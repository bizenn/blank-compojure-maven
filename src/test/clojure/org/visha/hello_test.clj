;; -*- mode: clojure; coding: utf-8 -*-
(ns org.visha.hello-test
  (:use [clojure.test]
        [org.visha.hello]))

(defn request [resource web-app & params]
  (web-app {:request-method :get :uri resource :params (first params)}))

(deftest routes_test []
  (is (= 200 (:status (request "/" main-routes))))
  (is (= "<h1>Hello World</h1>" ((request "/" main-routes) :body)))
  (is (= 404 (:status (request "/nonexists" main-routes))))
  (is (= "<h1>Page not found</h1>")))

(run-tests)

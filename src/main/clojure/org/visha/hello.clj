;; -*- mode: clojure; coding: utf-8-unix -*-
(ns org.visha.hello
  (:use compojure.core, ring.adapter.jetty)
  (:require [compojure.route :as route]))

(defroutes main-routes
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn standalone-start [port]
  (run-jetty main-routes {:port port}))

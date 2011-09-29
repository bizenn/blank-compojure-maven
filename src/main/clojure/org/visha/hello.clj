;; -*- mode: clojure; coding: utf-8-unix -*-
(ns org.visha.hello
  (:use compojure.core, ring.adapter.jetty)
  (:require [compojure.route :as route]))

(defroutes main-routes
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "Page not found"))

(defn standalone-start [port]
  (run-jetty main-routes {:port port}))

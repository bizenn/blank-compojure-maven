;; -*- mode: clojure; coding: utf-8 -*-
(ns org.visha.servlet
  (:use [ring.util.servlet]
        [org.visha.hello :only [main-routes]])
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defservice main-routes)

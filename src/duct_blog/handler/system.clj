(ns duct-blog.handler.system
  (:require [integrant.core :as ig]))

(defn ping
  [_]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "pong"})

(defmethod ig/init-key :duct-blog.handler.system/ping
  [_ _]
  ping)
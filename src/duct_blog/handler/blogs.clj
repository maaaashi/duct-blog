(ns duct-blog.handler.blogs
  (:require [integrant.core :as ig]))

(defn getBlogsHandler
  [_]
  {:status 200
   :headers {"content-type" "application/json"}
   :body "[]"})

(defmethod ig/init-key :duct-blog.handler.blogs/getBlogs
  [_ _]
  getBlogsHandler)
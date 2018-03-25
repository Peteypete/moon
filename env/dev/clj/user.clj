(ns user
  (:require 
            [mount.core :as mount]
            [moon.figwheel :refer [start-fw stop-fw cljs]]
            [moon.core :refer [start-app]]))

(defn start []
  (mount/start-without #'moon.core/repl-server))

(defn stop []
  (mount/stop-except #'moon.core/repl-server))

(defn restart []
  (stop)
  (start))



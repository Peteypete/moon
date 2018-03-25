(ns moon.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[moon started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[moon has shut down successfully]=-"))
   :middleware identity})

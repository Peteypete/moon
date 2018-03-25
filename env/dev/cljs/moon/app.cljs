(ns ^:figwheel-no-load moon.app
  (:require [moon.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)

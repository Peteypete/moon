(ns moon.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [moon.core-test]))

(doo-tests 'moon.core-test)


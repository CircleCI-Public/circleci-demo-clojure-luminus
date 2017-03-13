(ns cci-demo-clojure.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[cci-demo-clojure started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[cci-demo-clojure has shut down successfully]=-"))
   :middleware identity})

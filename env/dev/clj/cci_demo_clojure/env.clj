(ns cci-demo-clojure.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [cci-demo-clojure.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[cci-demo-clojure started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[cci-demo-clojure has shut down successfully]=-"))
   :middleware wrap-dev})

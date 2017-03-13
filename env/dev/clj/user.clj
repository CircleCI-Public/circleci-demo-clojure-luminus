(ns user
  (:require [mount.core :as mount]
            cci-demo-clojure.core))

(defn start []
  (mount/start-without #'cci-demo-clojure.core/http-server
                       #'cci-demo-clojure.core/repl-server))

(defn stop []
  (mount/stop-except #'cci-demo-clojure.core/http-server
                     #'cci-demo-clojure.core/repl-server))

(defn restart []
  (stop)
  (start))



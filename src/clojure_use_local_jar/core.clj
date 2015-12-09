(ns clojure-use-local-jar.core
 (:require [clojure.java.jdbc :as jdbc]
           [java-jdbc.ddl     :as ddl ]
           [java-jdbc.sql   :as sql]))

(def db-spec {:classname   "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname     "//localhost:5432/lianxi-clojure-sql"
              ;; Not needed for a non-secure local database...
              :user "postgres"
              :password "root"
              })

(defn main
  "I don't do ahole lot."
  [& args]
  (println  "Hello, World!")
  ;; 查询
  (println (jdbc/query db-spec (sql/select * :tags (sql/where {:name "Clojure"}))))
  )




(defproject clojure-use-local-jar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.3.0"]
                 [java-jdbc/dsl "0.1.0"]
                 ;[org.postgresql/postgresql "9.2-1003-jdbc4" ]
                 ]
  :resource-paths ["resources/*"]
  :main clojure-use-local-jar.core/main)

(defproject clojure-from-zero-to-hero "0.1.0-SNAPSHOT"
  :description "Siva's Spring Boot from Zero to Hero in Clojure"
  :url "https://github.com/matheusemm/clojure-from-zero-to-hero"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [com.stuartsierra/component "1.1.0"]

                 [com.github.seancorfield/next.jdbc "1.3.955"]
                 [com.github.seancorfield/honeysql "2.6.1203"]
                 [org.postgresql/postgresql "42.7.4"]
                 [org.flywaydb/flyway-core "10.21.0"]
                 [org.flywaydb/flyway-database-postgresql "10.21.0"]
                 [com.zaxxer/HikariCP "6.2.0"]

                 [camel-snake-kebab "0.4.3"]

                 [com.taoensso/telemere "1.0.0-RC1"]]
  :main ^:skip-aot zero-to-hero.core
  :target-path "target/%s"
  :plugins [[com.github.liquidz/antq "2.11.1250"]]
  :antq {}
  :profiles {:dev {:dependencies [[com.stuartsierra/component.repl "1.0.0"]
                                  [nrepl/nrepl "1.3.0"]
                                  [org.testcontainers/testcontainers "1.20.3"]
                                  [org.testcontainers/postgresql "1.20.3"]]
                   :source-paths ["dev"]}
             :kaocha {:dependencies [[lambdaisland/kaocha "1.91.1392"]]}
             :uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

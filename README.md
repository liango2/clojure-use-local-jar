# clojure-use-local-jar

# 引入本地jar包:

例如 本地jar包存放在 C:\Users\liango\clojure-use-local-jar\resources目录下

在project.clj中使用
 ```
    :resource-paths ["resources/*"]
 ```
来引入本地的包:


```
C:\Users\liango\clojure-use-local-jar>lein run
WARNING!!! version ranges found for:
[noir "1.2.2"] -> [org.clojure/clojure "[1.2.1,1.2.1],[1.3.0,1.3.0]"]
Consider using [noir "1.2.2" :exclusions [org.clojure/clojure]].

WARNING: update already refers to: #'clojure.core/update in namespace: java-jdbc.sql, being replaced by: #'java-jdbc.sql/update
Hello, World!
({:id 1, :name Clojure})
```

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

(ns cauldron.core
  (:gen-class))

(defn foo []
  "jackdaw")

(defmacro abe [x]
  `(str "Hello, " ~x "!"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (abe "dorry"))
    (binding [*ns* (find-ns 'cauldron.core)]
      (load-file (first args))))

;;  (load-file (first args))))

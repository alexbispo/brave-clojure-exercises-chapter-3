(ns brave-clojure-exercises-chapter-3.core
  (:gen-class))

(defn exercise-one
  "Use the str, vector, list, hash-map, and hash-set functions."
  []
  (println "I should use the str, vector, list, hash-map, and hash-set functions."))

(defn exercise-two
  "Write a function that takes a number and adds 100 to it"
  [number]
  (+ number 100))

(defn dec-maker
  "Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:
   Example:
    (def dec9 (dec-maker 9))
    (dec9 10)
    => 1"
  [dec-by]
  #(- % dec-by))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

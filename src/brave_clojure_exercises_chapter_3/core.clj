(ns brave-clojure-exercises-chapter-3.core
  (:gen-class))

(defn adds-100
  "Write a function that takes a number and adds 100 to it"
  [number]
  (+ number 100))

(defn dec-maker
  "Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:"
  [dec-by]
  #(- % dec-by))

(defn mapset
  "Write a function, mapset, that works like map except the return value is a set"
  [f coll]
  (set (map f coll)))

(defn -main
  "Start..."
  [& args]
  (let [out-exercise-two (adds-100 2)
        out-exercise-three (let [dec9 (dec-maker 9)] (dec9 10))
        out-exercise-four (mapset inc [1 1 2 2])]
    (println (str "Exercise two's out: " out-exercise-two))
    (println (str "Exercise three's out: " out-exercise-three))
    (println (str "Exercise four's out: " out-exercise-four))))

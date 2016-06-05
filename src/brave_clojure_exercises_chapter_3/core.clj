(ns brave-clojure-exercises-chapter-3.core
  (:gen-class))

(defn adds-100
  [number]
  (+ number 100))

(defn dec-maker
  [dec-by]
  #(- % dec-by))

(defn mapset
  [f coll]
  (set (map f coll)))

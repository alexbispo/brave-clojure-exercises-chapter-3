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

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (conj final-body-parts part (matching-part part)))
          #{}
          asym-body-parts))

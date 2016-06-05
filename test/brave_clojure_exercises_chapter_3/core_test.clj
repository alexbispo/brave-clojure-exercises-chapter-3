(ns brave-clojure-exercises-chapter-3.core-test
  (:require [clojure.test :refer :all]
            [brave-clojure-exercises-chapter-3.core :refer :all]))

(deftest test-adds-100
  (testing "Write a function that takes a number and adds 100 to it"
    (is (= 102 (adds-100 2)))))

(deftest test-dec-maker
  (testing
    "Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:"
    (is (= 1 (let [dec9 (dec-maker 9)] (dec9 10))))))

(deftest test-mapset
  (testing "Write a function, mapset, that works like map except the return value is a set"
    (is (= #{2 3} (mapset inc [1 1 2 2])))))

(deftest test-matching-part
  (is (= {:name "right-eye" :size 1} (matching-part {:name "left-eye" :size 1})))
  (is (= {:name "head" :size 3} (matching-part {:name "head" :size 3})))
  (is (= {:name "cleft-chin" :size 2} (matching-part {:name "cleft-chin" :size 2}))))

(deftest test-symmetrize-body-parts
  (let [asym-hobbit-body-parts
        [{:name "head" :size 3}
        {:name "left-eye" :size 1}
        {:name "left-ear" :size 1}
        {:name "mouth" :size 1}
        {:name "nose" :size 1}
        {:name "neck" :size 2}
        {:name "left-shoulder" :size 3}
        {:name "left-upper-arm" :size 3}
        {:name "chest" :size 10}
        {:name "back" :size 10}
        {:name "left-forearm" :size 3}
        {:name "abdomen" :size 6}
        {:name "left-kidney" :size 1}
        {:name "left-hand" :size 2}
        {:name "left-knee" :size 2}
        {:name "left-thigh" :size 4}
        {:name "left-lower-leg" :size 3}
        {:name "left-achilles" :size 1}
        {:name "left-foot" :size 2}]
        symmetric-body-parts
        #{{:name "head" :size 3}
          {:name "left-eye" :size 1}
          {:name "right-eye" :size 1}
          {:name "left-ear" :size 1}
          {:name "right-ear" :size 1}
          {:name "mouth" :size 1}
          {:name "nose" :size 1}
          {:name "neck" :size 2}
          {:name "left-shoulder" :size 3}
          {:name "right-shoulder" :size 3}
          {:name "left-upper-arm" :size 3}
          {:name "right-upper-arm" :size 3}
          {:name "chest" :size 10}
          {:name "back" :size 10}
          {:name "left-forearm" :size 3}
          {:name "right-forearm" :size 3}
          {:name "abdomen" :size 6}
          {:name "left-kidney" :size 1}
          {:name "right-kidney" :size 1}
          {:name "left-hand" :size 2}
          {:name "right-hand" :size 2}
          {:name "left-knee" :size 2}
          {:name "right-knee" :size 2}
          {:name "left-thigh" :size 4}
          {:name "right-thigh" :size 4}
          {:name "left-lower-leg" :size 3}
          {:name "right-lower-leg" :size 3}
          {:name "left-achilles" :size 1}
          {:name "right-achilles" :size 1}
          {:name "left-foot" :size 2}
          {:name "right-foot" :size 2}}]
    (is (= symmetric-body-parts (symmetrize-body-parts asym-hobbit-body-parts)))))
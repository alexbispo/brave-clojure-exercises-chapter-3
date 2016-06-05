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

(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  "I")

(deftest test-should-be-true
  (is (= "I" (convert 1))))


(run-tests 'tfnico.test-roman-numerals)
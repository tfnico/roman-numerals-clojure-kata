(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number)
    ""
    "I"))

(deftest test-convert
  (are [x y ] (= y (convert x))
    0 ""
    1 "I"))
	
(run-tests 'tfnico.test-roman-numerals)

(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= number 0)
    ""
    "I"))

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"))

(run-tests 'tfnico.test-roman-numerals)

(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  "")

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""))

(run-tests 'tfnico.test-roman-numerals)

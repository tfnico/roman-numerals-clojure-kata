(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  "")
	
(deftest test-convert
  (are [x y] (= y (convert x))
    0 ""))



	
(run-tests 'tfnico.test-roman-numerals)

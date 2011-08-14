(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number) 
    ""
    "I"))

(deftest convert-numeral
  (are [number numeral] (= (convert number) numeral)
    0 ""
    1 "I"))
	
(run-tests 'tfnico.test-roman-numerals)

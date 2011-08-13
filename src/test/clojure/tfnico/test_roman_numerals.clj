(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (let [ mapping {0 "", 1 "I", 2 "II", 3 "III", 4 "IV", 5 "V"}]
  (mapping number)))

(deftest one
  (are [number numeral] (= (convert number) numeral)
                           0 ""
                           1 "I"
                           2 "II"
    3 "III"
    4 "IV"
    5 "V"))

(run-tests 'tfnico.test-roman-numerals)
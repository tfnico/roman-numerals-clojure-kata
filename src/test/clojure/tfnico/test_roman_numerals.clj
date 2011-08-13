(ns tfnico.test-roman-numerals
 (:use clojure.test))

(defn convert [number]
  (let [ mapping {0 "", 1 "I", 2 "II", 3 "III", 4 "IV", 5 "V"}]
    (cond
      (= number 10) "X"
      (= number 9) "IX"
      (> number 5) (str "V" (convert (- number 5)))
      true (mapping number))))

(deftest one
  (are [number numeral] (= (convert number) numeral)
    0 ""
    1 "I"
    2 "II"
    3 "III"
    4 "IV"
    5 "V"
    6 "VI"
    7 "VII"
    8 "VIII"
    9 "IX"
    10 "X"))

(run-tests 'tfnico.test-roman-numerals)
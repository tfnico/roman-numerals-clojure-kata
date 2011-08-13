(ns tfnico.test-roman-numerals
 (:use clojure.test))

(defn convert [number]
  (let [ mapping {0 "", 1 "I", 2 "II", 3 "III", 4 "IV", 5 "V"}]
    (cond
      (>= number 10) (str "X" (convert(- number 10)))
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
    10 "X"
    11 "XI"
    12 "XII"
    14 "XIV"
    15 "XV"
    16 "XVI"
    19 "XIX"
    20 "XX"
    39 "XXXIX"))

(run-tests 'tfnico.test-roman-numerals)
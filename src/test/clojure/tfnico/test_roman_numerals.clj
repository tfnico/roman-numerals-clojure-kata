(ns tfnico.test-roman-numerals
 (:use clojure.test))

(defn convert [number]
  (let [ mapping {0 "", 1 "I", 2 "II", 3 "III", 4 "IV", 5 "V"}]
    (if(= number 9)
      "IX"
      (if(> number 5)
        (str "V" (convert (- number 5)))
        (mapping number)))))

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
    9 "IX"))

(run-tests 'tfnico.test-roman-numerals)
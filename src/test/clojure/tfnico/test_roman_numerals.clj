(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
    (cond
        (>= number 10) (str "X" (convert (- number 10)))
        (= number 9) "IX"
        (>= number 5) (str "V" (convert (- number 5)))
        true (["" "I" "II" "III" "IV"] number)))

(deftest test-convert
  (are [x y ] (= y (convert x))
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
    19 "XIX"))
	
(run-tests 'tfnico.test-roman-numerals)

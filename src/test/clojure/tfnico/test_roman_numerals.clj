(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (let [mappings {0 "", 1 "I", 2 "II", 3 "III",  4 "IV"}]
    (cond
      (>= number 10) (str "X" (convert (- number 10)))
      (= number 9) "IX"
      (>= number 5) (str "V" (convert (- number 5)))
      true (mappings number))))

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"
    2 "II"
    3 "III"
    4 "IV"
    5 "V"
    6 "VI"
    9 "IX"
    10 "X"
    11 "XI"
    14 "XIV"
    19 "XIX"
    25 "XXV"
    39 "XXXIX"))

(run-tests 'tfnico.test-roman-numerals)

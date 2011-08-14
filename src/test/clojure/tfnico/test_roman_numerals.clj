(ns tfnico.test-roman-numerals
 (:use clojure.test))

(defn to-use [number numeralMap]
  (if-let [entry (find numeralMap number)]
    entry
    (first (filter (fn [entry] (<= (key entry) number)) numeralMap))))

(defn convert [number]
  (let [numeralMap {50 "L", 40 "XL", 10 "X", 9 "IX", 5 "V" 4 "IV", 1 "I"}
        entry (to-use number numeralMap)]
    (if (= 0 number)
      ""
      (str (val entry) (convert (- number (key entry)))))))

(deftest convert-numeral
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
    14 "XIV"
    20 "XX"
    88 "LXXXVIII"))

(run-tests 'tfnico.test-roman-numerals)

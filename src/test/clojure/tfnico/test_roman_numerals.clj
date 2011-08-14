(ns tfnico.test-roman-numerals
 (:use clojure.test))

(defn to-use [number numeralMap]
  (if (= number 4 )
    (first numeralMap)
    (second numeralMap)))

(defn convert [number]
  (let [numeralMap {4 "IV", 1 "I"}
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
    4 "IV"))

(run-tests 'tfnico.test-roman-numerals)

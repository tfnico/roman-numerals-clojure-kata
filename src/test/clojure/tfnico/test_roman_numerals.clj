(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number)
    ""
    (if (= 1 number)
        "I"
        "II")))

(deftest one
  (are [number numeral] (= (convert number) numeral)
                           0 ""
                           1 "I"
                           2 "II"
                          ))

(run-tests 'tfnico.test-roman-numerals)
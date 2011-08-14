(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number) 
    ""
    (str "I" (convert (- number 1)))))

(deftest convert-numeral
  (are [number numeral] (= (convert number) numeral)
    0 ""
    1 "I"
    2 "II"
    3 "III"))
	
(run-tests 'tfnico.test-roman-numerals)

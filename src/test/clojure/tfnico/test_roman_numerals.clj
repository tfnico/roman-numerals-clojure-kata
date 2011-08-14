(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (let [numeralMap {1 "I"}
        entry (first numeralMap)]
  (if (= 0 number) 
    ""
    (str (val entry) (convert (- number (key entry)))))))

(deftest convert-numeral
  (are [number numeral] (= (convert number) numeral)
    0 ""
    1 "I"
    2 "II"
    3 "III"))
	
(run-tests 'tfnico.test-roman-numerals)

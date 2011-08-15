(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn to-use [number mapping]
  (first (filter (fn [entry] (<= (key entry) number)) mapping)))

(defn convert [number]
  (let [mapping {10 "X", 9 "IX", 5 "V", 4 "IV", 1 "I"}
        entry (to-use number mapping)]
  (if (= number 0) 
    ""
    (str (val entry) (convert (- number (key entry)))))))
	
(deftest test-convert
  (are [x y] (= y (convert x))
    0 ""
    1 "I"
    2 "II"
    3 "III"
    4 "IV"
    5 "V"
    6 "VI"
    7 "VII"
    9 "IX"
    10 "X"
    39 "XXXIX"))



	
(run-tests 'tfnico.test-roman-numerals)

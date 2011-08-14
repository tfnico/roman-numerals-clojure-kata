(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn to-use [number mapping]
  (if (= number 4)
    (first mapping)
    (second mapping)))

(defn convert [number]
  (let [mapping {4 "IV", 1 "I"}
        entry (to-use number mapping)]
  (if (> number 0)
    (str (val entry) (convert (- number (key entry))))
    "")))


(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"
    2 "II"
    3 "III"
    4 "IV"))

(run-tests 'tfnico.test-roman-numerals)

(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number)
    ""
    (if (= 1 number)
      "I"
      "II")))

(deftest test-convert
  (are [x y ] (= y (convert x))
    0 ""
    1 "I"
    2 "II"))
	
(run-tests 'tfnico.test-roman-numerals)

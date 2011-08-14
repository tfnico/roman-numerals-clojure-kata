(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= number 0)
    ""
    (if (= number 1)
      "I"
      "II")))

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"
    2 "II"))

(run-tests 'tfnico.test-roman-numerals)

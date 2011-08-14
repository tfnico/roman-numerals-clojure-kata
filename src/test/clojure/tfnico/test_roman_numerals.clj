(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= number 0)
    ""
    (if (= number 1)
      "I"
      (if (= number 2)
        "II"
        "III"))))

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"
    2 "II"
    3 "III"))

(run-tests 'tfnico.test-roman-numerals)

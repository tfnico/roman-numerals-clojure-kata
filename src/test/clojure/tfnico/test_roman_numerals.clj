(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= number 3)
    "III"
      (if (= number 2)
        "II"
        (if (= number 0)
            ""
            "I"))))
	
(deftest test-convert
  (are [x y] (= y (convert x))
    0 ""
    1 "I"
    2 "II"
    3 "III"))



	
(run-tests 'tfnico.test-roman-numerals)

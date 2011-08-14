(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (let [mappings {0 "", 1 "I", 2 "II", 3 "III",  4 "IV"}]
    (if (= number 10)
      "X"

        (if (>= number 9)
          "IX"
            (if (>= number 5)
              (str "V" (convert (- number 5)))
                (mappings number))))))

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"
    2 "II"
    3 "III"
    4 "IV"
    5 "V"
    6 "VI"
    9 "IX"
    10 "X"))

(run-tests 'tfnico.test-roman-numerals)

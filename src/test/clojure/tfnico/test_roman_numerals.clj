(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (let [mappings {0 "", 1 "I", 2 "II", 3 "III"}]
    (mappings number)))

(deftest conversion
  (are [x y] (= (convert x) y)
    0 ""
    1 "I"
    2 "II"
    3 "III"))

(run-tests 'tfnico.test-roman-numerals)

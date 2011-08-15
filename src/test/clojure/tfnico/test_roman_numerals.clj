(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (let [mapping {0 "", 1 "I", 2 "II", 3 "III"}]
    (mapping number)))
           
	
(deftest test-convert
  (are [x y] (= y (convert x))
    0 ""
    1 "I"
    2 "II"
    3 "III"))



	
(run-tests 'tfnico.test-roman-numerals)

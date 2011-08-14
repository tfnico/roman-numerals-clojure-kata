(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number) 
    ""
    "I"))


(deftest zero
  (is (= "" (convert 0))))

(deftest one
  (is (= "I" (convert 1))))
	
(run-tests 'tfnico.test-roman-numerals)

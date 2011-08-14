(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  "")


(deftest zero
  (is (= "" (convert 0))))
	
(run-tests 'tfnico.test-roman-numerals)

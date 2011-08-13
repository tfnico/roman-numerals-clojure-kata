(ns tfnico.test-roman-numerals
	(:use clojure.test
              tfnico.roman-numerals))
	
(deftest test-should-be-true
  (is (= "I" (convert 1))))
	

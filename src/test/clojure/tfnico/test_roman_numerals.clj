(ns tfnico.test-roman-numerals
	(:use clojure.test))
	
(deftest one-larger-than-zero
  (is (> 1 0)))
	
(run-tests 'tfnico.test-roman-numerals)

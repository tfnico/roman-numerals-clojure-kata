(ns tfnico.test-roman-numerals
	(:use clojure.test))

(defn convert [number]
  (if (= 0 number) "" "I"))

(deftest one
  (is (= "I" (convert 1))))

(deftest zero
  (is (= "" (convert 0))))

(deftest two
  (is (= "II" (convert 2))))


(run-tests 'tfnico.test-roman-numerals)
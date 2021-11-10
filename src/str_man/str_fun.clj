(ns str-man.str-fun
  (:gen-class)
  (:require [clojure.string :as str]))

(defn check [s]
  (println "Is String blank :"(str/blank? s))
  (println "String Index 'j':" (str/index-of s "j"))
  (println "String Index 'm' from 5:" (str/index-of s "m" 5))
  (println "String last-Index 'a' :" (str/last-index-of s "a"))
  (println "String last-Index 'a' from 5:" (str/last-index-of s "a" 5))
  )
(defn is-str-blank [s]
  (str/blank? s))
;; given str2 present in str or not
;; return true and false
(defn str-include-str1 [str str2]
  (str/includes? str str2))

;; given string ends with end or not
;; return true or false
(defn str-end-with [s end]
  (str/ends-with? s end))

;; capitalise the first letter of the String
;; return string with capitalize
(defn capitalize-str [str]
  (println "String Capitalize ::" (str/capitalize str)))

;; uppercase the given string
;; return the uppercase string
(defn uppercase-str [s]
  (str/upper-case s))

;; lowercase the given string
;; return the lowercase string
(defn lowercase-str [s]
  (str/lower-case s))

;;to count the no of Character in iven string
;; return the count of characters
(defn char-count[s]
 (count s))

;; divide the given string to start and end point given
(defn sub-str[s from end]
  (subs s from end))

;;compare the given two string
;; Returns a negative number, zero, or a positive number when ‘s1’ is logically 'less than', 'equal to', or 'greater than' ‘s2’.
(defn compare-str [s1 s2]
  (compare s1 s2))

;;reverse the given string
(defn rev-str[s]
  (reverse s))

;join the Collection element with provided string
(defn join-str[s col]
  (str/join s col))

;;split the given string with provide reg #" "
(defn split-str [s reg]
  (str/split s reg))

;;replace the string if match found with replacement
(defn replace-str [str match replacement]
  (str/replace str match replacement) )

;; remove all white spaces from both side
(defn trim-str [s]
  (println "remove white space from both side"s" :"(str/trim s)))

;; remove all white spaces from left side of string
(defn triml-str [s]
  (println "remove white space from left " s " :" (str/triml s)))

;; remove all white spaces from right side of string
(defn trimr-str [s]
  (println "remove white space from right" s " :" (str/trimr s)))


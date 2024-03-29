(ns str-man.core
  (:gen-class)
  (:require [clojure.string :as str]
            [str_man.myexception :as excep]
            [str-man.logic :as logical]
            [str-man.global-exception :as global-excep]))

(defn check [s]
  (println "Is String blank :"(str/blank? s))
  (println "String Index 'j':" (str/index-of s "j"))
  (println "String Index 'm' from 5:" (str/index-of s "m" 5))
  (println "String last-Index 'a' :" (str/last-index-of s "a"))
   (println "String last-Index 'a' from 5:" (str/last-index-of s "a" 5))
)
;; given str2 present in str or not
;; return true and false
(defn str-include-str1 [str str2]
  (if (str/includes? str str2)
    (println "Is String Include "str2 ":" (str/includes? str str2)))
  )

;; given string ends with end or not
;; return true or false 
(defn str-end-with [s end]
  (println "Is String End-with '.' :" (str/ends-with? s end)))

;; capitalise the first letter of the String
;; return string with capitalize 
(defn capitalize-str [str]
  (println "String Capitalize ::" (str/capitalize str)))

;; uppercase the given string
;; return the uppercase string 
(defn uppercase-str [s]
  (println "String Upper-case :" (str/upper-case s)))

;; lowercase the given string
;; return the lowercase string 
(defn lowercase-str [s]
   (println "String lowercase :" (str/lower-case s)))

;;to count the no of Character in iven string
;; return the count of characters
(defn char-count [s]
  (println "No of character in string :"(count s)))

;; divide the given string to start and end point given
(defn sub-str[s from end]
  (println"sub String from 3-6:"(subs s from end)))

;;compare the given two string
;; Returns a negative number, zero, or a positive number when ‘s1’ is logically 'less than', 'equal to', or 'greater than' ‘s2’.
(defn compare-str [s1 s2]
  (println "s1 and s2 compare:" (compare s1 s2)))

;;reverse the given string 
(defn rev-str[s]
  (println s "reverse string :"(reverse s)))

;join the Collection element with provided string
;join string in collection after first element of collection
(defn join-str[s col]
  (println "join "col "with " s ":"(str/join s col)))

;;split the given string with provide reg #" "
(defn split-str [s reg]
  (println "split "s "with " reg ":" (str/split s reg)))

;;replace the string if match found with replacement
(defn replace-str [str match replacement]
  (println "replace "match "with "replacement" :"(str/replace str match replacement) ))

;; remove all white spaces from both side 
(defn trim-str [s]
  (println "remove white space from both side"s" :"(str/trim s)))

;; remove all white spaces from left side of string 
(defn triml-str [s]
  (println "remove white space from left " s " :" (str/triml s)))

;; remove all white spaces from right side of string 
(defn trimr-str [s]
  (println "remove white space from right" s " :" (str/trimr s)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "welcome to String manipulation")
  (println "Please Enter string")
  ;(str-include-str1 (read-line) (read-line))
  ;(str-end-with (read-line) (read-line))
  ;(capitalize-str (read-line))
  ;(uppercase-str (read-line))
  ;(lowercase-str (read-line))
  ;(char-count (read-line))
  ;(sub-str (read-line) (java.lang.Integer/parseInt (read-line))(java.lang.Integer/parseInt (read-line)))
  ;(compare-str (read-line) (read-line))
  ;(rev-str (read-line))
  ;(join-str "manoj" ["i am " " amale"])
  ;(split-str (read-line) (read-line))
  ;(replace-str (read-line) (read-line) (read-line))
  ;(trim-str (read-line))
  ;(triml-str (read-line))
  ;(trimr-str (read-line))
  (global-excep/try-catch (excep/valid-gender (read-line)))
  ;(try (excep/valid-gender (read-line))
  ;     (catch Exception e (println (.getMessage e))))
  )

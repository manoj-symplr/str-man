(ns str-man.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn check [s]
  (println "Is String blank :"(str/blank? s))
  (println "String Capitaliza :" (str/capitalize s))
  (println "String Upper-case :" (str/upper-case s))
  (println "String lowercase :" (str/lower-case s))
  (println "Is String End-with '.' :" (str/ends-with? s "."))
  (println "Is String Include 'manoj':" (str/includes? s "manoj"))
  (println "String Index 'j':" (str/index-of s "j"))
  (println "String Index 'm' from 5:" (str/index-of s "m" 5))
  (println "String last-Index 'a' :" (str/last-index-of s "a"))
   (println "String last-Index 'a' from 5:" (str/last-index-of s "a" 5))
)

;;to count the no of Character in iven string
;; return the count of characters
(defn char-count[s]
  (println "No of character in string :"(count s)))

;; divede the given string to start and end point given 
(defn sub-str[s]
  (println"sub String from 3-6:"(subs s 3 6)))

;;compare the given two string
;; Returns a negative number, zero, or a positive number when ‘s1’ is logically 'less than', 'equal to', or 'greater than' ‘s2’.
(defn compare-str [s1 s2]
  (println "s1 and s2 compare:" (compare s1 s2)))

;;reverse the given string 
(defn rev-str[s]
  (println s "reverce string :"(reverse s)))

;join the Collection element with provided string 
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
  (println "welcome to String manupulation")
  (println "Please Enter string")
  (check (read-line))
  )

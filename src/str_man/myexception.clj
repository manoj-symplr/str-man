(ns str_man.myexception
  (:gen-class :extends java.lang.Exception))

(defn valid-age [age]
  (if (> age 18)
    (println "eligible for vote")
    (throw (str_man.myexception. "you are under age")))
  )
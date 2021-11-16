(ns str_man.myexception
  (:gen-class :extends java.lang.Exception))

(defn valid-age [age]
  (if (> age 18)
    (println "eligible for vote")
    (throw (str_man.myexception. "you are under age")))
  )

(defn valid-gender [gender]
  (if (or (= gender "male") (= gender "female") (= gender "transgender"))
    (println "valid gender")
    (throw (str_man.myexception. "Un-valid gender")))
  )
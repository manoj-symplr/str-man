(ns str-man.global-exception
  (:gen-class))

(defmacro try-catch
  [expression]
  `(try ~expression
       (catch Exception e# (println (.getMessage e#)))))

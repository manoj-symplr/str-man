(ns str-man.logic (:gen-class))

(defmulti factorial identity)

(defmethod factorial 0 [_]  1)

(defmethod factorial :default [num]
  (* num (factorial (dec num))))

(defmulti bat
          (fn ([x y & xs]
               (mapv class (into [x y] xs)))))
(defmethod bat [String String] [x y & xs]
  (str "str: " x " and " y))
(defmethod bat [String String String] [x y & xs]
  (str "str: " x ", " y " and " (first xs)))
(defmethod bat [String String String String] [x y & xs]
  (str "str: " x ", " y ", " (first xs) " and " (second xs)))
(defmethod bat [Number Number] [x y & xs]
  (str "number: " x " and " y))


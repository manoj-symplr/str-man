(ns str-man.core-test
  (:require [clojure.test :refer :all]
    ;[str-man.core :refer :all]
            [str-man.str-fun :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1)))are

  (testing "str-blank"
    (is (= false (is-str-blank "manoj"))))

  (testing "str-include-str1"
    (is (= true (str-include-str1 "i am manoj" "manoj"))))

  (testing "str-end-with"
    (is (= true (str-end-with "i am manoj" "manoj"))))

  (testing "str-uppercase"
    (is (= "I AM MANOJ" (uppercase-str "i am manoj"))))

  (testing "str-replace"
    (is (= "i am amale" (replace-str "i am manoj" "manoj" "amale"))))

  (testing "str-reverse"
    (is (= '(\j \o \n \a \m) (rev-str "manoj"))))


  )

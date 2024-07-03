package ru.madrabit.leonard.chapter1;

/*
* Проверяет содержит ли строка только цифры
* */
public class HasOnlyIntegers {

    public boolean isOnlyNum(String str) {
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return  true;
    }
}

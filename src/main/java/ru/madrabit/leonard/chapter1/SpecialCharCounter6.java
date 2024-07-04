package ru.madrabit.leonard.chapter1;

public class SpecialCharCounter6 {
    public long counter(String str, char special) {
       long result = 0;
//       for(char ch : str.toCharArray()) {
//           if (ch == special) {
//               result++;
//           }
//       }

      result = str.chars().filter(ch -> ch == special).count();

       return  result;
    }
}

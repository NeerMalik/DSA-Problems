import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hello = new HashMap<>();
        hello.put('I', 1);
        hello.put('V', 5);
        hello.put('X', 10);
        hello.put('L', 50);
        hello.put('C', 100);
        hello.put('D', 500);
        hello.put('M', 1000);
char[] array1 = s.toCharArray();
int sum = 0;
for (int i = 0; i < array1.length; i++) {
int currentValue = hello.get(array1[i]);
if (i < array1.length - 1 && (hello.get(array1[i]) < hello.get(array1[i + 1]))) {
sum -= currentValue;
 }else {
sum += currentValue;
}
}
return sum;
}
}

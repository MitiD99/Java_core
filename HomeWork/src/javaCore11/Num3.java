package javaCore11;
/*Вхідним параметром є стрічка :
        String str = "I love Java more than my friend. Java is so beautiful.";
        перевірити чи є в стрічці слово “Java”;
        замінити слово “Java” на “C#”;
        замінити всі слова “Java” на “C#”;*/

public class Num3 {
    public static void main(String[] args) {
        String s = "I love Java more than my friend. Java is so beautiful.";
        System.out.println(s.matches(".Java.*"));
        System.out.println(s.replaceFirst("Java", "C#"));
        System.out.println(s.replaceAll("Java", "C#"));
    }
}

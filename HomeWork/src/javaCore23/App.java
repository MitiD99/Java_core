package javaCore23;
/*Дана колекція клас People (з полями name - ім'я, age - вік, sex - стать)

        Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)
        Знайти середній вік серед чоловіків
        Знайти кількість потенційно працездатних людей у вибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)
        Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
        Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
        Знайти найстаршу людину
        Знайти наймолодшу людину
        Вивести скільки є чоловіків
        Вивести скільки є жінок
        Вивеcти всіх жінок в яких ім’я починається на “A”*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class App {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();
        people.add(new People("Adam", 21, "man"));
        people.add(new People("Jack", 13, "man"));
        people.add(new People("Harry", 68, "man"));
        people.add(new People("Karen", 2, "woman"));
        people.add(new People("Jacob", 23, "man"));
        people.add(new People("Alexa", 78, "woman"));
        people.add(new People("Oscar", 33, "man"));
        people.add(new People("Aimee", 44, "woman"));
        /*people.stream().filter(c->c.getSex() == "man").filter(a->a.getAge()>18 && a.getAge()<27).forEach(System.out::println); // чоловіки віком від 18 до 27*/

        /*double average = people.stream().filter(c->c.getSex() == "man").mapToInt(c->c.getAge()).average().getAsDouble();
         *System.out.println("Середній вік серед чоловіків" + average); // знаходить середній вік серед чоловіків*/

        /*List<People>listMan = people.stream().filter(f->f.getSex() == "man" && f.getAge()>18 && f.getAge()<60).collect(Collectors.toList());
         *List<People>listWoman = people.stream().filter(s->s.getSex()=="woman" && s.getAge()>18 && s.getAge()<55).collect(Collectors.toList());
         *List<People> all = Stream.concat(listMan.stream(),listWoman.stream()).collect(Collectors.toList());
         *all.forEach(System.out::println);  // показує усіх працездатних людей
         *System.out.println(all.stream().count()); //показує кількість працездатних людей*/

        /* people.stream().sorted(Comparator.comparing(People::getName).reversed()).forEach(System.out::println); // сортування за ім'ям в зворотному алфавітному порядку*/

        /*people.stream().sorted(Comparator.comparing(People::getName)).forEach(System.out::println);// посортовано по імені
         *System.out.println("-----------------------------------------------------------------");
         *people.stream().sorted(Comparator.comparing(People::getAge)).forEach(System.out::println);//посортовано за віком*/

        /* People max = people.stream().max(Comparator.comparing(People::getAge)).get();
         *System.out.println(max);//Знайти найстаршу людину*/

        /*People min = people.stream().min(Comparator.comparing(People::getAge)).get();
         *System.out.println(min);// Знайти наймолодшу людину */

        /* System.out.println(people.stream().filter(c->c.getSex() == "man").count());//Вивести скільки є чоловіків
         *System.out.println(people.stream().filter(s->s.getSex()=="woman").count());//Вивести скільки є жінок */

        /*people.stream().filter(s->s.getSex()=="woman" && s.getName().startsWith("A")).forEach(System.out::println);//Вивеcти всіх жінок в яких ім’я починається на “A”*/

    }

}

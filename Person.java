import java.util.List;
import java.util.Objects;

//public  abstract class Person {

    //1) Сделать его правильным - создать геттеры и сеттеры, проверить, что он соответствует тем правилам, которые мы с вами обсуждали.

    //2) Создать классы Pensioner и Worker. Унаследовать их от класса Person. В класс Pensioner добавить дробное поле pension, в класс Worker добавить два поля minSalary и maxSalary.

    //3) Класс Person превращаем в абстрактный. В него добавляем абстрактный метод die(), которая ничего не возвращает.

    // 4) В Worker реализуем этот метод таким образом: пишем на экран сообщение "Этот человек не дожил до пенсии"

    //5) В классе Pensioner реализуем так: пишем на экран "Этот пенсионер умер, он заработал: x". Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"

 public class Person implements Comparable < Person> {

     //Описание занятия: 1) Реализовать интерфейс comparable для класса Person
     //
     //2) Реализация должна быть такой:
     //сравниваются имена по длине, если имена равны, тогда сравнение идет через возраст.
     //
     //3) В классе Company добавить поле holidays типа Map.
     // Для него добавить геттер и сеттер. Записывать в него праздничные дни. Например "Новый год" -"31 декабря". Для двух компаний составить разные списки праздников


     private String name;
     private int age;
     private int height;
     private double weight;
     double workAge;

     private List<Person> children;

     public Person(List<Person> children) {
         this.children = children;
     }

     public Person(String name, int age, int height, int weight) {
         this.name = name;
         this.age = age;
         this.height = height;
         this.weight = weight;
     }


     public void die() {
     }


     public String goWork() {
         if (this.workAge >= 18 && this.workAge <= 70) {
             System.out.println("Oтдыхаю дома");
         } else {
             System.out.println("Pаботаю");
         }

         return null;
     }


     public void getInfo() {
         System.out.println(name + age + height + weight);

     }


     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public int getHeight() {

         return height;
     }

     public double getWeight() {

         return weight;
     }

     public double getWorkAge() {

         return workAge;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {

         this.age = age;
     }

     public void setHeight(int height) {
         this.height = height;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     public void setWorkAge(double workAge) {

         this.workAge = workAge;
     }

     public List<Person> getChildren() {
         return children;
     }

     public void setChildren(List<Person> children) {
         this.children = children;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Person person = (Person) o;
         return age == person.age && height == person.height && Double.compare(person.weight, weight) == 0 && Double.compare(person.workAge, workAge) == 0 && Objects.equals(name, person.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, age, height, weight, workAge);
     }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", height=" + height +
                 ", weight=" + weight +
                 ", workAge=" + workAge +
                 '}';
     }


     @Override
     public int compareTo(Person o) {
         int firstNameLen = name.length();
         int secondNameLen = o.name.length();
         if (firstNameLen != secondNameLen) {
             return Integer.compare(firstNameLen, secondNameLen);
         } else {
             return Integer.compare(age, o.age);
         }

         //   if (firstNameLen < secondNameLen) {//      return -1;
         //   }
         //   else if ( secondNameLen > firstNameLen){
         //       return 1;
         //   }
         //   else {
         //      if ( age < o.age){
         //           return -1;
         //    }
         //     else if ( age > o.age) {
         //         return 1;
         //    }
         //    return 0;
         //  }
         //return 0;
     }
 }


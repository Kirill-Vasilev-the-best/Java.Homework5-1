import javax.naming.Name;
import java.util.*;

public class task2 {
    public static void main (String[] args) {
        ex0();
    }
    static void ex0(){
        /*Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена
        с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */
        Employees employees = new Employees();
        employees.add("Иван", "Иванов");
        employees.add("Светлана", "Петрова");
        employees.add("Кристина", "Белова");
        employees.add("Анна", "Мусина");
        employees.add("Анна", "Крутова");
        employees.add("Иван", "Юрин");
        employees.add("Петр", "Лыков");
        employees.add("Павел", "Чернов");
        employees.add("Петр", "Чернышов");
        employees.add("Мария", "Федорова");
        employees.add("Марина", "Светлова");
        employees.add("Мария", "Савина");
        employees.add("Мария", "Рыкова");
        employees.add("Марина", "Лугова");
        employees.add("Анна", "Владимирова");
        employees.add("Иван", "Мечников");
        employees.add("Петр", "Петин");
        employees.add("Иван", "Ежов");


        }


    }

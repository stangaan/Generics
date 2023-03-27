import javax.naming.InvalidNameException;
import javax.naming.Name;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        подключаем наш дженерик класс и указываем ссылочный тип данных и вставляем инфу
// чтобы вставить лист с данными надо его создать и в последнем поле указать имя листа
        List<Integer> Listsalary = new ArrayList<>();
        Listsalary.add(2600);
        Listsalary.add(3550);
        GenericsClass <Integer, String, Integer, Integer, String> stringGenericsClass = new GenericsClass<>(1,"Andrei", 43, Listsalary, "Database is saved!");
//        выводим все на экран с помошью print
        stringGenericsClass.print();

    }




}
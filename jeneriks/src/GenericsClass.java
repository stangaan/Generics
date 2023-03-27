import java.util.List;

public class GenericsClass<N, S, T, E, A> {
//добавляем скопки <T> и указываем что у нас будет неопределенный тип

    private N number;
    private S nameGenerics;

    private T ageGenerics;
    private List<E> listSalary;
    private A save;
    public GenericsClass(N number, S nameGenerics, T ageGenerics, List<E> listSalary, A save) {
        this.number = number;
        this.nameGenerics = nameGenerics;
        this.ageGenerics = ageGenerics;
        this.listSalary = listSalary;
        this.save = save;
    }
//создаем конструктор


    public A getSave() {
        return save;
    }

    public void setSave(A save) {
        this.save = save;
    }

    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }

    public S getNameGenerics() {
        return nameGenerics;
    }

    public void setNameGenerics(S nameGenerics) {
        this.nameGenerics = nameGenerics;
    }

    public T getAgeGenerics() {
        return ageGenerics;
    }

    public void setAgeGenerics(T ageGenerics) {
        this.ageGenerics = ageGenerics;
    }

    public List<E> getListSalary() {
        return listSalary;
    }

    public void setListSalary(List<E> listSalary) {
        this.listSalary = listSalary;
    }

    //    и создаем вывод на экран
    public void print(){
        System.out.print(number);
        System.out.print(" ");
        System.out.print(nameGenerics);
        System.out.print(" ");
        System.out.println(ageGenerics);
        System.out.println(" ");
        System.out.println(listSalary);
        System.out.println(save);
//        переходим в main \и реализуем то что мы здесь создали
    }


    }


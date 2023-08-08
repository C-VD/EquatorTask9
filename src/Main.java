

//    Создать класс Орешек с полем вес.
//    Изменить вес ореха нельзя. - done
class Oreshek {
final double ves;
//    Все орешки создаются с весом 12.5. - done
    Oreshek(){
        ves = 12.5;
    }
}

//    Создать класс Дерево, у которого есть метод ВыраститьМассивОрехов. - done
//    Параметр метода - это количество, результат - массив Орешков. - done
class Derevo{
    Oreshek[] virostitMassivOrehov(int nOrehov){
        Oreshek[] mas = new Oreshek[nOrehov];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Oreshek();
        }
        return mas;
    }
}

//    Создать класс Белочка, у которой есть - done
//    метод собирания орехов из массива, выращенного деревом. - done
class Belochka{
    void sobratOrehi(Oreshek[] mas) {
      double v = 0;
//    Белочка перебирает каждый орешек в массиве, говорит "ура, еще орех!" - done
        for (Oreshek o: mas) {
            System.out.println("ура, еще орех!");
//    и суммирует вес всех найденных орехов. - done

            v += o.ves;
        }
//    в итоге она гордо сообщает, какой общий вес она насобирала - done
        System.out.println("Xo-xo, общий вес - " + v);
    }
}

//
//    Продемонстрировать работу системы с 1 объектом класса Белочка,
//    1 Деревом и массивом из 15 орехов - done
public class Main {
    public static void main(String[] args) {
        Derevo derevo = new Derevo();
        Oreshek[] mas = derevo.virostitMassivOrehov(15);
        Belochka belochka = new Belochka();
        belochka.sobratOrehi(mas);
    }
}
public class Main {
    public static void main(String[] args) {

        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);

        var LiftingCapacity = 50;
        var StuffWeight = 20;
        var CapacityLeft = LiftingCapacity - StuffWeight;
        System.out.println("Еще можно положить " + CapacityLeft + "кг вещей");

        var appleWeight = 2;
        var orangesWeigth = 3;
        var fruitWeight = appleWeight + orangesWeigth;
        System.out.println("Общий вес фруктов " + fruitWeight + "кг");

        var meatWeight = 4;
        var waterWeight =  5;
        var tomatosWeight = 2;
        var cucumbersWeight = 2;
        var pepersWeight = 2;
        var zucchiniWeight = 2;
        var vegatablesWeight = tomatosWeight + cucumbersWeight + pepersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegatablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг");

        var leftWeight = LiftingCapacity - StuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + "кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теп ерь вес продуктов " + productsWeight);

        leftWeight = LiftingCapacity + StuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + "кг!");

        var overload = (StuffWeight + productsWeight) % LiftingCapacity;
        System.out.println("Перегруз на " + overload + " кг");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине " + productsInOneCar);


    }
}
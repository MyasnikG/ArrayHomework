package homework.oop;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car ();

        car1.setMark("BMW");
        car1.setModel("760i");
        car1.setColor("White");
        car1.setPrice(114595);
        car1.setProductionYear(2023);
        car1.setLogo('\u00A9');
        car1.setAutomatic(true);
        car1.setEnginePower(536);

        Car car2 = new Car();

        car2.setMark("Mercedes-Benz");
        car2.setModel("EQS");
        car2.setProductionYear(2022);
        car2.setPrice(102310);
        car2.setEnginePower(329);
        car2.setColor("Gray");
        car2.setLogo('&');
        car2.setAutomatic(true);

        System.out.println("First car is " + car1.getMark() + " " + car1.getModel() + " " + car1.getProductionYear() + " " + car1.getColor() + " "+ car1.getPrice() + "USD"
        + " Engine power is " + car1.getEnginePower() + " horsepower" + " and logo is " + car1.getLogo());

        System.out.println();
        System.out.println("Second car is " + car2.getMark() + " " + car2.getModel() + " " + car2.getProductionYear() + " " + car2.getColor() + " "+ car2.getPrice() + "USD"
                + " Engine power is " + car2.getEnginePower() + " horsepower" + " and logo is " + car2.getLogo());

        System.out.println();
        Car car3 = new Car();
        car3.setMark("Lamborghini");
        car3.setModel("Aventador");
        car3.setProductionYear(2011);
        car3.setPrice(507353);
        car3.setEnginePower(769);
        car3.setColor("Blue");
        car3.setLogo('*');
        car3.setAutomatic(true);

        System.out.println("Third car is " + car3.getMark() + " " + car3.getModel() + " " + car3.getProductionYear() + " " + car3.getColor() + " "+ car3.getPrice() + "USD"
                + " Engine power is " + car3.getEnginePower() + " horsepower" + " and logo is " + car3.getLogo());

        System.out.println();
        Car car4 = new Car();
        car4.setMark("Nissan");
        car4.setModel("Z Coupe");
        car4.setProductionYear(2023);
        car4.setPrice(39990);
        car4.setEnginePower(400);
        car4.setColor("Yellow");
        car4.setLogo('@');
        car4.setAutomatic(true);

        System.out.println("Fourth car is " + car4.getMark() + " " + car4.getModel() + " " + car4.getProductionYear() + " " + car4.getColor() + " "+ car4.getPrice() + "USD"
                + " Engine power is " + car4.getEnginePower() + " horsepower" + " and logo is " + car4.getLogo());


        System.out.println();
        Car car5 = new Car();
        car5.setMark("Toyota");
        car5.setModel("GR86");
        car5.setProductionYear(2023);
        car5.setPrice(31425);
        car5.setEnginePower(228);
        car5.setColor("Orange");
        car5.setLogo('^');
        car5.setAutomatic(true);

        System.out.println("Fifth car is " + car5.getMark() + " " + car5.getModel() + " " + car5.getProductionYear() + " " + car5.getColor() + " "+ car5.getPrice() + "USD"
                + " Engine power is " + car5.getEnginePower() + " horsepower" + " and logo is " + car5.getLogo());
    }
}

public class EstruturaDoArray {
    public static void main(String[] args) {
        System.out.println("Aprendendo Array");
        String[] cars = {"Uno", "Fusca", "Chevette", "Opala", "Maverik"};
        int i;
        for(i=0; i<cars.length ;i++){
            if(cars[i].equals("Chevette")) {
                System.out.println("Carro posição " + i + "= " + cars[i]);
            }
        }
    }
}
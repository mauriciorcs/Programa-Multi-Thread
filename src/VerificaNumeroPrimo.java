public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        Integer[] numeros = {13, 507, 991, 809, 1555};
        for (Integer i : numeros) {
            //int number = Integer.parseInt(arg);
            Thread thread = new Thread(new Threads(i));
            thread.start();
        }
    }
}





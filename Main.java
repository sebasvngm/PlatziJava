class Main{
    Run Debug;
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new Car("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(passenger:4);
        uberX.printDataCar();        
    }

}


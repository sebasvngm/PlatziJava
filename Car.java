class Car{
    Integer id;
    String License;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.License = license;
        this.driver = driver;

    }

    void printDataCar() {
      System.out.println("License: " + License + "Name Driver: " + driver.name);  
    }

    public Integer getPassenger(){
      return passenger;

    }

    public void setPassenger(Integer passegenger){
      if(passenger == 4){
        this.passenger = passegenger;
      }else{
        System.out.println("Necesesitas asignar 4 pasajeros");
      }
    }
  
}
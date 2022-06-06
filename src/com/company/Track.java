package com.company;

    public class Track extends Engine {
        int cargo_capacity;
        int wheels_number;

        Track (int wheels_number,int cargo_capacity, int power, String fuel_type, boolean hybrid_or_not) {
            super(power, fuel_type, hybrid_or_not);
            this.cargo_capacity = cargo_capacity;
            this.wheels_number = wheels_number;
        }
        public void getParam(){
            super.converte();
            System.out.println(" Power of Track " + power + " Wheels Number " + wheels_number + " Cargo Capacity " + cargo_capacity + " fuel_type " + fuel_type + " Hybrid_or_not " + hybridtype  );
        }
}

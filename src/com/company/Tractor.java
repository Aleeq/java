package com.company;

    public class Tractor extends Engine {
        int number;
        int capacity;

        Tractor (int number,int capacity, int power, String fuel_type, boolean hybrid_or_not){
            super(power, fuel_type, hybrid_or_not);
            this.number = number;
            this.capacity = capacity;
        }

        public void getParam(){
            super.converte();
            System.out.println(" Power of Tractor " + power + " Number " + number + " Capacity " + capacity + " fuel_type " + fuel_type + " Hybrid_or_not " + hybridtype  );
        }
}

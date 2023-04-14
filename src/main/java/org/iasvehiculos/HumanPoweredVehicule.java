package org.iasvehiculos;

public class HumanPoweredVehicule {

         double valorComercial = 10.000;
         double environmentalSubside = 25;
         double precioFinal;

    public HumanPoweredVehicule(double precioFinal) {

    }

    public HumanPoweredVehicule() {
        this.valorComercial = valorComercial;
        this.environmentalSubside = environmentalSubside;
        this.precioFinal = valorComercial / environmentalSubside;
    }

    double priceFinal(double precioFinal){
       return precioFinal;
    }
}


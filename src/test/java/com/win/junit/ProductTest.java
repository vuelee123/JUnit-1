package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductTest {

    double productCost = 4.0;
    int productQuantity = 10;
    String productName = "Gas";

    @Test
    public void printProduct( ){
        System.out.println(this.productName + " cost "  + this.productCost + " and " + this.productQuantity + "gallons" + " were purchased." );

        assertEquals("Gas cost 4.0 and 10 gallons were purchased.", this.productName + " cost "  + this.productCost + " and " + this.productQuantity + " gallons" + " were purchased." );
    }
}

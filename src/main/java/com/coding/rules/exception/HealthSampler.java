package com.coding.rules.exception;

/**
 * Created by grahul on 16-03-2019.
 */
public class HealthSampler {

  public static void main(String[] args) {

    Checkup checkup = new Checkup();
    //checkup.healthCheckByDoctor(null);


    try {
      checkup.healthCheckByDoctor(null);
    } catch (Exception e) {
      System.out.println("Something went wrong : " + e.getMessage());
    }


  }


}

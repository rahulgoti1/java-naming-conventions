package com.coding.rules.exception;

/**
 * Created by grahul on 16-03-2019.
 */
public class Checkup {


  public String healthCheckByDoctor(final String doctorName) {
    return new Doctor().checkMyHealth(doctorName);
  }


}

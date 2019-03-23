package com.coding.rules.exception;

/**
 * Created by grahul on 16-03-2019.
 */
public class HealthException extends RuntimeException {

  public HealthException() {
  }

  public HealthException(String message) {
    super(message);
  }
}

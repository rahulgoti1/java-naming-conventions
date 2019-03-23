package com.coding.rules.exception;

import java.util.Optional;

/**
 * Created by grahul on 16-03-2019.
 */
public class Doctor {


  public String checkMyHealth(final String doctorName) {
    // Controller -> Service -> Util -> Repo(throw new Exception())
    if (!Optional.ofNullable(doctorName).isPresent()) {
      throw new HealthException("Sorry Please provide me your name");
    }

    return String.valueOf(doctorName).toUpperCase();
  }


}

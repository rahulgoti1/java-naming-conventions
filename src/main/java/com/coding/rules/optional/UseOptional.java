package com.coding.rules.optional;

import java.util.Optional;

/**
 * Created by grahul on 15-03-2019.
 */
public class UseOptional {

  private static final String DEFAULT_NAME = "google";
  private static final String DEFAULT_NULL_NAME = null;

  public static void main(String[] args) {

 /*   Optional<String> name = Optional.ofNullable(DEFAULT_NULL_NAME);
    System.out.println(name.get());*/

    System.out.println(Optional
        .ofNullable(DEFAULT_NULL_NAME)
        .orElse(DEFAULT_NAME)
        .equals("google"));


    if (DEFAULT_NULL_NAME == null) {
      System.out.println(DEFAULT_NAME.equals("10000"));
    } else {
      System.out.println(DEFAULT_NULL_NAME.equals("10000"));
    }

    if (DEFAULT_NULL_NAME != null) {
      System.out.println(DEFAULT_NULL_NAME.equals("10000"));
    }

    Optional<String> defaultNullName = Optional.ofNullable(
        DEFAULT_NULL_NAME
    );



    /*Optional<String> name = Optional.ofNullable(DEFAULT_NULL_NAME);
    if (name.isPresent()) {
      System.out.println(name.get());
    }*/


    Optional<String> name = Optional.of("java");
    System.out.println(name.map(String::toUpperCase));

  }


}

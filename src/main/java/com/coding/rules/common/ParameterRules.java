package com.coding.rules.common;

import com.coding.rules.model.Person;

/**
 * Created by grahul on 16-03-2019.
 */
public class ParameterRules {

  private static final String DEFAULT_NAME = "Spring";

  public static void main(String[] args) {


    Person person = new Person(10L, DEFAULT_NAME);
    new ParameterRules().validatePerson(DEFAULT_NAME, person);
    //new ParameterRules().validatePerson(person);
  }

  private Boolean validatePerson(final String name, final Person person) {
    return DEFAULT_NAME.equals(name) && person.getId() > 10;
  }

  private Boolean validatePerson(final Person person) {
    return DEFAULT_NAME.equals(person.getName()) && person.getId() > 10;
  }

}

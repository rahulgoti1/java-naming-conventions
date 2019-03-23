package com.coding.rules.optional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by grahul on 15-03-2019.
 */
public class UseOptionalWithCollection {


  private static final String NAME_HOLDER = "guava";
  private static final String CITY_HOLDER = "city";

  public static void main(String[] args) {

    Set<String> cities = giveMeCityNames(NAME_HOLDER);
    Boolean isSuratAvailable = cities.contains("Surat");
    System.out.println("Surat found : " + isSuratAvailable);


    /*Set<String> cities = Optional.ofNullable(
        giveMeCityNames(NAME_HOLDER)
    ).orElse(Collections.emptySet());
    Boolean isSuratAvailable = cities.contains("Surat");
    System.out.println("Surat found : " + isSuratAvailable);*/

  }

  private static Set<String> giveMeCityNames(final String param) {

    if (CITY_HOLDER.equals(param)) {
      final Set<String> names = new HashSet<>();
      names.add("Surat");
      names.add("Sydney");
      names.add("Shanghai");
      names.add("San Jose");
      names.add("Skopje");
      return names;
    }

    return null;
  }

}

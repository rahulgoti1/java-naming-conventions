package com.coding.rules.npe;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by grahul on 15-03-2019.
 */
public class NullPointerHelper {

  private static final String NAME_HOLDER = "google";

  public static void main(String[] args) {


  }

  /**
   * Use of Ternary Operator.
   */
  private Boolean ternaryOperator(final Long param) {
    return param >= 5L ? Boolean.TRUE : Boolean.FALSE;
  }

  /**
   * User of Apache Commons Lang.
   */
  private Boolean apacheCommonsLang(final String param) {
    return StringUtils.isNotEmpty(param);
  }

  /**
   * Compare with Null reference.
   */
  private Boolean withoutUseOfValueOf(final String param) {
    return param.equals(NAME_HOLDER);
  }

  /**
   * User of String.valueOf method.
   */
  private Boolean withUseOfValueOf(final String param) {
    return String.valueOf(param).equals(NAME_HOLDER);
  }

  /**
   * Always compare with CONSTANT variable.
   */
  private Boolean userConstWithParam(final String param) {
    return NAME_HOLDER.equals(param);
  }

  /**
   * With null reference collections.
   */
  private Set<String> giveMeCityNamesOrNull(final String name) {

    if (NAME_HOLDER.equals(name)) {
      final Set<String> names = new HashSet<>();
      names.add("Surat");
      names.add("Skopje");
      names.add("Sydney");
      names.add("Shanghai");
      names.add("San Jose");
      return names;
    }

    return null;
  }

  /**
   * Always practice to return Empty collection rather than null reference.
   */
  private Set<String> giveMeCityNames(final String param) {

    if (NAME_HOLDER.equals(param)) {
      final Set<String> names = new HashSet<>();
      names.add("Surat");
      names.add("Sydney");
      names.add("Shanghai");
      names.add("San Jose");
      names.add("Skopje");
      return names;
    }

    return Collections.emptySet();
  }

  /**
   * Use of Preconditions.checkNotNull(age, "age is required");
   */
  private Boolean isEligibleForVoting(final Long age) {
    Preconditions.checkNotNull(age, "age is required");

    return Long.valueOf(18).compareTo(age) == 0;
  }

}

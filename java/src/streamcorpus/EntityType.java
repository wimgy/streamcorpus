/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package streamcorpus;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Different tagging tools have different strings for labeling the
 * various common entity types.  To avoid ambiguity, we define a
 * canonical list here, which we will surely have to expand over time
 * as new taggers recognize new types of entities.
 */
public enum EntityType implements org.apache.thrift.TEnum {
  PER(0),
  ORG(1),
  /**
   * physical location
   */
  LOC(2),
  MALE_PRONOUN(3),
  FEMALE_PRONOUN(4),
  TIME(5),
  DATE(6),
  MONEY(7),
  PERCENT(8),
  /**
   * uncategorized named entities, e.g. Civil War for Stanford CoreNLP
   */
  MISC(9),
  GPE(10),
  FAC(11),
  VEH(12),
  WEA(13),
  phone(14),
  email(15),
  URL(16);

  private final int value;

  private EntityType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static EntityType findByValue(int value) { 
    switch (value) {
      case 0:
        return PER;
      case 1:
        return ORG;
      case 2:
        return LOC;
      case 3:
        return MALE_PRONOUN;
      case 4:
        return FEMALE_PRONOUN;
      case 5:
        return TIME;
      case 6:
        return DATE;
      case 7:
        return MONEY;
      case 8:
        return PERCENT;
      case 9:
        return MISC;
      case 10:
        return GPE;
      case 11:
        return FAC;
      case 12:
        return VEH;
      case 13:
        return WEA;
      case 14:
        return phone;
      case 15:
        return email;
      case 16:
        return URL;
      default:
        return null;
    }
  }
}

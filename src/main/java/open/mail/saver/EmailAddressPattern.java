package open.mail.saver;

import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

/** https://emailregex.com/ General Email Regex (RFC 5322 Official Standard) */
@NoArgsConstructor
public class EmailAddressPattern {
  static final String EMAIL_ADDRESS_REGEXP =
      "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]"
          + "+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~"
          + "-]+)*|\"(?:[\\x01-\\x08\\x0b\\"
          + "x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\"
          + "x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\"
          + "x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9]"
          + "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]"
          + "(?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25"
          + "[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"
          + "\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?"
          + "[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:"
          + "[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\"
          + "x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\"
          + "x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

  private static final Pattern emailAddressPattern = Pattern.compile(EMAIL_ADDRESS_REGEXP);

  public static boolean isValid(String address) {
    return emailAddressPattern.matcher(address).matches();
  }
}

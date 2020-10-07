package open.mail.saver;

import lombok.Getter;
import lombok.Value;

@Value
public class EmailAddress {

  String email;

  public EmailAddress(String email) {
    email = email.strip();
    assert EmailAddressPattern.isValid(email) : "Invalid email address format";
    this.email = email;
  }
}

package open.mail.saver.interfaces;

import open.mail.saver.EmailAddress;
import open.mail.saver.EmailAddressPattern;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailAddressMapper {

  EmailAddressDto toEmailAddressDto(EmailAddress emailAddress) {
    return new EmailAddressDto(emailAddress.getEmail());
  }

  EmailAddress toEmailAddress(EmailAddressDto emailAddressDto) {
    String address = emailAddressDto.getEmail().strip();
    if (!EmailAddressPattern.isValid(address)) {
      throw new RuntimeException();
    }
    return new EmailAddress(address);
  }
}

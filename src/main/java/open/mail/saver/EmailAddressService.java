package open.mail.saver;

@FunctionalInterface
public interface EmailAddressService {

  void process(EmailAddress emailAddress);
}

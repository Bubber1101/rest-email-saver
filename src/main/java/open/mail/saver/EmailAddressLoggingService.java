package open.mail.saver;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Slf4j
public class EmailAddressLoggingService implements EmailAddressService {

  @Override
  public void process(EmailAddress emailAddress) {

    log.info("Persisting email address {}", emailAddress);
  }
}

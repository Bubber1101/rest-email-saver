package open.mail.saver;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Slf4j
public class EmailAddressLoggingService implements EmailAddressService {

  @ConfigProperty(name = "log.message")
  String message;

  @Override
  public void process(EmailAddress emailAddress) {
    log.info("{}||Persisting email address {}", message, emailAddress);
  }
}

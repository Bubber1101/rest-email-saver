package open.mail.saver;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotBlank;

@ApplicationScoped
@AllArgsConstructor
@Slf4j
public class EmailAddressPersistenceService {

//  @ConfigProperty(name = "file.path", defaultValue = ".")
  String filePath = "c:";

  public void save(@NotBlank EmailAddress address) {
    // TODO: Implement writing to file
    log.info("Persisting email address {}", address);
  }
}

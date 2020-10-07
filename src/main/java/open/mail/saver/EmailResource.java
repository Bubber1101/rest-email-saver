package open.mail.saver;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emails")
@Consumes(MediaType.APPLICATION_JSON)
public class EmailResource {

  @Inject EmailAddressPersistenceService emailAddressPersistenceService;

  @POST
  public void add(EmailAddress emailAddress) {
    emailAddressPersistenceService.save(emailAddress);
  }
}

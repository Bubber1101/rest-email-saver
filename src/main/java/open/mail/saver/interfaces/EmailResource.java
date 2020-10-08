package open.mail.saver.interfaces;

import open.mail.saver.EmailAddress;
import open.mail.saver.EmailAddressService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emails")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmailResource {

  @Inject EmailAddressService emailAddressPersistenceService;

  @Inject EmailAddressMapper emailAddressMapper;

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public EmailAddressDto add(EmailAddressDto emailAddressDto) {
    EmailAddress emailAddress = emailAddressMapper.toEmailAddress(emailAddressDto);
    emailAddressPersistenceService.process(emailAddress);
    return emailAddressMapper.toEmailAddressDto(emailAddress);
  }
}

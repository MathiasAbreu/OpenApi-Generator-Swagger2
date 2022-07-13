package br.com.ufcg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T09:44:11.938680700-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/TeamOferta/cata/1.0.0}")
public class PetApiController implements PetApi {

    private final PetApiDelegate delegate;

    public PetApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PetApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PetApiDelegate() {});
    }

    @Override
    public PetApiDelegate getDelegate() {
        return delegate;
    }

}

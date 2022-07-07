package br.com.ufcg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-07T09:22:51.708616300-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/TeamOferta/cata/1.0.0}")
public class StoreApiController implements StoreApi {

    private final StoreApiDelegate delegate;

    public StoreApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) StoreApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new StoreApiDelegate() {});
    }

    @Override
    public StoreApiDelegate getDelegate() {
        return delegate;
    }

}

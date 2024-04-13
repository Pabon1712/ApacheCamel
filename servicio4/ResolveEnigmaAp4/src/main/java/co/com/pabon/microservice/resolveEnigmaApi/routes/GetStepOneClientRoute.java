package co.com.pabon.microservice.resolveEnigmaApi.routes;

import java.util.Objects;
import co.com.pabon.microservice.resolveEnigmaApi.model.Header;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GetStepOneClientRoute extends RouteBuilder {
	@Override
	public void configure() throws Exception{
		
		from("direct:get-step-one")
		.setHeader(Exchange.HTTP_METHOD, constant("POST"))
        .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
        .setBody(simple("{ \r\n"
            + "    \"data\":[\r\n"
            + "        {\r\n"
            + "            \"id\": \"1234567890\",\r\n"
            + "            \"type\": \"CLIENT\"\r\n"
            + "        }\r\n"
            + "    ]\r\n"
            + "}"))
        .log("Request microservice step one ${body}")
        .to("http4://localhost:8083/v1/getOneEnigma/getStep")
        .log("Response microservice step one ${body}");
		
		
	}
}

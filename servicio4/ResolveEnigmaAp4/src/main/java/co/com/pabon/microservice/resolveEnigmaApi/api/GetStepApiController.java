package co.com.pabon.microservice.resolveEnigmaApi.api;

import co.com.pabon.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.pabon.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;


@Controller
public class GetStepApiController implements GetStepApi {
	
	private static final Logger Log=LoggerFactory.getLogger(GetStepApiController.class);
	@Override
	public ResponseEntity<List<JsonApiBodyResponseSuccess>> getStep(JsonApiBodyRequest body) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

    

package com.taufeeque.cloudvendorserviceapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Cloud Vendor Service API",
				version = "1.0.0",
				description = "This Project is for learning purpose only",
				termsOfService = "runcodenow",
				contact = @Contact(
						name = "Md Taufeeque Alam",
						email = "md7870taufeequea@gmail.com"
				),
				license = @License(
						name = "licence",
						url = "runcodenow"
				)
		)
)

@SecurityScheme(
		name = "bearerAuth",
		description = "JWT auth description",
		scheme = "bearer",
		type = SecuritySchemeType.HTTP,
		bearerFormat = "JWT",
		in = SecuritySchemeIn.HEADER
)
class CloudVendorServiceApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(CloudVendorServiceApiApplication.class, args);
	}

}

package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Coffee Shop API")
                    .description("API for managing orders and menu in a coffee shop.")
                    .contact(
                        Contact()
                            .name("CoffeShop API Support")
                            .url("https://www.coffeeshop.com/support")
                            .email("support@coffeshop.com")
                    )
                    .version("1.0.0")
            )
            .components(
                Components()
                    .addSecuritySchemes("basicAuth", SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("basic")
                    )
            )
    }
}

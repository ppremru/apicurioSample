# Spike to look at basic generated code

>This is a simple example of OpenAPI code generation.
>The generated code is checked for the purpose of sharing/review.

## pom.xml:
>
>  The property "service" is the name of the openapi yaml file.
>  For example:
>   <properties>
>       <service>profile</service>
>       ...
>   </properties>

## OpenAPI.yaml:
>  The yaml was produced from apicurio
>  For example:
>     ./src/main/resources/profile.yaml

## Generate code:
>  mvn clean install

## View the 2.0 rendered swagger:
>  Note the output swagger is 2.0 as required by 3scale
>  http://localhost:8080/swagger-ui.html
>  http://localhost:8080/v2/apidocs

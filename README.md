Minimum viable reproducible example for https://github.com/spring-projects/spring-framework/issues/26774.

Run the test in com.example.DemoApplicationTests and note that it fails. Then, change the value in properties-library/src/main/resources/config/application.yml from false to true, and re-run the test. Note that it now succeeds. This indicates that the property value in application-test.yml is being ignored, despite being specified in @ActiveProfiles.

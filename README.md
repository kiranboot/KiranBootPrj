# KiranBootPrj
Kiran Boot Prj

starter boot to web boot: (Embedded Tomcat)
Added -web in the pom.xml dependency to have web capabilities to my boot project
and added CromeController.java with the following annotations:
@Controller
@RequestMapping
@ResponseBody

Note: since we addedd -web you will see many other jars in the prj Maven dependency




running the boot application on Tomcat

in the pom change to war for <packaging>

Extend the SpringBootServletInitializer

and override the method configure()

public class KiranBootPrjApplication extends SpringBootServletInitializer

/**
 *  Used when run as war (packaging in the pom.xml)
 */
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
  return builder.sources(KiranBootPrjApplication.class);
}

Add Tomcat server and Add project to server

need to add context path in the url
http://localhost:8080/demo/getName


https://github.com/spring-projects/spring-boot/tree/master/spring-boot-starters


https://github.com/docker/labs/

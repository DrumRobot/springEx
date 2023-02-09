package com.example.demo;

import java.util.Collections;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.JspConfigDescriptorImpl;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroup;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroupDescriptorImpl;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JspConfig extends SpringBootServletInitializer {

	@Bean
	public ConfigurableServletWebServerFactory configurableServletWebServerFactory() {
		return new TomcatServletWebServerFactory() {

			@Override
			protected void postProcessContext(Context context) {
				super.postProcessContext(context);
				JspPropertyGroup jspPropertyGroup = new JspPropertyGroup();
				jspPropertyGroup.addUrlPattern("*.jsp");
				jspPropertyGroup.setPageEncoding("UTF-8");
				jspPropertyGroup.setScriptingInvalid("false");
				jspPropertyGroup.setTrimWhitespace("true");
				jspPropertyGroup.setDefaultContentType("text/html");
				JspPropertyGroupDescriptorImpl descriptor = new JspPropertyGroupDescriptorImpl(jspPropertyGroup);
				context.setJspConfigDescriptor(new JspConfigDescriptorImpl(
						Collections.singletonList(descriptor), Collections.emptyList()));
			}
		};
	}
}

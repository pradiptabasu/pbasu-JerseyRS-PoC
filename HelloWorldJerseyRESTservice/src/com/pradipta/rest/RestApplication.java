package com.pradipta.rest;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends Application {
	public RestApplication() {
		final Application application = new ResourceConfig().packages(
				"com.pradipta.rest.test").register(
				DeclarativeLinkingFeature.class);
	}
}

package net.sf.lavalamp.application;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import net.sf.lavalamp.site.BuildProperties;
import net.sf.lavalamp.device.DeviceProperties;

import org.junit.Before;
import org.junit.Test;

public class ApplicationPropertiesWebTest {

	ApplicationProperties applicationProperties;
	DeviceProperties[] deviceProperties;

	@Before
	public void setUp() throws FileNotFoundException {
		applicationProperties = new ApplicationPropertiesLoader()
				.load("src/test/resources/test.yml");
		deviceProperties = applicationProperties.getDeviceProperties();

	}

	@Test
	public void shouldLoadFirstDeviceProperties() throws FileNotFoundException {

		DeviceProperties deviceProperty = deviceProperties[0];
		assertEquals("net.sf.lavalamp.device.DummyDevice", deviceProperty
				.getClassName());
		assertEquals("C:/Program Files/Telldus", deviceProperty.getPath());
	}
}

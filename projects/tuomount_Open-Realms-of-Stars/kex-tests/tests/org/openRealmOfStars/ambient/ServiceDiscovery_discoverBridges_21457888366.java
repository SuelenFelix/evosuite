package org.openRealmOfStars.ambient;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.ambient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ServiceDiscovery_discoverBridges_21457888366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383;

    public ServiceDiscovery_discoverBridges_21457888366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383 = newInstance(Class.forName("org.openRealmOfStars.ambient.ServiceDiscovery"));
        setField(term383, term383.getClass(), "socket", null);
        setField(term383, term383.getClass(), "address", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.ServiceDiscovery");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "discoverBridges", argTypes, term383, args);
    }

};



package be.tomcools.dropwizard.websocket.registration;

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
import static be.tomcools.dropwizard.websocket.registration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Endpoints_iterator_10730160639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public Endpoints_iterator_10730160639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.registration.Endpoints"));
        setField(term50, term50.getClass(), "endpointList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.registration.Endpoints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term50, args);
    }

};



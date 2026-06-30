package io.axoniq.demo.bikerental.bikerental.command;

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
import static io.axoniq.demo.bikerental.bikerental.command.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Bike_handle_86266206210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437;

    public Bike_handle_86266206210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.command.Bike"));
        setField(term437, term437.getClass(), "bikeId", null);
        setBooleanField(term437, term437.getClass(), "isAvailable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.command.Bike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.ReturnBikeCommand");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handle", argTypes, term437, args);
    }

};



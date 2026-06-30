package io.axoniq.demo.bikerental.bikerental.coreapi;

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
import static io.axoniq.demo.bikerental.bikerental.coreapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisterBikeCommand_getLocation_19301613763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029;

    public RegisterBikeCommand_getLocation_19301613763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2029 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.RegisterBikeCommand"));
        setField(term2029, term2029.getClass(), "bikeId", "jSpAteRute");
        setField(term2029, term2029.getClass(), "bikeType", "swZVeJAxjt");
        setField(term2029, term2029.getClass(), "location", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.RegisterBikeCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term2029, args);
    }

};



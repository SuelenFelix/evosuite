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

public class Bike_handle_9009047412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term82;

    public Bike_handle_9009047412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.command.Bike"));
        setField(term68, term68.getClass(), "bikeId", "xxtlPwDYFs");
        setBooleanField(term68, term68.getClass(), "isAvailable", false);
        term82 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.RentBikeCommand"));
        setField(term82, term82.getClass(), "bikeId", "jJCZpVmanW");
        setField(term82, term82.getClass(), "renter", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.command.Bike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.RentBikeCommand");
        Object[] args = new Object[1];
        args[0] = term82;
        callMethod(klass, "handle", argTypes, term68, args);
    }

};



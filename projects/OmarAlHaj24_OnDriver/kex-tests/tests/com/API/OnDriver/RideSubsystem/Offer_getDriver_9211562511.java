package com.API.OnDriver.RideSubsystem;

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
import static com.API.OnDriver.RideSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Offer_getDriver_9211562511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988;

    public Offer_getDriver_9211562511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3988 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setDoubleField(term3988, term3988.getClass(), "price", 0.0);
        setDoubleField(term3988, term3988.getClass(), "discountedPrice", 0.0);
        setField(term3988, term3988.getClass(), "driver", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDriver", argTypes, term3988, args);
    }

};



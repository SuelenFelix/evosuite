package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class UserAddresses_getUniqueid_17124620466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337433;

    public UserAddresses_getUniqueid_17124620466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337446 = new ArrayList();
        ((ArrayList) term337446).add("AFRfAPZdqf");
        ((ArrayList) term337446).add("cZrxYHSQhL");
        term337433 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term337433, term337433.getClass(), "uniqueid", "daQciREiuI");
        setField(term337433, term337433.getClass(), "addresses", term337446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUniqueid", argTypes, term337433, args);
    }

};



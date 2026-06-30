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

public class UserAddresses_toString_10023499125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337296;

    public UserAddresses_toString_10023499125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337309 = new ArrayList();
        ((ArrayList) term337309).add("qCsUoglQjM");
        ((ArrayList) term337309).add("BVcWJbDXrQ");
        ((ArrayList) term337309).add("PNxbmyThZc");
        ((ArrayList) term337309).add("fdRVcZbqUf");
        ((ArrayList) term337309).add("aSUSvETRSv");
        term337296 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term337296, term337296.getClass(), "uniqueid", "BaRcksFiYp");
        setField(term337296, term337296.getClass(), "addresses", term337309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term337296, args);
    }

};



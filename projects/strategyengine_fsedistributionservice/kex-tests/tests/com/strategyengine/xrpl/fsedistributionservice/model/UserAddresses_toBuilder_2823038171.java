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

public class UserAddresses_toBuilder_2823038171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336724;

    public UserAddresses_toBuilder_2823038171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336737 = new ArrayList();
        ((ArrayList) term336737).add("CoEwWlFbOr");
        ((ArrayList) term336737).add("oKzUOrAFFo");
        ((ArrayList) term336737).add("cShhTkvRUF");
        ((ArrayList) term336737).add("qgiseKtoqu");
        ((ArrayList) term336737).add("FfGmyAKSaB");
        ((ArrayList) term336737).add("icoPCGhgWH");
        ((ArrayList) term336737).add("CHQBuYSRSj");
        term336724 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term336724, term336724.getClass(), "uniqueid", "PEDTNvvicf");
        setField(term336724, term336724.getClass(), "addresses", term336737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term336724, args);
    }

};



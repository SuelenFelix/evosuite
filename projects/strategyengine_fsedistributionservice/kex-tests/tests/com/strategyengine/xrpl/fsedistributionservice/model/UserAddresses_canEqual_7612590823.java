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

public class UserAddresses_canEqual_7612590823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337109;
     Object term337150;

    public UserAddresses_canEqual_7612590823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337122 = new ArrayList();
        ((ArrayList) term337122).add("SwynsBLJcI");
        ((ArrayList) term337122).add("yXgTitaDXW");
        term337109 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term337109, term337109.getClass(), "uniqueid", "mnrQVzZjuq");
        setField(term337109, term337109.getClass(), "addresses", term337122);
        term337150 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term337150;
        callMethod(klass, "canEqual", argTypes, term337109, args);
    }

};



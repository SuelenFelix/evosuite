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
import java.util.LinkedList;

public class UserAddresses_setAddresses_8778638311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337873;
     Object term337914;

    public UserAddresses_setAddresses_8778638311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337886 = new ArrayList();
        ((ArrayList) term337886).add("GoCyvRPeGu");
        ((ArrayList) term337886).add("qokvePyIUm");
        term337873 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term337873, term337873.getClass(), "uniqueid", "uXqaYisYbX");
        setField(term337873, term337873.getClass(), "addresses", term337886);
        term337914 = new LinkedList();
        ((LinkedList) term337914).add("mdkCDAisEP");
        ((LinkedList) term337914).add("KCXlVnMQNa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term337914;
        callMethod(klass, "setAddresses", argTypes, term337873, args);
    }

};



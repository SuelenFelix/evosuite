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

public class UserAddresses_equals_429035472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336905;
     Object term337018;

    public UserAddresses_equals_429035472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336918 = new ArrayList();
        ((ArrayList) term336918).add("hKmKbZReWq");
        ((ArrayList) term336918).add("dVNQlaRjno");
        ((ArrayList) term336918).add("heuePoxaMW");
        ((ArrayList) term336918).add("MxqYtTLyvM");
        ((ArrayList) term336918).add("FuAWIrUgQq");
        ((ArrayList) term336918).add("GMuFrECYuC");
        ((ArrayList) term336918).add("sgrKLUdnej");
        ((ArrayList) term336918).add("COSohDlJwZ");
        term336905 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term336905, term336905.getClass(), "uniqueid", "UyXrmrYEff");
        setField(term336905, term336905.getClass(), "addresses", term336918);
        term337018 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term337018;
        callMethod(klass, "equals", argTypes, term336905, args);
    }

};



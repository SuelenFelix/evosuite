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

public class FseAccount_FseAccountBuilder_build_62501771714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78490;

    public FseAccount_FseAccountBuilder_build_62501771714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78490 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        setField(term78490, term78490.getClass(), "classicAddress", null);
        setField(term78490, term78490.getClass(), "xrpBalance", null);
        setField(term78490, term78490.getClass(), "trustLines", null);
        setField(term78490, term78490.getClass(), "activationAddress", null);
        setField(term78490, term78490.getClass(), "blackholed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term78490, args);
    }

};



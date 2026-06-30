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

public class UserAddresses_UserAddressesBuilder_uniqueid_9335580241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336041;

    public UserAddresses_UserAddressesBuilder_uniqueid_9335580241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336054 = new ArrayList();
        ((ArrayList) term336054).add("FXnVCgcJAm");
        ((ArrayList) term336054).add("noOpWudfzV");
        ((ArrayList) term336054).add("OWORKBHHIN");
        term336041 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder"));
        setField(term336041, term336041.getClass(), "uniqueid", "RWefwvwipX");
        setField(term336041, term336041.getClass(), "addresses", term336054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sbvPxiaOoC";
        callMethod(klass, "uniqueid", argTypes, term336041, args);
    }

};



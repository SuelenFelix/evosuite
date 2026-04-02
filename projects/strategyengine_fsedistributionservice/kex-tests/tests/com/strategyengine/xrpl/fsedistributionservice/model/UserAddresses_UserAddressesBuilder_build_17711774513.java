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

public class UserAddresses_UserAddressesBuilder_build_17711774513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336446;

    public UserAddresses_UserAddressesBuilder_build_17711774513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336459 = new ArrayList();
        ((ArrayList) term336459).add("EmYykcYSYU");
        ((ArrayList) term336459).add("tmkiHdXIso");
        ((ArrayList) term336459).add("iivsdaIdLe");
        ((ArrayList) term336459).add("yNZErAgZDk");
        ((ArrayList) term336459).add("gyeAErvtXb");
        ((ArrayList) term336459).add("IEsZEVbFZG");
        ((ArrayList) term336459).add("hefxCEhnuL");
        term336446 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder"));
        setField(term336446, term336446.getClass(), "uniqueid", "BDiGllEiZb");
        setField(term336446, term336446.getClass(), "addresses", term336459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term336446, args);
    }

};



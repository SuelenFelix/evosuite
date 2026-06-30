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

public class FseWallet_equals_20665468051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332627;
     Object term332676;

    public FseWallet_equals_20665468051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332627 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet"));
        setField(term332627, term332627.getClass(), "fromClassicAddress", "BVIBVYApBG");
        setField(term332627, term332627.getClass(), "fromSigningPublicKey", "rDMARKSlyU");
        setField(term332627, term332627.getClass(), "fromPrivateKey", "pdwBEXDsZz");
        setField(term332627, term332627.getClass(), "userSeed", "ODCEExTkfn");
        term332676 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term332676;
        callMethod(klass, "equals", argTypes, term332627, args);
    }

};



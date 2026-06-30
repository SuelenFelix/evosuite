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

public class FseWallet_getFromPrivateKey_78516374222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333880;

    public FseWallet_getFromPrivateKey_78516374222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333880 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet"));
        setField(term333880, term333880.getClass(), "fromClassicAddress", null);
        setField(term333880, term333880.getClass(), "fromSigningPublicKey", null);
        setField(term333880, term333880.getClass(), "fromPrivateKey", null);
        setField(term333880, term333880.getClass(), "userSeed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromPrivateKey", argTypes, term333880, args);
    }

};



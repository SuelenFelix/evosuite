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

public class FseWallet_getUserSeed_77416770023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333881;

    public FseWallet_getUserSeed_77416770023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333881 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet"));
        setField(term333881, term333881.getClass(), "fromClassicAddress", null);
        setField(term333881, term333881.getClass(), "fromSigningPublicKey", null);
        setField(term333881, term333881.getClass(), "fromPrivateKey", null);
        setField(term333881, term333881.getClass(), "userSeed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserSeed", argTypes, term333881, args);
    }

};



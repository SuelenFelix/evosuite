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

public class FseWallet_FseWalletBuilder_toString_3617917806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18892;

    public FseWallet_FseWalletBuilder_toString_3617917806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18892 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder"));
        setField(term18892, term18892.getClass(), "fromClassicAddress", "qFGKIJjlmV");
        setField(term18892, term18892.getClass(), "fromSigningPublicKey", "IHqvyhMtuM");
        setField(term18892, term18892.getClass(), "fromPrivateKey", "dAldIGYAXV");
        setField(term18892, term18892.getClass(), "userSeed", "mLwibAPEsa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18892, args);
    }

};



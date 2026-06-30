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

public class FseWallet_setFromClassicAddress_119820706811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333429;

    public FseWallet_setFromClassicAddress_119820706811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333429 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet"));
        setField(term333429, term333429.getClass(), "fromClassicAddress", "EEigYHpeLr");
        setField(term333429, term333429.getClass(), "fromSigningPublicKey", "iOZRBGDCUA");
        setField(term333429, term333429.getClass(), "fromPrivateKey", "SNLGmwYLAV");
        setField(term333429, term333429.getClass(), "userSeed", "FskwpQdCkf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GQONGOQPIz";
        callMethod(klass, "setFromClassicAddress", argTypes, term333429, args);
    }

};



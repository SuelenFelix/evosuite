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

public class FseWallet_FseWalletBuilder_build_15059820195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18803;

    public FseWallet_FseWalletBuilder_build_15059820195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18803 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder"));
        setField(term18803, term18803.getClass(), "fromClassicAddress", "VDokbsCuqq");
        setField(term18803, term18803.getClass(), "fromSigningPublicKey", "xClUIcPECX");
        setField(term18803, term18803.getClass(), "fromPrivateKey", "avhRaGZaBF");
        setField(term18803, term18803.getClass(), "userSeed", "JkgoRtImdE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term18803, args);
    }

};



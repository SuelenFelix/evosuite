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

public class FseWallet_FseWalletBuilder_fromClassicAddress_8828224401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18359;

    public FseWallet_FseWalletBuilder_fromClassicAddress_8828224401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18359 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder"));
        setField(term18359, term18359.getClass(), "fromClassicAddress", "YAXkVjQZcV");
        setField(term18359, term18359.getClass(), "fromSigningPublicKey", "pumvwBWvpy");
        setField(term18359, term18359.getClass(), "fromPrivateKey", "HwLHeGLyhe");
        setField(term18359, term18359.getClass(), "userSeed", "RDnkgWkcbz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IBpaxltauX";
        callMethod(klass, "fromClassicAddress", argTypes, term18359, args);
    }

};



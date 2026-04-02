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

public class FseWallet_FseWalletBuilder_fromPrivateKey_2614104343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18581;

    public FseWallet_FseWalletBuilder_fromPrivateKey_2614104343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18581 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder"));
        setField(term18581, term18581.getClass(), "fromClassicAddress", "lZIgPZPgTu");
        setField(term18581, term18581.getClass(), "fromSigningPublicKey", "iuCxnHGMoW");
        setField(term18581, term18581.getClass(), "fromPrivateKey", "GPSEWEDSTo");
        setField(term18581, term18581.getClass(), "userSeed", "RCOqfVsRHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseWallet$FseWalletBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TSyCeEZPaT";
        callMethod(klass, "fromPrivateKey", argTypes, term18581, args);
    }

};



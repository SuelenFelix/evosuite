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

public class FsePaymentResult_setClassicAddress_97556281043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326625;

    public FsePaymentResult_setClassicAddress_97556281043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326625 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term326625, term326625.getClass(), "id", null);
        setField(term326625, term326625.getClass(), "responseCode", null);
        setField(term326625, term326625.getClass(), "reason", null);
        setField(term326625, term326625.getClass(), "classicAddress", null);
        setField(term326625, term326625.getClass(), "status", null);
        setField(term326625, term326625.getClass(), "paymentAmount", null);
        setField(term326625, term326625.getClass(), "snapshotBalance", null);
        setField(term326625, term326625.getClass(), "nftOwned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClassicAddress", argTypes, term326625, args);
    }

};



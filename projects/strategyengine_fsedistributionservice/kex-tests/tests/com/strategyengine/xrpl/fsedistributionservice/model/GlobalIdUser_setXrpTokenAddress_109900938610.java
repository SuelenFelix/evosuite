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
import java.lang.Object;
import java.lang.Integer;

public class GlobalIdUser_setXrpTokenAddress_109900938610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11629;
     Object term11657;

    public GlobalIdUser_setXrpTokenAddress_109900938610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11655 = new Integer(1622346318);
        term11629 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser"));
        Object term11630 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress"));
        setField(term11630, term11630.getClass(), "currencyName", "pJbnHTYrxn");
        setField(term11630, term11630.getClass(), "classicAddress", "iIRsCSYqXH");
        setField(term11629, term11629.getClass(), "xrpTokenAddress", term11630);
        setField(term11629, term11629.getClass(), "totalVerifications", term11655);
        term11657 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress"));
        setField(term11657, term11657.getClass(), "currencyName", "nghfqDXyCG");
        setField(term11657, term11657.getClass(), "classicAddress", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress");
        Object[] args = new Object[1];
        args[0] = term11657;
        callMethod(klass, "setXrpTokenAddress", argTypes, term11629, args);
    }

};



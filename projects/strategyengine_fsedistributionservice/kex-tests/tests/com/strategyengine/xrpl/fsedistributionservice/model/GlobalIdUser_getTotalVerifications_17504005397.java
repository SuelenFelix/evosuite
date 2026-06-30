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

public class GlobalIdUser_getTotalVerifications_17504005397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11534;

    public GlobalIdUser_getTotalVerifications_17504005397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11560 = new Integer(-1685132342);
        term11534 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser"));
        Object term11535 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress"));
        setField(term11535, term11535.getClass(), "currencyName", "XfRABIFVEp");
        setField(term11535, term11535.getClass(), "classicAddress", "MHGKyEnwKc");
        setField(term11534, term11534.getClass(), "xrpTokenAddress", term11535);
        setField(term11534, term11534.getClass(), "totalVerifications", term11560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalVerifications", argTypes, term11534, args);
    }

};



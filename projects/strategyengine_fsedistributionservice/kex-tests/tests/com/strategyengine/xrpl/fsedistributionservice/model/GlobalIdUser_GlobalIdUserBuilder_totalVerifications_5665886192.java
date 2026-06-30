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

public class GlobalIdUser_GlobalIdUserBuilder_totalVerifications_5665886192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446501;
     Object term446529;

    public GlobalIdUser_GlobalIdUserBuilder_totalVerifications_5665886192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term446527 = new Integer(1320570890);
        term446501 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser$GlobalIdUserBuilder"));
        Object term446502 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress"));
        setField(term446502, term446502.getClass(), "currencyName", "CtxCIgenEk");
        setField(term446502, term446502.getClass(), "classicAddress", "BxNhqJkpzh");
        setField(term446501, term446501.getClass(), "xrpTokenAddress", term446502);
        setField(term446501, term446501.getClass(), "totalVerifications", term446527);
        term446529 = new Integer(-130649791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser$GlobalIdUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term446529;
        callMethod(klass, "totalVerifications", argTypes, term446501, args);
    }

};



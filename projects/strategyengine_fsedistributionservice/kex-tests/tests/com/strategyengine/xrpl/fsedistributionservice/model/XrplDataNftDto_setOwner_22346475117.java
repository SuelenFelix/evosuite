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
import java.lang.Long;

public class XrplDataNftDto_setOwner_22346475117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335386;

    public XrplDataNftDto_setOwner_22346475117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335423 = new Long(-4645802432501468482L);
        Long term335425 = new Long(797348855178248421L);
        Long term335427 = new Long(4140938707845767186L);
        Long term335429 = new Long(-6049958218605558734L);
        term335386 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335386, term335386.getClass(), "nfTokenID", "KYrVRQYYLY");
        setField(term335386, term335386.getClass(), "issuer", "iiXiwzHGtZ");
        setField(term335386, term335386.getClass(), "owner", "vMUryzcVEt");
        setField(term335386, term335386.getClass(), "taxon", term335423);
        setField(term335386, term335386.getClass(), "transferFee", term335425);
        setField(term335386, term335386.getClass(), "flags", term335427);
        setField(term335386, term335386.getClass(), "sequence", term335429);
        setField(term335386, term335386.getClass(), "uri", "bekkhEJXox");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pTiGxmDpUW";
        callMethod(klass, "setOwner", argTypes, term335386, args);
    }

};



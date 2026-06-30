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

public class XrplDataNftDto_setUri_28920700022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335901;

    public XrplDataNftDto_setUri_28920700022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335938 = new Long(54468717425932218L);
        Long term335940 = new Long(5860114696949347386L);
        Long term335942 = new Long(3415381732664403599L);
        Long term335944 = new Long(3853271903861685327L);
        term335901 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335901, term335901.getClass(), "nfTokenID", "ndJgNFVDzv");
        setField(term335901, term335901.getClass(), "issuer", "GLSpCLEiGN");
        setField(term335901, term335901.getClass(), "owner", "JiekpKxKqu");
        setField(term335901, term335901.getClass(), "taxon", term335938);
        setField(term335901, term335901.getClass(), "transferFee", term335940);
        setField(term335901, term335901.getClass(), "flags", term335942);
        setField(term335901, term335901.getClass(), "sequence", term335944);
        setField(term335901, term335901.getClass(), "uri", "fZAngeuZqR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zlkNfxvlVJ";
        callMethod(klass, "setUri", argTypes, term335901, args);
    }

};



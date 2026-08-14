package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CurrentAlert_setId_19935783835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3691;

    public CurrentAlert_setId_19935783835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3691 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term3728 = (Object[]) newArray("java.lang.String", 1);
        setField(term3691, term3691.getClass(), "id", "BRIVNtfUWU");
        setField(term3691, term3691.getClass(), "cat", "DbiCVtPPCT");
        setField(term3691, term3691.getClass(), "title", "WzFopsaDuG");
        setElement(term3728, 0, "PapWxkhEWe");
        setField(term3691, term3691.getClass(), "data", term3728);
        setField(term3691, term3691.getClass(), "desc", "smnHEqRFRx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XYtryyobou";
        callMethod(klass, "setId", argTypes, term3691, args);
    }

};



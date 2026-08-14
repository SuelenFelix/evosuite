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

public class CurrentAlert_toString_15062903813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5206;

    public CurrentAlert_toString_15062903813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5206 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term5243 = (Object[]) newArray("java.lang.String", 5);
        setField(term5206, term5206.getClass(), "id", "aSkmSwTnEw");
        setField(term5206, term5206.getClass(), "cat", "xvkbvaEGYd");
        setField(term5206, term5206.getClass(), "title", "HBGNxdNURv");
        setElement(term5243, 0, "mfCpTPPQQm");
        setElement(term5243, 1, "OcJCIDNIXA");
        setElement(term5243, 2, "XfRABIFVEp");
        setElement(term5243, 3, "MHGKyEnwKc");
        setElement(term5243, 4, "ShIELyuULw");
        setField(term5206, term5206.getClass(), "data", term5243);
        setField(term5206, term5206.getClass(), "desc", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5206, args);
    }

};



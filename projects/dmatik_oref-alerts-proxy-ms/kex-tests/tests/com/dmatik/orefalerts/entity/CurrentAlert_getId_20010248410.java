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

public class CurrentAlert_getId_20010248410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2779;

    public CurrentAlert_getId_20010248410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2779 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term2816 = (Object[]) newArray("java.lang.String", 6);
        setField(term2779, term2779.getClass(), "id", "hCWPJQKpdc");
        setField(term2779, term2779.getClass(), "cat", "WzMEhMXkKx");
        setField(term2779, term2779.getClass(), "title", "XOiDvlDhdc");
        setElement(term2816, 0, "AdxvLJhNLe");
        setElement(term2816, 1, "lHfTrWKMPk");
        setElement(term2816, 2, "JDaAnsVTGV");
        setElement(term2816, 3, "mLUZFTfjle");
        setElement(term2816, 4, "xIeFjkHkOe");
        setElement(term2816, 5, "SdCKLMIYnX");
        setField(term2779, term2779.getClass(), "data", term2816);
        setField(term2779, term2779.getClass(), "desc", "OJJtVNPyKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2779, args);
    }

};



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

public class CurrentAlert_getCat_246882621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3001;

    public CurrentAlert_getCat_246882621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3001 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term3038 = (Object[]) newArray("java.lang.String", 5);
        setField(term3001, term3001.getClass(), "id", "AKNapTAfmD");
        setField(term3001, term3001.getClass(), "cat", "xJgPlLxpgC");
        setField(term3001, term3001.getClass(), "title", "EYtfuJaxiM");
        setElement(term3038, 0, "gCWtLVKVVe");
        setElement(term3038, 1, "fWKJoSoCwE");
        setElement(term3038, 2, "wfaXBpWAUH");
        setElement(term3038, 3, "VMeAzAHwZj");
        setElement(term3038, 4, "PznxWXsZME");
        setField(term3001, term3001.getClass(), "data", term3038);
        setField(term3001, term3001.getClass(), "desc", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCat", argTypes, term3001, args);
    }

};



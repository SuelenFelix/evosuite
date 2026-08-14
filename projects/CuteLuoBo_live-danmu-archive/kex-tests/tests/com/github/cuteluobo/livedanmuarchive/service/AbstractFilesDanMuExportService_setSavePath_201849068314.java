package com.github.cuteluobo.livedanmuarchive.service;

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
import static com.github.cuteluobo.livedanmuarchive.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AbstractFilesDanMuExportService_setSavePath_201849068314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227515;

    public AbstractFilesDanMuExportService_setSavePath_201849068314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term227551 = Class.forName((String) "java.io.File$PathStatus");
        Field term227550 = ((Class) term227551).getDeclaredField((String) "INVALID");
        ((Field) term227550).setAccessible(true);
        Object enum211 = ((Field) term227550).get((Object) null);
        term227515 = newInstance(Class.forName("java.io.File"));
        setField(term227515, term227515.getClass(), "path", "OHliEqVque");
        setField(term227515, term227515.getClass(), "status", enum211);
        setIntField(term227515, term227515.getClass(), "prefixLength", 1364414277);
        setField(term227515, term227515.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.AbstractFilesDanMuExportService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term227515;
        callMethod(klass, "setSavePath", argTypes, null, args);
    }

};



package com.scaleguard.server.licencing.licensing;

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
import static com.scaleguard.server.licencing.licensing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class LicenceUtil_copyFile_1773501534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19859;
     Object term19884;

    public LicenceUtil_copyFile_1773501534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19931 = Class.forName((String) "java.io.File$PathStatus");
        Field term19930 = ((Class) term19931).getDeclaredField((String) "INVALID");
        ((Field) term19930).setAccessible(true);
        Object enum0 = ((Field) term19930).get((Object) null);
        term19859 = newInstance(Class.forName("java.io.File"));
        setField(term19859, term19859.getClass(), "path", "QJrTMTdxyh");
        setField(term19859, term19859.getClass(), "status", enum0);
        setIntField(term19859, term19859.getClass(), "prefixLength", 1484323161);
        setField(term19859, term19859.getClass(), "filePath", null);
        term19884 = newInstance(Class.forName("java.io.File"));
        setField(term19884, term19884.getClass(), "path", "rgZSPplPSs");
        setField(term19884, term19884.getClass(), "status", enum0);
        setIntField(term19884, term19884.getClass(), "prefixLength", 391863371);
        setField(term19884, term19884.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term19859;
        args[1] = term19884;
        callMethod(klass, "copyFile", argTypes, null, args);
    }

};



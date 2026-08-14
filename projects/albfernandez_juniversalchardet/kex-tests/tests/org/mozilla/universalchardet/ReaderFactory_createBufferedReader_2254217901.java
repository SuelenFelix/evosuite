package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ReaderFactory_createBufferedReader_2254217901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405840;

    public ReaderFactory_createBufferedReader_2254217901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term405876 = Class.forName((String) "java.io.File$PathStatus");
        Field term405875 = ((Class) term405876).getDeclaredField((String) "INVALID");
        ((Field) term405875).setAccessible(true);
        Object enum101 = ((Field) term405875).get((Object) null);
        term405840 = newInstance(Class.forName("java.io.File"));
        setField(term405840, term405840.getClass(), "path", "jDtqGUpnZN");
        setField(term405840, term405840.getClass(), "status", enum101);
        setIntField(term405840, term405840.getClass(), "prefixLength", -75206835);
        setField(term405840, term405840.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.ReaderFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = term405840;
        args[1] = null;
        callMethod(klass, "createBufferedReader", argTypes, null, args);
    }

};



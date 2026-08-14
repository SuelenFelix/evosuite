package io.polivakha.mojo.properties.models;

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
import static io.polivakha.mojo.properties.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FileResource_toString_18721003043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;

    public FileResource_toString_18721003043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term596 = Class.forName((String) "java.io.File$PathStatus");
        Field term595 = ((Class) term596).getDeclaredField((String) "INVALID");
        ((Field) term595).setAccessible(true);
        Object enum3 = ((Field) term595).get((Object) null);
        term559 = newInstance(Class.forName("io.polivakha.mojo.properties.models.FileResource"));
        Object term560 = newInstance(Class.forName("java.io.File"));
        setField(term560, term560.getClass(), "path", "xxtlPwDYFs");
        setField(term560, term560.getClass(), "status", enum3);
        setIntField(term560, term560.getClass(), "prefixLength", 391863371);
        setField(term560, term560.getClass(), "filePath", null);
        setField(term559, term559.getClass(), "file", term560);
        setField(term559, term559.getClass(), "stream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.models.FileResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term559, args);
    }

};



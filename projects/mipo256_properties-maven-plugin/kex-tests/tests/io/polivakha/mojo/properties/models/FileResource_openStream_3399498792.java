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

public class FileResource_openStream_3399498792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;

    public FileResource_openStream_3399498792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term417 = Class.forName((String) "java.io.File$PathStatus");
        Field term416 = ((Class) term417).getDeclaredField((String) "INVALID");
        ((Field) term416).setAccessible(true);
        Object enum2 = ((Field) term416).get((Object) null);
        term380 = newInstance(Class.forName("io.polivakha.mojo.properties.models.FileResource"));
        Object term381 = newInstance(Class.forName("java.io.File"));
        setField(term381, term381.getClass(), "path", "MuLcgQHgqz");
        setField(term381, term381.getClass(), "status", enum2);
        setIntField(term381, term381.getClass(), "prefixLength", 1484323161);
        setField(term381, term381.getClass(), "filePath", null);
        setField(term380, term380.getClass(), "file", term381);
        setField(term380, term380.getClass(), "stream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.models.FileResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "openStream", argTypes, term380, args);
    }

};



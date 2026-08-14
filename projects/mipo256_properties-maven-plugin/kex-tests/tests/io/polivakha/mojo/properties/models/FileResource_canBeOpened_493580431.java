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

public class FileResource_canBeOpened_493580431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public FileResource_canBeOpened_493580431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term238 = Class.forName((String) "java.io.File$PathStatus");
        Field term237 = ((Class) term238).getDeclaredField((String) "INVALID");
        ((Field) term237).setAccessible(true);
        Object enum1 = ((Field) term237).get((Object) null);
        term201 = newInstance(Class.forName("io.polivakha.mojo.properties.models.FileResource"));
        Object term202 = newInstance(Class.forName("java.io.File"));
        setField(term202, term202.getClass(), "path", "sjlJAEtRrb");
        setField(term202, term202.getClass(), "status", enum1);
        setIntField(term202, term202.getClass(), "prefixLength", 1162663216);
        setField(term202, term202.getClass(), "filePath", null);
        setField(term201, term201.getClass(), "file", term202);
        setField(term201, term201.getClass(), "stream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.models.FileResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBeOpened", argTypes, term201, args);
    }

};



package io.polivakha.mojo.properties.utils;

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
import static io.polivakha.mojo.properties.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PathParser_removeTrailingSlashIfPresent_19494691204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public PathParser_removeTrailingSlashIfPresent_19494691204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term46 = (byte[]) newByteArray(16);
        setField(term45, term45.getClass(), "value", term46);
        setByteField(term45, term45.getClass(), "coder", (byte) 47);
        setIntField(term45, term45.getClass(), "count", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.utils.PathParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term45;
        callMethod(klass, "removeTrailingSlashIfPresent", argTypes, null, args);
    }

};



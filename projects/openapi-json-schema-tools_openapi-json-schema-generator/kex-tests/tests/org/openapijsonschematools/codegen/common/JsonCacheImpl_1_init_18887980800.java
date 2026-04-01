package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JsonCacheImpl_1_init_18887980800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3617;

    public JsonCacheImpl_1_init_18887980800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3675 = Class.forName((String) "java.io.File$PathStatus");
        Field term3674 = ((Class) term3675).getDeclaredField((String) "INVALID");
        ((Field) term3674).setAccessible(true);
        Object enum8 = ((Field) term3674).get((Object) null);
        term3617 = newInstance(Class.forName("java.io.File"));
        setField(term3617, term3617.getClass(), "path", "uuaPigETmJ");
        setField(term3617, term3617.getClass(), "status", enum8);
        setIntField(term3617, term3617.getClass(), "prefixLength", -817164822);
        setField(term3617, term3617.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3617;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



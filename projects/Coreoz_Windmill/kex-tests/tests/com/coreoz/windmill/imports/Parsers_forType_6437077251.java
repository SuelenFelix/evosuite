package com.coreoz.windmill.imports;

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
import static com.coreoz.windmill.imports.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Parsers_forType_6437077251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public Parsers_forType_6437077251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207 = Class.forName((String) "com.coreoz.windmill.files.FileType");
        Field term206 = ((Class) term207).getDeclaredField((String) "CFBF");
        ((Field) term206).setAccessible(true);
        enum0 = ((Field) term206).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.Parsers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.FileType");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "forType", argTypes, null, args);
    }

};



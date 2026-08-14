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

public class DryRunStatus_init_12785176632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum11;

    public DryRunStatus_init_12785176632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7329 = Class.forName((String) "org.openapijsonschematools.codegen.common.DryRunStatus$State");
        Field term7328 = ((Class) term7329).getDeclaredField((String) "Error");
        ((Field) term7328).setAccessible(true);
        enum11 = ((Field) term7328).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus$State");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum11;
        args[2] = "tbcdzjIfER";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



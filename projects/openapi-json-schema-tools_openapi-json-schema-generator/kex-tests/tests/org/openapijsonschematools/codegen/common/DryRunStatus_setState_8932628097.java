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

public class DryRunStatus_setState_8932628097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9299;
     Object enum16;

    public DryRunStatus_setState_8932628097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9355 = Class.forName((String) "org.openapijsonschematools.codegen.common.DryRunStatus$State");
        Field term9354 = ((Class) term9355).getDeclaredField((String) "SkippedOverwrite");
        ((Field) term9354).setAccessible(true);
        enum16 = ((Field) term9354).get((Object) null);
        term9299 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus"));
        setField(term9299, term9299.getClass(), "path", null);
        setField(term9299, term9299.getClass(), "state", enum16);
        setField(term9299, term9299.getClass(), "reason", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus$State");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "setState", argTypes, term9299, args);
    }

};



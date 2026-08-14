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

public class DryRunStatus_getReason_15421737185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8487;

    public DryRunStatus_getReason_15421737185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8548 = Class.forName((String) "org.openapijsonschematools.codegen.common.DryRunStatus$State");
        Field term8547 = ((Class) term8548).getDeclaredField((String) "Error");
        ((Field) term8547).setAccessible(true);
        Object enum14 = ((Field) term8547).get((Object) null);
        term8487 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus"));
        setField(term8487, term8487.getClass(), "path", null);
        setField(term8487, term8487.getClass(), "state", enum14);
        setField(term8487, term8487.getClass(), "reason", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term8487, args);
    }

};



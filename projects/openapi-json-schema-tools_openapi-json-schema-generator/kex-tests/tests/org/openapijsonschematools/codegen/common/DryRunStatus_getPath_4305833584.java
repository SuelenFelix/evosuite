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

public class DryRunStatus_getPath_4305833584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8080;

    public DryRunStatus_getPath_4305833584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8135 = Class.forName((String) "org.openapijsonschematools.codegen.common.DryRunStatus$State");
        Field term8134 = ((Class) term8135).getDeclaredField((String) "WriteIfNewer");
        ((Field) term8134).setAccessible(true);
        Object enum13 = ((Field) term8134).get((Object) null);
        term8080 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus"));
        setField(term8080, term8080.getClass(), "path", null);
        setField(term8080, term8080.getClass(), "state", enum13);
        setField(term8080, term8080.getClass(), "reason", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term8080, args);
    }

};



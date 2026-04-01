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

public class DryRunStatus_getState_12603591757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8880;

    public DryRunStatus_getState_12603591757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8936 = Class.forName((String) "org.openapijsonschematools.codegen.common.DryRunStatus$State");
        Field term8935 = ((Class) term8936).getDeclaredField((String) "SkippedOverwrite");
        ((Field) term8935).setAccessible(true);
        Object enum15 = ((Field) term8935).get((Object) null);
        term8880 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus"));
        setField(term8880, term8880.getClass(), "path", null);
        setField(term8880, term8880.getClass(), "state", enum15);
        setField(term8880, term8880.getClass(), "reason", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.DryRunStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term8880, args);
    }

};



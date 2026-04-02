package org.camunda.community.zeebe.testutils.stubs;

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
import static org.camunda.community.zeebe.testutils.stubs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ActivatedJobStub_Status_values_20082761273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public ActivatedJobStub_Status_values_20082761273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78 = Class.forName((String) "org.camunda.community.zeebe.testutils.stubs.ActivatedJobStub$Status");
        Field term77 = ((Class) term78).getDeclaredField((String) "ACTIVATED");
        ((Field) term77).setAccessible(true);
        enum0 = ((Field) term77).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.camunda.community.zeebe.testutils.stubs.ActivatedJobStub$Status");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum0, args);
    }

};



package com.pfa.app.model.id;

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
import static com.pfa.app.model.id.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AssignmentId_hashCode_84801452418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;

    public AssignmentId_hashCode_84801452418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("com.pfa.app.model.id.AssignmentId"));
        setField(term156, term156.getClass(), "employeeId", null);
        setField(term156, term156.getClass(), "projectId", null);
        setField(term156, term156.getClass(), "commitDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term156, args);
    }

};



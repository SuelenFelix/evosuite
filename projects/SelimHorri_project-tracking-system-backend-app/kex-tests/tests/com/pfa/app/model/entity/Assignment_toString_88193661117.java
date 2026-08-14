package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Assignment_toString_88193661117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8621;

    public Assignment_toString_88193661117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8621 = newInstance(Class.forName("com.pfa.app.model.entity.Assignment"));
        setField(term8621, term8621.getClass(), "employeeId", null);
        setField(term8621, term8621.getClass(), "projectId", null);
        setField(term8621, term8621.getClass(), "commitDate", null);
        setField(term8621, term8621.getClass(), "commitEmpDesc", null);
        setField(term8621, term8621.getClass(), "commitMgrDesc", null);
        setField(term8621, term8621.getClass(), "employee", null);
        setField(term8621, term8621.getClass(), "project", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Assignment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8621, args);
    }

};



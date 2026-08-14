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

public class Assignment_setCommitMgrDesc_155691269125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8629;

    public Assignment_setCommitMgrDesc_155691269125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8629 = newInstance(Class.forName("com.pfa.app.model.entity.Assignment"));
        setField(term8629, term8629.getClass(), "employeeId", null);
        setField(term8629, term8629.getClass(), "projectId", null);
        setField(term8629, term8629.getClass(), "commitDate", null);
        setField(term8629, term8629.getClass(), "commitEmpDesc", null);
        setField(term8629, term8629.getClass(), "commitMgrDesc", null);
        setField(term8629, term8629.getClass(), "employee", null);
        setField(term8629, term8629.getClass(), "project", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Assignment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCommitMgrDesc", argTypes, term8629, args);
    }

};



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

public class Assignment_setProject_60183475829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8633;

    public Assignment_setProject_60183475829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8633 = newInstance(Class.forName("com.pfa.app.model.entity.Assignment"));
        setField(term8633, term8633.getClass(), "employeeId", null);
        setField(term8633, term8633.getClass(), "projectId", null);
        setField(term8633, term8633.getClass(), "commitDate", null);
        setField(term8633, term8633.getClass(), "commitEmpDesc", null);
        setField(term8633, term8633.getClass(), "commitMgrDesc", null);
        setField(term8633, term8633.getClass(), "employee", null);
        setField(term8633, term8633.getClass(), "project", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Assignment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Project");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProject", argTypes, term8633, args);
    }

};



package com.jakubduchon.webapidemo.projects;

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
import static com.jakubduchon.webapidemo.projects.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Project_enrollEmployee_123868753013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;

    public Project_enrollEmployee_123868753013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term891, term891.getClass(), "id", null);
        setField(term891, term891.getClass(), "name", null);
        setField(term891, term891.getClass(), "description", null);
        setField(term891, term891.getClass(), "enrolledEmployees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "enrollEmployee", argTypes, term891, args);
    }

};



package com.pfa.app.model.dto;

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
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProjectDTO_getAssignedEmployees_47555267420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2512;

    public ProjectDTO_getAssignedEmployees_47555267420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2512 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term2512, term2512.getClass(), "title", null);
        setField(term2512, term2512.getClass(), "startDate", null);
        setField(term2512, term2512.getClass(), "endDate", null);
        setField(term2512, term2512.getClass(), "status", null);
        setField(term2512, term2512.getClass(), "assignedEmployees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssignedEmployees", argTypes, term2512, args);
    }

};



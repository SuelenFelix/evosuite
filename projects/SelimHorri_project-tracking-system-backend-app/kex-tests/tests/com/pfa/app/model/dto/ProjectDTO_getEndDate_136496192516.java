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

public class ProjectDTO_getEndDate_136496192516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2508;

    public ProjectDTO_getEndDate_136496192516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2508 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term2508, term2508.getClass(), "title", null);
        setField(term2508, term2508.getClass(), "startDate", null);
        setField(term2508, term2508.getClass(), "endDate", null);
        setField(term2508, term2508.getClass(), "status", null);
        setField(term2508, term2508.getClass(), "assignedEmployees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term2508, args);
    }

};



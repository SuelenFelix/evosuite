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
import java.util.ArrayList;

public class ProjectDTO_getEndDate_13649619255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1384;

    public ProjectDTO_getEndDate_13649619255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1433 = new ArrayList();
        term1384 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term1384, term1384.getClass(), "title", "nHXjMycHlU");
        setField(term1384, term1384.getClass(), "startDate", "ieCtQFdkii");
        setField(term1384, term1384.getClass(), "endDate", "dEnhdmILtU");
        setField(term1384, term1384.getClass(), "status", "hoicvmsovO");
        setField(term1384, term1384.getClass(), "assignedEmployees", term1433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term1384, args);
    }

};



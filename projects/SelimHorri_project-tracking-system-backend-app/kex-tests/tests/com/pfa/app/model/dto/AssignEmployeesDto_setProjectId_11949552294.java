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

public class AssignEmployeesDto_setProjectId_11949552294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11770;

    public AssignEmployeesDto_setProjectId_11949552294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11795 = new ArrayList();
        term11770 = newInstance(Class.forName("com.pfa.app.model.dto.AssignEmployeesDto"));
        setField(term11770, term11770.getClass(), "projectId", "ndAITnOsny");
        setField(term11770, term11770.getClass(), "title", "CVZnTiJucs");
        setField(term11770, term11770.getClass(), "assignedEmployees", term11795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ecHEQufXoq";
        callMethod(klass, "setProjectId", argTypes, term11770, args);
    }

};



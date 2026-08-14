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

public class ProjectDTO_getStartDate_11760175983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1154;

    public ProjectDTO_getStartDate_11760175983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1203 = new ArrayList();
        term1154 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term1154, term1154.getClass(), "title", "jDtqGUpnZN");
        setField(term1154, term1154.getClass(), "startDate", "nGKItKLYNC");
        setField(term1154, term1154.getClass(), "endDate", "UiUYnPrcCi");
        setField(term1154, term1154.getClass(), "status", "UoYtihxVaS");
        setField(term1154, term1154.getClass(), "assignedEmployees", term1203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term1154, args);
    }

};



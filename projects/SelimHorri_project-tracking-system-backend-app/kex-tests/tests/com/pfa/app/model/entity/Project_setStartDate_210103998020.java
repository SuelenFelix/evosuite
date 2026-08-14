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

public class Project_setStartDate_210103998020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41862;

    public Project_setStartDate_210103998020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41862 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        setField(term41862, term41862.getClass(), "projectId", null);
        setField(term41862, term41862.getClass(), "title", null);
        setField(term41862, term41862.getClass(), "startDate", null);
        setField(term41862, term41862.getClass(), "endDate", null);
        setField(term41862, term41862.getClass(), "status", null);
        setField(term41862, term41862.getClass(), "assignments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStartDate", argTypes, term41862, args);
    }

};



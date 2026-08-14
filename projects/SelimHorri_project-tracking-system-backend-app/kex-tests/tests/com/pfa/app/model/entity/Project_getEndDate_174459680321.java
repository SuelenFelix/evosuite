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

public class Project_getEndDate_174459680321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41863;

    public Project_getEndDate_174459680321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41863 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        setField(term41863, term41863.getClass(), "projectId", null);
        setField(term41863, term41863.getClass(), "title", null);
        setField(term41863, term41863.getClass(), "startDate", null);
        setField(term41863, term41863.getClass(), "endDate", null);
        setField(term41863, term41863.getClass(), "status", null);
        setField(term41863, term41863.getClass(), "assignments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term41863, args);
    }

};



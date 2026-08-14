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

public class ProjectDTO_setStartDate_10132601584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;

    public ProjectDTO_setStartDate_10132601584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1296 = new ArrayList();
        ((ArrayList) term1296).add("MLqYREekMl");
        term1247 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term1247, term1247.getClass(), "title", "JDswTTCZHV");
        setField(term1247, term1247.getClass(), "startDate", "onpbIeEKoi");
        setField(term1247, term1247.getClass(), "endDate", "YRHGsAkhxb");
        setField(term1247, term1247.getClass(), "status", "ffYhPOzlUs");
        setField(term1247, term1247.getClass(), "assignedEmployees", term1296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "setStartDate", argTypes, term1247, args);
    }

};



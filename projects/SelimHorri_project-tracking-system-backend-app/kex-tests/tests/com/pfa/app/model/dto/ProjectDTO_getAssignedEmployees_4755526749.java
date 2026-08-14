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

public class ProjectDTO_getAssignedEmployees_4755526749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2020;

    public ProjectDTO_getAssignedEmployees_4755526749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2069 = new ArrayList();
        ((ArrayList) term2069).add("xOcJIiQQDu");
        ((ArrayList) term2069).add("GVizqqzXpy");
        ((ArrayList) term2069).add("JqXGgAhZPl");
        ((ArrayList) term2069).add("jiKYgYHqIS");
        ((ArrayList) term2069).add("DfISiziTgG");
        term2020 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term2020, term2020.getClass(), "title", "TimdotUuNC");
        setField(term2020, term2020.getClass(), "startDate", "PkWMRdJcBb");
        setField(term2020, term2020.getClass(), "endDate", "jSpAteRute");
        setField(term2020, term2020.getClass(), "status", "swZVeJAxjt");
        setField(term2020, term2020.getClass(), "assignedEmployees", term2069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssignedEmployees", argTypes, term2020, args);
    }

};



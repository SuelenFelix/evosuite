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
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Project_getProjectId_16604668602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40969;

    public Project_getProjectId_16604668602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40970 = new Integer(-388682282);
        HashMap term41005 = new HashMap();
        Set<Object> term41041 =  ((Map) term41005).keySet();
        HashSet term41004 = new HashSet((Collection<? extends Object>) term41041);
        term40969 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term40984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40988 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term40969, term40969.getClass(), "projectId", term40970);
        setField(term40969, term40969.getClass(), "title", "ZwoXDSRaAD");
        setIntField(term40984, term40984.getClass(), "year", 2015);
        setShortField(term40984, term40984.getClass(), "month", (short) 1);
        setShortField(term40984, term40984.getClass(), "day", (short) 9);
        setField(term40969, term40969.getClass(), "startDate", term40984);
        setIntField(term40988, term40988.getClass(), "year", 2021);
        setShortField(term40988, term40988.getClass(), "month", (short) 6);
        setShortField(term40988, term40988.getClass(), "day", (short) 14);
        setField(term40969, term40969.getClass(), "endDate", term40988);
        setField(term40969, term40969.getClass(), "status", "dNrgJAaxDz");
        setField(term40969, term40969.getClass(), "assignments", term41004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term40969, args);
    }

};



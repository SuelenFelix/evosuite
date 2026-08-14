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

public class Project_getStartDate_19335411305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41200;

    public Project_getStartDate_19335411305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41201 = new Integer(260483962);
        HashMap term41236 = new HashMap();
        Set<Object> term41268 =  ((Map) term41236).keySet();
        HashSet term41235 = new HashSet((Collection<? extends Object>) term41268);
        term41200 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41219 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41200, term41200.getClass(), "projectId", term41201);
        setField(term41200, term41200.getClass(), "title", "yunXHVjiFz");
        setIntField(term41215, term41215.getClass(), "year", 2014);
        setShortField(term41215, term41215.getClass(), "month", (short) 9);
        setShortField(term41215, term41215.getClass(), "day", (short) 30);
        setField(term41200, term41200.getClass(), "startDate", term41215);
        setIntField(term41219, term41219.getClass(), "year", 2025);
        setShortField(term41219, term41219.getClass(), "month", (short) 12);
        setShortField(term41219, term41219.getClass(), "day", (short) 24);
        setField(term41200, term41200.getClass(), "endDate", term41219);
        setField(term41200, term41200.getClass(), "status", "fInyTanaRj");
        setField(term41200, term41200.getClass(), "assignments", term41235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term41200, args);
    }

};



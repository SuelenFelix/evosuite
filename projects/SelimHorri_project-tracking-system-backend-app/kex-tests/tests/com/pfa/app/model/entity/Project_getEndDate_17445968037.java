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

public class Project_getEndDate_17445968037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41344;

    public Project_getEndDate_17445968037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41345 = new Integer(1328348146);
        HashMap term41380 = new HashMap();
        Set<Object> term41414 =  ((Map) term41380).keySet();
        HashSet term41379 = new HashSet((Collection<? extends Object>) term41414);
        term41344 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41363 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41344, term41344.getClass(), "projectId", term41345);
        setField(term41344, term41344.getClass(), "title", "RUlqnYyZPt");
        setIntField(term41359, term41359.getClass(), "year", 2024);
        setShortField(term41359, term41359.getClass(), "month", (short) 9);
        setShortField(term41359, term41359.getClass(), "day", (short) 30);
        setField(term41344, term41344.getClass(), "startDate", term41359);
        setIntField(term41363, term41363.getClass(), "year", 2028);
        setShortField(term41363, term41363.getClass(), "month", (short) 9);
        setShortField(term41363, term41363.getClass(), "day", (short) 3);
        setField(term41344, term41344.getClass(), "endDate", term41363);
        setField(term41344, term41344.getClass(), "status", "COBVzmryOp");
        setField(term41344, term41344.getClass(), "assignments", term41379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term41344, args);
    }

};



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

public class Project_setTitle_20451945154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41111;

    public Project_setTitle_20451945154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41112 = new Integer(-381662221);
        HashMap term41147 = new HashMap();
        Set<Object> term41189 =  ((Map) term41147).keySet();
        HashSet term41146 = new HashSet((Collection<? extends Object>) term41189);
        term41111 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41130 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41111, term41111.getClass(), "projectId", term41112);
        setField(term41111, term41111.getClass(), "title", "OEhrSgqRGn");
        setIntField(term41126, term41126.getClass(), "year", 2028);
        setShortField(term41126, term41126.getClass(), "month", (short) 11);
        setShortField(term41126, term41126.getClass(), "day", (short) 7);
        setField(term41111, term41111.getClass(), "startDate", term41126);
        setIntField(term41130, term41130.getClass(), "year", 2014);
        setShortField(term41130, term41130.getClass(), "month", (short) 9);
        setShortField(term41130, term41130.getClass(), "day", (short) 12);
        setField(term41111, term41111.getClass(), "endDate", term41130);
        setField(term41111, term41111.getClass(), "status", "fpnyXuhrlN");
        setField(term41111, term41111.getClass(), "assignments", term41146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmuvhLuzoo";
        callMethod(klass, "setTitle", argTypes, term41111, args);
    }

};



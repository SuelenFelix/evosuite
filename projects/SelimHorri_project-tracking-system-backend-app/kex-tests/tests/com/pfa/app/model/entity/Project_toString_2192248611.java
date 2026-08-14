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

public class Project_toString_2192248611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40898;

    public Project_toString_2192248611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40899 = new Integer(407640701);
        HashMap term40934 = new HashMap();
        Set<Object> term40968 =  ((Map) term40934).keySet();
        HashSet term40933 = new HashSet((Collection<? extends Object>) term40968);
        term40898 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term40913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40917 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term40898, term40898.getClass(), "projectId", term40899);
        setField(term40898, term40898.getClass(), "title", "sCuUAZsHXx");
        setIntField(term40913, term40913.getClass(), "year", 2013);
        setShortField(term40913, term40913.getClass(), "month", (short) 3);
        setShortField(term40913, term40913.getClass(), "day", (short) 17);
        setField(term40898, term40898.getClass(), "startDate", term40913);
        setIntField(term40917, term40917.getClass(), "year", 2024);
        setShortField(term40917, term40917.getClass(), "month", (short) 12);
        setShortField(term40917, term40917.getClass(), "day", (short) 18);
        setField(term40898, term40898.getClass(), "endDate", term40917);
        setField(term40898, term40898.getClass(), "status", "AmRcDBBIwM");
        setField(term40898, term40898.getClass(), "assignments", term40933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term40898, args);
    }

};



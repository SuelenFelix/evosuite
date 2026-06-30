package ru.smartup.timetracker.core;

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
import static ru.smartup.timetracker.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SessionEmployeePrincipal_equals_16791749017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2704;
     Object term2734;

    public SessionEmployeePrincipal_equals_16791749017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2719 = new HashMap();
        Set<Object> term2745 =  ((Map) term2719).keySet();
        HashSet term2718 = new HashSet((Collection<? extends Object>) term2745);
        HashMap term2729 = new HashMap();
        term2704 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2704, term2704.getClass(), "id", -1179120542);
        setField(term2704, term2704.getClass(), "email", "hNxWaHcfhY");
        setField(term2704, term2704.getClass(), "employeeRoles", term2718);
        setField(term2704, term2704.getClass(), "projectIdsByProjectRoles", term2729);
        term2734 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2734;
        callMethod(klass, "equals", argTypes, term2704, args);
    }

};



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
     Object term3078;
     Object term3108;

    public SessionEmployeePrincipal_equals_16791749017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3093 = new HashMap();
        Set<Object> term3119 =  ((Map) term3093).keySet();
        HashSet term3092 = new HashSet((Collection<? extends Object>) term3119);
        HashMap term3103 = new HashMap();
        term3078 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term3078, term3078.getClass(), "id", -1179120542);
        setField(term3078, term3078.getClass(), "email", "hNxWaHcfhY");
        setField(term3078, term3078.getClass(), "employeeRoles", term3092);
        setField(term3078, term3078.getClass(), "projectIdsByProjectRoles", term3103);
        term3108 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3108;
        callMethod(klass, "equals", argTypes, term3078, args);
    }

};



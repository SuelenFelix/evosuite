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
import java.lang.String;

public class SessionEmployeePrincipal_getProjectIdsByProjectRole_138863417611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2114;
     Object enum2;

    public SessionEmployeePrincipal_getProjectIdsByProjectRole_138863417611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2129 = new HashMap();
        Set<Object> term2167 =  ((Map) term2129).keySet();
        HashSet term2128 = new HashSet((Collection<? extends Object>) term2167);
        HashMap term2141 = new HashMap();
        term2114 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2114, term2114.getClass(), "id", 1135664017);
        setField(term2114, term2114.getClass(), "email", "oVcInYnLWB");
        setField(term2114, term2114.getClass(), "employeeRoles", term2128);
        setField(term2114, term2114.getClass(), "projectIdsByProjectRoles", term2141);
        Class<? extends Object> term2169 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2168 = ((Class) term2169).getDeclaredField((String) "MANAGER");
        ((Field) term2168).setAccessible(true);
        enum2 = ((Field) term2168).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "getProjectIdsByProjectRole", argTypes, term2114, args);
    }

};



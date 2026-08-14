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
     Object term2488;
     Object enum2;

    public SessionEmployeePrincipal_getProjectIdsByProjectRole_138863417611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2503 = new HashMap();
        Set<Object> term2541 =  ((Map) term2503).keySet();
        HashSet term2502 = new HashSet((Collection<? extends Object>) term2541);
        HashMap term2515 = new HashMap();
        term2488 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2488, term2488.getClass(), "id", 1135664017);
        setField(term2488, term2488.getClass(), "email", "oVcInYnLWB");
        setField(term2488, term2488.getClass(), "employeeRoles", term2502);
        setField(term2488, term2488.getClass(), "projectIdsByProjectRoles", term2515);
        Class<? extends Object> term2543 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2542 = ((Class) term2543).getDeclaredField((String) "MANAGER");
        ((Field) term2542).setAccessible(true);
        enum2 = ((Field) term2542).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "getProjectIdsByProjectRole", argTypes, term2488, args);
    }

};



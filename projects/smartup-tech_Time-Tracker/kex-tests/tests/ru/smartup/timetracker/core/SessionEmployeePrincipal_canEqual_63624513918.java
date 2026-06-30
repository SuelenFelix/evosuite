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

public class SessionEmployeePrincipal_canEqual_63624513918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2746;
     Object term2778;

    public SessionEmployeePrincipal_canEqual_63624513918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2761 = new HashMap();
        Set<Object> term2789 =  ((Map) term2761).keySet();
        HashSet term2760 = new HashSet((Collection<? extends Object>) term2789);
        HashMap term2773 = new HashMap();
        term2746 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2746, term2746.getClass(), "id", -73683645);
        setField(term2746, term2746.getClass(), "email", "RkybSrpybU");
        setField(term2746, term2746.getClass(), "employeeRoles", term2760);
        setField(term2746, term2746.getClass(), "projectIdsByProjectRoles", term2773);
        term2778 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2778;
        callMethod(klass, "canEqual", argTypes, term2746, args);
    }

};



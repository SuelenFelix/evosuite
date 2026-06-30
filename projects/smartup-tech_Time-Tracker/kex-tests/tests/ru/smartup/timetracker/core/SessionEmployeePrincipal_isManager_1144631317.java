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
import java.lang.Integer;

public class SessionEmployeePrincipal_isManager_1144631317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1940;
     Object term1972;

    public SessionEmployeePrincipal_isManager_1144631317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1955 = new HashMap();
        Set<Object> term1984 =  ((Map) term1955).keySet();
        HashSet term1954 = new HashSet((Collection<? extends Object>) term1984);
        HashMap term1967 = new HashMap();
        term1940 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1940, term1940.getClass(), "id", -1456670397);
        setField(term1940, term1940.getClass(), "email", "NRdvgJlhkX");
        setField(term1940, term1940.getClass(), "employeeRoles", term1954);
        setField(term1940, term1940.getClass(), "projectIdsByProjectRoles", term1967);
        term1972 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1972;
        callMethod(klass, "isManager", argTypes, term1940, args);
    }

};



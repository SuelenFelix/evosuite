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

public class SessionEmployeePrincipal_isEmployee_152012492210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2069;
     Object term2101;

    public SessionEmployeePrincipal_isEmployee_152012492210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2084 = new HashMap();
        Set<Object> term2113 =  ((Map) term2084).keySet();
        HashSet term2083 = new HashSet((Collection<? extends Object>) term2113);
        HashMap term2096 = new HashMap();
        term2069 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2069, term2069.getClass(), "id", -117576464);
        setField(term2069, term2069.getClass(), "email", "LQFpaHEwXR");
        setField(term2069, term2069.getClass(), "employeeRoles", term2083);
        setField(term2069, term2069.getClass(), "projectIdsByProjectRoles", term2096);
        term2101 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2101;
        callMethod(klass, "isEmployee", argTypes, term2069, args);
    }

};



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

public class SessionEmployeePrincipal_isEmployee_15201230004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1815;

    public SessionEmployeePrincipal_isEmployee_15201230004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1830 = new HashMap();
        Set<Object> term1857 =  ((Map) term1830).keySet();
        HashSet term1829 = new HashSet((Collection<? extends Object>) term1857);
        HashMap term1842 = new HashMap();
        term1815 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1815, term1815.getClass(), "id", -883034806);
        setField(term1815, term1815.getClass(), "email", "MjGYSRKTNF");
        setField(term1815, term1815.getClass(), "employeeRoles", term1829);
        setField(term1815, term1815.getClass(), "projectIdsByProjectRoles", term1842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmployee", argTypes, term1815, args);
    }

};



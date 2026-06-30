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

public class SessionEmployeePrincipal_isNotManager_19498882186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1897;
     Object term1927;

    public SessionEmployeePrincipal_isNotManager_19498882186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1912 = new HashMap();
        Set<Object> term1939 =  ((Map) term1912).keySet();
        HashSet term1911 = new HashSet((Collection<? extends Object>) term1939);
        HashMap term1922 = new HashMap();
        term1897 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1897, term1897.getClass(), "id", 597278769);
        setField(term1897, term1897.getClass(), "email", "RMFIsYGgne");
        setField(term1897, term1897.getClass(), "employeeRoles", term1911);
        setField(term1897, term1897.getClass(), "projectIdsByProjectRoles", term1922);
        term1927 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1927;
        callMethod(klass, "isNotManager", argTypes, term1897, args);
    }

};



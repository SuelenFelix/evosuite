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
     Object term2271;
     Object term2301;

    public SessionEmployeePrincipal_isNotManager_19498882186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2286 = new HashMap();
        Set<Object> term2313 =  ((Map) term2286).keySet();
        HashSet term2285 = new HashSet((Collection<? extends Object>) term2313);
        HashMap term2296 = new HashMap();
        term2271 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2271, term2271.getClass(), "id", 597278769);
        setField(term2271, term2271.getClass(), "email", "RMFIsYGgne");
        setField(term2271, term2271.getClass(), "employeeRoles", term2285);
        setField(term2271, term2271.getClass(), "projectIdsByProjectRoles", term2296);
        term2301 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2301;
        callMethod(klass, "isNotManager", argTypes, term2271, args);
    }

};



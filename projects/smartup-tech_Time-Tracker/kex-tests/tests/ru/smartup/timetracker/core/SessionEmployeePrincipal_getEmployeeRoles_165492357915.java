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

public class SessionEmployeePrincipal_getEmployeeRoles_165492357915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3001;

    public SessionEmployeePrincipal_getEmployeeRoles_165492357915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3016 = new HashMap();
        Set<Object> term3036 =  ((Map) term3016).keySet();
        HashSet term3015 = new HashSet((Collection<? extends Object>) term3036);
        HashMap term3021 = new HashMap();
        term3001 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term3001, term3001.getClass(), "id", -244121226);
        setField(term3001, term3001.getClass(), "email", "HyxfbSQYBe");
        setField(term3001, term3001.getClass(), "employeeRoles", term3015);
        setField(term3001, term3001.getClass(), "projectIdsByProjectRoles", term3021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeRoles", argTypes, term3001, args);
    }

};



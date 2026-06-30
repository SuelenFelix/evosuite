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
     Object term2627;

    public SessionEmployeePrincipal_getEmployeeRoles_165492357915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2642 = new HashMap();
        Set<Object> term2662 =  ((Map) term2642).keySet();
        HashSet term2641 = new HashSet((Collection<? extends Object>) term2662);
        HashMap term2647 = new HashMap();
        term2627 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2627, term2627.getClass(), "id", -244121226);
        setField(term2627, term2627.getClass(), "email", "HyxfbSQYBe");
        setField(term2627, term2627.getClass(), "employeeRoles", term2641);
        setField(term2627, term2627.getClass(), "projectIdsByProjectRoles", term2647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeRoles", argTypes, term2627, args);
    }

};



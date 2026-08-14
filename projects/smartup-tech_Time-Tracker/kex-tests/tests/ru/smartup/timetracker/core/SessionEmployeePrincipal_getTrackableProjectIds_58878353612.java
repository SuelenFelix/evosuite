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

public class SessionEmployeePrincipal_getTrackableProjectIds_58878353612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2880;

    public SessionEmployeePrincipal_getTrackableProjectIds_58878353612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2895 = new HashMap();
        Set<Object> term2920 =  ((Map) term2895).keySet();
        HashSet term2894 = new HashSet((Collection<? extends Object>) term2920);
        HashMap term2905 = new HashMap();
        term2880 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2880, term2880.getClass(), "id", 590364439);
        setField(term2880, term2880.getClass(), "email", "aJlieCFVtF");
        setField(term2880, term2880.getClass(), "employeeRoles", term2894);
        setField(term2880, term2880.getClass(), "projectIdsByProjectRoles", term2905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackableProjectIds", argTypes, term2880, args);
    }

};



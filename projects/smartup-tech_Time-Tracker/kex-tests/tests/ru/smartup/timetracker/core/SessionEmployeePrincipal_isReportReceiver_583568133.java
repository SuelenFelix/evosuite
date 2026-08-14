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

public class SessionEmployeePrincipal_isReportReceiver_583568133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;

    public SessionEmployeePrincipal_isReportReceiver_583568133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2165 = new HashMap();
        Set<Object> term2188 =  ((Map) term2165).keySet();
        HashSet term2164 = new HashSet((Collection<? extends Object>) term2188);
        HashMap term2173 = new HashMap();
        term2150 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2150, term2150.getClass(), "id", 1134449235);
        setField(term2150, term2150.getClass(), "email", "SzjVpOQTyS");
        setField(term2150, term2150.getClass(), "employeeRoles", term2164);
        setField(term2150, term2150.getClass(), "projectIdsByProjectRoles", term2173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReportReceiver", argTypes, term2150, args);
    }

};



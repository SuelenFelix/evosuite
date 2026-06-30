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

public class SessionEmployeePrincipal_isNotManagerOrEmployee_1661597999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2026;
     Object term2056;

    public SessionEmployeePrincipal_isNotManagerOrEmployee_1661597999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2041 = new HashMap();
        Set<Object> term2068 =  ((Map) term2041).keySet();
        HashSet term2040 = new HashSet((Collection<? extends Object>) term2068);
        HashMap term2051 = new HashMap();
        term2026 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2026, term2026.getClass(), "id", -6029667);
        setField(term2026, term2026.getClass(), "email", "MxlszYVzRf");
        setField(term2026, term2026.getClass(), "employeeRoles", term2040);
        setField(term2026, term2026.getClass(), "projectIdsByProjectRoles", term2051);
        term2056 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2056;
        callMethod(klass, "isNotManagerOrEmployee", argTypes, term2026, args);
    }

};



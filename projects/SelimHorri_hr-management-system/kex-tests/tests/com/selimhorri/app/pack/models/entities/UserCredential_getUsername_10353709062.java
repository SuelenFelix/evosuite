package com.selimhorri.app.pack.models.entities;

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
import static com.selimhorri.app.pack.models.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserCredential_getUsername_10353709062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;

    public UserCredential_getUsername_10353709062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term363 = new Integer(-203030934);
        Boolean term389 = new Boolean(true);
        Integer term428 = new Integer(-1179120542);
        Integer term454 = new Integer(-73683645);
        Double term466 = new Double(0.4569171842750229);
        Double term468 = new Double(0.8598297828918529);
        Integer term471 = new Integer(-226514366);
        HashMap term498 = new HashMap();
        Set<Object> term594 =  ((Map) term498).keySet();
        HashSet term497 = new HashSet((Collection<? extends Object>) term594);
        term362 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term427 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term456 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term461 = newInstance(Class.forName("java.time.LocalTime"));
        Object term470 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term503 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term362, term362.getClass(), "id", term363);
        setField(term362, term362.getClass(), "username", "YRHGsAkhxb");
        setField(term362, term362.getClass(), "password", "ffYhPOzlUs");
        setField(term362, term362.getClass(), "enabled", term389);
        setField(term362, term362.getClass(), "email", "MLqYREekMl");
        setField(term362, term362.getClass(), "phone", "ytSBIKXogI");
        setField(term362, term362.getClass(), "role", "nHXjMycHlU");
        setField(term427, term427.getClass(), "empno", term428);
        setField(term427, term427.getClass(), "ename", "ieCtQFdkii");
        setField(term427, term427.getClass(), "job", "dEnhdmILtU");
        setField(term427, term427.getClass(), "mgr", term454);
        setIntField(term457, term457.getClass(), "year", 2019);
        setShortField(term457, term457.getClass(), "month", (short) 2);
        setShortField(term457, term457.getClass(), "day", (short) 21);
        setField(term456, term456.getClass(), "date", term457);
        setByteField(term461, term461.getClass(), "hour", (byte) 5);
        setByteField(term461, term461.getClass(), "minute", (byte) 41);
        setByteField(term461, term461.getClass(), "second", (byte) 11);
        setIntField(term461, term461.getClass(), "nano", 859829782);
        setField(term456, term456.getClass(), "time", term461);
        setField(term427, term427.getClass(), "hireDate", term456);
        setField(term427, term427.getClass(), "sal", term466);
        setField(term427, term427.getClass(), "comm", term468);
        setField(term470, term470.getClass(), "deptno", term471);
        setField(term470, term470.getClass(), "dname", "hoicvmsovO");
        setField(term470, term470.getClass(), "loc", "eqJfYWRaEL");
        setField(term470, term470.getClass(), "employees", term497);
        setField(term427, term427.getClass(), "department", term470);
        setField(term503, term503.getClass(), "id", null);
        setField(term503, term503.getClass(), "username", null);
        setField(term503, term503.getClass(), "password", null);
        setField(term503, term503.getClass(), "enabled", null);
        setField(term503, term503.getClass(), "email", null);
        setField(term503, term503.getClass(), "phone", null);
        setField(term503, term503.getClass(), "role", null);
        setField(term503, term503.getClass(), "employee", null);
        setField(term427, term427.getClass(), "userCredential", term503);
        setField(term362, term362.getClass(), "employee", term427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term362, args);
    }

};



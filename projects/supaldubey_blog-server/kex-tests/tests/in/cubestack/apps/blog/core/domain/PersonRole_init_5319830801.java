package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class PersonRole_init_5319830801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1289;
     Object term1434;

    public PersonRole_init_5319830801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1563 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term1562 = ((Class) term1563).getDeclaredField((String) "ACTIVE");
        ((Field) term1562).setAccessible(true);
        Object enum4 = ((Field) term1562).get((Object) null);
        ArrayList term1408 = new ArrayList();
        Long term1412 = new Long(-8257434502486459194L);
        term1289 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term1414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1419 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1429 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1289, term1289.getClass(), "firstName", "SzjVpOQTyS");
        setField(term1289, term1289.getClass(), "lastName", "MjGYSRKTNF");
        setField(term1289, term1289.getClass(), "email", "hRNSzYYIrc");
        setField(term1289, term1289.getClass(), "username", "RMFIsYGgne");
        setField(term1289, term1289.getClass(), "password", "NRdvgJlhkX");
        setField(term1289, term1289.getClass(), "profileImage", "uuaPigETmJ");
        setField(term1289, term1289.getClass(), "status", enum4);
        setField(term1289, term1289.getClass(), "phone", "MxlszYVzRf");
        setField(term1289, term1289.getClass(), "countryCode", "LQFpaHEwXR");
        setField(term1289, term1289.getClass(), "salt", "oVcInYnLWB");
        setField(term1289, term1289.getClass(), "personRoles", term1408);
        setField(term1289, term1289.getClass(), "id", term1412);
        setIntField(term1415, term1415.getClass(), "year", 2022);
        setShortField(term1415, term1415.getClass(), "month", (short) 2);
        setShortField(term1415, term1415.getClass(), "day", (short) 26);
        setField(term1414, term1414.getClass(), "date", term1415);
        setByteField(term1419, term1419.getClass(), "hour", (byte) 11);
        setByteField(term1419, term1419.getClass(), "minute", (byte) 42);
        setByteField(term1419, term1419.getClass(), "second", (byte) 15);
        setIntField(term1419, term1419.getClass(), "nano", 377731937);
        setField(term1414, term1414.getClass(), "time", term1419);
        setField(term1289, term1289.getClass(), "createdAt", term1414);
        setIntField(term1425, term1425.getClass(), "year", 2026);
        setShortField(term1425, term1425.getClass(), "month", (short) 12);
        setShortField(term1425, term1425.getClass(), "day", (short) 14);
        setField(term1424, term1424.getClass(), "date", term1425);
        setByteField(term1429, term1429.getClass(), "hour", (byte) 16);
        setByteField(term1429, term1429.getClass(), "minute", (byte) 34);
        setByteField(term1429, term1429.getClass(), "second", (byte) 9);
        setIntField(term1429, term1429.getClass(), "nano", 518326996);
        setField(term1424, term1424.getClass(), "time", term1429);
        setField(term1289, term1289.getClass(), "updatedAt", term1424);
        Long term1447 = new Long(-8400487765614892086L);
        term1434 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term1449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1464 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1434, term1434.getClass(), "roleName", "aJlieCFVtF");
        setField(term1434, term1434.getClass(), "id", term1447);
        setIntField(term1450, term1450.getClass(), "year", 2025);
        setShortField(term1450, term1450.getClass(), "month", (short) 4);
        setShortField(term1450, term1450.getClass(), "day", (short) 24);
        setField(term1449, term1449.getClass(), "date", term1450);
        setByteField(term1454, term1454.getClass(), "hour", (byte) 18);
        setByteField(term1454, term1454.getClass(), "minute", (byte) 11);
        setByteField(term1454, term1454.getClass(), "second", (byte) 40);
        setIntField(term1454, term1454.getClass(), "nano", 137454929);
        setField(term1449, term1449.getClass(), "time", term1454);
        setField(term1434, term1434.getClass(), "createdAt", term1449);
        setIntField(term1460, term1460.getClass(), "year", 2024);
        setShortField(term1460, term1460.getClass(), "month", (short) 1);
        setShortField(term1460, term1460.getClass(), "day", (short) 24);
        setField(term1459, term1459.getClass(), "date", term1460);
        setByteField(term1464, term1464.getClass(), "hour", (byte) 20);
        setByteField(term1464, term1464.getClass(), "minute", (byte) 28);
        setByteField(term1464, term1464.getClass(), "second", (byte) 39);
        setIntField(term1464, term1464.getClass(), "nano", 952728177);
        setField(term1459, term1459.getClass(), "time", term1464);
        setField(term1434, term1434.getClass(), "updatedAt", term1459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.PersonRole");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.core.domain.Role");
        Object[] args = new Object[2];
        args[0] = term1289;
        args[1] = term1434;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



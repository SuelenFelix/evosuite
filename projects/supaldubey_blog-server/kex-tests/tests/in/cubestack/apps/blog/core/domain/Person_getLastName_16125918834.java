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

public class Person_getLastName_16125918834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4597;

    public Person_getLastName_16125918834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4803 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term4802 = ((Class) term4803).getDeclaredField((String) "ACTIVE");
        ((Field) term4802).setAccessible(true);
        Object enum11 = ((Field) term4802).get((Object) null);
        ArrayList term4716 = new ArrayList();
        Long term4720 = new Long(-4325723315152823407L);
        term4597 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term4722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4737 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4597, term4597.getClass(), "firstName", "ytSBIKXogI");
        setField(term4597, term4597.getClass(), "lastName", "nHXjMycHlU");
        setField(term4597, term4597.getClass(), "email", "ieCtQFdkii");
        setField(term4597, term4597.getClass(), "username", "dEnhdmILtU");
        setField(term4597, term4597.getClass(), "password", "hoicvmsovO");
        setField(term4597, term4597.getClass(), "profileImage", "eqJfYWRaEL");
        setField(term4597, term4597.getClass(), "status", enum11);
        setField(term4597, term4597.getClass(), "phone", "fhkbdRViHi");
        setField(term4597, term4597.getClass(), "countryCode", "uWHnvSvaPl");
        setField(term4597, term4597.getClass(), "salt", "kBdSllIBVz");
        setField(term4597, term4597.getClass(), "personRoles", term4716);
        setField(term4597, term4597.getClass(), "id", term4720);
        setIntField(term4723, term4723.getClass(), "year", 2025);
        setShortField(term4723, term4723.getClass(), "month", (short) 3);
        setShortField(term4723, term4723.getClass(), "day", (short) 9);
        setField(term4722, term4722.getClass(), "date", term4723);
        setByteField(term4727, term4727.getClass(), "hour", (byte) 5);
        setByteField(term4727, term4727.getClass(), "minute", (byte) 49);
        setByteField(term4727, term4727.getClass(), "second", (byte) 12);
        setIntField(term4727, term4727.getClass(), "nano", 791695028);
        setField(term4722, term4722.getClass(), "time", term4727);
        setField(term4597, term4597.getClass(), "createdAt", term4722);
        setIntField(term4733, term4733.getClass(), "year", 2023);
        setShortField(term4733, term4733.getClass(), "month", (short) 9);
        setShortField(term4733, term4733.getClass(), "day", (short) 23);
        setField(term4732, term4732.getClass(), "date", term4733);
        setByteField(term4737, term4737.getClass(), "hour", (byte) 12);
        setByteField(term4737, term4737.getClass(), "minute", (byte) 55);
        setByteField(term4737, term4737.getClass(), "second", (byte) 58);
        setIntField(term4737, term4737.getClass(), "nano", 159178396);
        setField(term4732, term4732.getClass(), "time", term4737);
        setField(term4597, term4597.getClass(), "updatedAt", term4732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term4597, args);
    }

};



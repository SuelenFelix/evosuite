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

public class Person_setFirstName_47021372519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12133;

    public Person_setFirstName_47021372519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12351 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term12350 = ((Class) term12351).getDeclaredField((String) "ACTIVE");
        ((Field) term12350).setAccessible(true);
        Object enum26 = ((Field) term12350).get((Object) null);
        ArrayList term12252 = new ArrayList();
        Long term12256 = new Long(1967728129628047933L);
        term12133 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term12258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12263 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12273 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12133, term12133.getClass(), "firstName", "kGMQdqJYyB");
        setField(term12133, term12133.getClass(), "lastName", "XJJNClzHRf");
        setField(term12133, term12133.getClass(), "email", "HDaezxQfQR");
        setField(term12133, term12133.getClass(), "username", "iikZEapDlu");
        setField(term12133, term12133.getClass(), "password", "nhoHrZfnIN");
        setField(term12133, term12133.getClass(), "profileImage", "ZkMALXpEAZ");
        setField(term12133, term12133.getClass(), "status", enum26);
        setField(term12133, term12133.getClass(), "phone", "tXfQjSqDzN");
        setField(term12133, term12133.getClass(), "countryCode", "BjugTaMcxJ");
        setField(term12133, term12133.getClass(), "salt", "vGiuZVPJNH");
        setField(term12133, term12133.getClass(), "personRoles", term12252);
        setField(term12133, term12133.getClass(), "id", term12256);
        setIntField(term12259, term12259.getClass(), "year", 2022);
        setShortField(term12259, term12259.getClass(), "month", (short) 6);
        setShortField(term12259, term12259.getClass(), "day", (short) 20);
        setField(term12258, term12258.getClass(), "date", term12259);
        setByteField(term12263, term12263.getClass(), "hour", (byte) 7);
        setByteField(term12263, term12263.getClass(), "minute", (byte) 57);
        setByteField(term12263, term12263.getClass(), "second", (byte) 37);
        setIntField(term12263, term12263.getClass(), "nano", 90374877);
        setField(term12258, term12258.getClass(), "time", term12263);
        setField(term12133, term12133.getClass(), "createdAt", term12258);
        setIntField(term12269, term12269.getClass(), "year", 2023);
        setShortField(term12269, term12269.getClass(), "month", (short) 2);
        setShortField(term12269, term12269.getClass(), "day", (short) 16);
        setField(term12268, term12268.getClass(), "date", term12269);
        setByteField(term12273, term12273.getClass(), "hour", (byte) 3);
        setByteField(term12273, term12273.getClass(), "minute", (byte) 18);
        setByteField(term12273, term12273.getClass(), "second", (byte) 56);
        setIntField(term12273, term12273.getClass(), "nano", 733017887);
        setField(term12268, term12268.getClass(), "time", term12273);
        setField(term12133, term12133.getClass(), "updatedAt", term12268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tlzpzIjMib";
        callMethod(klass, "setFirstName", argTypes, term12133, args);
    }

};



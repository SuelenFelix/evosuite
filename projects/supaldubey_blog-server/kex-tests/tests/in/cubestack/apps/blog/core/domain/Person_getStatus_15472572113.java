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

public class Person_getStatus_15472572113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9074;

    public Person_getStatus_15472572113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9280 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term9279 = ((Class) term9280).getDeclaredField((String) "ACTIVE");
        ((Field) term9279).setAccessible(true);
        Object enum20 = ((Field) term9279).get((Object) null);
        ArrayList term9193 = new ArrayList();
        Long term9197 = new Long(-2585684163342970173L);
        term9074 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term9199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9204 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9214 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9074, term9074.getClass(), "firstName", "LWyEaeIyAo");
        setField(term9074, term9074.getClass(), "lastName", "yVMkkQhvmN");
        setField(term9074, term9074.getClass(), "email", "mvrkADEgpp");
        setField(term9074, term9074.getClass(), "username", "pXOkjyeIRb");
        setField(term9074, term9074.getClass(), "password", "GgZWSjxjyE");
        setField(term9074, term9074.getClass(), "profileImage", "EeBVbzjcCI");
        setField(term9074, term9074.getClass(), "status", enum20);
        setField(term9074, term9074.getClass(), "phone", "UfQtPRyWRC");
        setField(term9074, term9074.getClass(), "countryCode", "FPvxVzzSvD");
        setField(term9074, term9074.getClass(), "salt", "WHcwFgsGFC");
        setField(term9074, term9074.getClass(), "personRoles", term9193);
        setField(term9074, term9074.getClass(), "id", term9197);
        setIntField(term9200, term9200.getClass(), "year", 2020);
        setShortField(term9200, term9200.getClass(), "month", (short) 8);
        setShortField(term9200, term9200.getClass(), "day", (short) 15);
        setField(term9199, term9199.getClass(), "date", term9200);
        setByteField(term9204, term9204.getClass(), "hour", (byte) 2);
        setByteField(term9204, term9204.getClass(), "minute", (byte) 0);
        setByteField(term9204, term9204.getClass(), "second", (byte) 38);
        setIntField(term9204, term9204.getClass(), "nano", 146431486);
        setField(term9199, term9199.getClass(), "time", term9204);
        setField(term9074, term9074.getClass(), "createdAt", term9199);
        setIntField(term9210, term9210.getClass(), "year", 2014);
        setShortField(term9210, term9210.getClass(), "month", (short) 11);
        setShortField(term9210, term9210.getClass(), "day", (short) 8);
        setField(term9209, term9209.getClass(), "date", term9210);
        setByteField(term9214, term9214.getClass(), "hour", (byte) 8);
        setByteField(term9214, term9214.getClass(), "minute", (byte) 43);
        setByteField(term9214, term9214.getClass(), "second", (byte) 32);
        setIntField(term9214, term9214.getClass(), "nano", 154434838);
        setField(term9209, term9209.getClass(), "time", term9214);
        setField(term9074, term9074.getClass(), "updatedAt", term9209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term9074, args);
    }

};



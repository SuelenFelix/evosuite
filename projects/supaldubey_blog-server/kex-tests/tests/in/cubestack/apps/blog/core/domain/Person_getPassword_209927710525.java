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

public class Person_getPassword_209927710525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15235;

    public Person_getPassword_209927710525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15441 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term15440 = ((Class) term15441).getDeclaredField((String) "ACTIVE");
        ((Field) term15440).setAccessible(true);
        Object enum32 = ((Field) term15440).get((Object) null);
        ArrayList term15354 = new ArrayList();
        Long term15358 = new Long(-484994522244390100L);
        term15235 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term15360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15375 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15235, term15235.getClass(), "firstName", "CGOpQSZZwI");
        setField(term15235, term15235.getClass(), "lastName", "ypEdrstygY");
        setField(term15235, term15235.getClass(), "email", "sNQFlATEeQ");
        setField(term15235, term15235.getClass(), "username", "ZKMLioamsY");
        setField(term15235, term15235.getClass(), "password", "WVbxuoDBcn");
        setField(term15235, term15235.getClass(), "profileImage", "pvDEABOxLt");
        setField(term15235, term15235.getClass(), "status", enum32);
        setField(term15235, term15235.getClass(), "phone", "beAMpkroCQ");
        setField(term15235, term15235.getClass(), "countryCode", "uSUvKAyuvd");
        setField(term15235, term15235.getClass(), "salt", "onQLVONGuf");
        setField(term15235, term15235.getClass(), "personRoles", term15354);
        setField(term15235, term15235.getClass(), "id", term15358);
        setIntField(term15361, term15361.getClass(), "year", 2028);
        setShortField(term15361, term15361.getClass(), "month", (short) 4);
        setShortField(term15361, term15361.getClass(), "day", (short) 1);
        setField(term15360, term15360.getClass(), "date", term15361);
        setByteField(term15365, term15365.getClass(), "hour", (byte) 16);
        setByteField(term15365, term15365.getClass(), "minute", (byte) 22);
        setByteField(term15365, term15365.getClass(), "second", (byte) 32);
        setIntField(term15365, term15365.getClass(), "nano", 406353763);
        setField(term15360, term15360.getClass(), "time", term15365);
        setField(term15235, term15235.getClass(), "createdAt", term15360);
        setIntField(term15371, term15371.getClass(), "year", 2019);
        setShortField(term15371, term15371.getClass(), "month", (short) 7);
        setShortField(term15371, term15371.getClass(), "day", (short) 19);
        setField(term15370, term15370.getClass(), "date", term15371);
        setByteField(term15375, term15375.getClass(), "hour", (byte) 10);
        setByteField(term15375, term15375.getClass(), "minute", (byte) 54);
        setByteField(term15375, term15375.getClass(), "second", (byte) 55);
        setIntField(term15375, term15375.getClass(), "nano", 244650454);
        setField(term15370, term15370.getClass(), "time", term15375);
        setField(term15235, term15235.getClass(), "updatedAt", term15370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term15235, args);
    }

};



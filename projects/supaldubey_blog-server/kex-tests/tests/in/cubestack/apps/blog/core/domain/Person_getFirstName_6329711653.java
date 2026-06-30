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

public class Person_getFirstName_6329711653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4102;

    public Person_getFirstName_6329711653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4308 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term4307 = ((Class) term4308).getDeclaredField((String) "ACTIVE");
        ((Field) term4307).setAccessible(true);
        Object enum10 = ((Field) term4307).get((Object) null);
        ArrayList term4221 = new ArrayList();
        Long term4225 = new Long(-8885298608300233488L);
        term4102 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term4227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4242 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4102, term4102.getClass(), "firstName", "jDtqGUpnZN");
        setField(term4102, term4102.getClass(), "lastName", "nGKItKLYNC");
        setField(term4102, term4102.getClass(), "email", "UiUYnPrcCi");
        setField(term4102, term4102.getClass(), "username", "UoYtihxVaS");
        setField(term4102, term4102.getClass(), "password", "JDswTTCZHV");
        setField(term4102, term4102.getClass(), "profileImage", "onpbIeEKoi");
        setField(term4102, term4102.getClass(), "status", enum10);
        setField(term4102, term4102.getClass(), "phone", "YRHGsAkhxb");
        setField(term4102, term4102.getClass(), "countryCode", "ffYhPOzlUs");
        setField(term4102, term4102.getClass(), "salt", "MLqYREekMl");
        setField(term4102, term4102.getClass(), "personRoles", term4221);
        setField(term4102, term4102.getClass(), "id", term4225);
        setIntField(term4228, term4228.getClass(), "year", 2015);
        setShortField(term4228, term4228.getClass(), "month", (short) 3);
        setShortField(term4228, term4228.getClass(), "day", (short) 10);
        setField(term4227, term4227.getClass(), "date", term4228);
        setByteField(term4232, term4232.getClass(), "hour", (byte) 23);
        setByteField(term4232, term4232.getClass(), "minute", (byte) 34);
        setByteField(term4232, term4232.getClass(), "second", (byte) 44);
        setIntField(term4232, term4232.getClass(), "nano", 587322824);
        setField(term4227, term4227.getClass(), "time", term4232);
        setField(term4102, term4102.getClass(), "createdAt", term4227);
        setIntField(term4238, term4238.getClass(), "year", 2027);
        setShortField(term4238, term4238.getClass(), "month", (short) 8);
        setShortField(term4238, term4238.getClass(), "day", (short) 26);
        setField(term4237, term4237.getClass(), "date", term4238);
        setByteField(term4242, term4242.getClass(), "hour", (byte) 5);
        setByteField(term4242, term4242.getClass(), "minute", (byte) 11);
        setByteField(term4242, term4242.getClass(), "second", (byte) 9);
        setIntField(term4242, term4242.getClass(), "nano", 219245092);
        setField(term4237, term4237.getClass(), "time", term4242);
        setField(term4102, term4102.getClass(), "updatedAt", term4237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term4102, args);
    }

};



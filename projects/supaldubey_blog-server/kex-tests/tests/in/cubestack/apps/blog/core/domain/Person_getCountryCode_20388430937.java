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

public class Person_getCountryCode_20388430937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6082;

    public Person_getCountryCode_20388430937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6288 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term6287 = ((Class) term6288).getDeclaredField((String) "ACTIVE");
        ((Field) term6287).setAccessible(true);
        Object enum14 = ((Field) term6287).get((Object) null);
        ArrayList term6201 = new ArrayList();
        Long term6205 = new Long(-872011222785455006L);
        term6082 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term6207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6212 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6222 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6082, term6082.getClass(), "firstName", "LvJFtLBaxj");
        setField(term6082, term6082.getClass(), "lastName", "PHvxnGHptP");
        setField(term6082, term6082.getClass(), "email", "TimdotUuNC");
        setField(term6082, term6082.getClass(), "username", "PkWMRdJcBb");
        setField(term6082, term6082.getClass(), "password", "jSpAteRute");
        setField(term6082, term6082.getClass(), "profileImage", "swZVeJAxjt");
        setField(term6082, term6082.getClass(), "status", enum14);
        setField(term6082, term6082.getClass(), "phone", "xOcJIiQQDu");
        setField(term6082, term6082.getClass(), "countryCode", "GVizqqzXpy");
        setField(term6082, term6082.getClass(), "salt", "JqXGgAhZPl");
        setField(term6082, term6082.getClass(), "personRoles", term6201);
        setField(term6082, term6082.getClass(), "id", term6205);
        setIntField(term6208, term6208.getClass(), "year", 2016);
        setShortField(term6208, term6208.getClass(), "month", (short) 6);
        setShortField(term6208, term6208.getClass(), "day", (short) 15);
        setField(term6207, term6207.getClass(), "date", term6208);
        setByteField(term6212, term6212.getClass(), "hour", (byte) 21);
        setByteField(term6212, term6212.getClass(), "minute", (byte) 23);
        setByteField(term6212, term6212.getClass(), "second", (byte) 23);
        setIntField(term6212, term6212.getClass(), "nano", 433372070);
        setField(term6207, term6207.getClass(), "time", term6212);
        setField(term6082, term6082.getClass(), "createdAt", term6207);
        setIntField(term6218, term6218.getClass(), "year", 2012);
        setShortField(term6218, term6218.getClass(), "month", (short) 8);
        setShortField(term6218, term6218.getClass(), "day", (short) 25);
        setField(term6217, term6217.getClass(), "date", term6218);
        setByteField(term6222, term6222.getClass(), "hour", (byte) 19);
        setByteField(term6222, term6222.getClass(), "minute", (byte) 49);
        setByteField(term6222, term6222.getClass(), "second", (byte) 8);
        setIntField(term6222, term6222.getClass(), "nano", 912685024);
        setField(term6217, term6217.getClass(), "time", term6222);
        setField(term6082, term6082.getClass(), "updatedAt", term6217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryCode", argTypes, term6082, args);
    }

};



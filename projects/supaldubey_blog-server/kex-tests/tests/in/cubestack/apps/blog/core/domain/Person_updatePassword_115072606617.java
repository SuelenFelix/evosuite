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

public class Person_updatePassword_115072606617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11099;

    public Person_updatePassword_115072606617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11317 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term11316 = ((Class) term11317).getDeclaredField((String) "ACTIVE");
        ((Field) term11316).setAccessible(true);
        Object enum24 = ((Field) term11316).get((Object) null);
        ArrayList term11218 = new ArrayList();
        Long term11222 = new Long(-7672528020740371001L);
        term11099 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term11224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11239 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11099, term11099.getClass(), "firstName", "JmcmxoGhIK");
        setField(term11099, term11099.getClass(), "lastName", "jXzmYyrnnT");
        setField(term11099, term11099.getClass(), "email", "igCAtimmYB");
        setField(term11099, term11099.getClass(), "username", "DyiXbeYIaN");
        setField(term11099, term11099.getClass(), "password", "VGizxZnyHX");
        setField(term11099, term11099.getClass(), "profileImage", "kVEZMHmRtR");
        setField(term11099, term11099.getClass(), "status", enum24);
        setField(term11099, term11099.getClass(), "phone", "ekxGuOYIwi");
        setField(term11099, term11099.getClass(), "countryCode", "RbVQXSpxXy");
        setField(term11099, term11099.getClass(), "salt", "YpJbIgJWWv");
        setField(term11099, term11099.getClass(), "personRoles", term11218);
        setField(term11099, term11099.getClass(), "id", term11222);
        setIntField(term11225, term11225.getClass(), "year", 2011);
        setShortField(term11225, term11225.getClass(), "month", (short) 6);
        setShortField(term11225, term11225.getClass(), "day", (short) 26);
        setField(term11224, term11224.getClass(), "date", term11225);
        setByteField(term11229, term11229.getClass(), "hour", (byte) 22);
        setByteField(term11229, term11229.getClass(), "minute", (byte) 39);
        setByteField(term11229, term11229.getClass(), "second", (byte) 11);
        setIntField(term11229, term11229.getClass(), "nano", 686293604);
        setField(term11224, term11224.getClass(), "time", term11229);
        setField(term11099, term11099.getClass(), "createdAt", term11224);
        setIntField(term11235, term11235.getClass(), "year", 2012);
        setShortField(term11235, term11235.getClass(), "month", (short) 7);
        setShortField(term11235, term11235.getClass(), "day", (short) 21);
        setField(term11234, term11234.getClass(), "date", term11235);
        setByteField(term11239, term11239.getClass(), "hour", (byte) 13);
        setByteField(term11239, term11239.getClass(), "minute", (byte) 41);
        setByteField(term11239, term11239.getClass(), "second", (byte) 44);
        setIntField(term11239, term11239.getClass(), "nano", 394467282);
        setField(term11234, term11234.getClass(), "time", term11239);
        setField(term11099, term11099.getClass(), "updatedAt", term11234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JppkknKVOw";
        callMethod(klass, "updatePassword", argTypes, term11099, args);
    }

};



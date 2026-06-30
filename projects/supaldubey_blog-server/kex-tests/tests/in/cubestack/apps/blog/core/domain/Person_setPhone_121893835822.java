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

public class Person_setPhone_121893835822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13684;

    public Person_setPhone_121893835822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13902 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term13901 = ((Class) term13902).getDeclaredField((String) "ACTIVE");
        ((Field) term13901).setAccessible(true);
        Object enum29 = ((Field) term13901).get((Object) null);
        ArrayList term13803 = new ArrayList();
        Long term13807 = new Long(-5892135042702373494L);
        term13684 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term13809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13814 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13824 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13684, term13684.getClass(), "firstName", "TwfWVQGiIj");
        setField(term13684, term13684.getClass(), "lastName", "gUvcueTURF");
        setField(term13684, term13684.getClass(), "email", "EwQBhZjCIT");
        setField(term13684, term13684.getClass(), "username", "aSkmSwTnEw");
        setField(term13684, term13684.getClass(), "password", "xvkbvaEGYd");
        setField(term13684, term13684.getClass(), "profileImage", "HBGNxdNURv");
        setField(term13684, term13684.getClass(), "status", enum29);
        setField(term13684, term13684.getClass(), "phone", "mfCpTPPQQm");
        setField(term13684, term13684.getClass(), "countryCode", "OcJCIDNIXA");
        setField(term13684, term13684.getClass(), "salt", "XfRABIFVEp");
        setField(term13684, term13684.getClass(), "personRoles", term13803);
        setField(term13684, term13684.getClass(), "id", term13807);
        setIntField(term13810, term13810.getClass(), "year", 2016);
        setShortField(term13810, term13810.getClass(), "month", (short) 10);
        setShortField(term13810, term13810.getClass(), "day", (short) 20);
        setField(term13809, term13809.getClass(), "date", term13810);
        setByteField(term13814, term13814.getClass(), "hour", (byte) 18);
        setByteField(term13814, term13814.getClass(), "minute", (byte) 39);
        setByteField(term13814, term13814.getClass(), "second", (byte) 1);
        setIntField(term13814, term13814.getClass(), "nano", 196253988);
        setField(term13809, term13809.getClass(), "time", term13814);
        setField(term13684, term13684.getClass(), "createdAt", term13809);
        setIntField(term13820, term13820.getClass(), "year", 2019);
        setShortField(term13820, term13820.getClass(), "month", (short) 1);
        setShortField(term13820, term13820.getClass(), "day", (short) 6);
        setField(term13819, term13819.getClass(), "date", term13820);
        setByteField(term13824, term13824.getClass(), "hour", (byte) 18);
        setByteField(term13824, term13824.getClass(), "minute", (byte) 8);
        setByteField(term13824, term13824.getClass(), "second", (byte) 46);
        setIntField(term13824, term13824.getClass(), "nano", 934136445);
        setField(term13819, term13819.getClass(), "time", term13824);
        setField(term13684, term13684.getClass(), "updatedAt", term13819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MHGKyEnwKc";
        callMethod(klass, "setPhone", argTypes, term13684, args);
    }

};



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

public class Person_getPhone_16426067746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5587;

    public Person_getPhone_16426067746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5793 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term5792 = ((Class) term5793).getDeclaredField((String) "ACTIVE");
        ((Field) term5792).setAccessible(true);
        Object enum13 = ((Field) term5792).get((Object) null);
        ArrayList term5706 = new ArrayList();
        Long term5710 = new Long(-5476826692763582090L);
        term5587 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term5712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5727 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5587, term5587.getClass(), "firstName", "oVgzLbrsFr");
        setField(term5587, term5587.getClass(), "lastName", "vQVyKLdtaz");
        setField(term5587, term5587.getClass(), "email", "OWKQODBLzb");
        setField(term5587, term5587.getClass(), "username", "wGmYcqUkgE");
        setField(term5587, term5587.getClass(), "password", "idgaQsnJpQ");
        setField(term5587, term5587.getClass(), "profileImage", "VgZnGoIFwQ");
        setField(term5587, term5587.getClass(), "status", enum13);
        setField(term5587, term5587.getClass(), "phone", "jUbSRrkrYZ");
        setField(term5587, term5587.getClass(), "countryCode", "bWWfajKbEX");
        setField(term5587, term5587.getClass(), "salt", "cAPeiZHKGJ");
        setField(term5587, term5587.getClass(), "personRoles", term5706);
        setField(term5587, term5587.getClass(), "id", term5710);
        setIntField(term5713, term5713.getClass(), "year", 2021);
        setShortField(term5713, term5713.getClass(), "month", (short) 8);
        setShortField(term5713, term5713.getClass(), "day", (short) 12);
        setField(term5712, term5712.getClass(), "date", term5713);
        setByteField(term5717, term5717.getClass(), "hour", (byte) 2);
        setByteField(term5717, term5717.getClass(), "minute", (byte) 17);
        setByteField(term5717, term5717.getClass(), "second", (byte) 51);
        setIntField(term5717, term5717.getClass(), "nano", 207375141);
        setField(term5712, term5712.getClass(), "time", term5717);
        setField(term5587, term5587.getClass(), "createdAt", term5712);
        setIntField(term5723, term5723.getClass(), "year", 2025);
        setShortField(term5723, term5723.getClass(), "month", (short) 11);
        setShortField(term5723, term5723.getClass(), "day", (short) 3);
        setField(term5722, term5722.getClass(), "date", term5723);
        setByteField(term5727, term5727.getClass(), "hour", (byte) 21);
        setByteField(term5727, term5727.getClass(), "minute", (byte) 24);
        setByteField(term5727, term5727.getClass(), "second", (byte) 23);
        setIntField(term5727, term5727.getClass(), "nano", 210986721);
        setField(term5722, term5722.getClass(), "time", term5727);
        setField(term5587, term5587.getClass(), "updatedAt", term5722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term5587, args);
    }

};



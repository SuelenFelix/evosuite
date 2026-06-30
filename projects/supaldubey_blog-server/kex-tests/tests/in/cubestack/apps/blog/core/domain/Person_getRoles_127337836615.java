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

public class Person_getRoles_127337836615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10109;

    public Person_getRoles_127337836615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10315 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term10314 = ((Class) term10315).getDeclaredField((String) "ACTIVE");
        ((Field) term10314).setAccessible(true);
        Object enum22 = ((Field) term10314).get((Object) null);
        ArrayList term10228 = new ArrayList();
        Long term10232 = new Long(2486810210675247493L);
        term10109 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term10234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10239 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10249 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10109, term10109.getClass(), "firstName", "hMmaoREuCK");
        setField(term10109, term10109.getClass(), "lastName", "VeDtgDzGAN");
        setField(term10109, term10109.getClass(), "email", "aWYOWZFyaX");
        setField(term10109, term10109.getClass(), "username", "BRIVNtfUWU");
        setField(term10109, term10109.getClass(), "password", "DbiCVtPPCT");
        setField(term10109, term10109.getClass(), "profileImage", "WzFopsaDuG");
        setField(term10109, term10109.getClass(), "status", enum22);
        setField(term10109, term10109.getClass(), "phone", "PapWxkhEWe");
        setField(term10109, term10109.getClass(), "countryCode", "smnHEqRFRx");
        setField(term10109, term10109.getClass(), "salt", "XYtryyobou");
        setField(term10109, term10109.getClass(), "personRoles", term10228);
        setField(term10109, term10109.getClass(), "id", term10232);
        setIntField(term10235, term10235.getClass(), "year", 2012);
        setShortField(term10235, term10235.getClass(), "month", (short) 4);
        setShortField(term10235, term10235.getClass(), "day", (short) 25);
        setField(term10234, term10234.getClass(), "date", term10235);
        setByteField(term10239, term10239.getClass(), "hour", (byte) 21);
        setByteField(term10239, term10239.getClass(), "minute", (byte) 14);
        setByteField(term10239, term10239.getClass(), "second", (byte) 15);
        setIntField(term10239, term10239.getClass(), "nano", 561700934);
        setField(term10234, term10234.getClass(), "time", term10239);
        setField(term10109, term10109.getClass(), "createdAt", term10234);
        setIntField(term10245, term10245.getClass(), "year", 2011);
        setShortField(term10245, term10245.getClass(), "month", (short) 10);
        setShortField(term10245, term10245.getClass(), "day", (short) 25);
        setField(term10244, term10244.getClass(), "date", term10245);
        setByteField(term10249, term10249.getClass(), "hour", (byte) 10);
        setByteField(term10249, term10249.getClass(), "minute", (byte) 33);
        setByteField(term10249, term10249.getClass(), "second", (byte) 8);
        setIntField(term10249, term10249.getClass(), "nano", 268304014);
        setField(term10244, term10244.getClass(), "time", term10249);
        setField(term10109, term10109.getClass(), "updatedAt", term10244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term10109, args);
    }

};



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

public class Person_setEmail_17640669221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13167;

    public Person_setEmail_17640669221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13385 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term13384 = ((Class) term13385).getDeclaredField((String) "ACTIVE");
        ((Field) term13384).setAccessible(true);
        Object enum28 = ((Field) term13384).get((Object) null);
        ArrayList term13286 = new ArrayList();
        Long term13290 = new Long(6855071767938501807L);
        term13167 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term13292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13307 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13167, term13167.getClass(), "firstName", "GrqozDKFOk");
        setField(term13167, term13167.getClass(), "lastName", "CFyoseFGLF");
        setField(term13167, term13167.getClass(), "email", "SFqCrhEWLm");
        setField(term13167, term13167.getClass(), "username", "GZdcJyZntS");
        setField(term13167, term13167.getClass(), "password", "OIHoJeysUi");
        setField(term13167, term13167.getClass(), "profileImage", "WXMWFDGcLB");
        setField(term13167, term13167.getClass(), "status", enum28);
        setField(term13167, term13167.getClass(), "phone", "wKWbJssZuG");
        setField(term13167, term13167.getClass(), "countryCode", "NzBMMhkhpT");
        setField(term13167, term13167.getClass(), "salt", "qCpEbQDHdF");
        setField(term13167, term13167.getClass(), "personRoles", term13286);
        setField(term13167, term13167.getClass(), "id", term13290);
        setIntField(term13293, term13293.getClass(), "year", 2016);
        setShortField(term13293, term13293.getClass(), "month", (short) 2);
        setShortField(term13293, term13293.getClass(), "day", (short) 25);
        setField(term13292, term13292.getClass(), "date", term13293);
        setByteField(term13297, term13297.getClass(), "hour", (byte) 8);
        setByteField(term13297, term13297.getClass(), "minute", (byte) 54);
        setByteField(term13297, term13297.getClass(), "second", (byte) 40);
        setIntField(term13297, term13297.getClass(), "nano", 124525896);
        setField(term13292, term13292.getClass(), "time", term13297);
        setField(term13167, term13167.getClass(), "createdAt", term13292);
        setIntField(term13303, term13303.getClass(), "year", 2029);
        setShortField(term13303, term13303.getClass(), "month", (short) 1);
        setShortField(term13303, term13303.getClass(), "day", (short) 10);
        setField(term13302, term13302.getClass(), "date", term13303);
        setByteField(term13307, term13307.getClass(), "hour", (byte) 8);
        setByteField(term13307, term13307.getClass(), "minute", (byte) 46);
        setByteField(term13307, term13307.getClass(), "second", (byte) 35);
        setIntField(term13307, term13307.getClass(), "nano", 58807194);
        setField(term13302, term13302.getClass(), "time", term13307);
        setField(term13167, term13167.getClass(), "updatedAt", term13302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AHbZyFOmlo";
        callMethod(klass, "setEmail", argTypes, term13167, args);
    }

};



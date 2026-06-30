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

public class Person_getPersonRoles_200715631130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18032;

    public Person_getPersonRoles_200715631130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18238 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term18237 = ((Class) term18238).getDeclaredField((String) "ACTIVE");
        ((Field) term18237).setAccessible(true);
        Object enum38 = ((Field) term18237).get((Object) null);
        ArrayList term18151 = new ArrayList();
        Long term18155 = new Long(5907001541142728739L);
        term18032 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term18157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18162 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18172 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18032, term18032.getClass(), "firstName", "THZSpzBRYP");
        setField(term18032, term18032.getClass(), "lastName", "ZfBIVGBQOE");
        setField(term18032, term18032.getClass(), "email", "QSrDQfEsTR");
        setField(term18032, term18032.getClass(), "username", "PsqusYmejD");
        setField(term18032, term18032.getClass(), "password", "NTWMiBEaDF");
        setField(term18032, term18032.getClass(), "profileImage", "SPBstwKFVr");
        setField(term18032, term18032.getClass(), "status", enum38);
        setField(term18032, term18032.getClass(), "phone", "WxYUTuqmIq");
        setField(term18032, term18032.getClass(), "countryCode", "OeQLvhVERT");
        setField(term18032, term18032.getClass(), "salt", "IlvgFINwIa");
        setField(term18032, term18032.getClass(), "personRoles", term18151);
        setField(term18032, term18032.getClass(), "id", term18155);
        setIntField(term18158, term18158.getClass(), "year", 2020);
        setShortField(term18158, term18158.getClass(), "month", (short) 8);
        setShortField(term18158, term18158.getClass(), "day", (short) 16);
        setField(term18157, term18157.getClass(), "date", term18158);
        setByteField(term18162, term18162.getClass(), "hour", (byte) 4);
        setByteField(term18162, term18162.getClass(), "minute", (byte) 37);
        setByteField(term18162, term18162.getClass(), "second", (byte) 19);
        setIntField(term18162, term18162.getClass(), "nano", 605410923);
        setField(term18157, term18157.getClass(), "time", term18162);
        setField(term18032, term18032.getClass(), "createdAt", term18157);
        setIntField(term18168, term18168.getClass(), "year", 2028);
        setShortField(term18168, term18168.getClass(), "month", (short) 5);
        setShortField(term18168, term18168.getClass(), "day", (short) 2);
        setField(term18167, term18167.getClass(), "date", term18168);
        setByteField(term18172, term18172.getClass(), "hour", (byte) 2);
        setByteField(term18172, term18172.getClass(), "minute", (byte) 59);
        setByteField(term18172, term18172.getClass(), "second", (byte) 30);
        setIntField(term18172, term18172.getClass(), "nano", 222274238);
        setField(term18167, term18167.getClass(), "time", term18172);
        setField(term18032, term18032.getClass(), "updatedAt", term18167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPersonRoles", argTypes, term18032, args);
    }

};



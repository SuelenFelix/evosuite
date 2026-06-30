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

public class Person_getSalt_198754324228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17020;

    public Person_getSalt_198754324228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17226 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term17225 = ((Class) term17226).getDeclaredField((String) "ACTIVE");
        ((Field) term17225).setAccessible(true);
        Object enum36 = ((Field) term17225).get((Object) null);
        ArrayList term17139 = new ArrayList();
        Long term17143 = new Long(1439298019805881866L);
        term17020 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term17145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17160 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17020, term17020.getClass(), "firstName", "tsTGdgQYUL");
        setField(term17020, term17020.getClass(), "lastName", "TtGbVmKcnX");
        setField(term17020, term17020.getClass(), "email", "GJVkUrCVdD");
        setField(term17020, term17020.getClass(), "username", "zNdorvdUgu");
        setField(term17020, term17020.getClass(), "password", "oPxuZbkYio");
        setField(term17020, term17020.getClass(), "profileImage", "vKitydDVnM");
        setField(term17020, term17020.getClass(), "status", enum36);
        setField(term17020, term17020.getClass(), "phone", "urCiQnUFBM");
        setField(term17020, term17020.getClass(), "countryCode", "EKjQdtKxAM");
        setField(term17020, term17020.getClass(), "salt", "TXZAIPQJHt");
        setField(term17020, term17020.getClass(), "personRoles", term17139);
        setField(term17020, term17020.getClass(), "id", term17143);
        setIntField(term17146, term17146.getClass(), "year", 2010);
        setShortField(term17146, term17146.getClass(), "month", (short) 2);
        setShortField(term17146, term17146.getClass(), "day", (short) 24);
        setField(term17145, term17145.getClass(), "date", term17146);
        setByteField(term17150, term17150.getClass(), "hour", (byte) 17);
        setByteField(term17150, term17150.getClass(), "minute", (byte) 58);
        setByteField(term17150, term17150.getClass(), "second", (byte) 56);
        setIntField(term17150, term17150.getClass(), "nano", 291725532);
        setField(term17145, term17145.getClass(), "time", term17150);
        setField(term17020, term17020.getClass(), "createdAt", term17145);
        setIntField(term17156, term17156.getClass(), "year", 2028);
        setShortField(term17156, term17156.getClass(), "month", (short) 7);
        setShortField(term17156, term17156.getClass(), "day", (short) 22);
        setField(term17155, term17155.getClass(), "date", term17156);
        setByteField(term17160, term17160.getClass(), "hour", (byte) 18);
        setByteField(term17160, term17160.getClass(), "minute", (byte) 33);
        setByteField(term17160, term17160.getClass(), "second", (byte) 7);
        setIntField(term17160, term17160.getClass(), "nano", 763613074);
        setField(term17155, term17155.getClass(), "time", term17160);
        setField(term17020, term17020.getClass(), "updatedAt", term17155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalt", argTypes, term17020, args);
    }

};



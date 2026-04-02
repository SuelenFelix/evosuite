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

public class Person_setStatus_185172420327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16247;
     Object enum35;

    public Person_setStatus_185172420327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16465 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term16464 = ((Class) term16465).getDeclaredField((String) "ACTIVE");
        ((Field) term16464).setAccessible(true);
        Object enum34 = ((Field) term16464).get((Object) null);
        ArrayList term16366 = new ArrayList();
        Long term16370 = new Long(6617340557564669657L);
        term16247 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term16372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16377 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16387 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16247, term16247.getClass(), "firstName", "pXdglvyrQe");
        setField(term16247, term16247.getClass(), "lastName", "OcfNzHYdki");
        setField(term16247, term16247.getClass(), "email", "uPuCVuZYOI");
        setField(term16247, term16247.getClass(), "username", "TweMFhxNdj");
        setField(term16247, term16247.getClass(), "password", "NBrvVzvQHe");
        setField(term16247, term16247.getClass(), "profileImage", "FjOiNAfBOc");
        setField(term16247, term16247.getClass(), "status", enum34);
        setField(term16247, term16247.getClass(), "phone", "iCCsaLHohG");
        setField(term16247, term16247.getClass(), "countryCode", "NJhGgctbdj");
        setField(term16247, term16247.getClass(), "salt", "MYWYUeLGOp");
        setField(term16247, term16247.getClass(), "personRoles", term16366);
        setField(term16247, term16247.getClass(), "id", term16370);
        setIntField(term16373, term16373.getClass(), "year", 2022);
        setShortField(term16373, term16373.getClass(), "month", (short) 11);
        setShortField(term16373, term16373.getClass(), "day", (short) 10);
        setField(term16372, term16372.getClass(), "date", term16373);
        setByteField(term16377, term16377.getClass(), "hour", (byte) 20);
        setByteField(term16377, term16377.getClass(), "minute", (byte) 8);
        setByteField(term16377, term16377.getClass(), "second", (byte) 35);
        setIntField(term16377, term16377.getClass(), "nano", 658416570);
        setField(term16372, term16372.getClass(), "time", term16377);
        setField(term16247, term16247.getClass(), "createdAt", term16372);
        setIntField(term16383, term16383.getClass(), "year", 2018);
        setShortField(term16383, term16383.getClass(), "month", (short) 11);
        setShortField(term16383, term16383.getClass(), "day", (short) 9);
        setField(term16382, term16382.getClass(), "date", term16383);
        setByteField(term16387, term16387.getClass(), "hour", (byte) 6);
        setByteField(term16387, term16387.getClass(), "minute", (byte) 8);
        setByteField(term16387, term16387.getClass(), "second", (byte) 32);
        setIntField(term16387, term16387.getClass(), "nano", 750733310);
        setField(term16382, term16382.getClass(), "time", term16387);
        setField(term16247, term16247.getClass(), "updatedAt", term16382);
        Class<? extends Object> term16755 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term16754 = ((Class) term16755).getDeclaredField((String) "DISABLED");
        ((Field) term16754).setAccessible(true);
        enum35 = ((Field) term16754).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.PersonStatus");
        Object[] args = new Object[1];
        args[0] = enum35;
        callMethod(klass, "setStatus", argTypes, term16247, args);
    }

};



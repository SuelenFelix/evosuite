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

public class Person_getId_8828658622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3607;

    public Person_getId_8828658622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3813 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term3812 = ((Class) term3813).getDeclaredField((String) "ACTIVE");
        ((Field) term3812).setAccessible(true);
        Object enum9 = ((Field) term3812).get((Object) null);
        ArrayList term3726 = new ArrayList();
        Long term3730 = new Long(-2813493605142626659L);
        term3607 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term3732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3737 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3747 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3607, term3607.getClass(), "firstName", "wSQxaModmm");
        setField(term3607, term3607.getClass(), "lastName", "UlajhuVLaP");
        setField(term3607, term3607.getClass(), "email", "gGSMzuGICf");
        setField(term3607, term3607.getClass(), "username", "hxCBltsObl");
        setField(term3607, term3607.getClass(), "password", "BndsHwAFMv");
        setField(term3607, term3607.getClass(), "profileImage", "GzFkzHGYFt");
        setField(term3607, term3607.getClass(), "status", enum9);
        setField(term3607, term3607.getClass(), "phone", "tShwQLRGNe");
        setField(term3607, term3607.getClass(), "countryCode", "LvtrsXUliU");
        setField(term3607, term3607.getClass(), "salt", "xLbjWUgOIL");
        setField(term3607, term3607.getClass(), "personRoles", term3726);
        setField(term3607, term3607.getClass(), "id", term3730);
        setIntField(term3733, term3733.getClass(), "year", 2014);
        setShortField(term3733, term3733.getClass(), "month", (short) 7);
        setShortField(term3733, term3733.getClass(), "day", (short) 13);
        setField(term3732, term3732.getClass(), "date", term3733);
        setByteField(term3737, term3737.getClass(), "hour", (byte) 21);
        setByteField(term3737, term3737.getClass(), "minute", (byte) 46);
        setByteField(term3737, term3737.getClass(), "second", (byte) 0);
        setIntField(term3737, term3737.getClass(), "nano", 887884128);
        setField(term3732, term3732.getClass(), "time", term3737);
        setField(term3607, term3607.getClass(), "createdAt", term3732);
        setIntField(term3743, term3743.getClass(), "year", 2023);
        setShortField(term3743, term3743.getClass(), "month", (short) 3);
        setShortField(term3743, term3743.getClass(), "day", (short) 7);
        setField(term3742, term3742.getClass(), "date", term3743);
        setByteField(term3747, term3747.getClass(), "hour", (byte) 21);
        setByteField(term3747, term3747.getClass(), "minute", (byte) 15);
        setByteField(term3747, term3747.getClass(), "second", (byte) 43);
        setIntField(term3747, term3747.getClass(), "nano", 639721472);
        setField(term3742, term3742.getClass(), "time", term3747);
        setField(term3607, term3607.getClass(), "updatedAt", term3742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3607, args);
    }

};



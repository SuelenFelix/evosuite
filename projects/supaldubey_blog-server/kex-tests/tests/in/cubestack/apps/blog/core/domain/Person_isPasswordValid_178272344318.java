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

public class Person_isPasswordValid_178272344318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11616;

    public Person_isPasswordValid_178272344318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11834 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term11833 = ((Class) term11834).getDeclaredField((String) "ACTIVE");
        ((Field) term11833).setAccessible(true);
        Object enum25 = ((Field) term11833).get((Object) null);
        ArrayList term11735 = new ArrayList();
        Long term11739 = new Long(-4502405999831680926L);
        term11616 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term11741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11756 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11616, term11616.getClass(), "firstName", "iljANwuEjk");
        setField(term11616, term11616.getClass(), "lastName", "kNqaJKIATy");
        setField(term11616, term11616.getClass(), "email", "vKQukfbJUd");
        setField(term11616, term11616.getClass(), "username", "lFRJFUMVbx");
        setField(term11616, term11616.getClass(), "password", "sZdUNdggUW");
        setField(term11616, term11616.getClass(), "profileImage", "OqbwYQfvAe");
        setField(term11616, term11616.getClass(), "status", enum25);
        setField(term11616, term11616.getClass(), "phone", "tRxZafjqIx");
        setField(term11616, term11616.getClass(), "countryCode", "DhjNLmRMCu");
        setField(term11616, term11616.getClass(), "salt", "PgPzMSEjjX");
        setField(term11616, term11616.getClass(), "personRoles", term11735);
        setField(term11616, term11616.getClass(), "id", term11739);
        setIntField(term11742, term11742.getClass(), "year", 2025);
        setShortField(term11742, term11742.getClass(), "month", (short) 9);
        setShortField(term11742, term11742.getClass(), "day", (short) 25);
        setField(term11741, term11741.getClass(), "date", term11742);
        setByteField(term11746, term11746.getClass(), "hour", (byte) 20);
        setByteField(term11746, term11746.getClass(), "minute", (byte) 0);
        setByteField(term11746, term11746.getClass(), "second", (byte) 25);
        setIntField(term11746, term11746.getClass(), "nano", 65871584);
        setField(term11741, term11741.getClass(), "time", term11746);
        setField(term11616, term11616.getClass(), "createdAt", term11741);
        setIntField(term11752, term11752.getClass(), "year", 2011);
        setShortField(term11752, term11752.getClass(), "month", (short) 9);
        setShortField(term11752, term11752.getClass(), "day", (short) 25);
        setField(term11751, term11751.getClass(), "date", term11752);
        setByteField(term11756, term11756.getClass(), "hour", (byte) 16);
        setByteField(term11756, term11756.getClass(), "minute", (byte) 45);
        setByteField(term11756, term11756.getClass(), "second", (byte) 19);
        setIntField(term11756, term11756.getClass(), "nano", 962864785);
        setField(term11751, term11751.getClass(), "time", term11756);
        setField(term11616, term11616.getClass(), "updatedAt", term11751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wzsPSPcRdj";
        callMethod(klass, "isPasswordValid", argTypes, term11616, args);
    }

};



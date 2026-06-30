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

public class Person_activate_103422201610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7567;

    public Person_activate_103422201610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7773 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term7772 = ((Class) term7773).getDeclaredField((String) "ACTIVE");
        ((Field) term7772).setAccessible(true);
        Object enum17 = ((Field) term7772).get((Object) null);
        ArrayList term7686 = new ArrayList();
        Long term7690 = new Long(-6573104506744284592L);
        term7567 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term7692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7707 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7567, term7567.getClass(), "firstName", "OEXDRUKcFl");
        setField(term7567, term7567.getClass(), "lastName", "RYdKCNNMBR");
        setField(term7567, term7567.getClass(), "email", "yGtHPyvYiQ");
        setField(term7567, term7567.getClass(), "username", "MvRIxilFMJ");
        setField(term7567, term7567.getClass(), "password", "iNwOJRBEjp");
        setField(term7567, term7567.getClass(), "profileImage", "XylxrMBraH");
        setField(term7567, term7567.getClass(), "status", enum17);
        setField(term7567, term7567.getClass(), "phone", "pORebkoRdD");
        setField(term7567, term7567.getClass(), "countryCode", "mXGCWJDOqA");
        setField(term7567, term7567.getClass(), "salt", "dpNsDgfPso");
        setField(term7567, term7567.getClass(), "personRoles", term7686);
        setField(term7567, term7567.getClass(), "id", term7690);
        setIntField(term7693, term7693.getClass(), "year", 2010);
        setShortField(term7693, term7693.getClass(), "month", (short) 1);
        setShortField(term7693, term7693.getClass(), "day", (short) 17);
        setField(term7692, term7692.getClass(), "date", term7693);
        setByteField(term7697, term7697.getClass(), "hour", (byte) 13);
        setByteField(term7697, term7697.getClass(), "minute", (byte) 5);
        setByteField(term7697, term7697.getClass(), "second", (byte) 51);
        setIntField(term7697, term7697.getClass(), "nano", 362260580);
        setField(term7692, term7692.getClass(), "time", term7697);
        setField(term7567, term7567.getClass(), "createdAt", term7692);
        setIntField(term7703, term7703.getClass(), "year", 2010);
        setShortField(term7703, term7703.getClass(), "month", (short) 9);
        setShortField(term7703, term7703.getClass(), "day", (short) 28);
        setField(term7702, term7702.getClass(), "date", term7703);
        setByteField(term7707, term7707.getClass(), "hour", (byte) 6);
        setByteField(term7707, term7707.getClass(), "minute", (byte) 4);
        setByteField(term7707, term7707.getClass(), "second", (byte) 54);
        setIntField(term7707, term7707.getClass(), "nano", 604713782);
        setField(term7702, term7702.getClass(), "time", term7707);
        setField(term7567, term7567.getClass(), "updatedAt", term7702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "activate", argTypes, term7567, args);
    }

};



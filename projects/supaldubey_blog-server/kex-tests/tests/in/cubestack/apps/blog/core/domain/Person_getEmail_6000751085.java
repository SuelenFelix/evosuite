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

public class Person_getEmail_6000751085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5092;

    public Person_getEmail_6000751085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5298 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term5297 = ((Class) term5298).getDeclaredField((String) "ACTIVE");
        ((Field) term5297).setAccessible(true);
        Object enum12 = ((Field) term5297).get((Object) null);
        ArrayList term5211 = new ArrayList();
        Long term5215 = new Long(2535595959091595249L);
        term5092 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term5217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5232 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5092, term5092.getClass(), "firstName", "TJmVBGfTML");
        setField(term5092, term5092.getClass(), "lastName", "tPlsykYBqO");
        setField(term5092, term5092.getClass(), "email", "bLPjGVBhlX");
        setField(term5092, term5092.getClass(), "username", "whBvTVIIlC");
        setField(term5092, term5092.getClass(), "password", "IgRJUzaCwW");
        setField(term5092, term5092.getClass(), "profileImage", "JUmudUmaaV");
        setField(term5092, term5092.getClass(), "status", enum12);
        setField(term5092, term5092.getClass(), "phone", "KoyGrUJeJW");
        setField(term5092, term5092.getClass(), "countryCode", "HqBOwkVqjD");
        setField(term5092, term5092.getClass(), "salt", "MAcUBcBckh");
        setField(term5092, term5092.getClass(), "personRoles", term5211);
        setField(term5092, term5092.getClass(), "id", term5215);
        setIntField(term5218, term5218.getClass(), "year", 2028);
        setShortField(term5218, term5218.getClass(), "month", (short) 10);
        setShortField(term5218, term5218.getClass(), "day", (short) 1);
        setField(term5217, term5217.getClass(), "date", term5218);
        setByteField(term5222, term5222.getClass(), "hour", (byte) 17);
        setByteField(term5222, term5222.getClass(), "minute", (byte) 29);
        setByteField(term5222, term5222.getClass(), "second", (byte) 30);
        setIntField(term5222, term5222.getClass(), "nano", 845472306);
        setField(term5217, term5217.getClass(), "time", term5222);
        setField(term5092, term5092.getClass(), "createdAt", term5217);
        setIntField(term5228, term5228.getClass(), "year", 2027);
        setShortField(term5228, term5228.getClass(), "month", (short) 2);
        setShortField(term5228, term5228.getClass(), "day", (short) 19);
        setField(term5227, term5227.getClass(), "date", term5228);
        setByteField(term5232, term5232.getClass(), "hour", (byte) 17);
        setByteField(term5232, term5232.getClass(), "minute", (byte) 37);
        setByteField(term5232, term5232.getClass(), "second", (byte) 27);
        setIntField(term5232, term5232.getClass(), "nano", 920380537);
        setField(term5227, term5227.getClass(), "time", term5232);
        setField(term5092, term5092.getClass(), "updatedAt", term5227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term5092, args);
    }

};



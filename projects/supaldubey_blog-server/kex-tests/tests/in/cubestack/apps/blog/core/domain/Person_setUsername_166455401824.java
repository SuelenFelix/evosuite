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

public class Person_setUsername_166455401824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14718;

    public Person_setUsername_166455401824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14936 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term14935 = ((Class) term14936).getDeclaredField((String) "ACTIVE");
        ((Field) term14935).setAccessible(true);
        Object enum31 = ((Field) term14935).get((Object) null);
        ArrayList term14837 = new ArrayList();
        Long term14841 = new Long(-6823727938421990489L);
        term14718 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term14843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14858 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14718, term14718.getClass(), "firstName", "NTlKJDDWlk");
        setField(term14718, term14718.getClass(), "lastName", "vOuMEpOQAg");
        setField(term14718, term14718.getClass(), "email", "SIODFGaQhr");
        setField(term14718, term14718.getClass(), "username", "qYzsiuXOgS");
        setField(term14718, term14718.getClass(), "password", "bxrCBbrrct");
        setField(term14718, term14718.getClass(), "profileImage", "CKWpJaaaxX");
        setField(term14718, term14718.getClass(), "status", enum31);
        setField(term14718, term14718.getClass(), "phone", "UBRmXJmfrt");
        setField(term14718, term14718.getClass(), "countryCode", "WZzvmIHhzZ");
        setField(term14718, term14718.getClass(), "salt", "doQLHkjpNm");
        setField(term14718, term14718.getClass(), "personRoles", term14837);
        setField(term14718, term14718.getClass(), "id", term14841);
        setIntField(term14844, term14844.getClass(), "year", 2018);
        setShortField(term14844, term14844.getClass(), "month", (short) 2);
        setShortField(term14844, term14844.getClass(), "day", (short) 14);
        setField(term14843, term14843.getClass(), "date", term14844);
        setByteField(term14848, term14848.getClass(), "hour", (byte) 2);
        setByteField(term14848, term14848.getClass(), "minute", (byte) 40);
        setByteField(term14848, term14848.getClass(), "second", (byte) 48);
        setIntField(term14848, term14848.getClass(), "nano", 371006728);
        setField(term14843, term14843.getClass(), "time", term14848);
        setField(term14718, term14718.getClass(), "createdAt", term14843);
        setIntField(term14854, term14854.getClass(), "year", 2025);
        setShortField(term14854, term14854.getClass(), "month", (short) 8);
        setShortField(term14854, term14854.getClass(), "day", (short) 22);
        setField(term14853, term14853.getClass(), "date", term14854);
        setByteField(term14858, term14858.getClass(), "hour", (byte) 6);
        setByteField(term14858, term14858.getClass(), "minute", (byte) 48);
        setByteField(term14858, term14858.getClass(), "second", (byte) 49);
        setIntField(term14858, term14858.getClass(), "nano", 46400229);
        setField(term14853, term14853.getClass(), "time", term14858);
        setField(term14718, term14718.getClass(), "updatedAt", term14853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lCyLIcSuom";
        callMethod(klass, "setUsername", argTypes, term14718, args);
    }

};



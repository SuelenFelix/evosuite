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

public class Person_getProfileImage_199199658211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8062;

    public Person_getProfileImage_199199658211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8268 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term8267 = ((Class) term8268).getDeclaredField((String) "ACTIVE");
        ((Field) term8267).setAccessible(true);
        Object enum18 = ((Field) term8267).get((Object) null);
        ArrayList term8181 = new ArrayList();
        Long term8185 = new Long(-4920224193275732920L);
        term8062 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term8187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8192 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8202 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8062, term8062.getClass(), "firstName", "hCWPJQKpdc");
        setField(term8062, term8062.getClass(), "lastName", "WzMEhMXkKx");
        setField(term8062, term8062.getClass(), "email", "XOiDvlDhdc");
        setField(term8062, term8062.getClass(), "username", "AdxvLJhNLe");
        setField(term8062, term8062.getClass(), "password", "lHfTrWKMPk");
        setField(term8062, term8062.getClass(), "profileImage", "JDaAnsVTGV");
        setField(term8062, term8062.getClass(), "status", enum18);
        setField(term8062, term8062.getClass(), "phone", "mLUZFTfjle");
        setField(term8062, term8062.getClass(), "countryCode", "xIeFjkHkOe");
        setField(term8062, term8062.getClass(), "salt", "SdCKLMIYnX");
        setField(term8062, term8062.getClass(), "personRoles", term8181);
        setField(term8062, term8062.getClass(), "id", term8185);
        setIntField(term8188, term8188.getClass(), "year", 2023);
        setShortField(term8188, term8188.getClass(), "month", (short) 7);
        setShortField(term8188, term8188.getClass(), "day", (short) 16);
        setField(term8187, term8187.getClass(), "date", term8188);
        setByteField(term8192, term8192.getClass(), "hour", (byte) 3);
        setByteField(term8192, term8192.getClass(), "minute", (byte) 1);
        setByteField(term8192, term8192.getClass(), "second", (byte) 19);
        setIntField(term8192, term8192.getClass(), "nano", 488629554);
        setField(term8187, term8187.getClass(), "time", term8192);
        setField(term8062, term8062.getClass(), "createdAt", term8187);
        setIntField(term8198, term8198.getClass(), "year", 2018);
        setShortField(term8198, term8198.getClass(), "month", (short) 7);
        setShortField(term8198, term8198.getClass(), "day", (short) 12);
        setField(term8197, term8197.getClass(), "date", term8198);
        setByteField(term8202, term8202.getClass(), "hour", (byte) 1);
        setByteField(term8202, term8202.getClass(), "minute", (byte) 3);
        setByteField(term8202, term8202.getClass(), "second", (byte) 47);
        setIntField(term8202, term8202.getClass(), "nano", 2729929);
        setField(term8197, term8197.getClass(), "time", term8202);
        setField(term8062, term8062.getClass(), "updatedAt", term8197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfileImage", argTypes, term8062, args);
    }

};



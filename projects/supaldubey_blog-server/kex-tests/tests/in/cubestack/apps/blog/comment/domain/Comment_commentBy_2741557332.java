package in.cubestack.apps.blog.comment.domain;

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
import static in.cubestack.apps.blog.comment.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class Comment_commentBy_2741557332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;
     Object term461;

    public Comment_commentBy_2741557332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term627 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term626 = ((Class) term627).getDeclaredField((String) "PUBLISHED");
        ((Field) term626).setAccessible(true);
        Object enum1 = ((Field) term626).get((Object) null);
        Long term439 = new Long(2442117782898005296L);
        term379 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        Object term429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term434 = newInstance(Class.forName("java.time.LocalTime"));
        Object term441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term446 = newInstance(Class.forName("java.time.LocalTime"));
        Object term451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term456 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term379, term379.getClass(), "title", "MuLcgQHgqz");
        setField(term379, term379.getClass(), "commenterId", "xxtlPwDYFs");
        setField(term379, term379.getClass(), "status", enum1);
        setField(term379, term379.getClass(), "content", "jJCZpVmanW");
        setIntField(term430, term430.getClass(), "year", 2021);
        setShortField(term430, term430.getClass(), "month", (short) 1);
        setShortField(term430, term430.getClass(), "day", (short) 18);
        setField(term429, term429.getClass(), "date", term430);
        setByteField(term434, term434.getClass(), "hour", (byte) 13);
        setByteField(term434, term434.getClass(), "minute", (byte) 38);
        setByteField(term434, term434.getClass(), "second", (byte) 26);
        setIntField(term434, term434.getClass(), "nano", 544608644);
        setField(term429, term429.getClass(), "time", term434);
        setField(term379, term379.getClass(), "publishedAt", term429);
        setField(term379, term379.getClass(), "id", term439);
        setIntField(term442, term442.getClass(), "year", 2015);
        setShortField(term442, term442.getClass(), "month", (short) 9);
        setShortField(term442, term442.getClass(), "day", (short) 19);
        setField(term441, term441.getClass(), "date", term442);
        setByteField(term446, term446.getClass(), "hour", (byte) 9);
        setByteField(term446, term446.getClass(), "minute", (byte) 4);
        setByteField(term446, term446.getClass(), "second", (byte) 10);
        setIntField(term446, term446.getClass(), "nano", 401765865);
        setField(term441, term441.getClass(), "time", term446);
        setField(term379, term379.getClass(), "createdAt", term441);
        setIntField(term452, term452.getClass(), "year", 2015);
        setShortField(term452, term452.getClass(), "month", (short) 4);
        setShortField(term452, term452.getClass(), "day", (short) 14);
        setField(term451, term451.getClass(), "date", term452);
        setByteField(term456, term456.getClass(), "hour", (byte) 18);
        setByteField(term456, term456.getClass(), "minute", (byte) 24);
        setByteField(term456, term456.getClass(), "second", (byte) 32);
        setIntField(term456, term456.getClass(), "nano", 369233818);
        setField(term451, term451.getClass(), "time", term456);
        setField(term379, term379.getClass(), "updatedAt", term451);
        Class<? extends Object> term1019 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term1018 = ((Class) term1019).getDeclaredField((String) "ACTIVE");
        ((Field) term1018).setAccessible(true);
        Object enum2 = ((Field) term1018).get((Object) null);
        ArrayList term580 = new ArrayList();
        Long term584 = new Long(6375119433582206027L);
        term461 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term601 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term461, term461.getClass(), "firstName", "EGtDIRbSSb");
        setField(term461, term461.getClass(), "lastName", "SzjVpOQTyS");
        setField(term461, term461.getClass(), "email", "MjGYSRKTNF");
        setField(term461, term461.getClass(), "username", "hRNSzYYIrc");
        setField(term461, term461.getClass(), "password", "RMFIsYGgne");
        setField(term461, term461.getClass(), "profileImage", "NRdvgJlhkX");
        setField(term461, term461.getClass(), "status", enum2);
        setField(term461, term461.getClass(), "phone", "uuaPigETmJ");
        setField(term461, term461.getClass(), "countryCode", "MxlszYVzRf");
        setField(term461, term461.getClass(), "salt", "LQFpaHEwXR");
        setField(term461, term461.getClass(), "personRoles", term580);
        setField(term461, term461.getClass(), "id", term584);
        setIntField(term587, term587.getClass(), "year", 2022);
        setShortField(term587, term587.getClass(), "month", (short) 2);
        setShortField(term587, term587.getClass(), "day", (short) 26);
        setField(term586, term586.getClass(), "date", term587);
        setByteField(term591, term591.getClass(), "hour", (byte) 11);
        setByteField(term591, term591.getClass(), "minute", (byte) 42);
        setByteField(term591, term591.getClass(), "second", (byte) 15);
        setIntField(term591, term591.getClass(), "nano", 377731937);
        setField(term586, term586.getClass(), "time", term591);
        setField(term461, term461.getClass(), "createdAt", term586);
        setIntField(term597, term597.getClass(), "year", 2026);
        setShortField(term597, term597.getClass(), "month", (short) 12);
        setShortField(term597, term597.getClass(), "day", (short) 14);
        setField(term596, term596.getClass(), "date", term597);
        setByteField(term601, term601.getClass(), "hour", (byte) 16);
        setByteField(term601, term601.getClass(), "minute", (byte) 34);
        setByteField(term601, term601.getClass(), "second", (byte) 9);
        setIntField(term601, term601.getClass(), "nano", 518326996);
        setField(term596, term596.getClass(), "time", term601);
        setField(term461, term461.getClass(), "updatedAt", term596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Object[] args = new Object[1];
        args[0] = term461;
        callMethod(klass, "commentBy", argTypes, term379, args);
    }

};



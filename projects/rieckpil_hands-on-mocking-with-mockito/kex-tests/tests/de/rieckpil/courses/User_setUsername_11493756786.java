package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setUsername_11493756786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1305;

    public User_setUsername_11493756786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1306 = new Long(4872422362414183754L);
        term1305 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1337 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1305, term1305.getClass(), "id", term1306);
        setField(term1305, term1305.getClass(), "username", "JDswTTCZHV");
        setField(term1305, term1305.getClass(), "email", "onpbIeEKoi");
        setIntField(term1333, term1333.getClass(), "year", 2026);
        setShortField(term1333, term1333.getClass(), "month", (short) 12);
        setShortField(term1333, term1333.getClass(), "day", (short) 14);
        setField(term1332, term1332.getClass(), "date", term1333);
        setByteField(term1337, term1337.getClass(), "hour", (byte) 16);
        setByteField(term1337, term1337.getClass(), "minute", (byte) 34);
        setByteField(term1337, term1337.getClass(), "second", (byte) 9);
        setIntField(term1337, term1337.getClass(), "nano", 518326996);
        setField(term1332, term1332.getClass(), "time", term1337);
        setField(term1305, term1305.getClass(), "createdAt", term1332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setUsername", argTypes, term1305, args);
    }

};



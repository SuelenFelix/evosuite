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

public class User_getUsername_4369667625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;

    public User_getUsername_4369667625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1249 = new Long(7411271909051562686L);
        term1248 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1280 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1248, term1248.getClass(), "id", term1249);
        setField(term1248, term1248.getClass(), "username", "UiUYnPrcCi");
        setField(term1248, term1248.getClass(), "email", "UoYtihxVaS");
        setIntField(term1276, term1276.getClass(), "year", 2022);
        setShortField(term1276, term1276.getClass(), "month", (short) 2);
        setShortField(term1276, term1276.getClass(), "day", (short) 26);
        setField(term1275, term1275.getClass(), "date", term1276);
        setByteField(term1280, term1280.getClass(), "hour", (byte) 11);
        setByteField(term1280, term1280.getClass(), "minute", (byte) 42);
        setByteField(term1280, term1280.getClass(), "second", (byte) 15);
        setIntField(term1280, term1280.getClass(), "nano", 377731937);
        setField(term1275, term1275.getClass(), "time", term1280);
        setField(term1248, term1248.getClass(), "createdAt", term1275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1248, args);
    }

};



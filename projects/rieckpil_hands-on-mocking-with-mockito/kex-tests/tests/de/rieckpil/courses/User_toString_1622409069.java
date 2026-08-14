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

public class User_toString_1622409069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1508;

    public User_toString_1622409069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1509 = new Long(6967924379644551255L);
        term1508 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1540 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1508, term1508.getClass(), "id", term1509);
        setField(term1508, term1508.getClass(), "username", "ieCtQFdkii");
        setField(term1508, term1508.getClass(), "email", "dEnhdmILtU");
        setIntField(term1536, term1536.getClass(), "year", 2022);
        setShortField(term1536, term1536.getClass(), "month", (short) 11);
        setShortField(term1536, term1536.getClass(), "day", (short) 16);
        setField(term1535, term1535.getClass(), "date", term1536);
        setByteField(term1540, term1540.getClass(), "hour", (byte) 15);
        setByteField(term1540, term1540.getClass(), "minute", (byte) 54);
        setByteField(term1540, term1540.getClass(), "second", (byte) 2);
        setIntField(term1540, term1540.getClass(), "nano", 733274103);
        setField(term1535, term1535.getClass(), "time", term1540);
        setField(term1508, term1508.getClass(), "createdAt", term1535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1508, args);
    }

};



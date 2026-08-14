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

public class User_setEmail_16574442922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1053;

    public User_setEmail_16574442922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1054 = new Long(6375119433582206027L);
        term1053 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1085 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1053, term1053.getClass(), "id", term1054);
        setField(term1053, term1053.getClass(), "username", "BndsHwAFMv");
        setField(term1053, term1053.getClass(), "email", "GzFkzHGYFt");
        setIntField(term1081, term1081.getClass(), "year", 2021);
        setShortField(term1081, term1081.getClass(), "month", (short) 1);
        setShortField(term1081, term1081.getClass(), "day", (short) 18);
        setField(term1080, term1080.getClass(), "date", term1081);
        setByteField(term1085, term1085.getClass(), "hour", (byte) 13);
        setByteField(term1085, term1085.getClass(), "minute", (byte) 38);
        setByteField(term1085, term1085.getClass(), "second", (byte) 26);
        setIntField(term1085, term1085.getClass(), "nano", 544608644);
        setField(term1080, term1080.getClass(), "time", term1085);
        setField(term1053, term1053.getClass(), "createdAt", term1080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setEmail", argTypes, term1053, args);
    }

};



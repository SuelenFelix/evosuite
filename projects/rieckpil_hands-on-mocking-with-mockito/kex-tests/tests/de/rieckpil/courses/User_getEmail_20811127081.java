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

public class User_getEmail_20811127081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996;

    public User_getEmail_20811127081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term997 = new Long(2442117782898005296L);
        term996 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1028 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term996, term996.getClass(), "id", term997);
        setField(term996, term996.getClass(), "username", "gGSMzuGICf");
        setField(term996, term996.getClass(), "email", "hxCBltsObl");
        setIntField(term1024, term1024.getClass(), "year", 2012);
        setShortField(term1024, term1024.getClass(), "month", (short) 8);
        setShortField(term1024, term1024.getClass(), "day", (short) 25);
        setField(term1023, term1023.getClass(), "date", term1024);
        setByteField(term1028, term1028.getClass(), "hour", (byte) 5);
        setByteField(term1028, term1028.getClass(), "minute", (byte) 20);
        setByteField(term1028, term1028.getClass(), "second", (byte) 50);
        setIntField(term1028, term1028.getClass(), "nano", 345595912);
        setField(term1023, term1023.getClass(), "time", term1028);
        setField(term996, term996.getClass(), "createdAt", term1023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term996, args);
    }

};



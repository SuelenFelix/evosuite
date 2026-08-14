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

public class User_getId_5981717383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1132;

    public User_getId_5981717383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1133 = new Long(-8257434502486459194L);
        term1132 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1164 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1132, term1132.getClass(), "id", term1133);
        setField(term1132, term1132.getClass(), "username", "LvtrsXUliU");
        setField(term1132, term1132.getClass(), "email", "xLbjWUgOIL");
        setIntField(term1160, term1160.getClass(), "year", 2015);
        setShortField(term1160, term1160.getClass(), "month", (short) 9);
        setShortField(term1160, term1160.getClass(), "day", (short) 19);
        setField(term1159, term1159.getClass(), "date", term1160);
        setByteField(term1164, term1164.getClass(), "hour", (byte) 9);
        setByteField(term1164, term1164.getClass(), "minute", (byte) 4);
        setByteField(term1164, term1164.getClass(), "second", (byte) 10);
        setIntField(term1164, term1164.getClass(), "nano", 401765865);
        setField(term1159, term1159.getClass(), "time", term1164);
        setField(term1132, term1132.getClass(), "createdAt", term1159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1132, args);
    }

};



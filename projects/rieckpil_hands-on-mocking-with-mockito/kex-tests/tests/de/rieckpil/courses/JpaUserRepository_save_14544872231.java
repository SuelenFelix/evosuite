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

public class JpaUserRepository_save_14544872231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1623;
     Object term1624;

    public JpaUserRepository_save_14544872231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1623 = newInstance(Class.forName("de.rieckpil.courses.JpaUserRepository"));
        Long term1625 = new Long(-2813493605142626659L);
        term1624 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1656 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1624, term1624.getClass(), "id", term1625);
        setField(term1624, term1624.getClass(), "username", "fhkbdRViHi");
        setField(term1624, term1624.getClass(), "email", "uWHnvSvaPl");
        setIntField(term1652, term1652.getClass(), "year", 2019);
        setShortField(term1652, term1652.getClass(), "month", (short) 2);
        setShortField(term1652, term1652.getClass(), "day", (short) 21);
        setField(term1651, term1651.getClass(), "date", term1652);
        setByteField(term1656, term1656.getClass(), "hour", (byte) 5);
        setByteField(term1656, term1656.getClass(), "minute", (byte) 41);
        setByteField(term1656, term1656.getClass(), "second", (byte) 11);
        setIntField(term1656, term1656.getClass(), "nano", 859829782);
        setField(term1651, term1651.getClass(), "time", term1656);
        setField(term1624, term1624.getClass(), "createdAt", term1651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.JpaUserRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.rieckpil.courses.User");
        Object[] args = new Object[1];
        args[0] = term1624;
        callMethod(klass, "save", argTypes, term1623, args);
    }

};



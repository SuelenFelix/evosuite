package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class SubmittedHours_init_17464780712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22322;
     Object term22326;

    public SubmittedHours_init_17464780712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22322 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22322, term22322.getClass(), "year", 2012);
        setShortField(term22322, term22322.getClass(), "month", (short) 2);
        setShortField(term22322, term22322.getClass(), "day", (short) 19);
        term22326 = new Float(0.06480974F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHours");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term22322;
        args[1] = term22326;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



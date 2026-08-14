package com.vivek.pattern.models;

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
import static com.vivek.pattern.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class User_init_1990720670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;

    public User_init_1990720670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term499 = new Integer(-616727354);
        term474 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term475 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term476 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term494 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term476, term476.getClass(), "title", "ZiaGIbnzTs");
        setField(term475, term475.getClass(), "movie", term476);
        setIntField(term490, term490.getClass(), "year", 2019);
        setShortField(term490, term490.getClass(), "month", (short) 2);
        setShortField(term490, term490.getClass(), "day", (short) 21);
        setField(term489, term489.getClass(), "date", term490);
        setByteField(term494, term494.getClass(), "hour", (byte) 5);
        setByteField(term494, term494.getClass(), "minute", (byte) 41);
        setByteField(term494, term494.getClass(), "second", (byte) 11);
        setIntField(term494, term494.getClass(), "nano", 859829782);
        setField(term489, term489.getClass(), "time", term494);
        setField(term475, term475.getClass(), "dateTime", term489);
        setField(term474, term474.getClass(), "show", term475);
        setField(term474, term474.getClass(), "numSeats", term499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.User");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.vivek.pattern.models.Booking");
        Object[] args = new Object[3];
        args[0] = "oVcInYnLWB";
        args[1] = "aJlieCFVtF";
        args[2] = term474;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



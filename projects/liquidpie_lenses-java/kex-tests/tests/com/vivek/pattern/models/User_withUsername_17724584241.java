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

public class User_withUsername_17724584241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;

    public User_withUsername_17724584241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term570 = new Integer(-1955890973);
        term531 = newInstance(Class.forName("com.vivek.pattern.models.User"));
        Object term556 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term557 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term558 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term565 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term531, term531.getClass(), "username", "tbcdzjIfER");
        setField(term531, term531.getClass(), "emailId", "HyxfbSQYBe");
        setField(term558, term558.getClass(), "title", "");
        setField(term557, term557.getClass(), "movie", term558);
        setIntField(term561, term561.getClass(), "year", 2018);
        setShortField(term561, term561.getClass(), "month", (short) 9);
        setShortField(term561, term561.getClass(), "day", (short) 28);
        setField(term560, term560.getClass(), "date", term561);
        setByteField(term565, term565.getClass(), "hour", (byte) 3);
        setByteField(term565, term565.getClass(), "minute", (byte) 37);
        setByteField(term565, term565.getClass(), "second", (byte) 46);
        setIntField(term565, term565.getClass(), "nano", 763326845);
        setField(term560, term560.getClass(), "time", term565);
        setField(term557, term557.getClass(), "dateTime", term560);
        setField(term556, term556.getClass(), "show", term557);
        setField(term556, term556.getClass(), "numSeats", term570);
        setField(term531, term531.getClass(), "booking", term556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "withUsername", argTypes, term531, args);
    }

};



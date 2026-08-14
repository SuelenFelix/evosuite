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

public class User_toString_16571535814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;

    public User_toString_16571535814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term834 = new Integer(1725571209);
        term795 = newInstance(Class.forName("com.vivek.pattern.models.User"));
        Object term820 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term821 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term822 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term829 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term795, term795.getClass(), "username", "TEParAifyi");
        setField(term795, term795.getClass(), "emailId", "OWDIEULEFu");
        setField(term822, term822.getClass(), "title", "");
        setField(term821, term821.getClass(), "movie", term822);
        setIntField(term825, term825.getClass(), "year", 2017);
        setShortField(term825, term825.getClass(), "month", (short) 6);
        setShortField(term825, term825.getClass(), "day", (short) 8);
        setField(term824, term824.getClass(), "date", term825);
        setByteField(term829, term829.getClass(), "hour", (byte) 0);
        setByteField(term829, term829.getClass(), "minute", (byte) 18);
        setByteField(term829, term829.getClass(), "second", (byte) 55);
        setIntField(term829, term829.getClass(), "nano", 680586717);
        setField(term824, term824.getClass(), "time", term829);
        setField(term821, term821.getClass(), "dateTime", term824);
        setField(term820, term820.getClass(), "show", term821);
        setField(term820, term820.getClass(), "numSeats", term834);
        setField(term795, term795.getClass(), "booking", term820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term795, args);
    }

};



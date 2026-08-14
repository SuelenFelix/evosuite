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

public class User_withBooking_1878271173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697;
     Object term738;

    public User_withBooking_1878271173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term736 = new Integer(1227103734);
        term697 = newInstance(Class.forName("com.vivek.pattern.models.User"));
        Object term722 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term723 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term724 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term731 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term697, term697.getClass(), "username", "vrQLuWIDJX");
        setField(term697, term697.getClass(), "emailId", "flxyYxBRtu");
        setField(term724, term724.getClass(), "title", "");
        setField(term723, term723.getClass(), "movie", term724);
        setIntField(term727, term727.getClass(), "year", 2021);
        setShortField(term727, term727.getClass(), "month", (short) 9);
        setShortField(term727, term727.getClass(), "day", (short) 7);
        setField(term726, term726.getClass(), "date", term727);
        setByteField(term731, term731.getClass(), "hour", (byte) 5);
        setByteField(term731, term731.getClass(), "minute", (byte) 25);
        setByteField(term731, term731.getClass(), "second", (byte) 7);
        setIntField(term731, term731.getClass(), "nano", 755924076);
        setField(term726, term726.getClass(), "time", term731);
        setField(term723, term723.getClass(), "dateTime", term726);
        setField(term722, term722.getClass(), "show", term723);
        setField(term722, term722.getClass(), "numSeats", term736);
        setField(term697, term697.getClass(), "booking", term722);
        Integer term763 = new Integer(-1339778481);
        term738 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term739 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term740 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term758 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term740, term740.getClass(), "title", "IoAlmYsBwc");
        setField(term739, term739.getClass(), "movie", term740);
        setIntField(term754, term754.getClass(), "year", 2012);
        setShortField(term754, term754.getClass(), "month", (short) 2);
        setShortField(term754, term754.getClass(), "day", (short) 19);
        setField(term753, term753.getClass(), "date", term754);
        setByteField(term758, term758.getClass(), "hour", (byte) 8);
        setByteField(term758, term758.getClass(), "minute", (byte) 4);
        setByteField(term758, term758.getClass(), "second", (byte) 43);
        setIntField(term758, term758.getClass(), "nano", 114930008);
        setField(term753, term753.getClass(), "time", term758);
        setField(term739, term739.getClass(), "dateTime", term753);
        setField(term738, term738.getClass(), "show", term739);
        setField(term738, term738.getClass(), "numSeats", term763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.vivek.pattern.models.Booking");
        Object[] args = new Object[1];
        args[0] = term738;
        callMethod(klass, "withBooking", argTypes, term697, args);
    }

};



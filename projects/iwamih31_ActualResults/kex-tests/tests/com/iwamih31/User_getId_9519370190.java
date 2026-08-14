package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class User_getId_9519370190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008;

    public User_getId_9519370190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1009 = new Integer(1134449235);
        Integer term1011 = new Integer(-883034806);
        term1008 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1041 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1008, term1008.getClass(), "id", term1009);
        setField(term1008, term1008.getClass(), "room", term1011);
        setField(term1008, term1008.getClass(), "name", "UlajhuVLaP");
        setIntField(term1025, term1025.getClass(), "year", 2012);
        setShortField(term1025, term1025.getClass(), "month", (short) 8);
        setShortField(term1025, term1025.getClass(), "day", (short) 25);
        setField(term1008, term1008.getClass(), "birthday", term1025);
        setField(term1008, term1008.getClass(), "level", "gGSMzuGICf");
        setIntField(term1041, term1041.getClass(), "year", 2016);
        setShortField(term1041, term1041.getClass(), "month", (short) 11);
        setShortField(term1041, term1041.getClass(), "day", (short) 29);
        setField(term1008, term1008.getClass(), "move_in", term1041);
        setField(term1008, term1008.getClass(), "use", "hxCBltsObl");
        setField(term1008, term1008.getClass(), "note", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1008, args);
    }

};



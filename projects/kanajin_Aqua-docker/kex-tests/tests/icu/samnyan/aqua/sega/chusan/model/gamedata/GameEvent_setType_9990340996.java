package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameEvent_setType_9990340996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;
     Object term171;

    public GameEvent_setType_9990340996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term147, term147.getClass(), "id", -883034806);
        setIntField(term147, term147.getClass(), "type", 1585847225);
        setIntField(term151, term151.getClass(), "year", 2012);
        setShortField(term151, term151.getClass(), "month", (short) 9);
        setShortField(term151, term151.getClass(), "day", (short) 11);
        setField(term150, term150.getClass(), "date", term151);
        setByteField(term155, term155.getClass(), "hour", (byte) 22);
        setByteField(term155, term155.getClass(), "minute", (byte) 10);
        setByteField(term155, term155.getClass(), "second", (byte) 8);
        setIntField(term155, term155.getClass(), "nano", 380008862);
        setField(term150, term150.getClass(), "time", term155);
        setField(term147, term147.getClass(), "startDate", term150);
        setIntField(term161, term161.getClass(), "year", 2021);
        setShortField(term161, term161.getClass(), "month", (short) 9);
        setShortField(term161, term161.getClass(), "day", (short) 7);
        setField(term160, term160.getClass(), "date", term161);
        setByteField(term165, term165.getClass(), "hour", (byte) 5);
        setByteField(term165, term165.getClass(), "minute", (byte) 25);
        setByteField(term165, term165.getClass(), "second", (byte) 7);
        setIntField(term165, term165.getClass(), "nano", 755924076);
        setField(term160, term160.getClass(), "time", term165);
        setField(term147, term147.getClass(), "endDate", term160);
        setBooleanField(term147, term147.getClass(), "enable", true);
        term171 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term171;
        callMethod(klass, "setType", argTypes, term147, args);
    }

};



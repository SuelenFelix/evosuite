package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameMessage_getId_6961978210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13571;

    public GameMessage_getId_6961978210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13571 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13601 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13571, term13571.getClass(), "id", -15712667);
        setIntField(term13571, term13571.getClass(), "type", 1964967720);
        setField(term13571, term13571.getClass(), "message", "gPzGDOEPPw");
        setIntField(term13587, term13587.getClass(), "year", 2014);
        setShortField(term13587, term13587.getClass(), "month", (short) 5);
        setShortField(term13587, term13587.getClass(), "day", (short) 31);
        setField(term13586, term13586.getClass(), "date", term13587);
        setByteField(term13591, term13591.getClass(), "hour", (byte) 16);
        setByteField(term13591, term13591.getClass(), "minute", (byte) 3);
        setByteField(term13591, term13591.getClass(), "second", (byte) 14);
        setIntField(term13591, term13591.getClass(), "nano", 281059649);
        setField(term13586, term13586.getClass(), "time", term13591);
        setField(term13571, term13571.getClass(), "startDate", term13586);
        setIntField(term13597, term13597.getClass(), "year", 2010);
        setShortField(term13597, term13597.getClass(), "month", (short) 12);
        setShortField(term13597, term13597.getClass(), "day", (short) 30);
        setField(term13596, term13596.getClass(), "date", term13597);
        setByteField(term13601, term13601.getClass(), "hour", (byte) 17);
        setByteField(term13601, term13601.getClass(), "minute", (byte) 44);
        setByteField(term13601, term13601.getClass(), "second", (byte) 59);
        setIntField(term13601, term13601.getClass(), "nano", 881407895);
        setField(term13596, term13596.getClass(), "time", term13601);
        setField(term13571, term13571.getClass(), "endDate", term13596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13571, args);
    }

};



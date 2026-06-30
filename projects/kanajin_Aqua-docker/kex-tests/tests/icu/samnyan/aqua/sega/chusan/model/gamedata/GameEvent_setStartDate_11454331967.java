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

public class GameEvent_setStartDate_11454331967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term197;

    public GameEvent_setStartDate_11454331967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term173, term173.getClass(), "id", -1685132342);
        setIntField(term173, term173.getClass(), "type", -1456670397);
        setIntField(term177, term177.getClass(), "year", 2012);
        setShortField(term177, term177.getClass(), "month", (short) 2);
        setShortField(term177, term177.getClass(), "day", (short) 19);
        setField(term176, term176.getClass(), "date", term177);
        setByteField(term181, term181.getClass(), "hour", (byte) 8);
        setByteField(term181, term181.getClass(), "minute", (byte) 4);
        setByteField(term181, term181.getClass(), "second", (byte) 43);
        setIntField(term181, term181.getClass(), "nano", 114930008);
        setField(term176, term176.getClass(), "time", term181);
        setField(term173, term173.getClass(), "startDate", term176);
        setIntField(term187, term187.getClass(), "year", 2017);
        setShortField(term187, term187.getClass(), "month", (short) 6);
        setShortField(term187, term187.getClass(), "day", (short) 8);
        setField(term186, term186.getClass(), "date", term187);
        setByteField(term191, term191.getClass(), "hour", (byte) 0);
        setByteField(term191, term191.getClass(), "minute", (byte) 18);
        setByteField(term191, term191.getClass(), "second", (byte) 55);
        setIntField(term191, term191.getClass(), "nano", 680586717);
        setField(term186, term186.getClass(), "time", term191);
        setField(term173, term173.getClass(), "endDate", term186);
        setBooleanField(term173, term173.getClass(), "enable", true);
        term197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term198, term198.getClass(), "year", 2015);
        setShortField(term198, term198.getClass(), "month", (short) 9);
        setShortField(term198, term198.getClass(), "day", (short) 16);
        setField(term197, term197.getClass(), "date", term198);
        setByteField(term202, term202.getClass(), "hour", (byte) 6);
        setByteField(term202, term202.getClass(), "minute", (byte) 19);
        setByteField(term202, term202.getClass(), "second", (byte) 42);
        setIntField(term202, term202.getClass(), "nano", 630084975);
        setField(term197, term197.getClass(), "time", term202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term197;
        callMethod(klass, "setStartDate", argTypes, term173, args);
    }

};



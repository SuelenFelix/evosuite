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
import java.lang.Boolean;

public class GameEvent_setEnable_2870168049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;
     Object term265;

    public GameEvent_setEnable_2870168049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term241, term241.getClass(), "id", -655067527);
        setIntField(term241, term241.getClass(), "type", -6029667);
        setIntField(term245, term245.getClass(), "year", 2014);
        setShortField(term245, term245.getClass(), "month", (short) 7);
        setShortField(term245, term245.getClass(), "day", (short) 13);
        setField(term244, term244.getClass(), "date", term245);
        setByteField(term249, term249.getClass(), "hour", (byte) 21);
        setByteField(term249, term249.getClass(), "minute", (byte) 46);
        setByteField(term249, term249.getClass(), "second", (byte) 0);
        setIntField(term249, term249.getClass(), "nano", 887884128);
        setField(term244, term244.getClass(), "time", term249);
        setField(term241, term241.getClass(), "startDate", term244);
        setIntField(term255, term255.getClass(), "year", 2023);
        setShortField(term255, term255.getClass(), "month", (short) 3);
        setShortField(term255, term255.getClass(), "day", (short) 7);
        setField(term254, term254.getClass(), "date", term255);
        setByteField(term259, term259.getClass(), "hour", (byte) 21);
        setByteField(term259, term259.getClass(), "minute", (byte) 15);
        setByteField(term259, term259.getClass(), "second", (byte) 43);
        setIntField(term259, term259.getClass(), "nano", 639721472);
        setField(term254, term254.getClass(), "time", term259);
        setField(term241, term241.getClass(), "endDate", term254);
        setBooleanField(term241, term241.getClass(), "enable", true);
        term265 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term265;
        callMethod(klass, "setEnable", argTypes, term241, args);
    }

};



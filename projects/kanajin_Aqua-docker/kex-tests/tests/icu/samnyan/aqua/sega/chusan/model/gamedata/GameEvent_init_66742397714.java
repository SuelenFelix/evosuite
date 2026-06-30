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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class GameEvent_init_66742397714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term367;
     Object term369;
     Object term379;
     Object term389;

    public GameEvent_init_66742397714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = new Integer(-203030934);
        term367 = new Integer(-1179120542);
        term369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term374 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term370, term370.getClass(), "year", 2016);
        setShortField(term370, term370.getClass(), "month", (short) 6);
        setShortField(term370, term370.getClass(), "day", (short) 15);
        setField(term369, term369.getClass(), "date", term370);
        setByteField(term374, term374.getClass(), "hour", (byte) 21);
        setByteField(term374, term374.getClass(), "minute", (byte) 23);
        setByteField(term374, term374.getClass(), "second", (byte) 23);
        setIntField(term374, term374.getClass(), "nano", 433372070);
        setField(term369, term369.getClass(), "time", term374);
        term379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term384 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term380, term380.getClass(), "year", 2012);
        setShortField(term380, term380.getClass(), "month", (short) 8);
        setShortField(term380, term380.getClass(), "day", (short) 25);
        setField(term379, term379.getClass(), "date", term380);
        setByteField(term384, term384.getClass(), "hour", (byte) 19);
        setByteField(term384, term384.getClass(), "minute", (byte) 49);
        setByteField(term384, term384.getClass(), "second", (byte) 8);
        setIntField(term384, term384.getClass(), "nano", 912685024);
        setField(term379, term379.getClass(), "time", term384);
        term389 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term365;
        args[1] = term367;
        args[2] = term369;
        args[3] = term379;
        args[4] = term389;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



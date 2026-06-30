package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class DivaCustomize_init_13195378317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29588;
     Object term29602;
     Object term29604;
     Object term29614;
     Object term29624;

    public DivaCustomize_init_13195378317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29588 = new Integer(340719678);
        term29602 = new Integer(299791142);
        term29604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29609 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29605, term29605.getClass(), "year", 2020);
        setShortField(term29605, term29605.getClass(), "month", (short) 8);
        setShortField(term29605, term29605.getClass(), "day", (short) 15);
        setField(term29604, term29604.getClass(), "date", term29605);
        setByteField(term29609, term29609.getClass(), "hour", (byte) 2);
        setByteField(term29609, term29609.getClass(), "minute", (byte) 0);
        setByteField(term29609, term29609.getClass(), "second", (byte) 38);
        setIntField(term29609, term29609.getClass(), "nano", 146431486);
        setField(term29604, term29604.getClass(), "time", term29609);
        term29614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29619 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29615, term29615.getClass(), "year", 2014);
        setShortField(term29615, term29615.getClass(), "month", (short) 11);
        setShortField(term29615, term29615.getClass(), "day", (short) 8);
        setField(term29614, term29614.getClass(), "date", term29615);
        setByteField(term29619, term29619.getClass(), "hour", (byte) 8);
        setByteField(term29619, term29619.getClass(), "minute", (byte) 43);
        setByteField(term29619, term29619.getClass(), "second", (byte) 32);
        setIntField(term29619, term29619.getClass(), "nano", 154434838);
        setField(term29614, term29614.getClass(), "time", term29619);
        term29624 = new Integer(1862191391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term29588;
        args[1] = "dHrIcaTbcS";
        args[2] = term29602;
        args[3] = term29604;
        args[4] = term29614;
        args[5] = term29624;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



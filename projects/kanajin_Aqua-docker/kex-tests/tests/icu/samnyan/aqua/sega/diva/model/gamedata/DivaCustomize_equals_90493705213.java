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
import java.lang.Object;

public class DivaCustomize_equals_90493705213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29402;
     Object term29438;

    public DivaCustomize_equals_90493705213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29402 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29432 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29402, term29402.getClass(), "id", -1626451656);
        setField(term29402, term29402.getClass(), "name", "sWchglYniO");
        setIntField(term29402, term29402.getClass(), "price", 173952451);
        setIntField(term29418, term29418.getClass(), "year", 2010);
        setShortField(term29418, term29418.getClass(), "month", (short) 5);
        setShortField(term29418, term29418.getClass(), "day", (short) 2);
        setField(term29417, term29417.getClass(), "date", term29418);
        setByteField(term29422, term29422.getClass(), "hour", (byte) 2);
        setByteField(term29422, term29422.getClass(), "minute", (byte) 22);
        setByteField(term29422, term29422.getClass(), "second", (byte) 33);
        setIntField(term29422, term29422.getClass(), "nano", 530835039);
        setField(term29417, term29417.getClass(), "time", term29422);
        setField(term29402, term29402.getClass(), "releaseDate", term29417);
        setIntField(term29428, term29428.getClass(), "year", 2024);
        setShortField(term29428, term29428.getClass(), "month", (short) 4);
        setShortField(term29428, term29428.getClass(), "day", (short) 24);
        setField(term29427, term29427.getClass(), "date", term29428);
        setByteField(term29432, term29432.getClass(), "hour", (byte) 7);
        setByteField(term29432, term29432.getClass(), "minute", (byte) 2);
        setByteField(term29432, term29432.getClass(), "second", (byte) 51);
        setIntField(term29432, term29432.getClass(), "nano", 635502964);
        setField(term29427, term29427.getClass(), "time", term29432);
        setField(term29402, term29402.getClass(), "endDate", term29427);
        setIntField(term29402, term29402.getClass(), "sortOrder", -1972033388);
        term29438 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29438;
        callMethod(klass, "equals", argTypes, term29402, args);
    }

};



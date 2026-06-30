package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameVersion_getLastTime_21376221323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;

    public GameVersion_getLastTime_21376221323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term662 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term704 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term662, term662.getClass(), "uuid", "eZFUvlxvGV");
        setField(term662, term662.getClass(), "romVersion", "BYqFIqCKAV");
        setField(term662, term662.getClass(), "dataVersion", "vrQLuWIDJX");
        setIntField(term700, term700.getClass(), "year", 2015);
        setShortField(term700, term700.getClass(), "month", (short) 4);
        setShortField(term700, term700.getClass(), "day", (short) 14);
        setField(term699, term699.getClass(), "date", term700);
        setByteField(term704, term704.getClass(), "hour", (byte) 18);
        setByteField(term704, term704.getClass(), "minute", (byte) 24);
        setByteField(term704, term704.getClass(), "second", (byte) 32);
        setIntField(term704, term704.getClass(), "nano", 369233818);
        setField(term699, term699.getClass(), "time", term704);
        setField(term662, term662.getClass(), "lastTime", term699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTime", argTypes, term662, args);
    }

};



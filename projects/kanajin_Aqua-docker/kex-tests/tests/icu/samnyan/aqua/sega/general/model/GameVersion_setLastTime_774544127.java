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

public class GameVersion_setLastTime_774544127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036;
     Object term1083;

    public GameVersion_setLastTime_774544127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1036 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term1073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1078 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1036, term1036.getClass(), "uuid", "nyiiPDVjAc");
        setField(term1036, term1036.getClass(), "romVersion", "aKnKipADSo");
        setField(term1036, term1036.getClass(), "dataVersion", "wSQxaModmm");
        setIntField(term1074, term1074.getClass(), "year", 2024);
        setShortField(term1074, term1074.getClass(), "month", (short) 1);
        setShortField(term1074, term1074.getClass(), "day", (short) 24);
        setField(term1073, term1073.getClass(), "date", term1074);
        setByteField(term1078, term1078.getClass(), "hour", (byte) 20);
        setByteField(term1078, term1078.getClass(), "minute", (byte) 28);
        setByteField(term1078, term1078.getClass(), "second", (byte) 39);
        setIntField(term1078, term1078.getClass(), "nano", 952728177);
        setField(term1073, term1073.getClass(), "time", term1078);
        setField(term1036, term1036.getClass(), "lastTime", term1073);
        term1083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1088 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1084, term1084.getClass(), "year", 2029);
        setShortField(term1084, term1084.getClass(), "month", (short) 8);
        setShortField(term1084, term1084.getClass(), "day", (short) 29);
        setField(term1083, term1083.getClass(), "date", term1084);
        setByteField(term1088, term1088.getClass(), "hour", (byte) 15);
        setByteField(term1088, term1088.getClass(), "minute", (byte) 50);
        setByteField(term1088, term1088.getClass(), "second", (byte) 1);
        setIntField(term1088, term1088.getClass(), "nano", 277971904);
        setField(term1083, term1083.getClass(), "time", term1088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1083;
        callMethod(klass, "setLastTime", argTypes, term1036, args);
    }

};



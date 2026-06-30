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

public class GameVersion_getUuid_18049222320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431;

    public GameVersion_getUuid_18049222320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term473 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term431, term431.getClass(), "uuid", "oVcInYnLWB");
        setField(term431, term431.getClass(), "romVersion", "aJlieCFVtF");
        setField(term431, term431.getClass(), "dataVersion", "ZiaGIbnzTs");
        setIntField(term469, term469.getClass(), "year", 2012);
        setShortField(term469, term469.getClass(), "month", (short) 8);
        setShortField(term469, term469.getClass(), "day", (short) 25);
        setField(term468, term468.getClass(), "date", term469);
        setByteField(term473, term473.getClass(), "hour", (byte) 5);
        setByteField(term473, term473.getClass(), "minute", (byte) 20);
        setByteField(term473, term473.getClass(), "second", (byte) 50);
        setIntField(term473, term473.getClass(), "nano", 345595912);
        setField(term468, term468.getClass(), "time", term473);
        setField(term431, term431.getClass(), "lastTime", term468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUuid", argTypes, term431, args);
    }

};



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

public class GameEvent_getType_14062396331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public GameEvent_getType_14062396331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent"));
        Object term28 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25, term25.getClass(), "id", 1484323161);
        setIntField(term25, term25.getClass(), "type", 391863371);
        setIntField(term29, term29.getClass(), "year", 2015);
        setShortField(term29, term29.getClass(), "month", (short) 9);
        setShortField(term29, term29.getClass(), "day", (short) 19);
        setField(term28, term28.getClass(), "date", term29);
        setByteField(term33, term33.getClass(), "hour", (byte) 9);
        setByteField(term33, term33.getClass(), "minute", (byte) 4);
        setByteField(term33, term33.getClass(), "second", (byte) 10);
        setIntField(term33, term33.getClass(), "nano", 401765865);
        setField(term28, term28.getClass(), "time", term33);
        setField(term25, term25.getClass(), "startDate", term28);
        setIntField(term39, term39.getClass(), "year", 2015);
        setShortField(term39, term39.getClass(), "month", (short) 4);
        setShortField(term39, term39.getClass(), "day", (short) 14);
        setField(term38, term38.getClass(), "date", term39);
        setByteField(term43, term43.getClass(), "hour", (byte) 18);
        setByteField(term43, term43.getClass(), "minute", (byte) 24);
        setByteField(term43, term43.getClass(), "second", (byte) 32);
        setIntField(term43, term43.getClass(), "nano", 369233818);
        setField(term38, term38.getClass(), "time", term43);
        setField(term25, term25.getClass(), "endDate", term38);
        setBooleanField(term25, term25.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term25, args);
    }

};



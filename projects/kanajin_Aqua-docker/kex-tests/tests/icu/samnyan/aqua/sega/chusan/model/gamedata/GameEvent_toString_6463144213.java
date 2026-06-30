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

public class GameEvent_toString_6463144213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;

    public GameEvent_toString_6463144213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term359 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term341, term341.getClass(), "id", -1275173084);
        setIntField(term341, term341.getClass(), "type", -244121226);
        setIntField(term345, term345.getClass(), "year", 2021);
        setShortField(term345, term345.getClass(), "month", (short) 8);
        setShortField(term345, term345.getClass(), "day", (short) 12);
        setField(term344, term344.getClass(), "date", term345);
        setByteField(term349, term349.getClass(), "hour", (byte) 2);
        setByteField(term349, term349.getClass(), "minute", (byte) 17);
        setByteField(term349, term349.getClass(), "second", (byte) 51);
        setIntField(term349, term349.getClass(), "nano", 207375141);
        setField(term344, term344.getClass(), "time", term349);
        setField(term341, term341.getClass(), "startDate", term344);
        setIntField(term355, term355.getClass(), "year", 2025);
        setShortField(term355, term355.getClass(), "month", (short) 11);
        setShortField(term355, term355.getClass(), "day", (short) 3);
        setField(term354, term354.getClass(), "date", term355);
        setByteField(term359, term359.getClass(), "hour", (byte) 21);
        setByteField(term359, term359.getClass(), "minute", (byte) 24);
        setByteField(term359, term359.getClass(), "second", (byte) 23);
        setIntField(term359, term359.getClass(), "nano", 210986721);
        setField(term354, term354.getClass(), "time", term359);
        setField(term341, term341.getClass(), "endDate", term354);
        setBooleanField(term341, term341.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term341, args);
    }

};



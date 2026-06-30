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

public class GameEvent_canEqual_78802311811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292;
     Object term316;

    public GameEvent_canEqual_78802311811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent"));
        Object term295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300 = newInstance(Class.forName("java.time.LocalTime"));
        Object term305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term292, term292.getClass(), "id", -1007160944);
        setIntField(term292, term292.getClass(), "type", 1135664017);
        setIntField(term296, term296.getClass(), "year", 2025);
        setShortField(term296, term296.getClass(), "month", (short) 3);
        setShortField(term296, term296.getClass(), "day", (short) 9);
        setField(term295, term295.getClass(), "date", term296);
        setByteField(term300, term300.getClass(), "hour", (byte) 5);
        setByteField(term300, term300.getClass(), "minute", (byte) 49);
        setByteField(term300, term300.getClass(), "second", (byte) 12);
        setIntField(term300, term300.getClass(), "nano", 791695028);
        setField(term295, term295.getClass(), "time", term300);
        setField(term292, term292.getClass(), "startDate", term295);
        setIntField(term306, term306.getClass(), "year", 2023);
        setShortField(term306, term306.getClass(), "month", (short) 9);
        setShortField(term306, term306.getClass(), "day", (short) 23);
        setField(term305, term305.getClass(), "date", term306);
        setByteField(term310, term310.getClass(), "hour", (byte) 12);
        setByteField(term310, term310.getClass(), "minute", (byte) 55);
        setByteField(term310, term310.getClass(), "second", (byte) 58);
        setIntField(term310, term310.getClass(), "nano", 159178396);
        setField(term305, term305.getClass(), "time", term310);
        setField(term292, term292.getClass(), "endDate", term305);
        setBooleanField(term292, term292.getClass(), "enable", false);
        term316 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term316;
        callMethod(klass, "canEqual", argTypes, term292, args);
    }

};



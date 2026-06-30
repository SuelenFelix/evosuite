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

public class GameEvent_getStartDate_8640614182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public GameEvent_getStartDate_8640614182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent"));
        Object term52 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49, term49.getClass(), "id", -1922583790);
        setIntField(term49, term49.getClass(), "type", -616727354);
        setIntField(term53, term53.getClass(), "year", 2022);
        setShortField(term53, term53.getClass(), "month", (short) 2);
        setShortField(term53, term53.getClass(), "day", (short) 26);
        setField(term52, term52.getClass(), "date", term53);
        setByteField(term57, term57.getClass(), "hour", (byte) 11);
        setByteField(term57, term57.getClass(), "minute", (byte) 42);
        setByteField(term57, term57.getClass(), "second", (byte) 15);
        setIntField(term57, term57.getClass(), "nano", 377731937);
        setField(term52, term52.getClass(), "time", term57);
        setField(term49, term49.getClass(), "startDate", term52);
        setIntField(term63, term63.getClass(), "year", 2026);
        setShortField(term63, term63.getClass(), "month", (short) 12);
        setShortField(term63, term63.getClass(), "day", (short) 14);
        setField(term62, term62.getClass(), "date", term63);
        setByteField(term67, term67.getClass(), "hour", (byte) 16);
        setByteField(term67, term67.getClass(), "minute", (byte) 34);
        setByteField(term67, term67.getClass(), "second", (byte) 9);
        setIntField(term67, term67.getClass(), "nano", 518326996);
        setField(term62, term62.getClass(), "time", term67);
        setField(term49, term49.getClass(), "endDate", term62);
        setBooleanField(term49, term49.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term49, args);
    }

};



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

public class GameMessage_equals_3052291210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14067;
     Object term14102;

    public GameMessage_equals_3052291210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14067 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term14082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14087 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14097 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14067, term14067.getClass(), "id", 213831054);
        setIntField(term14067, term14067.getClass(), "type", 330043745);
        setField(term14067, term14067.getClass(), "message", "vBnWPlsZMk");
        setIntField(term14083, term14083.getClass(), "year", 2015);
        setShortField(term14083, term14083.getClass(), "month", (short) 2);
        setShortField(term14083, term14083.getClass(), "day", (short) 1);
        setField(term14082, term14082.getClass(), "date", term14083);
        setByteField(term14087, term14087.getClass(), "hour", (byte) 11);
        setByteField(term14087, term14087.getClass(), "minute", (byte) 31);
        setByteField(term14087, term14087.getClass(), "second", (byte) 24);
        setIntField(term14087, term14087.getClass(), "nano", 461437823);
        setField(term14082, term14082.getClass(), "time", term14087);
        setField(term14067, term14067.getClass(), "startDate", term14082);
        setIntField(term14093, term14093.getClass(), "year", 2012);
        setShortField(term14093, term14093.getClass(), "month", (short) 3);
        setShortField(term14093, term14093.getClass(), "day", (short) 12);
        setField(term14092, term14092.getClass(), "date", term14093);
        setByteField(term14097, term14097.getClass(), "hour", (byte) 0);
        setByteField(term14097, term14097.getClass(), "minute", (byte) 32);
        setByteField(term14097, term14097.getClass(), "second", (byte) 14);
        setIntField(term14097, term14097.getClass(), "nano", 342342345);
        setField(term14092, term14092.getClass(), "time", term14097);
        setField(term14067, term14067.getClass(), "endDate", term14092);
        term14102 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14102;
        callMethod(klass, "equals", argTypes, term14067, args);
    }

};



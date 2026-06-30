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

public class GameMessage_canEqual_83468554111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14113;
     Object term14148;

    public GameMessage_canEqual_83468554111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14113 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term14128 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14129 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14133 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14143 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14113, term14113.getClass(), "id", -509349195);
        setIntField(term14113, term14113.getClass(), "type", -1639041228);
        setField(term14113, term14113.getClass(), "message", "fIZsWucfXz");
        setIntField(term14129, term14129.getClass(), "year", 2026);
        setShortField(term14129, term14129.getClass(), "month", (short) 9);
        setShortField(term14129, term14129.getClass(), "day", (short) 18);
        setField(term14128, term14128.getClass(), "date", term14129);
        setByteField(term14133, term14133.getClass(), "hour", (byte) 14);
        setByteField(term14133, term14133.getClass(), "minute", (byte) 51);
        setByteField(term14133, term14133.getClass(), "second", (byte) 41);
        setIntField(term14133, term14133.getClass(), "nano", 830322169);
        setField(term14128, term14128.getClass(), "time", term14133);
        setField(term14113, term14113.getClass(), "startDate", term14128);
        setIntField(term14139, term14139.getClass(), "year", 2024);
        setShortField(term14139, term14139.getClass(), "month", (short) 3);
        setShortField(term14139, term14139.getClass(), "day", (short) 17);
        setField(term14138, term14138.getClass(), "date", term14139);
        setByteField(term14143, term14143.getClass(), "hour", (byte) 5);
        setByteField(term14143, term14143.getClass(), "minute", (byte) 21);
        setByteField(term14143, term14143.getClass(), "second", (byte) 47);
        setIntField(term14143, term14143.getClass(), "nano", 798433252);
        setField(term14138, term14138.getClass(), "time", term14143);
        setField(term14113, term14113.getClass(), "endDate", term14138);
        term14148 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14148;
        callMethod(klass, "canEqual", argTypes, term14113, args);
    }

};



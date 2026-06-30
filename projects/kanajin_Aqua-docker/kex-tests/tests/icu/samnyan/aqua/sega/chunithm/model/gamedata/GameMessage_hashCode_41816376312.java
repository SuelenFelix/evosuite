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

public class GameMessage_hashCode_41816376312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14159;

    public GameMessage_hashCode_41816376312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14159 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term14174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14179 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14189 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14159, term14159.getClass(), "id", 2027686272);
        setIntField(term14159, term14159.getClass(), "type", -1494356104);
        setField(term14159, term14159.getClass(), "message", "IApvtmfhnq");
        setIntField(term14175, term14175.getClass(), "year", 2023);
        setShortField(term14175, term14175.getClass(), "month", (short) 7);
        setShortField(term14175, term14175.getClass(), "day", (short) 27);
        setField(term14174, term14174.getClass(), "date", term14175);
        setByteField(term14179, term14179.getClass(), "hour", (byte) 4);
        setByteField(term14179, term14179.getClass(), "minute", (byte) 25);
        setByteField(term14179, term14179.getClass(), "second", (byte) 46);
        setIntField(term14179, term14179.getClass(), "nano", 646465452);
        setField(term14174, term14174.getClass(), "time", term14179);
        setField(term14159, term14159.getClass(), "startDate", term14174);
        setIntField(term14185, term14185.getClass(), "year", 2022);
        setShortField(term14185, term14185.getClass(), "month", (short) 11);
        setShortField(term14185, term14185.getClass(), "day", (short) 2);
        setField(term14184, term14184.getClass(), "date", term14185);
        setByteField(term14189, term14189.getClass(), "hour", (byte) 4);
        setByteField(term14189, term14189.getClass(), "minute", (byte) 14);
        setByteField(term14189, term14189.getClass(), "second", (byte) 5);
        setIntField(term14189, term14189.getClass(), "nano", 604465127);
        setField(term14184, term14184.getClass(), "time", term14189);
        setField(term14159, term14159.getClass(), "endDate", term14184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14159, args);
    }

};



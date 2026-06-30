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
import java.lang.Integer;
import java.lang.Object;

public class GameMessage_init_50473121114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14249;
     Object term14251;
     Object term14265;
     Object term14275;

    public GameMessage_init_50473121114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14249 = new Integer(990883365);
        term14251 = new Integer(633598642);
        term14265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14270 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14266, term14266.getClass(), "year", 2026);
        setShortField(term14266, term14266.getClass(), "month", (short) 2);
        setShortField(term14266, term14266.getClass(), "day", (short) 5);
        setField(term14265, term14265.getClass(), "date", term14266);
        setByteField(term14270, term14270.getClass(), "hour", (byte) 1);
        setByteField(term14270, term14270.getClass(), "minute", (byte) 38);
        setByteField(term14270, term14270.getClass(), "second", (byte) 15);
        setIntField(term14270, term14270.getClass(), "nano", 167345230);
        setField(term14265, term14265.getClass(), "time", term14270);
        term14275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14280 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14276, term14276.getClass(), "year", 2029);
        setShortField(term14276, term14276.getClass(), "month", (short) 6);
        setShortField(term14276, term14276.getClass(), "day", (short) 4);
        setField(term14275, term14275.getClass(), "date", term14276);
        setByteField(term14280, term14280.getClass(), "hour", (byte) 22);
        setByteField(term14280, term14280.getClass(), "minute", (byte) 1);
        setByteField(term14280, term14280.getClass(), "second", (byte) 38);
        setIntField(term14280, term14280.getClass(), "nano", 329228491);
        setField(term14275, term14275.getClass(), "time", term14280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term14249;
        args[1] = term14251;
        args[2] = "QNjNTLlUaV";
        args[3] = term14265;
        args[4] = term14275;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



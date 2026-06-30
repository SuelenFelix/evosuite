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

public class GameEvent_equals_102407780710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term291;

    public GameEvent_equals_102407780710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term267, term267.getClass(), "id", -2068769794);
        setIntField(term267, term267.getClass(), "type", -117576464);
        setIntField(term271, term271.getClass(), "year", 2015);
        setShortField(term271, term271.getClass(), "month", (short) 3);
        setShortField(term271, term271.getClass(), "day", (short) 10);
        setField(term270, term270.getClass(), "date", term271);
        setByteField(term275, term275.getClass(), "hour", (byte) 23);
        setByteField(term275, term275.getClass(), "minute", (byte) 34);
        setByteField(term275, term275.getClass(), "second", (byte) 44);
        setIntField(term275, term275.getClass(), "nano", 587322824);
        setField(term270, term270.getClass(), "time", term275);
        setField(term267, term267.getClass(), "startDate", term270);
        setIntField(term281, term281.getClass(), "year", 2027);
        setShortField(term281, term281.getClass(), "month", (short) 8);
        setShortField(term281, term281.getClass(), "day", (short) 26);
        setField(term280, term280.getClass(), "date", term281);
        setByteField(term285, term285.getClass(), "hour", (byte) 5);
        setByteField(term285, term285.getClass(), "minute", (byte) 11);
        setByteField(term285, term285.getClass(), "second", (byte) 9);
        setIntField(term285, term285.getClass(), "nano", 219245092);
        setField(term280, term280.getClass(), "time", term285);
        setField(term267, term267.getClass(), "endDate", term280);
        setBooleanField(term267, term267.getClass(), "enable", true);
        term291 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term291;
        callMethod(klass, "equals", argTypes, term267, args);
    }

};



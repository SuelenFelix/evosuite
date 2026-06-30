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

public class GameEvent_isEnable_12217334224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;

    public GameEvent_isEnable_12217334224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term97, term97.getClass(), "id", 1227103734);
        setIntField(term97, term97.getClass(), "type", -1339778481);
        setIntField(term101, term101.getClass(), "year", 2029);
        setShortField(term101, term101.getClass(), "month", (short) 8);
        setShortField(term101, term101.getClass(), "day", (short) 29);
        setField(term100, term100.getClass(), "date", term101);
        setByteField(term105, term105.getClass(), "hour", (byte) 15);
        setByteField(term105, term105.getClass(), "minute", (byte) 50);
        setByteField(term105, term105.getClass(), "second", (byte) 1);
        setIntField(term105, term105.getClass(), "nano", 277971904);
        setField(term100, term100.getClass(), "time", term105);
        setField(term97, term97.getClass(), "startDate", term100);
        setIntField(term111, term111.getClass(), "year", 2022);
        setShortField(term111, term111.getClass(), "month", (short) 11);
        setShortField(term111, term111.getClass(), "day", (short) 16);
        setField(term110, term110.getClass(), "date", term111);
        setByteField(term115, term115.getClass(), "hour", (byte) 15);
        setByteField(term115, term115.getClass(), "minute", (byte) 54);
        setByteField(term115, term115.getClass(), "second", (byte) 2);
        setIntField(term115, term115.getClass(), "nano", 733274103);
        setField(term110, term110.getClass(), "time", term115);
        setField(term97, term97.getClass(), "endDate", term110);
        setBooleanField(term97, term97.getClass(), "enable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnable", argTypes, term97, args);
    }

};



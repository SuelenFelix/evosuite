package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class PvListHandler_difficultyString_2452500652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7279;

    public PvListHandler_difficultyString_2452500652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7336 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term7335 = ((Class) term7336).getDeclaredField((String) "UNDEFINED");
        ((Field) term7335).setAccessible(true);
        Object enum2 = ((Field) term7335).get((Object) null);
        Class<? extends Object> term7620 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term7619 = ((Class) term7620).getDeclaredField((String) "EXTRA");
        ((Field) term7619).setAccessible(true);
        Object enum3 = ((Field) term7619).get((Object) null);
        Object term7282 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term7294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7299 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7309 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7319 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7329 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7282, term7282.getClass(), "id", 6375119433582206027L);
        setIntField(term7282, term7282.getClass(), "pvId", 1227103734);
        setField(term7282, term7282.getClass(), "difficulty", enum2);
        setIntField(term7282, term7282.getClass(), "version", -1339778481);
        setField(term7282, term7282.getClass(), "edition", enum3);
        setIntField(term7295, term7295.getClass(), "year", 2022);
        setShortField(term7295, term7295.getClass(), "month", (short) 2);
        setShortField(term7295, term7295.getClass(), "day", (short) 26);
        setField(term7294, term7294.getClass(), "date", term7295);
        setByteField(term7299, term7299.getClass(), "hour", (byte) 11);
        setByteField(term7299, term7299.getClass(), "minute", (byte) 42);
        setByteField(term7299, term7299.getClass(), "second", (byte) 15);
        setIntField(term7299, term7299.getClass(), "nano", 377731937);
        setField(term7294, term7294.getClass(), "time", term7299);
        setField(term7282, term7282.getClass(), "demoStart", term7294);
        setIntField(term7305, term7305.getClass(), "year", 2026);
        setShortField(term7305, term7305.getClass(), "month", (short) 12);
        setShortField(term7305, term7305.getClass(), "day", (short) 14);
        setField(term7304, term7304.getClass(), "date", term7305);
        setByteField(term7309, term7309.getClass(), "hour", (byte) 16);
        setByteField(term7309, term7309.getClass(), "minute", (byte) 34);
        setByteField(term7309, term7309.getClass(), "second", (byte) 9);
        setIntField(term7309, term7309.getClass(), "nano", 518326996);
        setField(term7304, term7304.getClass(), "time", term7309);
        setField(term7282, term7282.getClass(), "demoEnd", term7304);
        setIntField(term7315, term7315.getClass(), "year", 2025);
        setShortField(term7315, term7315.getClass(), "month", (short) 4);
        setShortField(term7315, term7315.getClass(), "day", (short) 24);
        setField(term7314, term7314.getClass(), "date", term7315);
        setByteField(term7319, term7319.getClass(), "hour", (byte) 18);
        setByteField(term7319, term7319.getClass(), "minute", (byte) 11);
        setByteField(term7319, term7319.getClass(), "second", (byte) 40);
        setIntField(term7319, term7319.getClass(), "nano", 137454929);
        setField(term7314, term7314.getClass(), "time", term7319);
        setField(term7282, term7282.getClass(), "playableStart", term7314);
        setIntField(term7325, term7325.getClass(), "year", 2024);
        setShortField(term7325, term7325.getClass(), "month", (short) 1);
        setShortField(term7325, term7325.getClass(), "day", (short) 24);
        setField(term7324, term7324.getClass(), "date", term7325);
        setByteField(term7329, term7329.getClass(), "hour", (byte) 20);
        setByteField(term7329, term7329.getClass(), "minute", (byte) 28);
        setByteField(term7329, term7329.getClass(), "second", (byte) 39);
        setIntField(term7329, term7329.getClass(), "nano", 952728177);
        setField(term7324, term7324.getClass(), "time", term7329);
        setField(term7282, term7282.getClass(), "playableEnd", term7324);
        term7279 = new LinkedList();
        ((LinkedList) term7279).add(term7282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvListHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7279;
        callMethod(klass, "difficultyString", argTypes, null, args);
    }

};



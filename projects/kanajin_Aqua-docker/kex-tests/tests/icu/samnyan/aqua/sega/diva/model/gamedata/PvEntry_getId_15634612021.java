package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PvEntry_getId_15634612021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76469;

    public PvEntry_getId_15634612021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76541 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term76540 = ((Class) term76541).getDeclaredField((String) "UNDEFINED");
        ((Field) term76540).setAccessible(true);
        Object enum162 = ((Field) term76540).get((Object) null);
        Class<? extends Object> term76825 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term76824 = ((Class) term76825).getDeclaredField((String) "ORIGINAL");
        ((Field) term76824).setAccessible(true);
        Object enum163 = ((Field) term76824).get((Object) null);
        term76469 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term76500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76505 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76535 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76469, term76469.getClass(), "id", 7271112616766426991L);
        setIntField(term76469, term76469.getClass(), "pvId", 504525721);
        setField(term76469, term76469.getClass(), "difficulty", enum162);
        setIntField(term76469, term76469.getClass(), "version", 1835568392);
        setField(term76469, term76469.getClass(), "edition", enum163);
        setIntField(term76501, term76501.getClass(), "year", 2020);
        setShortField(term76501, term76501.getClass(), "month", (short) 12);
        setShortField(term76501, term76501.getClass(), "day", (short) 30);
        setField(term76500, term76500.getClass(), "date", term76501);
        setByteField(term76505, term76505.getClass(), "hour", (byte) 2);
        setByteField(term76505, term76505.getClass(), "minute", (byte) 11);
        setByteField(term76505, term76505.getClass(), "second", (byte) 8);
        setIntField(term76505, term76505.getClass(), "nano", 528799251);
        setField(term76500, term76500.getClass(), "time", term76505);
        setField(term76469, term76469.getClass(), "demoStart", term76500);
        setIntField(term76511, term76511.getClass(), "year", 2027);
        setShortField(term76511, term76511.getClass(), "month", (short) 9);
        setShortField(term76511, term76511.getClass(), "day", (short) 29);
        setField(term76510, term76510.getClass(), "date", term76511);
        setByteField(term76515, term76515.getClass(), "hour", (byte) 19);
        setByteField(term76515, term76515.getClass(), "minute", (byte) 13);
        setByteField(term76515, term76515.getClass(), "second", (byte) 31);
        setIntField(term76515, term76515.getClass(), "nano", 854066575);
        setField(term76510, term76510.getClass(), "time", term76515);
        setField(term76469, term76469.getClass(), "demoEnd", term76510);
        setIntField(term76521, term76521.getClass(), "year", 2025);
        setShortField(term76521, term76521.getClass(), "month", (short) 11);
        setShortField(term76521, term76521.getClass(), "day", (short) 16);
        setField(term76520, term76520.getClass(), "date", term76521);
        setByteField(term76525, term76525.getClass(), "hour", (byte) 12);
        setByteField(term76525, term76525.getClass(), "minute", (byte) 27);
        setByteField(term76525, term76525.getClass(), "second", (byte) 36);
        setIntField(term76525, term76525.getClass(), "nano", 699989217);
        setField(term76520, term76520.getClass(), "time", term76525);
        setField(term76469, term76469.getClass(), "playableStart", term76520);
        setIntField(term76531, term76531.getClass(), "year", 2018);
        setShortField(term76531, term76531.getClass(), "month", (short) 10);
        setShortField(term76531, term76531.getClass(), "day", (short) 3);
        setField(term76530, term76530.getClass(), "date", term76531);
        setByteField(term76535, term76535.getClass(), "hour", (byte) 12);
        setByteField(term76535, term76535.getClass(), "minute", (byte) 49);
        setByteField(term76535, term76535.getClass(), "second", (byte) 38);
        setIntField(term76535, term76535.getClass(), "nano", 549840711);
        setField(term76530, term76530.getClass(), "time", term76535);
        setField(term76469, term76469.getClass(), "playableEnd", term76530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term76469, args);
    }

};



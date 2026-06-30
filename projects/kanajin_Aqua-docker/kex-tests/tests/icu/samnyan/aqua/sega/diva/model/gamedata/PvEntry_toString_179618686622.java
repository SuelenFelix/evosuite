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

public class PvEntry_toString_179618686622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89448;

    public PvEntry_toString_179618686622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89512 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term89511 = ((Class) term89512).getDeclaredField((String) "HARD");
        ((Field) term89511).setAccessible(true);
        Object enum205 = ((Field) term89511).get((Object) null);
        Class<? extends Object> term89781 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term89780 = ((Class) term89781).getDeclaredField((String) "EXTRA");
        ((Field) term89780).setAccessible(true);
        Object enum206 = ((Field) term89780).get((Object) null);
        term89448 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term89471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89506 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89448, term89448.getClass(), "id", -6985556670871089725L);
        setIntField(term89448, term89448.getClass(), "pvId", -1644358555);
        setField(term89448, term89448.getClass(), "difficulty", enum205);
        setIntField(term89448, term89448.getClass(), "version", -388591034);
        setField(term89448, term89448.getClass(), "edition", enum206);
        setIntField(term89472, term89472.getClass(), "year", 2017);
        setShortField(term89472, term89472.getClass(), "month", (short) 2);
        setShortField(term89472, term89472.getClass(), "day", (short) 5);
        setField(term89471, term89471.getClass(), "date", term89472);
        setByteField(term89476, term89476.getClass(), "hour", (byte) 5);
        setByteField(term89476, term89476.getClass(), "minute", (byte) 46);
        setByteField(term89476, term89476.getClass(), "second", (byte) 38);
        setIntField(term89476, term89476.getClass(), "nano", 214202896);
        setField(term89471, term89471.getClass(), "time", term89476);
        setField(term89448, term89448.getClass(), "demoStart", term89471);
        setIntField(term89482, term89482.getClass(), "year", 2025);
        setShortField(term89482, term89482.getClass(), "month", (short) 6);
        setShortField(term89482, term89482.getClass(), "day", (short) 18);
        setField(term89481, term89481.getClass(), "date", term89482);
        setByteField(term89486, term89486.getClass(), "hour", (byte) 14);
        setByteField(term89486, term89486.getClass(), "minute", (byte) 17);
        setByteField(term89486, term89486.getClass(), "second", (byte) 34);
        setIntField(term89486, term89486.getClass(), "nano", 564527758);
        setField(term89481, term89481.getClass(), "time", term89486);
        setField(term89448, term89448.getClass(), "demoEnd", term89481);
        setIntField(term89492, term89492.getClass(), "year", 2015);
        setShortField(term89492, term89492.getClass(), "month", (short) 1);
        setShortField(term89492, term89492.getClass(), "day", (short) 7);
        setField(term89491, term89491.getClass(), "date", term89492);
        setByteField(term89496, term89496.getClass(), "hour", (byte) 10);
        setByteField(term89496, term89496.getClass(), "minute", (byte) 8);
        setByteField(term89496, term89496.getClass(), "second", (byte) 31);
        setIntField(term89496, term89496.getClass(), "nano", 617142943);
        setField(term89491, term89491.getClass(), "time", term89496);
        setField(term89448, term89448.getClass(), "playableStart", term89491);
        setIntField(term89502, term89502.getClass(), "year", 2024);
        setShortField(term89502, term89502.getClass(), "month", (short) 2);
        setShortField(term89502, term89502.getClass(), "day", (short) 2);
        setField(term89501, term89501.getClass(), "date", term89502);
        setByteField(term89506, term89506.getClass(), "hour", (byte) 5);
        setByteField(term89506, term89506.getClass(), "minute", (byte) 8);
        setByteField(term89506, term89506.getClass(), "second", (byte) 10);
        setIntField(term89506, term89506.getClass(), "nano", 897554578);
        setField(term89501, term89501.getClass(), "time", term89506);
        setField(term89448, term89448.getClass(), "playableEnd", term89501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term89448, args);
    }

};



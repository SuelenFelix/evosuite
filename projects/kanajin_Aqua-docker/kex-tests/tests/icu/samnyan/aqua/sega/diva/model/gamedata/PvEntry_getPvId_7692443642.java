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

public class PvEntry_getPvId_7692443642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77090;

    public PvEntry_getPvId_7692443642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77157 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term77156 = ((Class) term77157).getDeclaredField((String) "HARD");
        ((Field) term77156).setAccessible(true);
        Object enum164 = ((Field) term77156).get((Object) null);
        Class<? extends Object> term77426 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term77425 = ((Class) term77426).getDeclaredField((String) "ORIGINAL");
        ((Field) term77425).setAccessible(true);
        Object enum165 = ((Field) term77425).get((Object) null);
        term77090 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term77116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77121 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77151 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77090, term77090.getClass(), "id", -8514728180792822493L);
        setIntField(term77090, term77090.getClass(), "pvId", 457470807);
        setField(term77090, term77090.getClass(), "difficulty", enum164);
        setIntField(term77090, term77090.getClass(), "version", -994742871);
        setField(term77090, term77090.getClass(), "edition", enum165);
        setIntField(term77117, term77117.getClass(), "year", 2017);
        setShortField(term77117, term77117.getClass(), "month", (short) 6);
        setShortField(term77117, term77117.getClass(), "day", (short) 7);
        setField(term77116, term77116.getClass(), "date", term77117);
        setByteField(term77121, term77121.getClass(), "hour", (byte) 13);
        setByteField(term77121, term77121.getClass(), "minute", (byte) 52);
        setByteField(term77121, term77121.getClass(), "second", (byte) 17);
        setIntField(term77121, term77121.getClass(), "nano", 78180039);
        setField(term77116, term77116.getClass(), "time", term77121);
        setField(term77090, term77090.getClass(), "demoStart", term77116);
        setIntField(term77127, term77127.getClass(), "year", 2017);
        setShortField(term77127, term77127.getClass(), "month", (short) 6);
        setShortField(term77127, term77127.getClass(), "day", (short) 23);
        setField(term77126, term77126.getClass(), "date", term77127);
        setByteField(term77131, term77131.getClass(), "hour", (byte) 23);
        setByteField(term77131, term77131.getClass(), "minute", (byte) 29);
        setByteField(term77131, term77131.getClass(), "second", (byte) 17);
        setIntField(term77131, term77131.getClass(), "nano", 491252353);
        setField(term77126, term77126.getClass(), "time", term77131);
        setField(term77090, term77090.getClass(), "demoEnd", term77126);
        setIntField(term77137, term77137.getClass(), "year", 2021);
        setShortField(term77137, term77137.getClass(), "month", (short) 12);
        setShortField(term77137, term77137.getClass(), "day", (short) 23);
        setField(term77136, term77136.getClass(), "date", term77137);
        setByteField(term77141, term77141.getClass(), "hour", (byte) 18);
        setByteField(term77141, term77141.getClass(), "minute", (byte) 52);
        setByteField(term77141, term77141.getClass(), "second", (byte) 27);
        setIntField(term77141, term77141.getClass(), "nano", 512484524);
        setField(term77136, term77136.getClass(), "time", term77141);
        setField(term77090, term77090.getClass(), "playableStart", term77136);
        setIntField(term77147, term77147.getClass(), "year", 2012);
        setShortField(term77147, term77147.getClass(), "month", (short) 6);
        setShortField(term77147, term77147.getClass(), "day", (short) 25);
        setField(term77146, term77146.getClass(), "date", term77147);
        setByteField(term77151, term77151.getClass(), "hour", (byte) 2);
        setByteField(term77151, term77151.getClass(), "minute", (byte) 21);
        setByteField(term77151, term77151.getClass(), "second", (byte) 28);
        setIntField(term77151, term77151.getClass(), "nano", 605177282);
        setField(term77146, term77146.getClass(), "time", term77151);
        setField(term77090, term77090.getClass(), "playableEnd", term77146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term77090, args);
    }

};



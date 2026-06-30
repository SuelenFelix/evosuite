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

public class PvEntry_equals_83674050119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87679;
     Object term87742;

    public PvEntry_equals_83674050119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87744 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term87743 = ((Class) term87744).getDeclaredField((String) "EASY");
        ((Field) term87743).setAccessible(true);
        Object enum199 = ((Field) term87743).get((Object) null);
        Class<? extends Object> term88013 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term88012 = ((Class) term88013).getDeclaredField((String) "EXTRA");
        ((Field) term88012).setAccessible(true);
        Object enum200 = ((Field) term88012).get((Object) null);
        term87679 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term87702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87737 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87679, term87679.getClass(), "id", -1526729287349763895L);
        setIntField(term87679, term87679.getClass(), "pvId", -974923743);
        setField(term87679, term87679.getClass(), "difficulty", enum199);
        setIntField(term87679, term87679.getClass(), "version", 1876738932);
        setField(term87679, term87679.getClass(), "edition", enum200);
        setIntField(term87703, term87703.getClass(), "year", 2029);
        setShortField(term87703, term87703.getClass(), "month", (short) 1);
        setShortField(term87703, term87703.getClass(), "day", (short) 21);
        setField(term87702, term87702.getClass(), "date", term87703);
        setByteField(term87707, term87707.getClass(), "hour", (byte) 9);
        setByteField(term87707, term87707.getClass(), "minute", (byte) 46);
        setByteField(term87707, term87707.getClass(), "second", (byte) 1);
        setIntField(term87707, term87707.getClass(), "nano", 276350652);
        setField(term87702, term87702.getClass(), "time", term87707);
        setField(term87679, term87679.getClass(), "demoStart", term87702);
        setIntField(term87713, term87713.getClass(), "year", 2019);
        setShortField(term87713, term87713.getClass(), "month", (short) 12);
        setShortField(term87713, term87713.getClass(), "day", (short) 20);
        setField(term87712, term87712.getClass(), "date", term87713);
        setByteField(term87717, term87717.getClass(), "hour", (byte) 22);
        setByteField(term87717, term87717.getClass(), "minute", (byte) 20);
        setByteField(term87717, term87717.getClass(), "second", (byte) 29);
        setIntField(term87717, term87717.getClass(), "nano", 582302461);
        setField(term87712, term87712.getClass(), "time", term87717);
        setField(term87679, term87679.getClass(), "demoEnd", term87712);
        setIntField(term87723, term87723.getClass(), "year", 2010);
        setShortField(term87723, term87723.getClass(), "month", (short) 9);
        setShortField(term87723, term87723.getClass(), "day", (short) 26);
        setField(term87722, term87722.getClass(), "date", term87723);
        setByteField(term87727, term87727.getClass(), "hour", (byte) 17);
        setByteField(term87727, term87727.getClass(), "minute", (byte) 5);
        setByteField(term87727, term87727.getClass(), "second", (byte) 52);
        setIntField(term87727, term87727.getClass(), "nano", 138292575);
        setField(term87722, term87722.getClass(), "time", term87727);
        setField(term87679, term87679.getClass(), "playableStart", term87722);
        setIntField(term87733, term87733.getClass(), "year", 2022);
        setShortField(term87733, term87733.getClass(), "month", (short) 10);
        setShortField(term87733, term87733.getClass(), "day", (short) 14);
        setField(term87732, term87732.getClass(), "date", term87733);
        setByteField(term87737, term87737.getClass(), "hour", (byte) 10);
        setByteField(term87737, term87737.getClass(), "minute", (byte) 28);
        setByteField(term87737, term87737.getClass(), "second", (byte) 24);
        setIntField(term87737, term87737.getClass(), "nano", 117469048);
        setField(term87732, term87732.getClass(), "time", term87737);
        setField(term87679, term87679.getClass(), "playableEnd", term87732);
        term87742 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87742;
        callMethod(klass, "equals", argTypes, term87679, args);
    }

};



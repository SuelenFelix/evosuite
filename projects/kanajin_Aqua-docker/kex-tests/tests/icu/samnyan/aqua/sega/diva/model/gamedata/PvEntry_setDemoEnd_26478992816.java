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

public class PvEntry_setDemoEnd_26478992816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85834;
     Object term85897;

    public PvEntry_setDemoEnd_26478992816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85908 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term85907 = ((Class) term85908).getDeclaredField((String) "HARD");
        ((Field) term85907).setAccessible(true);
        Object enum193 = ((Field) term85907).get((Object) null);
        Class<? extends Object> term86177 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term86176 = ((Class) term86177).getDeclaredField((String) "EXTRA");
        ((Field) term86176).setAccessible(true);
        Object enum194 = ((Field) term86176).get((Object) null);
        term85834 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term85857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85872 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85882 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85834, term85834.getClass(), "id", -5258945362776941718L);
        setIntField(term85834, term85834.getClass(), "pvId", -2092117838);
        setField(term85834, term85834.getClass(), "difficulty", enum193);
        setIntField(term85834, term85834.getClass(), "version", 1524590776);
        setField(term85834, term85834.getClass(), "edition", enum194);
        setIntField(term85858, term85858.getClass(), "year", 2019);
        setShortField(term85858, term85858.getClass(), "month", (short) 8);
        setShortField(term85858, term85858.getClass(), "day", (short) 6);
        setField(term85857, term85857.getClass(), "date", term85858);
        setByteField(term85862, term85862.getClass(), "hour", (byte) 5);
        setByteField(term85862, term85862.getClass(), "minute", (byte) 32);
        setByteField(term85862, term85862.getClass(), "second", (byte) 47);
        setIntField(term85862, term85862.getClass(), "nano", 73220317);
        setField(term85857, term85857.getClass(), "time", term85862);
        setField(term85834, term85834.getClass(), "demoStart", term85857);
        setIntField(term85868, term85868.getClass(), "year", 2025);
        setShortField(term85868, term85868.getClass(), "month", (short) 2);
        setShortField(term85868, term85868.getClass(), "day", (short) 23);
        setField(term85867, term85867.getClass(), "date", term85868);
        setByteField(term85872, term85872.getClass(), "hour", (byte) 16);
        setByteField(term85872, term85872.getClass(), "minute", (byte) 39);
        setByteField(term85872, term85872.getClass(), "second", (byte) 42);
        setIntField(term85872, term85872.getClass(), "nano", 342777686);
        setField(term85867, term85867.getClass(), "time", term85872);
        setField(term85834, term85834.getClass(), "demoEnd", term85867);
        setIntField(term85878, term85878.getClass(), "year", 2029);
        setShortField(term85878, term85878.getClass(), "month", (short) 8);
        setShortField(term85878, term85878.getClass(), "day", (short) 14);
        setField(term85877, term85877.getClass(), "date", term85878);
        setByteField(term85882, term85882.getClass(), "hour", (byte) 10);
        setByteField(term85882, term85882.getClass(), "minute", (byte) 28);
        setByteField(term85882, term85882.getClass(), "second", (byte) 23);
        setIntField(term85882, term85882.getClass(), "nano", 676524979);
        setField(term85877, term85877.getClass(), "time", term85882);
        setField(term85834, term85834.getClass(), "playableStart", term85877);
        setIntField(term85888, term85888.getClass(), "year", 2011);
        setShortField(term85888, term85888.getClass(), "month", (short) 9);
        setShortField(term85888, term85888.getClass(), "day", (short) 7);
        setField(term85887, term85887.getClass(), "date", term85888);
        setByteField(term85892, term85892.getClass(), "hour", (byte) 0);
        setByteField(term85892, term85892.getClass(), "minute", (byte) 51);
        setByteField(term85892, term85892.getClass(), "second", (byte) 44);
        setIntField(term85892, term85892.getClass(), "nano", 245610060);
        setField(term85887, term85887.getClass(), "time", term85892);
        setField(term85834, term85834.getClass(), "playableEnd", term85887);
        term85897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85902 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term85898, term85898.getClass(), "year", 2018);
        setShortField(term85898, term85898.getClass(), "month", (short) 1);
        setShortField(term85898, term85898.getClass(), "day", (short) 29);
        setField(term85897, term85897.getClass(), "date", term85898);
        setByteField(term85902, term85902.getClass(), "hour", (byte) 22);
        setByteField(term85902, term85902.getClass(), "minute", (byte) 20);
        setByteField(term85902, term85902.getClass(), "second", (byte) 36);
        setIntField(term85902, term85902.getClass(), "nano", 74678080);
        setField(term85897, term85897.getClass(), "time", term85902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term85897;
        callMethod(klass, "setDemoEnd", argTypes, term85834, args);
    }

};



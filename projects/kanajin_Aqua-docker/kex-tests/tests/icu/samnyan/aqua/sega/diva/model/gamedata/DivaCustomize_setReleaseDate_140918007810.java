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
import java.lang.Object;

public class DivaCustomize_setReleaseDate_140918007810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29242;
     Object term29278;

    public DivaCustomize_setReleaseDate_140918007810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29242 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29272 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29242, term29242.getClass(), "id", 5603560);
        setField(term29242, term29242.getClass(), "name", "GUztJeVeCc");
        setIntField(term29242, term29242.getClass(), "price", -1079020032);
        setIntField(term29258, term29258.getClass(), "year", 2028);
        setShortField(term29258, term29258.getClass(), "month", (short) 10);
        setShortField(term29258, term29258.getClass(), "day", (short) 1);
        setField(term29257, term29257.getClass(), "date", term29258);
        setByteField(term29262, term29262.getClass(), "hour", (byte) 17);
        setByteField(term29262, term29262.getClass(), "minute", (byte) 29);
        setByteField(term29262, term29262.getClass(), "second", (byte) 30);
        setIntField(term29262, term29262.getClass(), "nano", 845472306);
        setField(term29257, term29257.getClass(), "time", term29262);
        setField(term29242, term29242.getClass(), "releaseDate", term29257);
        setIntField(term29268, term29268.getClass(), "year", 2027);
        setShortField(term29268, term29268.getClass(), "month", (short) 2);
        setShortField(term29268, term29268.getClass(), "day", (short) 19);
        setField(term29267, term29267.getClass(), "date", term29268);
        setByteField(term29272, term29272.getClass(), "hour", (byte) 17);
        setByteField(term29272, term29272.getClass(), "minute", (byte) 37);
        setByteField(term29272, term29272.getClass(), "second", (byte) 27);
        setIntField(term29272, term29272.getClass(), "nano", 920380537);
        setField(term29267, term29267.getClass(), "time", term29272);
        setField(term29242, term29242.getClass(), "endDate", term29267);
        setIntField(term29242, term29242.getClass(), "sortOrder", -1973791064);
        term29278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29283 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29279, term29279.getClass(), "year", 2021);
        setShortField(term29279, term29279.getClass(), "month", (short) 8);
        setShortField(term29279, term29279.getClass(), "day", (short) 12);
        setField(term29278, term29278.getClass(), "date", term29279);
        setByteField(term29283, term29283.getClass(), "hour", (byte) 2);
        setByteField(term29283, term29283.getClass(), "minute", (byte) 17);
        setByteField(term29283, term29283.getClass(), "second", (byte) 51);
        setIntField(term29283, term29283.getClass(), "nano", 207375141);
        setField(term29278, term29278.getClass(), "time", term29283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term29278;
        callMethod(klass, "setReleaseDate", argTypes, term29242, args);
    }

};



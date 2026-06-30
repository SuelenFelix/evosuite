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
import java.lang.Integer;

public class DivaCustomize_setSortOrder_36994905012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29354;
     Object term29390;

    public DivaCustomize_setSortOrder_36994905012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29354 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29374 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29384 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29354, term29354.getClass(), "id", 1633913667);
        setField(term29354, term29354.getClass(), "name", "xZTWqxWsAc");
        setIntField(term29354, term29354.getClass(), "price", 1292332296);
        setIntField(term29370, term29370.getClass(), "year", 2012);
        setShortField(term29370, term29370.getClass(), "month", (short) 3);
        setShortField(term29370, term29370.getClass(), "day", (short) 27);
        setField(term29369, term29369.getClass(), "date", term29370);
        setByteField(term29374, term29374.getClass(), "hour", (byte) 17);
        setByteField(term29374, term29374.getClass(), "minute", (byte) 49);
        setByteField(term29374, term29374.getClass(), "second", (byte) 24);
        setIntField(term29374, term29374.getClass(), "nano", 530647398);
        setField(term29369, term29369.getClass(), "time", term29374);
        setField(term29354, term29354.getClass(), "releaseDate", term29369);
        setIntField(term29380, term29380.getClass(), "year", 2010);
        setShortField(term29380, term29380.getClass(), "month", (short) 6);
        setShortField(term29380, term29380.getClass(), "day", (short) 14);
        setField(term29379, term29379.getClass(), "date", term29380);
        setByteField(term29384, term29384.getClass(), "hour", (byte) 6);
        setByteField(term29384, term29384.getClass(), "minute", (byte) 22);
        setByteField(term29384, term29384.getClass(), "second", (byte) 20);
        setIntField(term29384, term29384.getClass(), "nano", 25133051);
        setField(term29379, term29379.getClass(), "time", term29384);
        setField(term29354, term29354.getClass(), "endDate", term29379);
        setIntField(term29354, term29354.getClass(), "sortOrder", -1415256843);
        term29390 = new Integer(612177768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29390;
        callMethod(klass, "setSortOrder", argTypes, term29354, args);
    }

};



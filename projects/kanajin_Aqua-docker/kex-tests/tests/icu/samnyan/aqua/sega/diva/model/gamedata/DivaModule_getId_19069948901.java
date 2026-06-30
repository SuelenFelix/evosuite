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

public class DivaModule_getId_19069948901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29762;

    public DivaModule_getId_19069948901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29762 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term29777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29792 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29762, term29762.getClass(), "id", -1794965320);
        setField(term29762, term29762.getClass(), "name", "MwiFLgdSDA");
        setIntField(term29762, term29762.getClass(), "price", 520504102);
        setIntField(term29778, term29778.getClass(), "year", 2027);
        setShortField(term29778, term29778.getClass(), "month", (short) 8);
        setShortField(term29778, term29778.getClass(), "day", (short) 23);
        setField(term29777, term29777.getClass(), "date", term29778);
        setByteField(term29782, term29782.getClass(), "hour", (byte) 15);
        setByteField(term29782, term29782.getClass(), "minute", (byte) 12);
        setByteField(term29782, term29782.getClass(), "second", (byte) 6);
        setIntField(term29782, term29782.getClass(), "nano", 541218258);
        setField(term29777, term29777.getClass(), "time", term29782);
        setField(term29762, term29762.getClass(), "releaseDate", term29777);
        setIntField(term29788, term29788.getClass(), "year", 2013);
        setShortField(term29788, term29788.getClass(), "month", (short) 5);
        setShortField(term29788, term29788.getClass(), "day", (short) 26);
        setField(term29787, term29787.getClass(), "date", term29788);
        setByteField(term29792, term29792.getClass(), "hour", (byte) 4);
        setByteField(term29792, term29792.getClass(), "minute", (byte) 39);
        setByteField(term29792, term29792.getClass(), "second", (byte) 5);
        setIntField(term29792, term29792.getClass(), "nano", 392869354);
        setField(term29787, term29787.getClass(), "time", term29792);
        setField(term29762, term29762.getClass(), "endDate", term29787);
        setIntField(term29762, term29762.getClass(), "sortOrder", -457396133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term29762, args);
    }

};



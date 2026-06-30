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

public class DivaCustomize_setId_4320790497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29078;
     Object term29114;

    public DivaCustomize_setId_4320790497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29078 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29098 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29108 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29078, term29078.getClass(), "id", -781832877);
        setField(term29078, term29078.getClass(), "name", "wCcojFgWKb");
        setIntField(term29078, term29078.getClass(), "price", 797203987);
        setIntField(term29094, term29094.getClass(), "year", 2014);
        setShortField(term29094, term29094.getClass(), "month", (short) 7);
        setShortField(term29094, term29094.getClass(), "day", (short) 13);
        setField(term29093, term29093.getClass(), "date", term29094);
        setByteField(term29098, term29098.getClass(), "hour", (byte) 21);
        setByteField(term29098, term29098.getClass(), "minute", (byte) 46);
        setByteField(term29098, term29098.getClass(), "second", (byte) 0);
        setIntField(term29098, term29098.getClass(), "nano", 887884128);
        setField(term29093, term29093.getClass(), "time", term29098);
        setField(term29078, term29078.getClass(), "releaseDate", term29093);
        setIntField(term29104, term29104.getClass(), "year", 2023);
        setShortField(term29104, term29104.getClass(), "month", (short) 3);
        setShortField(term29104, term29104.getClass(), "day", (short) 7);
        setField(term29103, term29103.getClass(), "date", term29104);
        setByteField(term29108, term29108.getClass(), "hour", (byte) 21);
        setByteField(term29108, term29108.getClass(), "minute", (byte) 15);
        setByteField(term29108, term29108.getClass(), "second", (byte) 43);
        setIntField(term29108, term29108.getClass(), "nano", 639721472);
        setField(term29103, term29103.getClass(), "time", term29108);
        setField(term29078, term29078.getClass(), "endDate", term29103);
        setIntField(term29078, term29078.getClass(), "sortOrder", 1973060703);
        term29114 = new Integer(-138239905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29114;
        callMethod(klass, "setId", argTypes, term29078, args);
    }

};



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

public class DivaModule_setSortOrder_38636557112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30314;
     Object term30350;

    public DivaModule_setSortOrder_38636557112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30314 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30344 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30314, term30314.getClass(), "id", 1302807565);
        setField(term30314, term30314.getClass(), "name", "YIDNFdhfGO");
        setIntField(term30314, term30314.getClass(), "price", -838848221);
        setIntField(term30330, term30330.getClass(), "year", 2022);
        setShortField(term30330, term30330.getClass(), "month", (short) 4);
        setShortField(term30330, term30330.getClass(), "day", (short) 15);
        setField(term30329, term30329.getClass(), "date", term30330);
        setByteField(term30334, term30334.getClass(), "hour", (byte) 20);
        setByteField(term30334, term30334.getClass(), "minute", (byte) 58);
        setByteField(term30334, term30334.getClass(), "second", (byte) 46);
        setIntField(term30334, term30334.getClass(), "nano", 435562727);
        setField(term30329, term30329.getClass(), "time", term30334);
        setField(term30314, term30314.getClass(), "releaseDate", term30329);
        setIntField(term30340, term30340.getClass(), "year", 2026);
        setShortField(term30340, term30340.getClass(), "month", (short) 10);
        setShortField(term30340, term30340.getClass(), "day", (short) 31);
        setField(term30339, term30339.getClass(), "date", term30340);
        setByteField(term30344, term30344.getClass(), "hour", (byte) 17);
        setByteField(term30344, term30344.getClass(), "minute", (byte) 6);
        setByteField(term30344, term30344.getClass(), "second", (byte) 30);
        setIntField(term30344, term30344.getClass(), "nano", 785931660);
        setField(term30339, term30339.getClass(), "time", term30344);
        setField(term30314, term30314.getClass(), "endDate", term30339);
        setIntField(term30314, term30314.getClass(), "sortOrder", 1163761623);
        term30350 = new Integer(718742281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30350;
        callMethod(klass, "setSortOrder", argTypes, term30314, args);
    }

};



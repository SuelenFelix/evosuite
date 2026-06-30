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

public class DivaModule_setEndDate_69897817111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30258;
     Object term30294;

    public DivaModule_setEndDate_69897817111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30258 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30288 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30258, term30258.getClass(), "id", 178847646);
        setField(term30258, term30258.getClass(), "name", "llSJDzNeEq");
        setIntField(term30258, term30258.getClass(), "price", 273590437);
        setIntField(term30274, term30274.getClass(), "year", 2025);
        setShortField(term30274, term30274.getClass(), "month", (short) 8);
        setShortField(term30274, term30274.getClass(), "day", (short) 22);
        setField(term30273, term30273.getClass(), "date", term30274);
        setByteField(term30278, term30278.getClass(), "hour", (byte) 6);
        setByteField(term30278, term30278.getClass(), "minute", (byte) 48);
        setByteField(term30278, term30278.getClass(), "second", (byte) 49);
        setIntField(term30278, term30278.getClass(), "nano", 46400229);
        setField(term30273, term30273.getClass(), "time", term30278);
        setField(term30258, term30258.getClass(), "releaseDate", term30273);
        setIntField(term30284, term30284.getClass(), "year", 2028);
        setShortField(term30284, term30284.getClass(), "month", (short) 4);
        setShortField(term30284, term30284.getClass(), "day", (short) 1);
        setField(term30283, term30283.getClass(), "date", term30284);
        setByteField(term30288, term30288.getClass(), "hour", (byte) 16);
        setByteField(term30288, term30288.getClass(), "minute", (byte) 22);
        setByteField(term30288, term30288.getClass(), "second", (byte) 32);
        setIntField(term30288, term30288.getClass(), "nano", 406353763);
        setField(term30283, term30283.getClass(), "time", term30288);
        setField(term30258, term30258.getClass(), "endDate", term30283);
        setIntField(term30258, term30258.getClass(), "sortOrder", -348612876);
        term30294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30299 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30295, term30295.getClass(), "year", 2019);
        setShortField(term30295, term30295.getClass(), "month", (short) 7);
        setShortField(term30295, term30295.getClass(), "day", (short) 19);
        setField(term30294, term30294.getClass(), "date", term30295);
        setByteField(term30299, term30299.getClass(), "hour", (byte) 10);
        setByteField(term30299, term30299.getClass(), "minute", (byte) 54);
        setByteField(term30299, term30299.getClass(), "second", (byte) 55);
        setIntField(term30299, term30299.getClass(), "nano", 244650454);
        setField(term30294, term30294.getClass(), "time", term30299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30294;
        callMethod(klass, "setEndDate", argTypes, term30258, args);
    }

};



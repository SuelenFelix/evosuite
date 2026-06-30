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

public class DivaCustomize_hashCode_135362372715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29496;

    public DivaCustomize_hashCode_135362372715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29496 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29526 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29496, term29496.getClass(), "id", 1801052257);
        setField(term29496, term29496.getClass(), "name", "HlddItIexw");
        setIntField(term29496, term29496.getClass(), "price", -2110556060);
        setIntField(term29512, term29512.getClass(), "year", 2023);
        setShortField(term29512, term29512.getClass(), "month", (short) 7);
        setShortField(term29512, term29512.getClass(), "day", (short) 16);
        setField(term29511, term29511.getClass(), "date", term29512);
        setByteField(term29516, term29516.getClass(), "hour", (byte) 3);
        setByteField(term29516, term29516.getClass(), "minute", (byte) 1);
        setByteField(term29516, term29516.getClass(), "second", (byte) 19);
        setIntField(term29516, term29516.getClass(), "nano", 488629554);
        setField(term29511, term29511.getClass(), "time", term29516);
        setField(term29496, term29496.getClass(), "releaseDate", term29511);
        setIntField(term29522, term29522.getClass(), "year", 2018);
        setShortField(term29522, term29522.getClass(), "month", (short) 7);
        setShortField(term29522, term29522.getClass(), "day", (short) 12);
        setField(term29521, term29521.getClass(), "date", term29522);
        setByteField(term29526, term29526.getClass(), "hour", (byte) 1);
        setByteField(term29526, term29526.getClass(), "minute", (byte) 3);
        setByteField(term29526, term29526.getClass(), "second", (byte) 47);
        setIntField(term29526, term29526.getClass(), "nano", 2729929);
        setField(term29521, term29521.getClass(), "time", term29526);
        setField(term29496, term29496.getClass(), "endDate", term29521);
        setIntField(term29496, term29496.getClass(), "sortOrder", 313459791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term29496, args);
    }

};



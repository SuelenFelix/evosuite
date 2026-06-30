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

public class DivaModule_setPrice_3497147429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30154;
     Object term30190;

    public DivaModule_setPrice_3497147429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30154 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30174 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30184 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30154, term30154.getClass(), "id", -752870423);
        setField(term30154, term30154.getClass(), "name", "XNgNLbjmim");
        setIntField(term30154, term30154.getClass(), "price", -1698809299);
        setIntField(term30170, term30170.getClass(), "year", 2016);
        setShortField(term30170, term30170.getClass(), "month", (short) 10);
        setShortField(term30170, term30170.getClass(), "day", (short) 20);
        setField(term30169, term30169.getClass(), "date", term30170);
        setByteField(term30174, term30174.getClass(), "hour", (byte) 18);
        setByteField(term30174, term30174.getClass(), "minute", (byte) 39);
        setByteField(term30174, term30174.getClass(), "second", (byte) 1);
        setIntField(term30174, term30174.getClass(), "nano", 196253988);
        setField(term30169, term30169.getClass(), "time", term30174);
        setField(term30154, term30154.getClass(), "releaseDate", term30169);
        setIntField(term30180, term30180.getClass(), "year", 2019);
        setShortField(term30180, term30180.getClass(), "month", (short) 1);
        setShortField(term30180, term30180.getClass(), "day", (short) 6);
        setField(term30179, term30179.getClass(), "date", term30180);
        setByteField(term30184, term30184.getClass(), "hour", (byte) 18);
        setByteField(term30184, term30184.getClass(), "minute", (byte) 8);
        setByteField(term30184, term30184.getClass(), "second", (byte) 46);
        setIntField(term30184, term30184.getClass(), "nano", 934136445);
        setField(term30179, term30179.getClass(), "time", term30184);
        setField(term30154, term30154.getClass(), "endDate", term30179);
        setIntField(term30154, term30154.getClass(), "sortOrder", 401512128);
        term30190 = new Integer(-2069930777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30190;
        callMethod(klass, "setPrice", argTypes, term30154, args);
    }

};



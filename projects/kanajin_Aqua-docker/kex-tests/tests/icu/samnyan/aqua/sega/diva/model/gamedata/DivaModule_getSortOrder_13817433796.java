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

public class DivaModule_getSortOrder_13817433796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29992;

    public DivaModule_getSortOrder_13817433796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29992 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30022 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29992, term29992.getClass(), "id", -1617383807);
        setField(term29992, term29992.getClass(), "name", "gCFzBxPZKw");
        setIntField(term29992, term29992.getClass(), "price", -1244386281);
        setIntField(term30008, term30008.getClass(), "year", 2022);
        setShortField(term30008, term30008.getClass(), "month", (short) 6);
        setShortField(term30008, term30008.getClass(), "day", (short) 20);
        setField(term30007, term30007.getClass(), "date", term30008);
        setByteField(term30012, term30012.getClass(), "hour", (byte) 7);
        setByteField(term30012, term30012.getClass(), "minute", (byte) 57);
        setByteField(term30012, term30012.getClass(), "second", (byte) 37);
        setIntField(term30012, term30012.getClass(), "nano", 90374877);
        setField(term30007, term30007.getClass(), "time", term30012);
        setField(term29992, term29992.getClass(), "releaseDate", term30007);
        setIntField(term30018, term30018.getClass(), "year", 2023);
        setShortField(term30018, term30018.getClass(), "month", (short) 2);
        setShortField(term30018, term30018.getClass(), "day", (short) 16);
        setField(term30017, term30017.getClass(), "date", term30018);
        setByteField(term30022, term30022.getClass(), "hour", (byte) 3);
        setByteField(term30022, term30022.getClass(), "minute", (byte) 18);
        setByteField(term30022, term30022.getClass(), "second", (byte) 56);
        setIntField(term30022, term30022.getClass(), "nano", 733017887);
        setField(term30017, term30017.getClass(), "time", term30022);
        setField(term29992, term29992.getClass(), "endDate", term30017);
        setIntField(term29992, term29992.getClass(), "sortOrder", -885788574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortOrder", argTypes, term29992, args);
    }

};



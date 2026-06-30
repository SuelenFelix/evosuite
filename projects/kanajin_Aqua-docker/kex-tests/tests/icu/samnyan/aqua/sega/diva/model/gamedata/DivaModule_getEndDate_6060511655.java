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

public class DivaModule_getEndDate_6060511655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29946;

    public DivaModule_getEndDate_6060511655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29946 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term29961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29976 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29946, term29946.getClass(), "id", -706253892);
        setField(term29946, term29946.getClass(), "name", "lzqPLDonds");
        setIntField(term29946, term29946.getClass(), "price", -1341439819);
        setIntField(term29962, term29962.getClass(), "year", 2025);
        setShortField(term29962, term29962.getClass(), "month", (short) 9);
        setShortField(term29962, term29962.getClass(), "day", (short) 25);
        setField(term29961, term29961.getClass(), "date", term29962);
        setByteField(term29966, term29966.getClass(), "hour", (byte) 20);
        setByteField(term29966, term29966.getClass(), "minute", (byte) 0);
        setByteField(term29966, term29966.getClass(), "second", (byte) 25);
        setIntField(term29966, term29966.getClass(), "nano", 65871584);
        setField(term29961, term29961.getClass(), "time", term29966);
        setField(term29946, term29946.getClass(), "releaseDate", term29961);
        setIntField(term29972, term29972.getClass(), "year", 2011);
        setShortField(term29972, term29972.getClass(), "month", (short) 9);
        setShortField(term29972, term29972.getClass(), "day", (short) 25);
        setField(term29971, term29971.getClass(), "date", term29972);
        setByteField(term29976, term29976.getClass(), "hour", (byte) 16);
        setByteField(term29976, term29976.getClass(), "minute", (byte) 45);
        setByteField(term29976, term29976.getClass(), "second", (byte) 19);
        setIntField(term29976, term29976.getClass(), "nano", 962864785);
        setField(term29971, term29971.getClass(), "time", term29976);
        setField(term29946, term29946.getClass(), "endDate", term29971);
        setIntField(term29946, term29946.getClass(), "sortOrder", -728760750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term29946, args);
    }

};



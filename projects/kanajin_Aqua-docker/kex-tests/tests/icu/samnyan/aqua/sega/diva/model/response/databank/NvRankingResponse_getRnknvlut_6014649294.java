package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NvRankingResponse_getRnknvlut_6014649294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26954;

    public NvRankingResponse_getRnknvlut_6014649294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26954 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term26967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26994 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26954, term26954.getClass(), "rnk_nv_tag_str", "gUQhOyGfzF");
        setIntField(term26968, term26968.getClass(), "year", 2021);
        setShortField(term26968, term26968.getClass(), "month", (short) 4);
        setShortField(term26968, term26968.getClass(), "day", (short) 26);
        setField(term26967, term26967.getClass(), "date", term26968);
        setByteField(term26972, term26972.getClass(), "hour", (byte) 11);
        setByteField(term26972, term26972.getClass(), "minute", (byte) 34);
        setByteField(term26972, term26972.getClass(), "second", (byte) 15);
        setIntField(term26972, term26972.getClass(), "nano", 638206023);
        setField(term26967, term26967.getClass(), "time", term26972);
        setField(term26954, term26954.getClass(), "rnk_nv_ts", term26967);
        setField(term26954, term26954.getClass(), "rnk_nv_data", "IqDObvPBZX");
        setIntField(term26990, term26990.getClass(), "year", 2013);
        setShortField(term26990, term26990.getClass(), "month", (short) 9);
        setShortField(term26990, term26990.getClass(), "day", (short) 13);
        setField(term26989, term26989.getClass(), "date", term26990);
        setByteField(term26994, term26994.getClass(), "hour", (byte) 14);
        setByteField(term26994, term26994.getClass(), "minute", (byte) 36);
        setByteField(term26994, term26994.getClass(), "second", (byte) 59);
        setIntField(term26994, term26994.getClass(), "nano", 363124001);
        setField(term26989, term26989.getClass(), "time", term26994);
        setField(term26954, term26954.getClass(), "rnk_nv_lut", term26989);
        setField(term26954, term26954.getClass(), "cmd", "NITCrIISoC");
        setField(term26954, term26954.getClass(), "req_id", "nSzzeexTDI");
        setField(term26954, term26954.getClass(), "stat", "WBrpvMhmsz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_nv_lut", argTypes, term26954, args);
    }

};



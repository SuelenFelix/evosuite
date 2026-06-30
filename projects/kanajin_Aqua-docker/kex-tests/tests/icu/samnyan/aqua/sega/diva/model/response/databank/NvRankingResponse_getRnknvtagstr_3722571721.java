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

public class NvRankingResponse_getRnknvtagstr_3722571721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26561;

    public NvRankingResponse_getRnknvtagstr_3722571721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26561 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term26574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26601 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26561, term26561.getClass(), "rnk_nv_tag_str", "sBmtvFPDso");
        setIntField(term26575, term26575.getClass(), "year", 2025);
        setShortField(term26575, term26575.getClass(), "month", (short) 12);
        setShortField(term26575, term26575.getClass(), "day", (short) 16);
        setField(term26574, term26574.getClass(), "date", term26575);
        setByteField(term26579, term26579.getClass(), "hour", (byte) 7);
        setByteField(term26579, term26579.getClass(), "minute", (byte) 53);
        setByteField(term26579, term26579.getClass(), "second", (byte) 23);
        setIntField(term26579, term26579.getClass(), "nano", 532991944);
        setField(term26574, term26574.getClass(), "time", term26579);
        setField(term26561, term26561.getClass(), "rnk_nv_ts", term26574);
        setField(term26561, term26561.getClass(), "rnk_nv_data", "qsUIxrLolr");
        setIntField(term26597, term26597.getClass(), "year", 2024);
        setShortField(term26597, term26597.getClass(), "month", (short) 2);
        setShortField(term26597, term26597.getClass(), "day", (short) 5);
        setField(term26596, term26596.getClass(), "date", term26597);
        setByteField(term26601, term26601.getClass(), "hour", (byte) 12);
        setByteField(term26601, term26601.getClass(), "minute", (byte) 28);
        setByteField(term26601, term26601.getClass(), "second", (byte) 37);
        setIntField(term26601, term26601.getClass(), "nano", 689695229);
        setField(term26596, term26596.getClass(), "time", term26601);
        setField(term26561, term26561.getClass(), "rnk_nv_lut", term26596);
        setField(term26561, term26561.getClass(), "cmd", "IlQxArYcgB");
        setField(term26561, term26561.getClass(), "req_id", "lIgKCvCuoH");
        setField(term26561, term26561.getClass(), "stat", "dHuWgRwLOm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_nv_tag_str", argTypes, term26561, args);
    }

};



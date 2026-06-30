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

public class NvRankingResponse_getRnknvdata_18604460683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26823;

    public NvRankingResponse_getRnknvdata_18604460683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26823 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term26836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26841 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26863 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26823, term26823.getClass(), "rnk_nv_tag_str", "rHgKCfgCsg");
        setIntField(term26837, term26837.getClass(), "year", 2013);
        setShortField(term26837, term26837.getClass(), "month", (short) 5);
        setShortField(term26837, term26837.getClass(), "day", (short) 9);
        setField(term26836, term26836.getClass(), "date", term26837);
        setByteField(term26841, term26841.getClass(), "hour", (byte) 4);
        setByteField(term26841, term26841.getClass(), "minute", (byte) 18);
        setByteField(term26841, term26841.getClass(), "second", (byte) 35);
        setIntField(term26841, term26841.getClass(), "nano", 909079395);
        setField(term26836, term26836.getClass(), "time", term26841);
        setField(term26823, term26823.getClass(), "rnk_nv_ts", term26836);
        setField(term26823, term26823.getClass(), "rnk_nv_data", "AWtIUOuutt");
        setIntField(term26859, term26859.getClass(), "year", 2015);
        setShortField(term26859, term26859.getClass(), "month", (short) 3);
        setShortField(term26859, term26859.getClass(), "day", (short) 15);
        setField(term26858, term26858.getClass(), "date", term26859);
        setByteField(term26863, term26863.getClass(), "hour", (byte) 8);
        setByteField(term26863, term26863.getClass(), "minute", (byte) 45);
        setByteField(term26863, term26863.getClass(), "second", (byte) 29);
        setIntField(term26863, term26863.getClass(), "nano", 781486470);
        setField(term26858, term26858.getClass(), "time", term26863);
        setField(term26823, term26823.getClass(), "rnk_nv_lut", term26858);
        setField(term26823, term26823.getClass(), "cmd", "jBgJZpHifl");
        setField(term26823, term26823.getClass(), "req_id", "azMTTmEXnh");
        setField(term26823, term26823.getClass(), "stat", "BjJtxwsIpt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_nv_data", argTypes, term26823, args);
    }

};



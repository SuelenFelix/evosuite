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

public class NvRankingResponse_setRnknvts_16273642856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27238;
     Object term27319;

    public NvRankingResponse_setRnknvts_16273642856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27238 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term27251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27278 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27238, term27238.getClass(), "rnk_nv_tag_str", "RyaaOzWfYO");
        setIntField(term27252, term27252.getClass(), "year", 2016);
        setShortField(term27252, term27252.getClass(), "month", (short) 6);
        setShortField(term27252, term27252.getClass(), "day", (short) 23);
        setField(term27251, term27251.getClass(), "date", term27252);
        setByteField(term27256, term27256.getClass(), "hour", (byte) 20);
        setByteField(term27256, term27256.getClass(), "minute", (byte) 51);
        setByteField(term27256, term27256.getClass(), "second", (byte) 43);
        setIntField(term27256, term27256.getClass(), "nano", 284389409);
        setField(term27251, term27251.getClass(), "time", term27256);
        setField(term27238, term27238.getClass(), "rnk_nv_ts", term27251);
        setField(term27238, term27238.getClass(), "rnk_nv_data", "HAkxFBZZzz");
        setIntField(term27274, term27274.getClass(), "year", 2014);
        setShortField(term27274, term27274.getClass(), "month", (short) 10);
        setShortField(term27274, term27274.getClass(), "day", (short) 7);
        setField(term27273, term27273.getClass(), "date", term27274);
        setByteField(term27278, term27278.getClass(), "hour", (byte) 12);
        setByteField(term27278, term27278.getClass(), "minute", (byte) 59);
        setByteField(term27278, term27278.getClass(), "second", (byte) 39);
        setIntField(term27278, term27278.getClass(), "nano", 603709306);
        setField(term27273, term27273.getClass(), "time", term27278);
        setField(term27238, term27238.getClass(), "rnk_nv_lut", term27273);
        setField(term27238, term27238.getClass(), "cmd", "yejonZnVuy");
        setField(term27238, term27238.getClass(), "req_id", "ouesGIsvuG");
        setField(term27238, term27238.getClass(), "stat", "pHBHlmLIZQ");
        term27319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27324 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27320, term27320.getClass(), "year", 2019);
        setShortField(term27320, term27320.getClass(), "month", (short) 8);
        setShortField(term27320, term27320.getClass(), "day", (short) 12);
        setField(term27319, term27319.getClass(), "date", term27320);
        setByteField(term27324, term27324.getClass(), "hour", (byte) 14);
        setByteField(term27324, term27324.getClass(), "minute", (byte) 1);
        setByteField(term27324, term27324.getClass(), "second", (byte) 51);
        setIntField(term27324, term27324.getClass(), "nano", 499021786);
        setField(term27319, term27319.getClass(), "time", term27324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27319;
        callMethod(klass, "setRnk_nv_ts", argTypes, term27238, args);
    }

};



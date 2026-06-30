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

public class NvRankingResponse_setRnknvtagstr_7630229565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27085;

    public NvRankingResponse_setRnknvtagstr_7630229565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27085 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term27098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27125 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27085, term27085.getClass(), "rnk_nv_tag_str", "ZzqRHVEXcM");
        setIntField(term27099, term27099.getClass(), "year", 2020);
        setShortField(term27099, term27099.getClass(), "month", (short) 12);
        setShortField(term27099, term27099.getClass(), "day", (short) 21);
        setField(term27098, term27098.getClass(), "date", term27099);
        setByteField(term27103, term27103.getClass(), "hour", (byte) 20);
        setByteField(term27103, term27103.getClass(), "minute", (byte) 16);
        setByteField(term27103, term27103.getClass(), "second", (byte) 59);
        setIntField(term27103, term27103.getClass(), "nano", 976524801);
        setField(term27098, term27098.getClass(), "time", term27103);
        setField(term27085, term27085.getClass(), "rnk_nv_ts", term27098);
        setField(term27085, term27085.getClass(), "rnk_nv_data", "YYwIEARNxi");
        setIntField(term27121, term27121.getClass(), "year", 2028);
        setShortField(term27121, term27121.getClass(), "month", (short) 5);
        setShortField(term27121, term27121.getClass(), "day", (short) 15);
        setField(term27120, term27120.getClass(), "date", term27121);
        setByteField(term27125, term27125.getClass(), "hour", (byte) 20);
        setByteField(term27125, term27125.getClass(), "minute", (byte) 31);
        setByteField(term27125, term27125.getClass(), "second", (byte) 49);
        setIntField(term27125, term27125.getClass(), "nano", 945744862);
        setField(term27120, term27120.getClass(), "time", term27125);
        setField(term27085, term27085.getClass(), "rnk_nv_lut", term27120);
        setField(term27085, term27085.getClass(), "cmd", "rblXBUdTFc");
        setField(term27085, term27085.getClass(), "req_id", "rbsXSOJFKW");
        setField(term27085, term27085.getClass(), "stat", "sAgGDoUNlf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TSTZcXdFFi";
        callMethod(klass, "setRnk_nv_tag_str", argTypes, term27085, args);
    }

};



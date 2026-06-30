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

public class NvRankingResponse_setRnknvlut_17502329278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27532;
     Object term27613;

    public NvRankingResponse_setRnknvlut_17502329278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27532 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term27545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27550 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27572 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27532, term27532.getClass(), "rnk_nv_tag_str", "PLeKpWaxhQ");
        setIntField(term27546, term27546.getClass(), "year", 2016);
        setShortField(term27546, term27546.getClass(), "month", (short) 3);
        setShortField(term27546, term27546.getClass(), "day", (short) 20);
        setField(term27545, term27545.getClass(), "date", term27546);
        setByteField(term27550, term27550.getClass(), "hour", (byte) 0);
        setByteField(term27550, term27550.getClass(), "minute", (byte) 54);
        setByteField(term27550, term27550.getClass(), "second", (byte) 6);
        setIntField(term27550, term27550.getClass(), "nano", 183302469);
        setField(term27545, term27545.getClass(), "time", term27550);
        setField(term27532, term27532.getClass(), "rnk_nv_ts", term27545);
        setField(term27532, term27532.getClass(), "rnk_nv_data", "EBSKhqDdUW");
        setIntField(term27568, term27568.getClass(), "year", 2013);
        setShortField(term27568, term27568.getClass(), "month", (short) 11);
        setShortField(term27568, term27568.getClass(), "day", (short) 19);
        setField(term27567, term27567.getClass(), "date", term27568);
        setByteField(term27572, term27572.getClass(), "hour", (byte) 6);
        setByteField(term27572, term27572.getClass(), "minute", (byte) 45);
        setByteField(term27572, term27572.getClass(), "second", (byte) 10);
        setIntField(term27572, term27572.getClass(), "nano", 288981190);
        setField(term27567, term27567.getClass(), "time", term27572);
        setField(term27532, term27532.getClass(), "rnk_nv_lut", term27567);
        setField(term27532, term27532.getClass(), "cmd", "LvLbdICdfA");
        setField(term27532, term27532.getClass(), "req_id", "rtifrlITwl");
        setField(term27532, term27532.getClass(), "stat", "yGWXZDjnPS");
        term27613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27618 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27614, term27614.getClass(), "year", 2025);
        setShortField(term27614, term27614.getClass(), "month", (short) 9);
        setShortField(term27614, term27614.getClass(), "day", (short) 18);
        setField(term27613, term27613.getClass(), "date", term27614);
        setByteField(term27618, term27618.getClass(), "hour", (byte) 16);
        setByteField(term27618, term27618.getClass(), "minute", (byte) 1);
        setByteField(term27618, term27618.getClass(), "second", (byte) 23);
        setIntField(term27618, term27618.getClass(), "nano", 178285726);
        setField(term27613, term27613.getClass(), "time", term27618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27613;
        callMethod(klass, "setRnk_nv_lut", argTypes, term27532, args);
    }

};



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

public class NvRankingResponse_setRnknvdata_19634968847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27379;

    public NvRankingResponse_setRnknvdata_19634968847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27379 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term27392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27419 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27379, term27379.getClass(), "rnk_nv_tag_str", "ZWRAbOuktl");
        setIntField(term27393, term27393.getClass(), "year", 2014);
        setShortField(term27393, term27393.getClass(), "month", (short) 7);
        setShortField(term27393, term27393.getClass(), "day", (short) 22);
        setField(term27392, term27392.getClass(), "date", term27393);
        setByteField(term27397, term27397.getClass(), "hour", (byte) 9);
        setByteField(term27397, term27397.getClass(), "minute", (byte) 40);
        setByteField(term27397, term27397.getClass(), "second", (byte) 34);
        setIntField(term27397, term27397.getClass(), "nano", 463008257);
        setField(term27392, term27392.getClass(), "time", term27397);
        setField(term27379, term27379.getClass(), "rnk_nv_ts", term27392);
        setField(term27379, term27379.getClass(), "rnk_nv_data", "iqFRvFmVID");
        setIntField(term27415, term27415.getClass(), "year", 2027);
        setShortField(term27415, term27415.getClass(), "month", (short) 6);
        setShortField(term27415, term27415.getClass(), "day", (short) 20);
        setField(term27414, term27414.getClass(), "date", term27415);
        setByteField(term27419, term27419.getClass(), "hour", (byte) 23);
        setByteField(term27419, term27419.getClass(), "minute", (byte) 21);
        setByteField(term27419, term27419.getClass(), "second", (byte) 6);
        setIntField(term27419, term27419.getClass(), "nano", 897776059);
        setField(term27414, term27414.getClass(), "time", term27419);
        setField(term27379, term27379.getClass(), "rnk_nv_lut", term27414);
        setField(term27379, term27379.getClass(), "cmd", "pNAEtppZdv");
        setField(term27379, term27379.getClass(), "req_id", "VsFWNMdyRt");
        setField(term27379, term27379.getClass(), "stat", "QaoYFZhScg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UTvXIenLCR";
        callMethod(klass, "setRnk_nv_data", argTypes, term27379, args);
    }

};



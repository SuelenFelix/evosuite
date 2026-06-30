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

public class NvRankingResponse_getRnknvts_19581551572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26692;

    public NvRankingResponse_getRnknvts_19581551572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26692 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        Object term26705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26732 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26692, term26692.getClass(), "rnk_nv_tag_str", "PsTQDxNIld");
        setIntField(term26706, term26706.getClass(), "year", 2023);
        setShortField(term26706, term26706.getClass(), "month", (short) 5);
        setShortField(term26706, term26706.getClass(), "day", (short) 23);
        setField(term26705, term26705.getClass(), "date", term26706);
        setByteField(term26710, term26710.getClass(), "hour", (byte) 0);
        setByteField(term26710, term26710.getClass(), "minute", (byte) 50);
        setByteField(term26710, term26710.getClass(), "second", (byte) 5);
        setIntField(term26710, term26710.getClass(), "nano", 296286825);
        setField(term26705, term26705.getClass(), "time", term26710);
        setField(term26692, term26692.getClass(), "rnk_nv_ts", term26705);
        setField(term26692, term26692.getClass(), "rnk_nv_data", "uoBijJjvaj");
        setIntField(term26728, term26728.getClass(), "year", 2015);
        setShortField(term26728, term26728.getClass(), "month", (short) 2);
        setShortField(term26728, term26728.getClass(), "day", (short) 5);
        setField(term26727, term26727.getClass(), "date", term26728);
        setByteField(term26732, term26732.getClass(), "hour", (byte) 3);
        setByteField(term26732, term26732.getClass(), "minute", (byte) 26);
        setByteField(term26732, term26732.getClass(), "second", (byte) 49);
        setIntField(term26732, term26732.getClass(), "nano", 995758570);
        setField(term26727, term26727.getClass(), "time", term26732);
        setField(term26692, term26692.getClass(), "rnk_nv_lut", term26727);
        setField(term26692, term26692.getClass(), "cmd", "BdsLFSRWda");
        setField(term26692, term26692.getClass(), "req_id", "tMhhBYonAI");
        setField(term26692, term26692.getClass(), "stat", "AaQRshwIQC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_nv_ts", argTypes, term26692, args);
    }

};



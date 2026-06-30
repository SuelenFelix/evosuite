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

public class PsRankingResponse_getRnkpsedtn2_1272784556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19665;

    public PsRankingResponse_getRnkpsedtn2_1272784556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19665 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term19666 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19667 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19671 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19681 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19667, term19667.getClass(), "year", 2015);
        setShortField(term19667, term19667.getClass(), "month", (short) 12);
        setShortField(term19667, term19667.getClass(), "day", (short) 23);
        setField(term19666, term19666.getClass(), "date", term19667);
        setByteField(term19671, term19671.getClass(), "hour", (byte) 14);
        setByteField(term19671, term19671.getClass(), "minute", (byte) 17);
        setByteField(term19671, term19671.getClass(), "second", (byte) 50);
        setIntField(term19671, term19671.getClass(), "nano", 325544804);
        setField(term19666, term19666.getClass(), "time", term19671);
        setField(term19665, term19665.getClass(), "rnk_ps_lut", term19666);
        setIntField(term19677, term19677.getClass(), "year", 2027);
        setShortField(term19677, term19677.getClass(), "month", (short) 11);
        setShortField(term19677, term19677.getClass(), "day", (short) 8);
        setField(term19676, term19676.getClass(), "date", term19677);
        setByteField(term19681, term19681.getClass(), "hour", (byte) 11);
        setByteField(term19681, term19681.getClass(), "minute", (byte) 59);
        setByteField(term19681, term19681.getClass(), "second", (byte) 14);
        setIntField(term19681, term19681.getClass(), "nano", 322375591);
        setField(term19676, term19676.getClass(), "time", term19681);
        setField(term19665, term19665.getClass(), "rnk_ps_ts", term19676);
        setIntField(term19665, term19665.getClass(), "rnk_ps_dffclty", -1685132342);
        setField(term19665, term19665.getClass(), "rnk_ps_pv_id", "VWPFyrpmmb");
        setField(term19665, term19665.getClass(), "rnk_ps_edtn1", "gYYKrIeThw");
        setField(term19665, term19665.getClass(), "rnk_ps_edtn2", "UsxeLMVkAK");
        setField(term19665, term19665.getClass(), "rnk_ps_edtn3", "ITrhiKKzcb");
        setField(term19665, term19665.getClass(), "rnk_ps_scr1", "qMKmSzOQXg");
        setField(term19665, term19665.getClass(), "rnk_ps_scr2", "CURQCMkqbZ");
        setField(term19665, term19665.getClass(), "rnk_ps_scr3", "VZwkkQktrm");
        setField(term19665, term19665.getClass(), "rnk_ps_nm1", "wIuJvIvEMb");
        setField(term19665, term19665.getClass(), "rnk_ps_nm2", "EyojsbSjWT");
        setField(term19665, term19665.getClass(), "rnk_ps_nm3", "szGicGyWDL");
        setField(term19665, term19665.getClass(), "cmd", "lkdvUiYwRq");
        setField(term19665, term19665.getClass(), "req_id", "XuxkPrpfND");
        setField(term19665, term19665.getClass(), "stat", "OxNXeKMDje");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_edtn2", argTypes, term19665, args);
    }

};



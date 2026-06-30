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

public class PsRankingResponse_getRnkpsedtn3_1272794167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19973;

    public PsRankingResponse_getRnkpsedtn3_1272794167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term19974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19989 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19975, term19975.getClass(), "year", 2020);
        setShortField(term19975, term19975.getClass(), "month", (short) 8);
        setShortField(term19975, term19975.getClass(), "day", (short) 15);
        setField(term19974, term19974.getClass(), "date", term19975);
        setByteField(term19979, term19979.getClass(), "hour", (byte) 2);
        setByteField(term19979, term19979.getClass(), "minute", (byte) 0);
        setByteField(term19979, term19979.getClass(), "second", (byte) 38);
        setIntField(term19979, term19979.getClass(), "nano", 146431486);
        setField(term19974, term19974.getClass(), "time", term19979);
        setField(term19973, term19973.getClass(), "rnk_ps_lut", term19974);
        setIntField(term19985, term19985.getClass(), "year", 2014);
        setShortField(term19985, term19985.getClass(), "month", (short) 11);
        setShortField(term19985, term19985.getClass(), "day", (short) 8);
        setField(term19984, term19984.getClass(), "date", term19985);
        setByteField(term19989, term19989.getClass(), "hour", (byte) 8);
        setByteField(term19989, term19989.getClass(), "minute", (byte) 43);
        setByteField(term19989, term19989.getClass(), "second", (byte) 32);
        setIntField(term19989, term19989.getClass(), "nano", 154434838);
        setField(term19984, term19984.getClass(), "time", term19989);
        setField(term19973, term19973.getClass(), "rnk_ps_ts", term19984);
        setIntField(term19973, term19973.getClass(), "rnk_ps_dffclty", -1456670397);
        setField(term19973, term19973.getClass(), "rnk_ps_pv_id", "hGTqHomrbc");
        setField(term19973, term19973.getClass(), "rnk_ps_edtn1", "NNMBrIWEBw");
        setField(term19973, term19973.getClass(), "rnk_ps_edtn2", "GrTaccOQzl");
        setField(term19973, term19973.getClass(), "rnk_ps_edtn3", "uuSYOUCVHU");
        setField(term19973, term19973.getClass(), "rnk_ps_scr1", "DfWwbodtVw");
        setField(term19973, term19973.getClass(), "rnk_ps_scr2", "kTbFMpVWqx");
        setField(term19973, term19973.getClass(), "rnk_ps_scr3", "HegRNsidFg");
        setField(term19973, term19973.getClass(), "rnk_ps_nm1", "udRdJkgXmH");
        setField(term19973, term19973.getClass(), "rnk_ps_nm2", "FBCXbjHVXO");
        setField(term19973, term19973.getClass(), "rnk_ps_nm3", "dIWAnvmLiC");
        setField(term19973, term19973.getClass(), "cmd", "CuWebzZQjZ");
        setField(term19973, term19973.getClass(), "req_id", "wRVaaJxKYI");
        setField(term19973, term19973.getClass(), "stat", "yOQuJXRvOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_edtn3", argTypes, term19973, args);
    }

};



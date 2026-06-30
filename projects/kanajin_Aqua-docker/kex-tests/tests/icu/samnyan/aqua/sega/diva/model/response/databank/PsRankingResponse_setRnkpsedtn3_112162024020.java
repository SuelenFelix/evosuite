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

public class PsRankingResponse_setRnkpsedtn3_112162024020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24065;

    public PsRankingResponse_setRnkpsedtn3_112162024020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24065 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term24066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24081 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24067, term24067.getClass(), "year", 2022);
        setShortField(term24067, term24067.getClass(), "month", (short) 4);
        setShortField(term24067, term24067.getClass(), "day", (short) 15);
        setField(term24066, term24066.getClass(), "date", term24067);
        setByteField(term24071, term24071.getClass(), "hour", (byte) 20);
        setByteField(term24071, term24071.getClass(), "minute", (byte) 58);
        setByteField(term24071, term24071.getClass(), "second", (byte) 46);
        setIntField(term24071, term24071.getClass(), "nano", 435562727);
        setField(term24066, term24066.getClass(), "time", term24071);
        setField(term24065, term24065.getClass(), "rnk_ps_lut", term24066);
        setIntField(term24077, term24077.getClass(), "year", 2026);
        setShortField(term24077, term24077.getClass(), "month", (short) 10);
        setShortField(term24077, term24077.getClass(), "day", (short) 31);
        setField(term24076, term24076.getClass(), "date", term24077);
        setByteField(term24081, term24081.getClass(), "hour", (byte) 17);
        setByteField(term24081, term24081.getClass(), "minute", (byte) 6);
        setByteField(term24081, term24081.getClass(), "second", (byte) 30);
        setIntField(term24081, term24081.getClass(), "nano", 785931660);
        setField(term24076, term24076.getClass(), "time", term24081);
        setField(term24065, term24065.getClass(), "rnk_ps_ts", term24076);
        setIntField(term24065, term24065.getClass(), "rnk_ps_dffclty", -1179120542);
        setField(term24065, term24065.getClass(), "rnk_ps_pv_id", "nBaMiSdFmS");
        setField(term24065, term24065.getClass(), "rnk_ps_edtn1", "ezwGsjqTai");
        setField(term24065, term24065.getClass(), "rnk_ps_edtn2", "ngeHWMRjnn");
        setField(term24065, term24065.getClass(), "rnk_ps_edtn3", "FOKfDXQxMM");
        setField(term24065, term24065.getClass(), "rnk_ps_scr1", "gbxMvhrWpA");
        setField(term24065, term24065.getClass(), "rnk_ps_scr2", "huNTIobUHx");
        setField(term24065, term24065.getClass(), "rnk_ps_scr3", "MrVeCmRVzF");
        setField(term24065, term24065.getClass(), "rnk_ps_nm1", "CPVnQYACKw");
        setField(term24065, term24065.getClass(), "rnk_ps_nm2", "sbdLhVCRsw");
        setField(term24065, term24065.getClass(), "rnk_ps_nm3", "soJHvZwbtF");
        setField(term24065, term24065.getClass(), "cmd", "dTGwgkfDVj");
        setField(term24065, term24065.getClass(), "req_id", "zHiuLPzYQM");
        setField(term24065, term24065.getClass(), "stat", "ioYxUYJBrh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GXoLEdKEIe";
        callMethod(klass, "setRnk_ps_edtn3", argTypes, term24065, args);
    }

};



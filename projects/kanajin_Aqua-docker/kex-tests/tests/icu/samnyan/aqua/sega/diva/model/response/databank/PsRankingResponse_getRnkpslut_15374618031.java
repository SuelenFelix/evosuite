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

public class PsRankingResponse_getRnkpslut_15374618031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18125;

    public PsRankingResponse_getRnkpslut_15374618031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18125 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term18126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18141 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18127, term18127.getClass(), "year", 2016);
        setShortField(term18127, term18127.getClass(), "month", (short) 6);
        setShortField(term18127, term18127.getClass(), "day", (short) 15);
        setField(term18126, term18126.getClass(), "date", term18127);
        setByteField(term18131, term18131.getClass(), "hour", (byte) 21);
        setByteField(term18131, term18131.getClass(), "minute", (byte) 23);
        setByteField(term18131, term18131.getClass(), "second", (byte) 23);
        setIntField(term18131, term18131.getClass(), "nano", 433372070);
        setField(term18126, term18126.getClass(), "time", term18131);
        setField(term18125, term18125.getClass(), "rnk_ps_lut", term18126);
        setIntField(term18137, term18137.getClass(), "year", 2012);
        setShortField(term18137, term18137.getClass(), "month", (short) 8);
        setShortField(term18137, term18137.getClass(), "day", (short) 25);
        setField(term18136, term18136.getClass(), "date", term18137);
        setByteField(term18141, term18141.getClass(), "hour", (byte) 19);
        setByteField(term18141, term18141.getClass(), "minute", (byte) 49);
        setByteField(term18141, term18141.getClass(), "second", (byte) 8);
        setIntField(term18141, term18141.getClass(), "nano", 912685024);
        setField(term18136, term18136.getClass(), "time", term18141);
        setField(term18125, term18125.getClass(), "rnk_ps_ts", term18136);
        setIntField(term18125, term18125.getClass(), "rnk_ps_dffclty", -522618178);
        setField(term18125, term18125.getClass(), "rnk_ps_pv_id", "KbwxawvYsw");
        setField(term18125, term18125.getClass(), "rnk_ps_edtn1", "gvjdfHNzOa");
        setField(term18125, term18125.getClass(), "rnk_ps_edtn2", "HqitWglYWX");
        setField(term18125, term18125.getClass(), "rnk_ps_edtn3", "pOuFRlHmbK");
        setField(term18125, term18125.getClass(), "rnk_ps_scr1", "WrzdBkinqV");
        setField(term18125, term18125.getClass(), "rnk_ps_scr2", "vydWXHfFTw");
        setField(term18125, term18125.getClass(), "rnk_ps_scr3", "DRhkpDneCC");
        setField(term18125, term18125.getClass(), "rnk_ps_nm1", "vuIJRrypuA");
        setField(term18125, term18125.getClass(), "rnk_ps_nm2", "AxfSZmaiyA");
        setField(term18125, term18125.getClass(), "rnk_ps_nm3", "lBpveIKbea");
        setField(term18125, term18125.getClass(), "cmd", "uyLBVQYcOV");
        setField(term18125, term18125.getClass(), "req_id", "PoTZjDuBHa");
        setField(term18125, term18125.getClass(), "stat", "MIwvgVrhzP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_lut", argTypes, term18125, args);
    }

};



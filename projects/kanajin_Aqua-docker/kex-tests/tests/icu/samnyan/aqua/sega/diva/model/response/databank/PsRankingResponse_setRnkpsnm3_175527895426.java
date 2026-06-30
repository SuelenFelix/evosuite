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

public class PsRankingResponse_setRnkpsnm3_175527895426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26045;

    public PsRankingResponse_setRnkpsnm3_175527895426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26045 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term26046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26061 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26047, term26047.getClass(), "year", 2021);
        setShortField(term26047, term26047.getClass(), "month", (short) 3);
        setShortField(term26047, term26047.getClass(), "day", (short) 13);
        setField(term26046, term26046.getClass(), "date", term26047);
        setByteField(term26051, term26051.getClass(), "hour", (byte) 6);
        setByteField(term26051, term26051.getClass(), "minute", (byte) 25);
        setByteField(term26051, term26051.getClass(), "second", (byte) 42);
        setIntField(term26051, term26051.getClass(), "nano", 282924199);
        setField(term26046, term26046.getClass(), "time", term26051);
        setField(term26045, term26045.getClass(), "rnk_ps_lut", term26046);
        setIntField(term26057, term26057.getClass(), "year", 2020);
        setShortField(term26057, term26057.getClass(), "month", (short) 10);
        setShortField(term26057, term26057.getClass(), "day", (short) 25);
        setField(term26056, term26056.getClass(), "date", term26057);
        setByteField(term26061, term26061.getClass(), "hour", (byte) 18);
        setByteField(term26061, term26061.getClass(), "minute", (byte) 22);
        setByteField(term26061, term26061.getClass(), "second", (byte) 30);
        setIntField(term26061, term26061.getClass(), "nano", 948592965);
        setField(term26056, term26056.getClass(), "time", term26061);
        setField(term26045, term26045.getClass(), "rnk_ps_ts", term26056);
        setIntField(term26045, term26045.getClass(), "rnk_ps_dffclty", -469968304);
        setField(term26045, term26045.getClass(), "rnk_ps_pv_id", "gAAPyftlIR");
        setField(term26045, term26045.getClass(), "rnk_ps_edtn1", "kevWstoxwq");
        setField(term26045, term26045.getClass(), "rnk_ps_edtn2", "aSYOhFwzSm");
        setField(term26045, term26045.getClass(), "rnk_ps_edtn3", "pVZlzrBeDB");
        setField(term26045, term26045.getClass(), "rnk_ps_scr1", "EfSUvjuZAA");
        setField(term26045, term26045.getClass(), "rnk_ps_scr2", "PrHWfHydsG");
        setField(term26045, term26045.getClass(), "rnk_ps_scr3", "igruEzTbBE");
        setField(term26045, term26045.getClass(), "rnk_ps_nm1", "LFjgROsRUV");
        setField(term26045, term26045.getClass(), "rnk_ps_nm2", "kHxujKiCsr");
        setField(term26045, term26045.getClass(), "rnk_ps_nm3", "cseZveWowm");
        setField(term26045, term26045.getClass(), "cmd", "idfslIPhgx");
        setField(term26045, term26045.getClass(), "req_id", "HyFLOXeoDX");
        setField(term26045, term26045.getClass(), "stat", "crkNabVaWs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qBcAJgrABE";
        callMethod(klass, "setRnk_ps_nm3", argTypes, term26045, args);
    }

};



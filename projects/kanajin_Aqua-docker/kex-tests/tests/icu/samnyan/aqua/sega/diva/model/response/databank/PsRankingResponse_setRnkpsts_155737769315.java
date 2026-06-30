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

public class PsRankingResponse_setRnkpsts_155737769315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22447;
     Object term22625;

    public PsRankingResponse_setRnkpsts_155737769315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22447 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term22448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22463 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22449, term22449.getClass(), "year", 2024);
        setShortField(term22449, term22449.getClass(), "month", (short) 2);
        setShortField(term22449, term22449.getClass(), "day", (short) 29);
        setField(term22448, term22448.getClass(), "date", term22449);
        setByteField(term22453, term22453.getClass(), "hour", (byte) 17);
        setByteField(term22453, term22453.getClass(), "minute", (byte) 54);
        setByteField(term22453, term22453.getClass(), "second", (byte) 21);
        setIntField(term22453, term22453.getClass(), "nano", 605973408);
        setField(term22448, term22448.getClass(), "time", term22453);
        setField(term22447, term22447.getClass(), "rnk_ps_lut", term22448);
        setIntField(term22459, term22459.getClass(), "year", 2016);
        setShortField(term22459, term22459.getClass(), "month", (short) 2);
        setShortField(term22459, term22459.getClass(), "day", (short) 25);
        setField(term22458, term22458.getClass(), "date", term22459);
        setByteField(term22463, term22463.getClass(), "hour", (byte) 8);
        setByteField(term22463, term22463.getClass(), "minute", (byte) 54);
        setByteField(term22463, term22463.getClass(), "second", (byte) 40);
        setIntField(term22463, term22463.getClass(), "nano", 124525896);
        setField(term22458, term22458.getClass(), "time", term22463);
        setField(term22447, term22447.getClass(), "rnk_ps_ts", term22458);
        setIntField(term22447, term22447.getClass(), "rnk_ps_dffclty", 1135664017);
        setField(term22447, term22447.getClass(), "rnk_ps_pv_id", "rdiIyXfRtL");
        setField(term22447, term22447.getClass(), "rnk_ps_edtn1", "douzkltmiI");
        setField(term22447, term22447.getClass(), "rnk_ps_edtn2", "MFKjhvLtpe");
        setField(term22447, term22447.getClass(), "rnk_ps_edtn3", "xpbLKEsput");
        setField(term22447, term22447.getClass(), "rnk_ps_scr1", "urlyLwPBVn");
        setField(term22447, term22447.getClass(), "rnk_ps_scr2", "SPQVzOlOzZ");
        setField(term22447, term22447.getClass(), "rnk_ps_scr3", "bOUAgAptAI");
        setField(term22447, term22447.getClass(), "rnk_ps_nm1", "KSZfGbvzPE");
        setField(term22447, term22447.getClass(), "rnk_ps_nm2", "YfgYGgzYER");
        setField(term22447, term22447.getClass(), "rnk_ps_nm3", "IDClvDZuqE");
        setField(term22447, term22447.getClass(), "cmd", "cMvKxpZOvg");
        setField(term22447, term22447.getClass(), "req_id", "WWBYemIuiK");
        setField(term22447, term22447.getClass(), "stat", "nHYQYkycCR");
        term22625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22630 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22626, term22626.getClass(), "year", 2029);
        setShortField(term22626, term22626.getClass(), "month", (short) 1);
        setShortField(term22626, term22626.getClass(), "day", (short) 10);
        setField(term22625, term22625.getClass(), "date", term22626);
        setByteField(term22630, term22630.getClass(), "hour", (byte) 8);
        setByteField(term22630, term22630.getClass(), "minute", (byte) 46);
        setByteField(term22630, term22630.getClass(), "second", (byte) 35);
        setIntField(term22630, term22630.getClass(), "nano", 58807194);
        setField(term22625, term22625.getClass(), "time", term22630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22625;
        callMethod(klass, "setRnk_ps_ts", argTypes, term22447, args);
    }

};



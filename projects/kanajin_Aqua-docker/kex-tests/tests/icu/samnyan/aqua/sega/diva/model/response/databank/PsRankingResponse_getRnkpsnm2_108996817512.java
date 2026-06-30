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

public class PsRankingResponse_getRnkpsnm2_108996817512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21513;

    public PsRankingResponse_getRnkpsnm2_108996817512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21513 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term21514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21519 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21529 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21515, term21515.getClass(), "year", 2011);
        setShortField(term21515, term21515.getClass(), "month", (short) 6);
        setShortField(term21515, term21515.getClass(), "day", (short) 26);
        setField(term21514, term21514.getClass(), "date", term21515);
        setByteField(term21519, term21519.getClass(), "hour", (byte) 22);
        setByteField(term21519, term21519.getClass(), "minute", (byte) 39);
        setByteField(term21519, term21519.getClass(), "second", (byte) 11);
        setIntField(term21519, term21519.getClass(), "nano", 686293604);
        setField(term21514, term21514.getClass(), "time", term21519);
        setField(term21513, term21513.getClass(), "rnk_ps_lut", term21514);
        setIntField(term21525, term21525.getClass(), "year", 2012);
        setShortField(term21525, term21525.getClass(), "month", (short) 7);
        setShortField(term21525, term21525.getClass(), "day", (short) 21);
        setField(term21524, term21524.getClass(), "date", term21525);
        setByteField(term21529, term21529.getClass(), "hour", (byte) 13);
        setByteField(term21529, term21529.getClass(), "minute", (byte) 41);
        setByteField(term21529, term21529.getClass(), "second", (byte) 44);
        setIntField(term21529, term21529.getClass(), "nano", 394467282);
        setField(term21524, term21524.getClass(), "time", term21529);
        setField(term21513, term21513.getClass(), "rnk_ps_ts", term21524);
        setIntField(term21513, term21513.getClass(), "rnk_ps_dffclty", -2068769794);
        setField(term21513, term21513.getClass(), "rnk_ps_pv_id", "iYwkCLMsbJ");
        setField(term21513, term21513.getClass(), "rnk_ps_edtn1", "MXLsVQWrwc");
        setField(term21513, term21513.getClass(), "rnk_ps_edtn2", "lRaSlqzqNY");
        setField(term21513, term21513.getClass(), "rnk_ps_edtn3", "TiEyxWXsra");
        setField(term21513, term21513.getClass(), "rnk_ps_scr1", "TuLgwTZsPP");
        setField(term21513, term21513.getClass(), "rnk_ps_scr2", "KoasxTJGpx");
        setField(term21513, term21513.getClass(), "rnk_ps_scr3", "ceGeARYMoa");
        setField(term21513, term21513.getClass(), "rnk_ps_nm1", "fFWllaiFvh");
        setField(term21513, term21513.getClass(), "rnk_ps_nm2", "PFTdEDSbvZ");
        setField(term21513, term21513.getClass(), "rnk_ps_nm3", "TbiwoiebNe");
        setField(term21513, term21513.getClass(), "cmd", "laTITSWZuc");
        setField(term21513, term21513.getClass(), "req_id", "fkzRpxlAqS");
        setField(term21513, term21513.getClass(), "stat", "VYvbTGKslj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_nm2", argTypes, term21513, args);
    }

};



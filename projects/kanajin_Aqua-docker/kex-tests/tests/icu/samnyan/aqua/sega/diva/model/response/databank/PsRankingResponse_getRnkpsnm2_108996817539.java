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

public class PsRankingResponse_getRnkpsnm2_108996817539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26399;

    public PsRankingResponse_getRnkpsnm2_108996817539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26399 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        setField(term26399, term26399.getClass(), "rnk_ps_lut", null);
        setField(term26399, term26399.getClass(), "rnk_ps_ts", null);
        setIntField(term26399, term26399.getClass(), "rnk_ps_dffclty", 0);
        setField(term26399, term26399.getClass(), "rnk_ps_pv_id", null);
        setField(term26399, term26399.getClass(), "rnk_ps_edtn1", null);
        setField(term26399, term26399.getClass(), "rnk_ps_edtn2", null);
        setField(term26399, term26399.getClass(), "rnk_ps_edtn3", null);
        setField(term26399, term26399.getClass(), "rnk_ps_scr1", null);
        setField(term26399, term26399.getClass(), "rnk_ps_scr2", null);
        setField(term26399, term26399.getClass(), "rnk_ps_scr3", null);
        setField(term26399, term26399.getClass(), "rnk_ps_nm1", null);
        setField(term26399, term26399.getClass(), "rnk_ps_nm2", null);
        setField(term26399, term26399.getClass(), "rnk_ps_nm3", null);
        setField(term26399, term26399.getClass(), "cmd", null);
        setField(term26399, term26399.getClass(), "req_id", null);
        setField(term26399, term26399.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_nm2", argTypes, term26399, args);
    }

};



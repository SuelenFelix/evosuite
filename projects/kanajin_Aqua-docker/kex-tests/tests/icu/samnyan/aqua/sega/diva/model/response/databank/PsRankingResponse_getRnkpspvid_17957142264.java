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

public class PsRankingResponse_getRnkpspvid_17957142264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19049;

    public PsRankingResponse_getRnkpspvid_17957142264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19049 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term19050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19055 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19065 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19051, term19051.getClass(), "year", 2010);
        setShortField(term19051, term19051.getClass(), "month", (short) 1);
        setShortField(term19051, term19051.getClass(), "day", (short) 17);
        setField(term19050, term19050.getClass(), "date", term19051);
        setByteField(term19055, term19055.getClass(), "hour", (byte) 13);
        setByteField(term19055, term19055.getClass(), "minute", (byte) 5);
        setByteField(term19055, term19055.getClass(), "second", (byte) 51);
        setIntField(term19055, term19055.getClass(), "nano", 362260580);
        setField(term19050, term19050.getClass(), "time", term19055);
        setField(term19049, term19049.getClass(), "rnk_ps_lut", term19050);
        setIntField(term19061, term19061.getClass(), "year", 2010);
        setShortField(term19061, term19061.getClass(), "month", (short) 9);
        setShortField(term19061, term19061.getClass(), "day", (short) 28);
        setField(term19060, term19060.getClass(), "date", term19061);
        setByteField(term19065, term19065.getClass(), "hour", (byte) 6);
        setByteField(term19065, term19065.getClass(), "minute", (byte) 4);
        setByteField(term19065, term19065.getClass(), "second", (byte) 54);
        setIntField(term19065, term19065.getClass(), "nano", 604713782);
        setField(term19060, term19060.getClass(), "time", term19065);
        setField(term19049, term19049.getClass(), "rnk_ps_ts", term19060);
        setIntField(term19049, term19049.getClass(), "rnk_ps_dffclty", 1585847225);
        setField(term19049, term19049.getClass(), "rnk_ps_pv_id", "jDFNSuvZqm");
        setField(term19049, term19049.getClass(), "rnk_ps_edtn1", "pLvkKHqNYX");
        setField(term19049, term19049.getClass(), "rnk_ps_edtn2", "PwqnuJJwjR");
        setField(term19049, term19049.getClass(), "rnk_ps_edtn3", "NFkbBiPeiw");
        setField(term19049, term19049.getClass(), "rnk_ps_scr1", "tlRvilQyjJ");
        setField(term19049, term19049.getClass(), "rnk_ps_scr2", "gwTUlYNpjM");
        setField(term19049, term19049.getClass(), "rnk_ps_scr3", "uXYojRmxrM");
        setField(term19049, term19049.getClass(), "rnk_ps_nm1", "cxRwRcodud");
        setField(term19049, term19049.getClass(), "rnk_ps_nm2", "GDGBPlYeLn");
        setField(term19049, term19049.getClass(), "rnk_ps_nm3", "jdQANIXSTq");
        setField(term19049, term19049.getClass(), "cmd", "stVcZLTNpu");
        setField(term19049, term19049.getClass(), "req_id", "LgXdqWrsLL");
        setField(term19049, term19049.getClass(), "stat", "bbHWyibNmy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_pv_id", argTypes, term19049, args);
    }

};



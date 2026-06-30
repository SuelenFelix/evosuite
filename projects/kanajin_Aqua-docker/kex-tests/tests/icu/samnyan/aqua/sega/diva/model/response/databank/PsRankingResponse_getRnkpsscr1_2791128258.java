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

public class PsRankingResponse_getRnkpsscr1_2791128258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20281;

    public PsRankingResponse_getRnkpsscr1_2791128258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20281 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term20282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20287 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20297 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20283, term20283.getClass(), "year", 2020);
        setShortField(term20283, term20283.getClass(), "month", (short) 5);
        setShortField(term20283, term20283.getClass(), "day", (short) 18);
        setField(term20282, term20282.getClass(), "date", term20283);
        setByteField(term20287, term20287.getClass(), "hour", (byte) 5);
        setByteField(term20287, term20287.getClass(), "minute", (byte) 46);
        setByteField(term20287, term20287.getClass(), "second", (byte) 13);
        setIntField(term20287, term20287.getClass(), "nano", 45893173);
        setField(term20282, term20282.getClass(), "time", term20287);
        setField(term20281, term20281.getClass(), "rnk_ps_lut", term20282);
        setIntField(term20293, term20293.getClass(), "year", 2017);
        setShortField(term20293, term20293.getClass(), "month", (short) 4);
        setShortField(term20293, term20293.getClass(), "day", (short) 3);
        setField(term20292, term20292.getClass(), "date", term20293);
        setByteField(term20297, term20297.getClass(), "hour", (byte) 6);
        setByteField(term20297, term20297.getClass(), "minute", (byte) 51);
        setByteField(term20297, term20297.getClass(), "second", (byte) 10);
        setIntField(term20297, term20297.getClass(), "nano", 316377166);
        setField(term20292, term20292.getClass(), "time", term20297);
        setField(term20281, term20281.getClass(), "rnk_ps_ts", term20292);
        setIntField(term20281, term20281.getClass(), "rnk_ps_dffclty", 1622346318);
        setField(term20281, term20281.getClass(), "rnk_ps_pv_id", "XmLHcnVsch");
        setField(term20281, term20281.getClass(), "rnk_ps_edtn1", "Yrvtdcltri");
        setField(term20281, term20281.getClass(), "rnk_ps_edtn2", "RxrsjXRVcT");
        setField(term20281, term20281.getClass(), "rnk_ps_edtn3", "cfRimmJxqA");
        setField(term20281, term20281.getClass(), "rnk_ps_scr1", "oOnRVGqFmy");
        setField(term20281, term20281.getClass(), "rnk_ps_scr2", "LaXzFIlWMk");
        setField(term20281, term20281.getClass(), "rnk_ps_scr3", "GuVQjhBxma");
        setField(term20281, term20281.getClass(), "rnk_ps_nm1", "WAVMPPbIfL");
        setField(term20281, term20281.getClass(), "rnk_ps_nm2", "GISHLsgALf");
        setField(term20281, term20281.getClass(), "rnk_ps_nm3", "PVykkUSgBq");
        setField(term20281, term20281.getClass(), "cmd", "tnKbZaCsuj");
        setField(term20281, term20281.getClass(), "req_id", "ZFpcYBgLNC");
        setField(term20281, term20281.getClass(), "stat", "VAGkRppBem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_scr1", argTypes, term20281, args);
    }

};



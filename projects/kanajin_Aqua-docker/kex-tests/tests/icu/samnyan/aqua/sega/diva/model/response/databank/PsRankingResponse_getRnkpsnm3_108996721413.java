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

public class PsRankingResponse_getRnkpsnm3_108996721413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21821;

    public PsRankingResponse_getRnkpsnm3_108996721413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21821 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term21822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21827 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21837 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21823, term21823.getClass(), "year", 2025);
        setShortField(term21823, term21823.getClass(), "month", (short) 9);
        setShortField(term21823, term21823.getClass(), "day", (short) 25);
        setField(term21822, term21822.getClass(), "date", term21823);
        setByteField(term21827, term21827.getClass(), "hour", (byte) 20);
        setByteField(term21827, term21827.getClass(), "minute", (byte) 0);
        setByteField(term21827, term21827.getClass(), "second", (byte) 25);
        setIntField(term21827, term21827.getClass(), "nano", 65871584);
        setField(term21822, term21822.getClass(), "time", term21827);
        setField(term21821, term21821.getClass(), "rnk_ps_lut", term21822);
        setIntField(term21833, term21833.getClass(), "year", 2011);
        setShortField(term21833, term21833.getClass(), "month", (short) 9);
        setShortField(term21833, term21833.getClass(), "day", (short) 25);
        setField(term21832, term21832.getClass(), "date", term21833);
        setByteField(term21837, term21837.getClass(), "hour", (byte) 16);
        setByteField(term21837, term21837.getClass(), "minute", (byte) 45);
        setByteField(term21837, term21837.getClass(), "second", (byte) 19);
        setIntField(term21837, term21837.getClass(), "nano", 962864785);
        setField(term21832, term21832.getClass(), "time", term21837);
        setField(term21821, term21821.getClass(), "rnk_ps_ts", term21832);
        setIntField(term21821, term21821.getClass(), "rnk_ps_dffclty", -117576464);
        setField(term21821, term21821.getClass(), "rnk_ps_pv_id", "owLqDDnwZA");
        setField(term21821, term21821.getClass(), "rnk_ps_edtn1", "eBcTbweeYp");
        setField(term21821, term21821.getClass(), "rnk_ps_edtn2", "drcmjfQUDq");
        setField(term21821, term21821.getClass(), "rnk_ps_edtn3", "GjdWUoUSyA");
        setField(term21821, term21821.getClass(), "rnk_ps_scr1", "YEkxWsWaUl");
        setField(term21821, term21821.getClass(), "rnk_ps_scr2", "RINhPkhhct");
        setField(term21821, term21821.getClass(), "rnk_ps_scr3", "vjNPcTSqmS");
        setField(term21821, term21821.getClass(), "rnk_ps_nm1", "fFhdWuJbdC");
        setField(term21821, term21821.getClass(), "rnk_ps_nm2", "JlgLIHPabR");
        setField(term21821, term21821.getClass(), "rnk_ps_nm3", "LHnkeoNwHq");
        setField(term21821, term21821.getClass(), "cmd", "gVnDVbSyKa");
        setField(term21821, term21821.getClass(), "req_id", "kdCYNMSuoD");
        setField(term21821, term21821.getClass(), "stat", "eRYlSLwtvV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_nm3", argTypes, term21821, args);
    }

};



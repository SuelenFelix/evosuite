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

public class PsRankingResponse_getRnkpsts_18881685652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18433;

    public PsRankingResponse_getRnkpsts_18881685652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18433 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term18434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18449 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18435, term18435.getClass(), "year", 2012);
        setShortField(term18435, term18435.getClass(), "month", (short) 3);
        setShortField(term18435, term18435.getClass(), "day", (short) 27);
        setField(term18434, term18434.getClass(), "date", term18435);
        setByteField(term18439, term18439.getClass(), "hour", (byte) 17);
        setByteField(term18439, term18439.getClass(), "minute", (byte) 49);
        setByteField(term18439, term18439.getClass(), "second", (byte) 24);
        setIntField(term18439, term18439.getClass(), "nano", 530647398);
        setField(term18434, term18434.getClass(), "time", term18439);
        setField(term18433, term18433.getClass(), "rnk_ps_lut", term18434);
        setIntField(term18445, term18445.getClass(), "year", 2010);
        setShortField(term18445, term18445.getClass(), "month", (short) 6);
        setShortField(term18445, term18445.getClass(), "day", (short) 14);
        setField(term18444, term18444.getClass(), "date", term18445);
        setByteField(term18449, term18449.getClass(), "hour", (byte) 6);
        setByteField(term18449, term18449.getClass(), "minute", (byte) 22);
        setByteField(term18449, term18449.getClass(), "second", (byte) 20);
        setIntField(term18449, term18449.getClass(), "nano", 25133051);
        setField(term18444, term18444.getClass(), "time", term18449);
        setField(term18433, term18433.getClass(), "rnk_ps_ts", term18444);
        setIntField(term18433, term18433.getClass(), "rnk_ps_dffclty", 1134449235);
        setField(term18433, term18433.getClass(), "rnk_ps_pv_id", "HcUUieXdep");
        setField(term18433, term18433.getClass(), "rnk_ps_edtn1", "AbonCTtbef");
        setField(term18433, term18433.getClass(), "rnk_ps_edtn2", "maXrGOGoKA");
        setField(term18433, term18433.getClass(), "rnk_ps_edtn3", "zAkgWQVCpM");
        setField(term18433, term18433.getClass(), "rnk_ps_scr1", "yQUDyOroXU");
        setField(term18433, term18433.getClass(), "rnk_ps_scr2", "xweqkPdyJH");
        setField(term18433, term18433.getClass(), "rnk_ps_scr3", "kwteHWzwcc");
        setField(term18433, term18433.getClass(), "rnk_ps_nm1", "uMsWXqNhln");
        setField(term18433, term18433.getClass(), "rnk_ps_nm2", "MAnhIPOtHL");
        setField(term18433, term18433.getClass(), "rnk_ps_nm3", "dikKjYjmRO");
        setField(term18433, term18433.getClass(), "cmd", "GJnnMDVnEP");
        setField(term18433, term18433.getClass(), "req_id", "zSMVllDpfk");
        setField(term18433, term18433.getClass(), "stat", "iptRXVDoYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_ts", argTypes, term18433, args);
    }

};



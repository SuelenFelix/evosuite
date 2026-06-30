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

public class PsRankingResponse_setRnkpsscr1_38216364121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24395;

    public PsRankingResponse_setRnkpsscr1_38216364121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24395 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term24396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24411 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24397, term24397.getClass(), "year", 2022);
        setShortField(term24397, term24397.getClass(), "month", (short) 11);
        setShortField(term24397, term24397.getClass(), "day", (short) 10);
        setField(term24396, term24396.getClass(), "date", term24397);
        setByteField(term24401, term24401.getClass(), "hour", (byte) 20);
        setByteField(term24401, term24401.getClass(), "minute", (byte) 8);
        setByteField(term24401, term24401.getClass(), "second", (byte) 35);
        setIntField(term24401, term24401.getClass(), "nano", 658416570);
        setField(term24396, term24396.getClass(), "time", term24401);
        setField(term24395, term24395.getClass(), "rnk_ps_lut", term24396);
        setIntField(term24407, term24407.getClass(), "year", 2018);
        setShortField(term24407, term24407.getClass(), "month", (short) 11);
        setShortField(term24407, term24407.getClass(), "day", (short) 9);
        setField(term24406, term24406.getClass(), "date", term24407);
        setByteField(term24411, term24411.getClass(), "hour", (byte) 6);
        setByteField(term24411, term24411.getClass(), "minute", (byte) 8);
        setByteField(term24411, term24411.getClass(), "second", (byte) 32);
        setIntField(term24411, term24411.getClass(), "nano", 750733310);
        setField(term24406, term24406.getClass(), "time", term24411);
        setField(term24395, term24395.getClass(), "rnk_ps_ts", term24406);
        setIntField(term24395, term24395.getClass(), "rnk_ps_dffclty", -73683645);
        setField(term24395, term24395.getClass(), "rnk_ps_pv_id", "EugWXkztim");
        setField(term24395, term24395.getClass(), "rnk_ps_edtn1", "DvRdOzzihn");
        setField(term24395, term24395.getClass(), "rnk_ps_edtn2", "wIygCdQAKO");
        setField(term24395, term24395.getClass(), "rnk_ps_edtn3", "JsXroBYqwr");
        setField(term24395, term24395.getClass(), "rnk_ps_scr1", "YciMAObLwl");
        setField(term24395, term24395.getClass(), "rnk_ps_scr2", "qAmVqwwdyf");
        setField(term24395, term24395.getClass(), "rnk_ps_scr3", "IXPaHQnEUy");
        setField(term24395, term24395.getClass(), "rnk_ps_nm1", "zhcWVVrrjs");
        setField(term24395, term24395.getClass(), "rnk_ps_nm2", "EAMaFLdmaG");
        setField(term24395, term24395.getClass(), "rnk_ps_nm3", "DYZSJMwbhX");
        setField(term24395, term24395.getClass(), "cmd", "QGcshsIIWo");
        setField(term24395, term24395.getClass(), "req_id", "dPHtrzKWgf");
        setField(term24395, term24395.getClass(), "stat", "olmFxfIVeh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iSPirUEhXs";
        callMethod(klass, "setRnk_ps_scr1", argTypes, term24395, args);
    }

};



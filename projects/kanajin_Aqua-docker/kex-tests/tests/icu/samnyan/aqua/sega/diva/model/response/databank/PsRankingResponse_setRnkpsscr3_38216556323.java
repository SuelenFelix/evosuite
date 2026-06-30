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

public class PsRankingResponse_setRnkpsscr3_38216556323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25055;

    public PsRankingResponse_setRnkpsscr3_38216556323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25055 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term25056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25071 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25057, term25057.getClass(), "year", 2011);
        setShortField(term25057, term25057.getClass(), "month", (short) 8);
        setShortField(term25057, term25057.getClass(), "day", (short) 1);
        setField(term25056, term25056.getClass(), "date", term25057);
        setByteField(term25061, term25061.getClass(), "hour", (byte) 7);
        setByteField(term25061, term25061.getClass(), "minute", (byte) 2);
        setByteField(term25061, term25061.getClass(), "second", (byte) 46);
        setIntField(term25061, term25061.getClass(), "nano", 187178462);
        setField(term25056, term25056.getClass(), "time", term25061);
        setField(term25055, term25055.getClass(), "rnk_ps_lut", term25056);
        setIntField(term25067, term25067.getClass(), "year", 2020);
        setShortField(term25067, term25067.getClass(), "month", (short) 9);
        setShortField(term25067, term25067.getClass(), "day", (short) 3);
        setField(term25066, term25066.getClass(), "date", term25067);
        setByteField(term25071, term25071.getClass(), "hour", (byte) 10);
        setByteField(term25071, term25071.getClass(), "minute", (byte) 44);
        setByteField(term25071, term25071.getClass(), "second", (byte) 5);
        setIntField(term25071, term25071.getClass(), "nano", 572560230);
        setField(term25066, term25066.getClass(), "time", term25071);
        setField(term25055, term25055.getClass(), "rnk_ps_ts", term25066);
        setIntField(term25055, term25055.getClass(), "rnk_ps_dffclty", 1193880199);
        setField(term25055, term25055.getClass(), "rnk_ps_pv_id", "ETbxNuJLii");
        setField(term25055, term25055.getClass(), "rnk_ps_edtn1", "YJhnPtWtJR");
        setField(term25055, term25055.getClass(), "rnk_ps_edtn2", "xzGnrvbExX");
        setField(term25055, term25055.getClass(), "rnk_ps_edtn3", "LFZNDELxUZ");
        setField(term25055, term25055.getClass(), "rnk_ps_scr1", "GNIVsSTglt");
        setField(term25055, term25055.getClass(), "rnk_ps_scr2", "mzPebFiUSP");
        setField(term25055, term25055.getClass(), "rnk_ps_scr3", "HvbkjsQyDy");
        setField(term25055, term25055.getClass(), "rnk_ps_nm1", "wzSukELQFL");
        setField(term25055, term25055.getClass(), "rnk_ps_nm2", "VZyeaOWYEj");
        setField(term25055, term25055.getClass(), "rnk_ps_nm3", "PErxMBQSUv");
        setField(term25055, term25055.getClass(), "cmd", "KZQwbvujui");
        setField(term25055, term25055.getClass(), "req_id", "JPUZuGxKlI");
        setField(term25055, term25055.getClass(), "stat", "xqIbVsUspl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GnjLRtJywq";
        callMethod(klass, "setRnk_ps_scr3", argTypes, term25055, args);
    }

};



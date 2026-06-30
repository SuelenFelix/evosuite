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

public class PsRankingResponse_setRnkpspvid_150491224617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23075;

    public PsRankingResponse_setRnkpspvid_150491224617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23075 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term23076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23091 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23077, term23077.getClass(), "year", 2028);
        setShortField(term23077, term23077.getClass(), "month", (short) 1);
        setShortField(term23077, term23077.getClass(), "day", (short) 18);
        setField(term23076, term23076.getClass(), "date", term23077);
        setByteField(term23081, term23081.getClass(), "hour", (byte) 12);
        setByteField(term23081, term23081.getClass(), "minute", (byte) 4);
        setByteField(term23081, term23081.getClass(), "second", (byte) 39);
        setIntField(term23081, term23081.getClass(), "nano", 651287093);
        setField(term23076, term23076.getClass(), "time", term23081);
        setField(term23075, term23075.getClass(), "rnk_ps_lut", term23076);
        setIntField(term23087, term23087.getClass(), "year", 2027);
        setShortField(term23087, term23087.getClass(), "month", (short) 7);
        setShortField(term23087, term23087.getClass(), "day", (short) 23);
        setField(term23086, term23086.getClass(), "date", term23087);
        setByteField(term23091, term23091.getClass(), "hour", (byte) 12);
        setByteField(term23091, term23091.getClass(), "minute", (byte) 6);
        setByteField(term23091, term23091.getClass(), "second", (byte) 19);
        setIntField(term23091, term23091.getClass(), "nano", 8025683);
        setField(term23086, term23086.getClass(), "time", term23091);
        setField(term23075, term23075.getClass(), "rnk_ps_ts", term23086);
        setIntField(term23075, term23075.getClass(), "rnk_ps_dffclty", -1275173084);
        setField(term23075, term23075.getClass(), "rnk_ps_pv_id", "RsOfgdMCMv");
        setField(term23075, term23075.getClass(), "rnk_ps_edtn1", "nsofCJqJOR");
        setField(term23075, term23075.getClass(), "rnk_ps_edtn2", "CitJiZwsjF");
        setField(term23075, term23075.getClass(), "rnk_ps_edtn3", "ZiyMvLArWJ");
        setField(term23075, term23075.getClass(), "rnk_ps_scr1", "MaeokjEfWD");
        setField(term23075, term23075.getClass(), "rnk_ps_scr2", "ocZcumnXEz");
        setField(term23075, term23075.getClass(), "rnk_ps_scr3", "rNNwyactDR");
        setField(term23075, term23075.getClass(), "rnk_ps_nm1", "QJrTMTdxyh");
        setField(term23075, term23075.getClass(), "rnk_ps_nm2", "rgZSPplPSs");
        setField(term23075, term23075.getClass(), "rnk_ps_nm3", "NPUSTXlEKx");
        setField(term23075, term23075.getClass(), "cmd", "KKFprGoNpl");
        setField(term23075, term23075.getClass(), "req_id", "tWVISJlxKZ");
        setField(term23075, term23075.getClass(), "stat", "rOZkUKEoaf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yLnzGqyHGL";
        callMethod(klass, "setRnk_ps_pv_id", argTypes, term23075, args);
    }

};



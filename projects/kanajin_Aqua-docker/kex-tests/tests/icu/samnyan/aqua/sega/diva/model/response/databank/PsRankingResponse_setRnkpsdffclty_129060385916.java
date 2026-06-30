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
import java.lang.Integer;

public class PsRankingResponse_setRnkpsdffclty_129060385916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22765;
     Object term22943;

    public PsRankingResponse_setRnkpsdffclty_129060385916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22765 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term22766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22781 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22767, term22767.getClass(), "year", 2016);
        setShortField(term22767, term22767.getClass(), "month", (short) 10);
        setShortField(term22767, term22767.getClass(), "day", (short) 20);
        setField(term22766, term22766.getClass(), "date", term22767);
        setByteField(term22771, term22771.getClass(), "hour", (byte) 18);
        setByteField(term22771, term22771.getClass(), "minute", (byte) 39);
        setByteField(term22771, term22771.getClass(), "second", (byte) 1);
        setIntField(term22771, term22771.getClass(), "nano", 196253988);
        setField(term22766, term22766.getClass(), "time", term22771);
        setField(term22765, term22765.getClass(), "rnk_ps_lut", term22766);
        setIntField(term22777, term22777.getClass(), "year", 2019);
        setShortField(term22777, term22777.getClass(), "month", (short) 1);
        setShortField(term22777, term22777.getClass(), "day", (short) 6);
        setField(term22776, term22776.getClass(), "date", term22777);
        setByteField(term22781, term22781.getClass(), "hour", (byte) 18);
        setByteField(term22781, term22781.getClass(), "minute", (byte) 8);
        setByteField(term22781, term22781.getClass(), "second", (byte) 46);
        setIntField(term22781, term22781.getClass(), "nano", 934136445);
        setField(term22776, term22776.getClass(), "time", term22781);
        setField(term22765, term22765.getClass(), "rnk_ps_ts", term22776);
        setIntField(term22765, term22765.getClass(), "rnk_ps_dffclty", 590364439);
        setField(term22765, term22765.getClass(), "rnk_ps_pv_id", "yBiVacDcZX");
        setField(term22765, term22765.getClass(), "rnk_ps_edtn1", "QrKfEgQeoy");
        setField(term22765, term22765.getClass(), "rnk_ps_edtn2", "oApgdbwnti");
        setField(term22765, term22765.getClass(), "rnk_ps_edtn3", "YcgHACNgyo");
        setField(term22765, term22765.getClass(), "rnk_ps_scr1", "MrUPJzBTEn");
        setField(term22765, term22765.getClass(), "rnk_ps_scr2", "IaSymdfFGa");
        setField(term22765, term22765.getClass(), "rnk_ps_scr3", "FxSvJCIpul");
        setField(term22765, term22765.getClass(), "rnk_ps_nm1", "HCjKwpexJj");
        setField(term22765, term22765.getClass(), "rnk_ps_nm2", "sCpIHVPdfl");
        setField(term22765, term22765.getClass(), "rnk_ps_nm3", "lMUBBGRjfY");
        setField(term22765, term22765.getClass(), "cmd", "olYpqbolWL");
        setField(term22765, term22765.getClass(), "req_id", "MCMCjxXzjw");
        setField(term22765, term22765.getClass(), "stat", "pZbbwCURge");
        term22943 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22943;
        callMethod(klass, "setRnk_ps_dffclty", argTypes, term22765, args);
    }

};



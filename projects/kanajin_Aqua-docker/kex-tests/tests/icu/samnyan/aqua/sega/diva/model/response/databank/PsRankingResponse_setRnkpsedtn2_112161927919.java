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

public class PsRankingResponse_setRnkpsedtn2_112161927919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23735;

    public PsRankingResponse_setRnkpsedtn2_112161927919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23735 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term23736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23741 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23751 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23737, term23737.getClass(), "year", 2028);
        setShortField(term23737, term23737.getClass(), "month", (short) 4);
        setShortField(term23737, term23737.getClass(), "day", (short) 1);
        setField(term23736, term23736.getClass(), "date", term23737);
        setByteField(term23741, term23741.getClass(), "hour", (byte) 16);
        setByteField(term23741, term23741.getClass(), "minute", (byte) 22);
        setByteField(term23741, term23741.getClass(), "second", (byte) 32);
        setIntField(term23741, term23741.getClass(), "nano", 406353763);
        setField(term23736, term23736.getClass(), "time", term23741);
        setField(term23735, term23735.getClass(), "rnk_ps_lut", term23736);
        setIntField(term23747, term23747.getClass(), "year", 2019);
        setShortField(term23747, term23747.getClass(), "month", (short) 7);
        setShortField(term23747, term23747.getClass(), "day", (short) 19);
        setField(term23746, term23746.getClass(), "date", term23747);
        setByteField(term23751, term23751.getClass(), "hour", (byte) 10);
        setByteField(term23751, term23751.getClass(), "minute", (byte) 54);
        setByteField(term23751, term23751.getClass(), "second", (byte) 55);
        setIntField(term23751, term23751.getClass(), "nano", 244650454);
        setField(term23746, term23746.getClass(), "time", term23751);
        setField(term23735, term23735.getClass(), "rnk_ps_ts", term23746);
        setIntField(term23735, term23735.getClass(), "rnk_ps_dffclty", -203030934);
        setField(term23735, term23735.getClass(), "rnk_ps_pv_id", "VJtFSexKat");
        setField(term23735, term23735.getClass(), "rnk_ps_edtn1", "xPVddlPSQR");
        setField(term23735, term23735.getClass(), "rnk_ps_edtn2", "MxrhCLTMTH");
        setField(term23735, term23735.getClass(), "rnk_ps_edtn3", "kEehLMZcOU");
        setField(term23735, term23735.getClass(), "rnk_ps_scr1", "RhLliqMiOF");
        setField(term23735, term23735.getClass(), "rnk_ps_scr2", "jlhonEGrJH");
        setField(term23735, term23735.getClass(), "rnk_ps_scr3", "RKcKwlEYZb");
        setField(term23735, term23735.getClass(), "rnk_ps_nm1", "acPRDlpsid");
        setField(term23735, term23735.getClass(), "rnk_ps_nm2", "YyojIzvxLZ");
        setField(term23735, term23735.getClass(), "rnk_ps_nm3", "fxapaYlZea");
        setField(term23735, term23735.getClass(), "cmd", "VJgREHwfRM");
        setField(term23735, term23735.getClass(), "req_id", "kXnpLIZTAr");
        setField(term23735, term23735.getClass(), "stat", "ZiMAmqpbzk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UwJtBPAtSU";
        callMethod(klass, "setRnk_ps_edtn2", argTypes, term23735, args);
    }

};



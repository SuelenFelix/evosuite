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

public class PsRankingResponse_setRnkpsedtn1_112161831818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23405;

    public PsRankingResponse_setRnkpsedtn1_112161831818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23405 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term23406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23421 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23407, term23407.getClass(), "year", 2018);
        setShortField(term23407, term23407.getClass(), "month", (short) 2);
        setShortField(term23407, term23407.getClass(), "day", (short) 14);
        setField(term23406, term23406.getClass(), "date", term23407);
        setByteField(term23411, term23411.getClass(), "hour", (byte) 2);
        setByteField(term23411, term23411.getClass(), "minute", (byte) 40);
        setByteField(term23411, term23411.getClass(), "second", (byte) 48);
        setIntField(term23411, term23411.getClass(), "nano", 371006728);
        setField(term23406, term23406.getClass(), "time", term23411);
        setField(term23405, term23405.getClass(), "rnk_ps_lut", term23406);
        setIntField(term23417, term23417.getClass(), "year", 2025);
        setShortField(term23417, term23417.getClass(), "month", (short) 8);
        setShortField(term23417, term23417.getClass(), "day", (short) 22);
        setField(term23416, term23416.getClass(), "date", term23417);
        setByteField(term23421, term23421.getClass(), "hour", (byte) 6);
        setByteField(term23421, term23421.getClass(), "minute", (byte) 48);
        setByteField(term23421, term23421.getClass(), "second", (byte) 49);
        setIntField(term23421, term23421.getClass(), "nano", 46400229);
        setField(term23416, term23416.getClass(), "time", term23421);
        setField(term23405, term23405.getClass(), "rnk_ps_ts", term23416);
        setIntField(term23405, term23405.getClass(), "rnk_ps_dffclty", -244121226);
        setField(term23405, term23405.getClass(), "rnk_ps_pv_id", "IjprPXBDuY");
        setField(term23405, term23405.getClass(), "rnk_ps_edtn1", "wkqPmmFDAa");
        setField(term23405, term23405.getClass(), "rnk_ps_edtn2", "rLTDtNqLyW");
        setField(term23405, term23405.getClass(), "rnk_ps_edtn3", "CLsbWobdgS");
        setField(term23405, term23405.getClass(), "rnk_ps_scr1", "TbYrjEyFPc");
        setField(term23405, term23405.getClass(), "rnk_ps_scr2", "muefchpJiZ");
        setField(term23405, term23405.getClass(), "rnk_ps_scr3", "tuYaAqvYrh");
        setField(term23405, term23405.getClass(), "rnk_ps_nm1", "CIbhheukbR");
        setField(term23405, term23405.getClass(), "rnk_ps_nm2", "VOHPpErtan");
        setField(term23405, term23405.getClass(), "rnk_ps_nm3", "GDMUlolTNs");
        setField(term23405, term23405.getClass(), "cmd", "xpLvWisjzN");
        setField(term23405, term23405.getClass(), "req_id", "IKfozyyKEj");
        setField(term23405, term23405.getClass(), "stat", "thCjwQjRBL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ojLrjltndD";
        callMethod(klass, "setRnk_ps_edtn1", argTypes, term23405, args);
    }

};



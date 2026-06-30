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

public class PsRankingResponse_getRnkpsscr2_2791137869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20589;

    public PsRankingResponse_getRnkpsscr2_2791137869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20589 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term20590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20605 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20591, term20591.getClass(), "year", 2027);
        setShortField(term20591, term20591.getClass(), "month", (short) 8);
        setShortField(term20591, term20591.getClass(), "day", (short) 23);
        setField(term20590, term20590.getClass(), "date", term20591);
        setByteField(term20595, term20595.getClass(), "hour", (byte) 15);
        setByteField(term20595, term20595.getClass(), "minute", (byte) 12);
        setByteField(term20595, term20595.getClass(), "second", (byte) 6);
        setIntField(term20595, term20595.getClass(), "nano", 541218258);
        setField(term20590, term20590.getClass(), "time", term20595);
        setField(term20589, term20589.getClass(), "rnk_ps_lut", term20590);
        setIntField(term20601, term20601.getClass(), "year", 2013);
        setShortField(term20601, term20601.getClass(), "month", (short) 5);
        setShortField(term20601, term20601.getClass(), "day", (short) 26);
        setField(term20600, term20600.getClass(), "date", term20601);
        setByteField(term20605, term20605.getClass(), "hour", (byte) 4);
        setByteField(term20605, term20605.getClass(), "minute", (byte) 39);
        setByteField(term20605, term20605.getClass(), "second", (byte) 5);
        setIntField(term20605, term20605.getClass(), "nano", 392869354);
        setField(term20600, term20600.getClass(), "time", term20605);
        setField(term20589, term20589.getClass(), "rnk_ps_ts", term20600);
        setIntField(term20589, term20589.getClass(), "rnk_ps_dffclty", 1048535127);
        setField(term20589, term20589.getClass(), "rnk_ps_pv_id", "eKcEJRxNSu");
        setField(term20589, term20589.getClass(), "rnk_ps_edtn1", "NTXQPWFYSA");
        setField(term20589, term20589.getClass(), "rnk_ps_edtn2", "fOuOhBpldm");
        setField(term20589, term20589.getClass(), "rnk_ps_edtn3", "qQQRKGPyIM");
        setField(term20589, term20589.getClass(), "rnk_ps_scr1", "lzcwhvjdFg");
        setField(term20589, term20589.getClass(), "rnk_ps_scr2", "dfzWTjcjnI");
        setField(term20589, term20589.getClass(), "rnk_ps_scr3", "bsnZXGEvFv");
        setField(term20589, term20589.getClass(), "rnk_ps_nm1", "osFrHWYeRy");
        setField(term20589, term20589.getClass(), "rnk_ps_nm2", "scpIQUfPKw");
        setField(term20589, term20589.getClass(), "rnk_ps_nm3", "QKYBpCjuYt");
        setField(term20589, term20589.getClass(), "cmd", "vjiRfoGdkl");
        setField(term20589, term20589.getClass(), "req_id", "TwaxeSHvnR");
        setField(term20589, term20589.getClass(), "stat", "paPzDETzIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_scr2", argTypes, term20589, args);
    }

};



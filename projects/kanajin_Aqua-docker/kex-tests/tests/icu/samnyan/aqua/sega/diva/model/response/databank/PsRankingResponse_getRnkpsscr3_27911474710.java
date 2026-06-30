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

public class PsRankingResponse_getRnkpsscr3_27911474710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20897;

    public PsRankingResponse_getRnkpsscr3_27911474710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20897 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term20898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20913 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20899, term20899.getClass(), "year", 2012);
        setShortField(term20899, term20899.getClass(), "month", (short) 4);
        setShortField(term20899, term20899.getClass(), "day", (short) 25);
        setField(term20898, term20898.getClass(), "date", term20899);
        setByteField(term20903, term20903.getClass(), "hour", (byte) 21);
        setByteField(term20903, term20903.getClass(), "minute", (byte) 14);
        setByteField(term20903, term20903.getClass(), "second", (byte) 15);
        setIntField(term20903, term20903.getClass(), "nano", 561700934);
        setField(term20898, term20898.getClass(), "time", term20903);
        setField(term20897, term20897.getClass(), "rnk_ps_lut", term20898);
        setIntField(term20909, term20909.getClass(), "year", 2011);
        setShortField(term20909, term20909.getClass(), "month", (short) 10);
        setShortField(term20909, term20909.getClass(), "day", (short) 25);
        setField(term20908, term20908.getClass(), "date", term20909);
        setByteField(term20913, term20913.getClass(), "hour", (byte) 10);
        setByteField(term20913, term20913.getClass(), "minute", (byte) 33);
        setByteField(term20913, term20913.getClass(), "second", (byte) 8);
        setIntField(term20913, term20913.getClass(), "nano", 268304014);
        setField(term20908, term20908.getClass(), "time", term20913);
        setField(term20897, term20897.getClass(), "rnk_ps_ts", term20908);
        setIntField(term20897, term20897.getClass(), "rnk_ps_dffclty", -655067527);
        setField(term20897, term20897.getClass(), "rnk_ps_pv_id", "fufeuGfwpN");
        setField(term20897, term20897.getClass(), "rnk_ps_edtn1", "XJbkXbljvz");
        setField(term20897, term20897.getClass(), "rnk_ps_edtn2", "fuvdkDwBeH");
        setField(term20897, term20897.getClass(), "rnk_ps_edtn3", "NTefzwLPhx");
        setField(term20897, term20897.getClass(), "rnk_ps_scr1", "dirFuhqyNu");
        setField(term20897, term20897.getClass(), "rnk_ps_scr2", "YVLRenzuoR");
        setField(term20897, term20897.getClass(), "rnk_ps_scr3", "JukEMhPWql");
        setField(term20897, term20897.getClass(), "rnk_ps_nm1", "ZdNcodHERG");
        setField(term20897, term20897.getClass(), "rnk_ps_nm2", "CLHomjAqIM");
        setField(term20897, term20897.getClass(), "rnk_ps_nm3", "mzCFLzFuSj");
        setField(term20897, term20897.getClass(), "cmd", "WQnMpDlSfA");
        setField(term20897, term20897.getClass(), "req_id", "aOIvTQtXiv");
        setField(term20897, term20897.getClass(), "stat", "IyjDiknqhA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_scr3", argTypes, term20897, args);
    }

};



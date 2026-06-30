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

public class PsRankingResponse_init_14737478340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17853;
     Object term17863;
     Object term17873;

    public PsRankingResponse_init_14737478340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17858 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17854, term17854.getClass(), "year", 2021);
        setShortField(term17854, term17854.getClass(), "month", (short) 8);
        setShortField(term17854, term17854.getClass(), "day", (short) 12);
        setField(term17853, term17853.getClass(), "date", term17854);
        setByteField(term17858, term17858.getClass(), "hour", (byte) 2);
        setByteField(term17858, term17858.getClass(), "minute", (byte) 17);
        setByteField(term17858, term17858.getClass(), "second", (byte) 51);
        setIntField(term17858, term17858.getClass(), "nano", 207375141);
        setField(term17853, term17853.getClass(), "time", term17858);
        term17863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17868 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17864, term17864.getClass(), "year", 2025);
        setShortField(term17864, term17864.getClass(), "month", (short) 11);
        setShortField(term17864, term17864.getClass(), "day", (short) 3);
        setField(term17863, term17863.getClass(), "date", term17864);
        setByteField(term17868, term17868.getClass(), "hour", (byte) 21);
        setByteField(term17868, term17868.getClass(), "minute", (byte) 24);
        setByteField(term17868, term17868.getClass(), "second", (byte) 23);
        setIntField(term17868, term17868.getClass(), "nano", 210986721);
        setField(term17863, term17863.getClass(), "time", term17868);
        term17873 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        Object[] args = new Object[16];
        args[0] = "eWnrMSbYbT";
        args[1] = "AjoFvDFyCY";
        args[2] = "OFTJwdPiTG";
        args[3] = term17853;
        args[4] = term17863;
        args[5] = term17873;
        args[6] = "QiUprSEluR";
        args[7] = "cDOXXottZh";
        args[8] = "rfqJDkDppz";
        args[9] = "MGorMVGauT";
        args[10] = "jXKxUGTuEF";
        args[11] = "nDCcyhiTnS";
        args[12] = "Bcivwcjece";
        args[13] = "QTefjRuiez";
        args[14] = "SQZVNkAVBB";
        args[15] = "mrSAYJlddZ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



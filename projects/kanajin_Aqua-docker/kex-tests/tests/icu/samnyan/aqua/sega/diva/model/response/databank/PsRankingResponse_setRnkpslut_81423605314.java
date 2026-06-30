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

public class PsRankingResponse_setRnkpslut_81423605314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22129;
     Object term22307;

    public PsRankingResponse_setRnkpslut_81423605314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22129 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term22130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22145 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22131, term22131.getClass(), "year", 2022);
        setShortField(term22131, term22131.getClass(), "month", (short) 6);
        setShortField(term22131, term22131.getClass(), "day", (short) 20);
        setField(term22130, term22130.getClass(), "date", term22131);
        setByteField(term22135, term22135.getClass(), "hour", (byte) 7);
        setByteField(term22135, term22135.getClass(), "minute", (byte) 57);
        setByteField(term22135, term22135.getClass(), "second", (byte) 37);
        setIntField(term22135, term22135.getClass(), "nano", 90374877);
        setField(term22130, term22130.getClass(), "time", term22135);
        setField(term22129, term22129.getClass(), "rnk_ps_lut", term22130);
        setIntField(term22141, term22141.getClass(), "year", 2023);
        setShortField(term22141, term22141.getClass(), "month", (short) 2);
        setShortField(term22141, term22141.getClass(), "day", (short) 16);
        setField(term22140, term22140.getClass(), "date", term22141);
        setByteField(term22145, term22145.getClass(), "hour", (byte) 3);
        setByteField(term22145, term22145.getClass(), "minute", (byte) 18);
        setByteField(term22145, term22145.getClass(), "second", (byte) 56);
        setIntField(term22145, term22145.getClass(), "nano", 733017887);
        setField(term22140, term22140.getClass(), "time", term22145);
        setField(term22129, term22129.getClass(), "rnk_ps_ts", term22140);
        setIntField(term22129, term22129.getClass(), "rnk_ps_dffclty", -1007160944);
        setField(term22129, term22129.getClass(), "rnk_ps_pv_id", "duOyJsARTD");
        setField(term22129, term22129.getClass(), "rnk_ps_edtn1", "xPnOHsNlyc");
        setField(term22129, term22129.getClass(), "rnk_ps_edtn2", "OTSPWPJefj");
        setField(term22129, term22129.getClass(), "rnk_ps_edtn3", "EOTYMqXRmE");
        setField(term22129, term22129.getClass(), "rnk_ps_scr1", "iTxNduwSjE");
        setField(term22129, term22129.getClass(), "rnk_ps_scr2", "MQUTfIiFnh");
        setField(term22129, term22129.getClass(), "rnk_ps_scr3", "JeyKRznnft");
        setField(term22129, term22129.getClass(), "rnk_ps_nm1", "vQJUCtuYpK");
        setField(term22129, term22129.getClass(), "rnk_ps_nm2", "GHtOeztAdz");
        setField(term22129, term22129.getClass(), "rnk_ps_nm3", "gSAtqakaLY");
        setField(term22129, term22129.getClass(), "cmd", "taPBiMFNEZ");
        setField(term22129, term22129.getClass(), "req_id", "NoAFAfGyYL");
        setField(term22129, term22129.getClass(), "stat", "MFtfkBMyOD");
        term22307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22312 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22308, term22308.getClass(), "year", 2025);
        setShortField(term22308, term22308.getClass(), "month", (short) 3);
        setShortField(term22308, term22308.getClass(), "day", (short) 28);
        setField(term22307, term22307.getClass(), "date", term22308);
        setByteField(term22312, term22312.getClass(), "hour", (byte) 19);
        setByteField(term22312, term22312.getClass(), "minute", (byte) 56);
        setByteField(term22312, term22312.getClass(), "second", (byte) 52);
        setIntField(term22312, term22312.getClass(), "nano", 738558930);
        setField(term22307, term22307.getClass(), "time", term22312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22307;
        callMethod(klass, "setRnk_ps_lut", argTypes, term22129, args);
    }

};



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

public class PsRankingResponse_setRnkpsnm1_175527703224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25385;

    public PsRankingResponse_setRnkpsnm1_175527703224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25385 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term25386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25401 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25387, term25387.getClass(), "year", 2020);
        setShortField(term25387, term25387.getClass(), "month", (short) 8);
        setShortField(term25387, term25387.getClass(), "day", (short) 16);
        setField(term25386, term25386.getClass(), "date", term25387);
        setByteField(term25391, term25391.getClass(), "hour", (byte) 4);
        setByteField(term25391, term25391.getClass(), "minute", (byte) 37);
        setByteField(term25391, term25391.getClass(), "second", (byte) 19);
        setIntField(term25391, term25391.getClass(), "nano", 605410923);
        setField(term25386, term25386.getClass(), "time", term25391);
        setField(term25385, term25385.getClass(), "rnk_ps_lut", term25386);
        setIntField(term25397, term25397.getClass(), "year", 2028);
        setShortField(term25397, term25397.getClass(), "month", (short) 5);
        setShortField(term25397, term25397.getClass(), "day", (short) 2);
        setField(term25396, term25396.getClass(), "date", term25397);
        setByteField(term25401, term25401.getClass(), "hour", (byte) 2);
        setByteField(term25401, term25401.getClass(), "minute", (byte) 59);
        setByteField(term25401, term25401.getClass(), "second", (byte) 30);
        setIntField(term25401, term25401.getClass(), "nano", 222274238);
        setField(term25396, term25396.getClass(), "time", term25401);
        setField(term25385, term25385.getClass(), "rnk_ps_ts", term25396);
        setIntField(term25385, term25385.getClass(), "rnk_ps_dffclty", -1087774327);
        setField(term25385, term25385.getClass(), "rnk_ps_pv_id", "TDaodpHTRK");
        setField(term25385, term25385.getClass(), "rnk_ps_edtn1", "JayazbYDLK");
        setField(term25385, term25385.getClass(), "rnk_ps_edtn2", "ORDuSTrpNA");
        setField(term25385, term25385.getClass(), "rnk_ps_edtn3", "hysThIPoEJ");
        setField(term25385, term25385.getClass(), "rnk_ps_scr1", "dfZepHfGwh");
        setField(term25385, term25385.getClass(), "rnk_ps_scr2", "zjfMxUERFZ");
        setField(term25385, term25385.getClass(), "rnk_ps_scr3", "ooVlhmiOff");
        setField(term25385, term25385.getClass(), "rnk_ps_nm1", "dUNzDLXJcj");
        setField(term25385, term25385.getClass(), "rnk_ps_nm2", "OrVSjRJVwa");
        setField(term25385, term25385.getClass(), "rnk_ps_nm3", "cdZEcINJAM");
        setField(term25385, term25385.getClass(), "cmd", "qumYSwcWHz");
        setField(term25385, term25385.getClass(), "req_id", "raNzcEorkV");
        setField(term25385, term25385.getClass(), "stat", "nEgozCeoUr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EWGMzlcOnW";
        callMethod(klass, "setRnk_ps_nm1", argTypes, term25385, args);
    }

};



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

public class PsRankingResponse_getRnkpsedtn1_1272774945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19357;

    public PsRankingResponse_getRnkpsedtn1_1272774945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19357 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term19358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19373 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19359, term19359.getClass(), "year", 2023);
        setShortField(term19359, term19359.getClass(), "month", (short) 7);
        setShortField(term19359, term19359.getClass(), "day", (short) 16);
        setField(term19358, term19358.getClass(), "date", term19359);
        setByteField(term19363, term19363.getClass(), "hour", (byte) 3);
        setByteField(term19363, term19363.getClass(), "minute", (byte) 1);
        setByteField(term19363, term19363.getClass(), "second", (byte) 19);
        setIntField(term19363, term19363.getClass(), "nano", 488629554);
        setField(term19358, term19358.getClass(), "time", term19363);
        setField(term19357, term19357.getClass(), "rnk_ps_lut", term19358);
        setIntField(term19369, term19369.getClass(), "year", 2018);
        setShortField(term19369, term19369.getClass(), "month", (short) 7);
        setShortField(term19369, term19369.getClass(), "day", (short) 12);
        setField(term19368, term19368.getClass(), "date", term19369);
        setByteField(term19373, term19373.getClass(), "hour", (byte) 1);
        setByteField(term19373, term19373.getClass(), "minute", (byte) 3);
        setByteField(term19373, term19373.getClass(), "second", (byte) 47);
        setIntField(term19373, term19373.getClass(), "nano", 2729929);
        setField(term19368, term19368.getClass(), "time", term19373);
        setField(term19357, term19357.getClass(), "rnk_ps_ts", term19368);
        setIntField(term19357, term19357.getClass(), "rnk_ps_dffclty", 597278769);
        setField(term19357, term19357.getClass(), "rnk_ps_pv_id", "vYYOYhWMWZ");
        setField(term19357, term19357.getClass(), "rnk_ps_edtn1", "FLQJOzEXff");
        setField(term19357, term19357.getClass(), "rnk_ps_edtn2", "qlaIVJBSfQ");
        setField(term19357, term19357.getClass(), "rnk_ps_edtn3", "lYvIWBFFsq");
        setField(term19357, term19357.getClass(), "rnk_ps_scr1", "tThwsqWKcE");
        setField(term19357, term19357.getClass(), "rnk_ps_scr2", "bkSgsDrkCN");
        setField(term19357, term19357.getClass(), "rnk_ps_scr3", "hwjlcimgJH");
        setField(term19357, term19357.getClass(), "rnk_ps_nm1", "TLxQzxvizR");
        setField(term19357, term19357.getClass(), "rnk_ps_nm2", "uUgJfKAzDM");
        setField(term19357, term19357.getClass(), "rnk_ps_nm3", "gZPZNkweEp");
        setField(term19357, term19357.getClass(), "cmd", "vfennwtmqe");
        setField(term19357, term19357.getClass(), "req_id", "zZxoNkohbw");
        setField(term19357, term19357.getClass(), "stat", "DQrjPcLysX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_edtn1", argTypes, term19357, args);
    }

};



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

public class BannerDataResponse_getBdhs_925014453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;

    public BannerDataResponse_getBdhs_925014453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term373 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term369, term369.getClass(), "year", 2015);
        setShortField(term369, term369.getClass(), "month", (short) 4);
        setShortField(term369, term369.getClass(), "day", (short) 14);
        setField(term368, term368.getClass(), "date", term369);
        setByteField(term373, term373.getClass(), "hour", (byte) 18);
        setByteField(term373, term373.getClass(), "minute", (byte) 24);
        setByteField(term373, term373.getClass(), "second", (byte) 32);
        setIntField(term373, term373.getClass(), "nano", 369233818);
        setField(term368, term368.getClass(), "time", term373);
        setField(term367, term367.getClass(), "bd_ut", term368);
        setField(term367, term367.getClass(), "bd_ti", "aJlieCFVtF");
        setField(term367, term367.getClass(), "bd_hs", "ZiaGIbnzTs");
        setIntField(term367, term367.getClass(), "bd_id", 391863371);
        setField(term367, term367.getClass(), "cmd", "tbcdzjIfER");
        setField(term367, term367.getClass(), "req_id", "HyxfbSQYBe");
        setField(term367, term367.getClass(), "stat", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBd_hs", argTypes, term367, args);
    }

};



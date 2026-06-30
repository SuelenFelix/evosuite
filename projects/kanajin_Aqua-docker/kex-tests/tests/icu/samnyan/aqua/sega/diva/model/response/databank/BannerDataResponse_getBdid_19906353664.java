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

public class BannerDataResponse_getBdid_19906353664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;

    public BannerDataResponse_getBdid_19906353664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term490 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term495 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term491, term491.getClass(), "year", 2022);
        setShortField(term491, term491.getClass(), "month", (short) 2);
        setShortField(term491, term491.getClass(), "day", (short) 26);
        setField(term490, term490.getClass(), "date", term491);
        setByteField(term495, term495.getClass(), "hour", (byte) 11);
        setByteField(term495, term495.getClass(), "minute", (byte) 42);
        setByteField(term495, term495.getClass(), "second", (byte) 15);
        setIntField(term495, term495.getClass(), "nano", 377731937);
        setField(term490, term490.getClass(), "time", term495);
        setField(term489, term489.getClass(), "bd_ut", term490);
        setField(term489, term489.getClass(), "bd_ti", "hNxWaHcfhY");
        setField(term489, term489.getClass(), "bd_hs", "RkybSrpybU");
        setIntField(term489, term489.getClass(), "bd_id", -1922583790);
        setField(term489, term489.getClass(), "cmd", "xOEqzGAmDU");
        setField(term489, term489.getClass(), "req_id", "eZFUvlxvGV");
        setField(term489, term489.getClass(), "stat", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBd_id", argTypes, term489, args);
    }

};



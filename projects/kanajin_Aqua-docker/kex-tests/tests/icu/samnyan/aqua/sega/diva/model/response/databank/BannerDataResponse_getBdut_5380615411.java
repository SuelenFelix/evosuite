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

public class BannerDataResponse_getBdut_5380615411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;

    public BannerDataResponse_getBdut_5380615411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term125, term125.getClass(), "year", 2021);
        setShortField(term125, term125.getClass(), "month", (short) 1);
        setShortField(term125, term125.getClass(), "day", (short) 18);
        setField(term124, term124.getClass(), "date", term125);
        setByteField(term129, term129.getClass(), "hour", (byte) 13);
        setByteField(term129, term129.getClass(), "minute", (byte) 38);
        setByteField(term129, term129.getClass(), "second", (byte) 26);
        setIntField(term129, term129.getClass(), "nano", 544608644);
        setField(term124, term124.getClass(), "time", term129);
        setField(term123, term123.getClass(), "bd_ut", term124);
        setField(term123, term123.getClass(), "bd_ti", "EGtDIRbSSb");
        setField(term123, term123.getClass(), "bd_hs", "SzjVpOQTyS");
        setIntField(term123, term123.getClass(), "bd_id", 1162663216);
        setField(term123, term123.getClass(), "cmd", "MjGYSRKTNF");
        setField(term123, term123.getClass(), "req_id", "hRNSzYYIrc");
        setField(term123, term123.getClass(), "stat", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBd_ut", argTypes, term123, args);
    }

};



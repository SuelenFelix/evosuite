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

public class BannerDataResponse_setBdhs_5161698617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public BannerDataResponse_setBdhs_5161698617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term893 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term889, term889.getClass(), "year", 2029);
        setShortField(term889, term889.getClass(), "month", (short) 8);
        setShortField(term889, term889.getClass(), "day", (short) 29);
        setField(term888, term888.getClass(), "date", term889);
        setByteField(term893, term893.getClass(), "hour", (byte) 15);
        setByteField(term893, term893.getClass(), "minute", (byte) 50);
        setByteField(term893, term893.getClass(), "second", (byte) 1);
        setIntField(term893, term893.getClass(), "nano", 277971904);
        setField(term888, term888.getClass(), "time", term893);
        setField(term887, term887.getClass(), "bd_ut", term888);
        setField(term887, term887.getClass(), "bd_ti", "xrwlQZdwCp");
        setField(term887, term887.getClass(), "bd_hs", "IDCWpPLRkE");
        setIntField(term887, term887.getClass(), "bd_id", -2038273078);
        setField(term887, term887.getClass(), "cmd", "nyiiPDVjAc");
        setField(term887, term887.getClass(), "req_id", "aKnKipADSo");
        setField(term887, term887.getClass(), "stat", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setBd_hs", argTypes, term887, args);
    }

};



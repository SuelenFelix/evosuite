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

public class BannerDataResponse_setBdid_3638994408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031;
     Object term1103;

    public BannerDataResponse_setBdid_3638994408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1031 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term1032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1037 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1033, term1033.getClass(), "year", 2022);
        setShortField(term1033, term1033.getClass(), "month", (short) 11);
        setShortField(term1033, term1033.getClass(), "day", (short) 16);
        setField(term1032, term1032.getClass(), "date", term1033);
        setByteField(term1037, term1037.getClass(), "hour", (byte) 15);
        setByteField(term1037, term1037.getClass(), "minute", (byte) 54);
        setByteField(term1037, term1037.getClass(), "second", (byte) 2);
        setIntField(term1037, term1037.getClass(), "nano", 733274103);
        setField(term1032, term1032.getClass(), "time", term1037);
        setField(term1031, term1031.getClass(), "bd_ut", term1032);
        setField(term1031, term1031.getClass(), "bd_ti", "gGSMzuGICf");
        setField(term1031, term1031.getClass(), "bd_hs", "hxCBltsObl");
        setIntField(term1031, term1031.getClass(), "bd_id", 1227103734);
        setField(term1031, term1031.getClass(), "cmd", "BndsHwAFMv");
        setField(term1031, term1031.getClass(), "req_id", "GzFkzHGYFt");
        setField(term1031, term1031.getClass(), "stat", "tShwQLRGNe");
        term1103 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1103;
        callMethod(klass, "setBd_id", argTypes, term1031, args);
    }

};



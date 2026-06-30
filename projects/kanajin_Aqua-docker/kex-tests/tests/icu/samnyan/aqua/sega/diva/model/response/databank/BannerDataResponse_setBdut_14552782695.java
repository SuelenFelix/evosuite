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

public class BannerDataResponse_setBdut_14552782695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;
     Object term683;

    public BannerDataResponse_setBdut_14552782695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term617 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term613, term613.getClass(), "year", 2026);
        setShortField(term613, term613.getClass(), "month", (short) 12);
        setShortField(term613, term613.getClass(), "day", (short) 14);
        setField(term612, term612.getClass(), "date", term613);
        setByteField(term617, term617.getClass(), "hour", (byte) 16);
        setByteField(term617, term617.getClass(), "minute", (byte) 34);
        setByteField(term617, term617.getClass(), "second", (byte) 9);
        setIntField(term617, term617.getClass(), "nano", 518326996);
        setField(term612, term612.getClass(), "time", term617);
        setField(term611, term611.getClass(), "bd_ut", term612);
        setField(term611, term611.getClass(), "bd_ti", "vrQLuWIDJX");
        setField(term611, term611.getClass(), "bd_hs", "flxyYxBRtu");
        setIntField(term611, term611.getClass(), "bd_id", -616727354);
        setField(term611, term611.getClass(), "cmd", "OclPbYPkcH");
        setField(term611, term611.getClass(), "req_id", "IoAlmYsBwc");
        setField(term611, term611.getClass(), "stat", "TEParAifyi");
        term683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term688 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term684, term684.getClass(), "year", 2025);
        setShortField(term684, term684.getClass(), "month", (short) 4);
        setShortField(term684, term684.getClass(), "day", (short) 24);
        setField(term683, term683.getClass(), "date", term684);
        setByteField(term688, term688.getClass(), "hour", (byte) 18);
        setByteField(term688, term688.getClass(), "minute", (byte) 11);
        setByteField(term688, term688.getClass(), "second", (byte) 40);
        setIntField(term688, term688.getClass(), "nano", 137454929);
        setField(term683, term683.getClass(), "time", term688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term683;
        callMethod(klass, "setBd_ut", argTypes, term611, args);
    }

};



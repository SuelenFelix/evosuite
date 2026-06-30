package icu.samnyan.aqua.api.controller.sega.manage;

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
import static icu.samnyan.aqua.api.controller.sega.manage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ApiDivaManageController_savePv_17928342263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object enum0;

    public ApiDivaManageController_savePv_17928342263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term149 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term145, term145.getClass(), "PVID", -602026508);
        setIntField(term145, term145.getClass(), "Version", -157887805);
        setIntField(term145, term145.getClass(), "Edition", 1876565163);
        setIntField(term151, term151.getClass(), "year", 2025);
        setShortField(term151, term151.getClass(), "month", (short) 11);
        setShortField(term151, term151.getClass(), "day", (short) 3);
        setField(term150, term150.getClass(), "date", term151);
        setByteField(term155, term155.getClass(), "hour", (byte) 21);
        setByteField(term155, term155.getClass(), "minute", (byte) 24);
        setByteField(term155, term155.getClass(), "second", (byte) 23);
        setIntField(term155, term155.getClass(), "nano", 210986721);
        setField(term150, term150.getClass(), "time", term155);
        setField(term149, term149.getClass(), "Start", term150);
        setIntField(term161, term161.getClass(), "year", 2016);
        setShortField(term161, term161.getClass(), "month", (short) 6);
        setShortField(term161, term161.getClass(), "day", (short) 15);
        setField(term160, term160.getClass(), "date", term161);
        setByteField(term165, term165.getClass(), "hour", (byte) 21);
        setByteField(term165, term165.getClass(), "minute", (byte) 23);
        setByteField(term165, term165.getClass(), "second", (byte) 23);
        setIntField(term165, term165.getClass(), "nano", 433372070);
        setField(term160, term160.getClass(), "time", term165);
        setField(term149, term149.getClass(), "End", term160);
        setField(term145, term145.getClass(), "AdvDemo", term149);
        setIntField(term172, term172.getClass(), "year", 2012);
        setShortField(term172, term172.getClass(), "month", (short) 8);
        setShortField(term172, term172.getClass(), "day", (short) 25);
        setField(term171, term171.getClass(), "date", term172);
        setByteField(term176, term176.getClass(), "hour", (byte) 19);
        setByteField(term176, term176.getClass(), "minute", (byte) 49);
        setByteField(term176, term176.getClass(), "second", (byte) 8);
        setIntField(term176, term176.getClass(), "nano", 912685024);
        setField(term171, term171.getClass(), "time", term176);
        setField(term170, term170.getClass(), "Start", term171);
        setIntField(term182, term182.getClass(), "year", 2012);
        setShortField(term182, term182.getClass(), "month", (short) 3);
        setShortField(term182, term182.getClass(), "day", (short) 27);
        setField(term181, term181.getClass(), "date", term182);
        setByteField(term186, term186.getClass(), "hour", (byte) 17);
        setByteField(term186, term186.getClass(), "minute", (byte) 49);
        setByteField(term186, term186.getClass(), "second", (byte) 24);
        setIntField(term186, term186.getClass(), "nano", 530647398);
        setField(term181, term181.getClass(), "time", term186);
        setField(term170, term170.getClass(), "End", term181);
        setField(term145, term145.getClass(), "Playable", term170);
        Class<? extends Object> term258 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term257 = ((Class) term258).getDeclaredField((String) "NORMAL");
        ((Field) term257).setAccessible(true);
        enum0 = ((Field) term257).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.manage.ApiDivaManageController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[2];
        args[0] = term145;
        args[1] = enum0;
        callMethod(klass, "savePv", argTypes, null, args);
    }

};



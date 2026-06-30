package icu.samnyan.aqua.sega.diva.model.response.boot;

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
import static icu.samnyan.aqua.sega.diva.model.response.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendResponse_setAtndprm2_20611853526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;

    public AttendResponse_setAtndprm2_20611853526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term922 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term880, term880.getClass(), "atnd_prm1", "IDCWpPLRkE");
        setField(term880, term880.getClass(), "atnd_prm2", "nyiiPDVjAc");
        setField(term880, term880.getClass(), "atnd_prm3", "aKnKipADSo");
        setIntField(term918, term918.getClass(), "year", 2025);
        setShortField(term918, term918.getClass(), "month", (short) 4);
        setShortField(term918, term918.getClass(), "day", (short) 24);
        setField(term917, term917.getClass(), "date", term918);
        setByteField(term922, term922.getClass(), "hour", (byte) 18);
        setByteField(term922, term922.getClass(), "minute", (byte) 11);
        setByteField(term922, term922.getClass(), "second", (byte) 40);
        setIntField(term922, term922.getClass(), "nano", 137454929);
        setField(term917, term917.getClass(), "time", term922);
        setField(term880, term880.getClass(), "atnd_lut", term917);
        setField(term880, term880.getClass(), "cmd", "wSQxaModmm");
        setField(term880, term880.getClass(), "req_id", "UlajhuVLaP");
        setField(term880, term880.getClass(), "stat", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setAtnd_prm2", argTypes, term880, args);
    }

};



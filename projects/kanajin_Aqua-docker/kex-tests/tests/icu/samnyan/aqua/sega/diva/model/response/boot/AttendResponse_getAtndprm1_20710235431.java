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

public class AttendResponse_getAtndprm1_20710235431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public AttendResponse_getAtndprm1_20710235431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term143, term143.getClass(), "atnd_prm1", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "atnd_prm2", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "atnd_prm3", "hRNSzYYIrc");
        setIntField(term181, term181.getClass(), "year", 2021);
        setShortField(term181, term181.getClass(), "month", (short) 1);
        setShortField(term181, term181.getClass(), "day", (short) 18);
        setField(term180, term180.getClass(), "date", term181);
        setByteField(term185, term185.getClass(), "hour", (byte) 13);
        setByteField(term185, term185.getClass(), "minute", (byte) 38);
        setByteField(term185, term185.getClass(), "second", (byte) 26);
        setIntField(term185, term185.getClass(), "nano", 544608644);
        setField(term180, term180.getClass(), "time", term185);
        setField(term143, term143.getClass(), "atnd_lut", term180);
        setField(term143, term143.getClass(), "cmd", "RMFIsYGgne");
        setField(term143, term143.getClass(), "req_id", "NRdvgJlhkX");
        setField(term143, term143.getClass(), "stat", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_prm1", argTypes, term143, args);
    }

};



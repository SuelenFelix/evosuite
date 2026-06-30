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

public class AttendResponse_setAtndlut_5238570488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1210;
     Object term1293;

    public AttendResponse_setAtndlut_5238570488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1210 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term1247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1252 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1210, term1210.getClass(), "atnd_prm1", "UiUYnPrcCi");
        setField(term1210, term1210.getClass(), "atnd_prm2", "UoYtihxVaS");
        setField(term1210, term1210.getClass(), "atnd_prm3", "JDswTTCZHV");
        setIntField(term1248, term1248.getClass(), "year", 2029);
        setShortField(term1248, term1248.getClass(), "month", (short) 8);
        setShortField(term1248, term1248.getClass(), "day", (short) 29);
        setField(term1247, term1247.getClass(), "date", term1248);
        setByteField(term1252, term1252.getClass(), "hour", (byte) 15);
        setByteField(term1252, term1252.getClass(), "minute", (byte) 50);
        setByteField(term1252, term1252.getClass(), "second", (byte) 1);
        setIntField(term1252, term1252.getClass(), "nano", 277971904);
        setField(term1247, term1247.getClass(), "time", term1252);
        setField(term1210, term1210.getClass(), "atnd_lut", term1247);
        setField(term1210, term1210.getClass(), "cmd", "onpbIeEKoi");
        setField(term1210, term1210.getClass(), "req_id", "YRHGsAkhxb");
        setField(term1210, term1210.getClass(), "stat", "ffYhPOzlUs");
        term1293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1298 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1294, term1294.getClass(), "year", 2022);
        setShortField(term1294, term1294.getClass(), "month", (short) 11);
        setShortField(term1294, term1294.getClass(), "day", (short) 16);
        setField(term1293, term1293.getClass(), "date", term1294);
        setByteField(term1298, term1298.getClass(), "hour", (byte) 15);
        setByteField(term1298, term1298.getClass(), "minute", (byte) 54);
        setByteField(term1298, term1298.getClass(), "second", (byte) 2);
        setIntField(term1298, term1298.getClass(), "nano", 733274103);
        setField(term1293, term1293.getClass(), "time", term1298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1293;
        callMethod(klass, "setAtnd_lut", argTypes, term1210, args);
    }

};



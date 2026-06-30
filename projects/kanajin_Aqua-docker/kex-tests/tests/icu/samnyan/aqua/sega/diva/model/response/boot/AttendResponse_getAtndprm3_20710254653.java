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

public class AttendResponse_getAtndprm3_20710254653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;

    public AttendResponse_getAtndprm3_20710254653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term466 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term471 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term429, term429.getClass(), "atnd_prm1", "HyxfbSQYBe");
        setField(term429, term429.getClass(), "atnd_prm2", "pCTimMblYc");
        setField(term429, term429.getClass(), "atnd_prm3", "hNxWaHcfhY");
        setIntField(term467, term467.getClass(), "year", 2015);
        setShortField(term467, term467.getClass(), "month", (short) 4);
        setShortField(term467, term467.getClass(), "day", (short) 14);
        setField(term466, term466.getClass(), "date", term467);
        setByteField(term471, term471.getClass(), "hour", (byte) 18);
        setByteField(term471, term471.getClass(), "minute", (byte) 24);
        setByteField(term471, term471.getClass(), "second", (byte) 32);
        setIntField(term471, term471.getClass(), "nano", 369233818);
        setField(term466, term466.getClass(), "time", term471);
        setField(term429, term429.getClass(), "atnd_lut", term466);
        setField(term429, term429.getClass(), "cmd", "RkybSrpybU");
        setField(term429, term429.getClass(), "req_id", "xOEqzGAmDU");
        setField(term429, term429.getClass(), "stat", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_prm3", argTypes, term429, args);
    }

};



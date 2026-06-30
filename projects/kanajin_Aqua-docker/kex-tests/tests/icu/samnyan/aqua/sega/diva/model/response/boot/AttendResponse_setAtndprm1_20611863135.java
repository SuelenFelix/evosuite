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

public class AttendResponse_setAtndprm1_20611863135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;

    public AttendResponse_setAtndprm1_20611863135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term757 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term715, term715.getClass(), "atnd_prm1", "OWDIEULEFu");
        setField(term715, term715.getClass(), "atnd_prm2", "dWRymuLBtr");
        setField(term715, term715.getClass(), "atnd_prm3", "AijpHYOFuy");
        setIntField(term753, term753.getClass(), "year", 2026);
        setShortField(term753, term753.getClass(), "month", (short) 12);
        setShortField(term753, term753.getClass(), "day", (short) 14);
        setField(term752, term752.getClass(), "date", term753);
        setByteField(term757, term757.getClass(), "hour", (byte) 16);
        setByteField(term757, term757.getClass(), "minute", (byte) 34);
        setByteField(term757, term757.getClass(), "second", (byte) 9);
        setIntField(term757, term757.getClass(), "nano", 518326996);
        setField(term752, term752.getClass(), "time", term757);
        setField(term715, term715.getClass(), "atnd_lut", term752);
        setField(term715, term715.getClass(), "cmd", "SbAoxhfrkn");
        setField(term715, term715.getClass(), "req_id", "kuTXqwMtDB");
        setField(term715, term715.getClass(), "stat", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "setAtnd_prm1", argTypes, term715, args);
    }

};



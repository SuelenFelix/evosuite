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

public class AttendResponse_getAtndprm2_20710245042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;

    public AttendResponse_getAtndprm2_20710245042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term286, term286.getClass(), "atnd_prm1", "MxlszYVzRf");
        setField(term286, term286.getClass(), "atnd_prm2", "LQFpaHEwXR");
        setField(term286, term286.getClass(), "atnd_prm3", "oVcInYnLWB");
        setIntField(term324, term324.getClass(), "year", 2015);
        setShortField(term324, term324.getClass(), "month", (short) 9);
        setShortField(term324, term324.getClass(), "day", (short) 19);
        setField(term323, term323.getClass(), "date", term324);
        setByteField(term328, term328.getClass(), "hour", (byte) 9);
        setByteField(term328, term328.getClass(), "minute", (byte) 4);
        setByteField(term328, term328.getClass(), "second", (byte) 10);
        setIntField(term328, term328.getClass(), "nano", 401765865);
        setField(term323, term323.getClass(), "time", term328);
        setField(term286, term286.getClass(), "atnd_lut", term323);
        setField(term286, term286.getClass(), "cmd", "aJlieCFVtF");
        setField(term286, term286.getClass(), "req_id", "ZiaGIbnzTs");
        setField(term286, term286.getClass(), "stat", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_prm2", argTypes, term286, args);
    }

};



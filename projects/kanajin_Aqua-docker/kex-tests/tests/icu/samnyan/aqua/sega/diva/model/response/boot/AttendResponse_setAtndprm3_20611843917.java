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

public class AttendResponse_setAtndprm3_20611843917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045;

    public AttendResponse_setAtndprm3_20611843917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1045 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term1082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1087 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1045, term1045.getClass(), "atnd_prm1", "BndsHwAFMv");
        setField(term1045, term1045.getClass(), "atnd_prm2", "GzFkzHGYFt");
        setField(term1045, term1045.getClass(), "atnd_prm3", "tShwQLRGNe");
        setIntField(term1083, term1083.getClass(), "year", 2024);
        setShortField(term1083, term1083.getClass(), "month", (short) 1);
        setShortField(term1083, term1083.getClass(), "day", (short) 24);
        setField(term1082, term1082.getClass(), "date", term1083);
        setByteField(term1087, term1087.getClass(), "hour", (byte) 20);
        setByteField(term1087, term1087.getClass(), "minute", (byte) 28);
        setByteField(term1087, term1087.getClass(), "second", (byte) 39);
        setIntField(term1087, term1087.getClass(), "nano", 952728177);
        setField(term1082, term1082.getClass(), "time", term1087);
        setField(term1045, term1045.getClass(), "atnd_lut", term1082);
        setField(term1045, term1045.getClass(), "cmd", "LvtrsXUliU");
        setField(term1045, term1045.getClass(), "req_id", "xLbjWUgOIL");
        setField(term1045, term1045.getClass(), "stat", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nGKItKLYNC";
        callMethod(klass, "setAtnd_prm3", argTypes, term1045, args);
    }

};



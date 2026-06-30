package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameMessage_setMessage_6699957367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13890;

    public GameMessage_setMessage_6699957367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13890 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13920 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13890, term13890.getClass(), "id", -20614472);
        setIntField(term13890, term13890.getClass(), "type", 1126618861);
        setField(term13890, term13890.getClass(), "message", "pXxkiXgQnq");
        setIntField(term13906, term13906.getClass(), "year", 2010);
        setShortField(term13906, term13906.getClass(), "month", (short) 1);
        setShortField(term13906, term13906.getClass(), "day", (short) 10);
        setField(term13905, term13905.getClass(), "date", term13906);
        setByteField(term13910, term13910.getClass(), "hour", (byte) 12);
        setByteField(term13910, term13910.getClass(), "minute", (byte) 46);
        setByteField(term13910, term13910.getClass(), "second", (byte) 5);
        setIntField(term13910, term13910.getClass(), "nano", 540440953);
        setField(term13905, term13905.getClass(), "time", term13910);
        setField(term13890, term13890.getClass(), "startDate", term13905);
        setIntField(term13916, term13916.getClass(), "year", 2028);
        setShortField(term13916, term13916.getClass(), "month", (short) 5);
        setShortField(term13916, term13916.getClass(), "day", (short) 7);
        setField(term13915, term13915.getClass(), "date", term13916);
        setByteField(term13920, term13920.getClass(), "hour", (byte) 7);
        setByteField(term13920, term13920.getClass(), "minute", (byte) 48);
        setByteField(term13920, term13920.getClass(), "second", (byte) 4);
        setIntField(term13920, term13920.getClass(), "nano", 380425174);
        setField(term13915, term13915.getClass(), "time", term13920);
        setField(term13890, term13890.getClass(), "endDate", term13915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tKmrUDURku";
        callMethod(klass, "setMessage", argTypes, term13890, args);
    }

};



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

public class GameEvent_setEndDate_6299122458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term231;

    public GameEvent_setEndDate_6299122458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent"));
        Object term210 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215 = newInstance(Class.forName("java.time.LocalTime"));
        Object term220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term207, term207.getClass(), "id", 1622346318);
        setIntField(term207, term207.getClass(), "type", 1048535127);
        setIntField(term211, term211.getClass(), "year", 2029);
        setShortField(term211, term211.getClass(), "month", (short) 6);
        setShortField(term211, term211.getClass(), "day", (short) 23);
        setField(term210, term210.getClass(), "date", term211);
        setByteField(term215, term215.getClass(), "hour", (byte) 21);
        setByteField(term215, term215.getClass(), "minute", (byte) 55);
        setByteField(term215, term215.getClass(), "second", (byte) 27);
        setIntField(term215, term215.getClass(), "nano", 66889274);
        setField(term210, term210.getClass(), "time", term215);
        setField(term207, term207.getClass(), "startDate", term210);
        setIntField(term221, term221.getClass(), "year", 2017);
        setShortField(term221, term221.getClass(), "month", (short) 3);
        setShortField(term221, term221.getClass(), "day", (short) 5);
        setField(term220, term220.getClass(), "date", term221);
        setByteField(term225, term225.getClass(), "hour", (byte) 20);
        setByteField(term225, term225.getClass(), "minute", (byte) 34);
        setByteField(term225, term225.getClass(), "second", (byte) 55);
        setIntField(term225, term225.getClass(), "nano", 78024496);
        setField(term220, term220.getClass(), "time", term225);
        setField(term207, term207.getClass(), "endDate", term220);
        setBooleanField(term207, term207.getClass(), "enable", false);
        term231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term232, term232.getClass(), "year", 2020);
        setShortField(term232, term232.getClass(), "month", (short) 7);
        setShortField(term232, term232.getClass(), "day", (short) 24);
        setField(term231, term231.getClass(), "date", term232);
        setByteField(term236, term236.getClass(), "hour", (byte) 0);
        setByteField(term236, term236.getClass(), "minute", (byte) 59);
        setByteField(term236, term236.getClass(), "second", (byte) 56);
        setIntField(term236, term236.getClass(), "nano", 320219201);
        setField(term231, term231.getClass(), "time", term236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term231;
        callMethod(klass, "setEndDate", argTypes, term207, args);
    }

};



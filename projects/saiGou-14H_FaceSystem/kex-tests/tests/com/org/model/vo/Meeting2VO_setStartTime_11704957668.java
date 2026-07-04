package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting2VO_setStartTime_11704957668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4432;
     Object term4471;

    public Meeting2VO_setStartTime_11704957668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4433 = new Integer(597278769);
        Integer term4457 = new Integer(-1685132342);
        term4432 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4452 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4432, term4432.getClass(), "id", term4433);
        setField(term4432, term4432.getClass(), "username", "DbxrFiyttv");
        setIntField(term4448, term4448.getClass(), "year", 2024);
        setShortField(term4448, term4448.getClass(), "month", (short) 1);
        setShortField(term4448, term4448.getClass(), "day", (short) 24);
        setField(term4447, term4447.getClass(), "date", term4448);
        setByteField(term4452, term4452.getClass(), "hour", (byte) 20);
        setByteField(term4452, term4452.getClass(), "minute", (byte) 28);
        setByteField(term4452, term4452.getClass(), "second", (byte) 39);
        setIntField(term4452, term4452.getClass(), "nano", 952728177);
        setField(term4447, term4447.getClass(), "time", term4452);
        setField(term4432, term4432.getClass(), "startTime", term4447);
        setField(term4432, term4432.getClass(), "state", term4457);
        setField(term4432, term4432.getClass(), "faceUrl", "iVIrSxTsaM");
        term4471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4476 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4472, term4472.getClass(), "year", 2029);
        setShortField(term4472, term4472.getClass(), "month", (short) 8);
        setShortField(term4472, term4472.getClass(), "day", (short) 29);
        setField(term4471, term4471.getClass(), "date", term4472);
        setByteField(term4476, term4476.getClass(), "hour", (byte) 15);
        setByteField(term4476, term4476.getClass(), "minute", (byte) 50);
        setByteField(term4476, term4476.getClass(), "second", (byte) 1);
        setIntField(term4476, term4476.getClass(), "nano", 277971904);
        setField(term4471, term4471.getClass(), "time", term4476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4471;
        callMethod(klass, "setStartTime", argTypes, term4432, args);
    }

};



package com.org.model.excel;

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
import static com.org.model.excel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingMessage_toString_14767698755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;

    public MeetingMessage_toString_14767698755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term514 = new Integer(1227103734);
        Integer term516 = new Integer(-1339778481);
        term477 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term533 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term477, term477.getClass(), "username", "tbcdzjIfER");
        setField(term477, term477.getClass(), "nickname", "HyxfbSQYBe");
        setField(term477, term477.getClass(), "sex", "pCTimMblYc");
        setField(term477, term477.getClass(), "umPower", term514);
        setField(term477, term477.getClass(), "state", term516);
        setIntField(term519, term519.getClass(), "year", 2029);
        setShortField(term519, term519.getClass(), "month", (short) 8);
        setShortField(term519, term519.getClass(), "day", (short) 29);
        setField(term518, term518.getClass(), "date", term519);
        setByteField(term523, term523.getClass(), "hour", (byte) 15);
        setByteField(term523, term523.getClass(), "minute", (byte) 50);
        setByteField(term523, term523.getClass(), "second", (byte) 1);
        setIntField(term523, term523.getClass(), "nano", 277971904);
        setField(term518, term518.getClass(), "time", term523);
        setField(term477, term477.getClass(), "startTime", term518);
        setIntField(term529, term529.getClass(), "year", 2022);
        setShortField(term529, term529.getClass(), "month", (short) 11);
        setShortField(term529, term529.getClass(), "day", (short) 16);
        setField(term528, term528.getClass(), "date", term529);
        setByteField(term533, term533.getClass(), "hour", (byte) 15);
        setByteField(term533, term533.getClass(), "minute", (byte) 54);
        setByteField(term533, term533.getClass(), "second", (byte) 2);
        setIntField(term533, term533.getClass(), "nano", 733274103);
        setField(term528, term528.getClass(), "time", term533);
        setField(term477, term477.getClass(), "endTime", term528);
        setField(term477, term477.getClass(), "allTime", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term477, args);
    }

};



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

public class MeetingMessage_setStartTime_207337883020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38580;
     Object term38653;

    public MeetingMessage_setStartTime_207337883020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38617 = new Integer(-1329496162);
        Integer term38619 = new Integer(-1181178091);
        term38580 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term38621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38636 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38580, term38580.getClass(), "username", "rzlCRHVFsA");
        setField(term38580, term38580.getClass(), "nickname", "XICyfUgpjZ");
        setField(term38580, term38580.getClass(), "sex", "SOwukZbyqx");
        setField(term38580, term38580.getClass(), "umPower", term38617);
        setField(term38580, term38580.getClass(), "state", term38619);
        setIntField(term38622, term38622.getClass(), "year", 2025);
        setShortField(term38622, term38622.getClass(), "month", (short) 5);
        setShortField(term38622, term38622.getClass(), "day", (short) 7);
        setField(term38621, term38621.getClass(), "date", term38622);
        setByteField(term38626, term38626.getClass(), "hour", (byte) 9);
        setByteField(term38626, term38626.getClass(), "minute", (byte) 7);
        setByteField(term38626, term38626.getClass(), "second", (byte) 58);
        setIntField(term38626, term38626.getClass(), "nano", 974291074);
        setField(term38621, term38621.getClass(), "time", term38626);
        setField(term38580, term38580.getClass(), "startTime", term38621);
        setIntField(term38632, term38632.getClass(), "year", 2026);
        setShortField(term38632, term38632.getClass(), "month", (short) 9);
        setShortField(term38632, term38632.getClass(), "day", (short) 29);
        setField(term38631, term38631.getClass(), "date", term38632);
        setByteField(term38636, term38636.getClass(), "hour", (byte) 18);
        setByteField(term38636, term38636.getClass(), "minute", (byte) 42);
        setByteField(term38636, term38636.getClass(), "second", (byte) 40);
        setIntField(term38636, term38636.getClass(), "nano", 611001144);
        setField(term38631, term38631.getClass(), "time", term38636);
        setField(term38580, term38580.getClass(), "endTime", term38631);
        setField(term38580, term38580.getClass(), "allTime", "BPCRnKSWXh");
        term38653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38658 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38654, term38654.getClass(), "year", 2010);
        setShortField(term38654, term38654.getClass(), "month", (short) 5);
        setShortField(term38654, term38654.getClass(), "day", (short) 14);
        setField(term38653, term38653.getClass(), "date", term38654);
        setByteField(term38658, term38658.getClass(), "hour", (byte) 17);
        setByteField(term38658, term38658.getClass(), "minute", (byte) 11);
        setByteField(term38658, term38658.getClass(), "second", (byte) 30);
        setIntField(term38658, term38658.getClass(), "nano", 641019384);
        setField(term38653, term38653.getClass(), "time", term38658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term38653;
        callMethod(klass, "setStartTime", argTypes, term38580, args);
    }

};



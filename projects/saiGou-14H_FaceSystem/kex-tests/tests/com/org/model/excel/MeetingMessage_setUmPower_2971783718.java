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

public class MeetingMessage_setUmPower_2971783718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38350;
     Object term38423;

    public MeetingMessage_setUmPower_2971783718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38387 = new Integer(1129458600);
        Integer term38389 = new Integer(-1559804880);
        term38350 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term38391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38406 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38350, term38350.getClass(), "username", "NYzdiIdifj");
        setField(term38350, term38350.getClass(), "nickname", "QShAEmzTpm");
        setField(term38350, term38350.getClass(), "sex", "WfIDYpqgan");
        setField(term38350, term38350.getClass(), "umPower", term38387);
        setField(term38350, term38350.getClass(), "state", term38389);
        setIntField(term38392, term38392.getClass(), "year", 2011);
        setShortField(term38392, term38392.getClass(), "month", (short) 4);
        setShortField(term38392, term38392.getClass(), "day", (short) 14);
        setField(term38391, term38391.getClass(), "date", term38392);
        setByteField(term38396, term38396.getClass(), "hour", (byte) 4);
        setByteField(term38396, term38396.getClass(), "minute", (byte) 35);
        setByteField(term38396, term38396.getClass(), "second", (byte) 21);
        setIntField(term38396, term38396.getClass(), "nano", 578174822);
        setField(term38391, term38391.getClass(), "time", term38396);
        setField(term38350, term38350.getClass(), "startTime", term38391);
        setIntField(term38402, term38402.getClass(), "year", 2028);
        setShortField(term38402, term38402.getClass(), "month", (short) 2);
        setShortField(term38402, term38402.getClass(), "day", (short) 8);
        setField(term38401, term38401.getClass(), "date", term38402);
        setByteField(term38406, term38406.getClass(), "hour", (byte) 9);
        setByteField(term38406, term38406.getClass(), "minute", (byte) 51);
        setByteField(term38406, term38406.getClass(), "second", (byte) 30);
        setIntField(term38406, term38406.getClass(), "nano", 433905289);
        setField(term38401, term38401.getClass(), "time", term38406);
        setField(term38350, term38350.getClass(), "endTime", term38401);
        setField(term38350, term38350.getClass(), "allTime", "jkqkgaaQOn");
        term38423 = new Integer(420300457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38423;
        callMethod(klass, "setUmPower", argTypes, term38350, args);
    }

};



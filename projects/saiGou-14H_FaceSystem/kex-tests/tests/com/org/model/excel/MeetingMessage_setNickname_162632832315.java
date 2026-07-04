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

public class MeetingMessage_setNickname_162632832315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1629;

    public MeetingMessage_setNickname_162632832315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1666 = new Integer(-1275173084);
        Integer term1668 = new Integer(-244121226);
        term1629 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1685 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1629, term1629.getClass(), "username", "ytSBIKXogI");
        setField(term1629, term1629.getClass(), "nickname", "nHXjMycHlU");
        setField(term1629, term1629.getClass(), "sex", "ieCtQFdkii");
        setField(term1629, term1629.getClass(), "umPower", term1666);
        setField(term1629, term1629.getClass(), "state", term1668);
        setIntField(term1671, term1671.getClass(), "year", 2021);
        setShortField(term1671, term1671.getClass(), "month", (short) 8);
        setShortField(term1671, term1671.getClass(), "day", (short) 12);
        setField(term1670, term1670.getClass(), "date", term1671);
        setByteField(term1675, term1675.getClass(), "hour", (byte) 2);
        setByteField(term1675, term1675.getClass(), "minute", (byte) 17);
        setByteField(term1675, term1675.getClass(), "second", (byte) 51);
        setIntField(term1675, term1675.getClass(), "nano", 207375141);
        setField(term1670, term1670.getClass(), "time", term1675);
        setField(term1629, term1629.getClass(), "startTime", term1670);
        setIntField(term1681, term1681.getClass(), "year", 2025);
        setShortField(term1681, term1681.getClass(), "month", (short) 11);
        setShortField(term1681, term1681.getClass(), "day", (short) 3);
        setField(term1680, term1680.getClass(), "date", term1681);
        setByteField(term1685, term1685.getClass(), "hour", (byte) 21);
        setByteField(term1685, term1685.getClass(), "minute", (byte) 24);
        setByteField(term1685, term1685.getClass(), "second", (byte) 23);
        setIntField(term1685, term1685.getClass(), "nano", 210986721);
        setField(term1680, term1680.getClass(), "time", term1685);
        setField(term1629, term1629.getClass(), "endTime", term1680);
        setField(term1629, term1629.getClass(), "allTime", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "setNickname", argTypes, term1629, args);
    }

};



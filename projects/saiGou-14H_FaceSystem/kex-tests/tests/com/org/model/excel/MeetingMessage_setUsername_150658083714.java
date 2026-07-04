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

public class MeetingMessage_setUsername_150658083714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1494;

    public MeetingMessage_setUsername_150658083714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1531 = new Integer(590364439);
        Integer term1533 = new Integer(865208305);
        term1494 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1550 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1494, term1494.getClass(), "username", "JDswTTCZHV");
        setField(term1494, term1494.getClass(), "nickname", "onpbIeEKoi");
        setField(term1494, term1494.getClass(), "sex", "YRHGsAkhxb");
        setField(term1494, term1494.getClass(), "umPower", term1531);
        setField(term1494, term1494.getClass(), "state", term1533);
        setIntField(term1536, term1536.getClass(), "year", 2028);
        setShortField(term1536, term1536.getClass(), "month", (short) 10);
        setShortField(term1536, term1536.getClass(), "day", (short) 1);
        setField(term1535, term1535.getClass(), "date", term1536);
        setByteField(term1540, term1540.getClass(), "hour", (byte) 17);
        setByteField(term1540, term1540.getClass(), "minute", (byte) 29);
        setByteField(term1540, term1540.getClass(), "second", (byte) 30);
        setIntField(term1540, term1540.getClass(), "nano", 845472306);
        setField(term1535, term1535.getClass(), "time", term1540);
        setField(term1494, term1494.getClass(), "startTime", term1535);
        setIntField(term1546, term1546.getClass(), "year", 2027);
        setShortField(term1546, term1546.getClass(), "month", (short) 2);
        setShortField(term1546, term1546.getClass(), "day", (short) 19);
        setField(term1545, term1545.getClass(), "date", term1546);
        setByteField(term1550, term1550.getClass(), "hour", (byte) 17);
        setByteField(term1550, term1550.getClass(), "minute", (byte) 37);
        setByteField(term1550, term1550.getClass(), "second", (byte) 27);
        setIntField(term1550, term1550.getClass(), "nano", 920380537);
        setField(term1545, term1545.getClass(), "time", term1550);
        setField(term1494, term1494.getClass(), "endTime", term1545);
        setField(term1494, term1494.getClass(), "allTime", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MLqYREekMl";
        callMethod(klass, "setUsername", argTypes, term1494, args);
    }

};



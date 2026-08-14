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

public class MeetingMessage_setState_173827776919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38465;
     Object term38538;

    public MeetingMessage_setState_173827776919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38502 = new Integer(804843661);
        Integer term38504 = new Integer(1968236726);
        term38465 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term38506 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38507 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38511 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38517 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38521 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38465, term38465.getClass(), "username", "VxoGAcPGVp");
        setField(term38465, term38465.getClass(), "nickname", "ltoRvwhmcS");
        setField(term38465, term38465.getClass(), "sex", "iSXUZmUzsG");
        setField(term38465, term38465.getClass(), "umPower", term38502);
        setField(term38465, term38465.getClass(), "state", term38504);
        setIntField(term38507, term38507.getClass(), "year", 2016);
        setShortField(term38507, term38507.getClass(), "month", (short) 6);
        setShortField(term38507, term38507.getClass(), "day", (short) 2);
        setField(term38506, term38506.getClass(), "date", term38507);
        setByteField(term38511, term38511.getClass(), "hour", (byte) 5);
        setByteField(term38511, term38511.getClass(), "minute", (byte) 24);
        setByteField(term38511, term38511.getClass(), "second", (byte) 28);
        setIntField(term38511, term38511.getClass(), "nano", 586692762);
        setField(term38506, term38506.getClass(), "time", term38511);
        setField(term38465, term38465.getClass(), "startTime", term38506);
        setIntField(term38517, term38517.getClass(), "year", 2012);
        setShortField(term38517, term38517.getClass(), "month", (short) 3);
        setShortField(term38517, term38517.getClass(), "day", (short) 20);
        setField(term38516, term38516.getClass(), "date", term38517);
        setByteField(term38521, term38521.getClass(), "hour", (byte) 16);
        setByteField(term38521, term38521.getClass(), "minute", (byte) 41);
        setByteField(term38521, term38521.getClass(), "second", (byte) 13);
        setIntField(term38521, term38521.getClass(), "nano", 546552876);
        setField(term38516, term38516.getClass(), "time", term38521);
        setField(term38465, term38465.getClass(), "endTime", term38516);
        setField(term38465, term38465.getClass(), "allTime", "wCLSYvOrxz");
        term38538 = new Integer(-1080686915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38538;
        callMethod(klass, "setState", argTypes, term38465, args);
    }

};



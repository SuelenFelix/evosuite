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

public class MeetingVO_getOnline_621755315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7685;

    public MeetingVO_getOnline_621755315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7686 = new Integer(1146601902);
        Integer term7724 = new Integer(-1938881385);
        Integer term7784 = new Integer(-1629418973);
        Integer term7796 = new Integer(-100825168);
        Integer term7798 = new Integer(768407648);
        term7685 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term7726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7791 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7685, term7685.getClass(), "id", term7686);
        setField(term7685, term7685.getClass(), "name", "FIUbHJmAEj");
        setField(term7685, term7685.getClass(), "host", "mJrFDaDdyY");
        setField(term7685, term7685.getClass(), "roomName", "HqyBQNuLnz");
        setField(term7685, term7685.getClass(), "online", term7724);
        setIntField(term7727, term7727.getClass(), "year", 2027);
        setShortField(term7727, term7727.getClass(), "month", (short) 8);
        setShortField(term7727, term7727.getClass(), "day", (short) 26);
        setField(term7726, term7726.getClass(), "date", term7727);
        setByteField(term7731, term7731.getClass(), "hour", (byte) 5);
        setByteField(term7731, term7731.getClass(), "minute", (byte) 11);
        setByteField(term7731, term7731.getClass(), "second", (byte) 9);
        setIntField(term7731, term7731.getClass(), "nano", 219245092);
        setField(term7726, term7726.getClass(), "time", term7731);
        setField(term7685, term7685.getClass(), "createTime", term7726);
        setField(term7685, term7685.getClass(), "link", "xWkZKbrvmX");
        setField(term7685, term7685.getClass(), "meetingTime", "PTEWoxLNqQ");
        setField(term7685, term7685.getClass(), "signTime", "XiAUBffMZP");
        setField(term7685, term7685.getClass(), "introduce", "pkfsHvqODq");
        setField(term7685, term7685.getClass(), "state", term7784);
        setIntField(term7787, term7787.getClass(), "year", 2025);
        setShortField(term7787, term7787.getClass(), "month", (short) 3);
        setShortField(term7787, term7787.getClass(), "day", (short) 9);
        setField(term7786, term7786.getClass(), "date", term7787);
        setByteField(term7791, term7791.getClass(), "hour", (byte) 5);
        setByteField(term7791, term7791.getClass(), "minute", (byte) 49);
        setByteField(term7791, term7791.getClass(), "second", (byte) 12);
        setIntField(term7791, term7791.getClass(), "nano", 791695028);
        setField(term7786, term7786.getClass(), "time", term7791);
        setField(term7685, term7685.getClass(), "updateTime", term7786);
        setField(term7685, term7685.getClass(), "userNumber", term7796);
        setField(term7685, term7685.getClass(), "signNumber", term7798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOnline", argTypes, term7685, args);
    }

};



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

public class MeetingVO_equals_120169646429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52678;
     Object term52793;

    public MeetingVO_equals_120169646429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52679 = new Integer(1800400048);
        Integer term52717 = new Integer(-1248348901);
        Integer term52777 = new Integer(-808864128);
        Integer term52789 = new Integer(-1813216452);
        Integer term52791 = new Integer(180516410);
        term52678 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term52719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52724 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52784 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term52678, term52678.getClass(), "id", term52679);
        setField(term52678, term52678.getClass(), "name", "zxcdzyDZux");
        setField(term52678, term52678.getClass(), "host", "aMGJklsoLZ");
        setField(term52678, term52678.getClass(), "roomName", "MxjPynRJZL");
        setField(term52678, term52678.getClass(), "online", term52717);
        setIntField(term52720, term52720.getClass(), "year", 2010);
        setShortField(term52720, term52720.getClass(), "month", (short) 3);
        setShortField(term52720, term52720.getClass(), "day", (short) 31);
        setField(term52719, term52719.getClass(), "date", term52720);
        setByteField(term52724, term52724.getClass(), "hour", (byte) 13);
        setByteField(term52724, term52724.getClass(), "minute", (byte) 35);
        setByteField(term52724, term52724.getClass(), "second", (byte) 45);
        setIntField(term52724, term52724.getClass(), "nano", 154359665);
        setField(term52719, term52719.getClass(), "time", term52724);
        setField(term52678, term52678.getClass(), "createTime", term52719);
        setField(term52678, term52678.getClass(), "link", "pHRTNuwZAK");
        setField(term52678, term52678.getClass(), "meetingTime", "dLORHEiWhQ");
        setField(term52678, term52678.getClass(), "signTime", "beHKTyEsPG");
        setField(term52678, term52678.getClass(), "introduce", "tFQbHKqwNK");
        setField(term52678, term52678.getClass(), "state", term52777);
        setIntField(term52780, term52780.getClass(), "year", 2014);
        setShortField(term52780, term52780.getClass(), "month", (short) 11);
        setShortField(term52780, term52780.getClass(), "day", (short) 7);
        setField(term52779, term52779.getClass(), "date", term52780);
        setByteField(term52784, term52784.getClass(), "hour", (byte) 8);
        setByteField(term52784, term52784.getClass(), "minute", (byte) 9);
        setByteField(term52784, term52784.getClass(), "second", (byte) 37);
        setIntField(term52784, term52784.getClass(), "nano", 366421600);
        setField(term52779, term52779.getClass(), "time", term52784);
        setField(term52678, term52678.getClass(), "updateTime", term52779);
        setField(term52678, term52678.getClass(), "userNumber", term52789);
        setField(term52678, term52678.getClass(), "signNumber", term52791);
        term52793 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52793;
        callMethod(klass, "equals", argTypes, term52678, args);
    }

};



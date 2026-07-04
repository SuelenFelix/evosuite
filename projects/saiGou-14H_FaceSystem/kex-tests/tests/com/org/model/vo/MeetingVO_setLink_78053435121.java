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

public class MeetingVO_setLink_78053435121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10725;

    public MeetingVO_setLink_78053435121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10726 = new Integer(644154104);
        Integer term10764 = new Integer(76650923);
        Integer term10824 = new Integer(1003743923);
        Integer term10836 = new Integer(1887772522);
        Integer term10838 = new Integer(354196060);
        term10725 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term10766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10831 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10725, term10725.getClass(), "id", term10726);
        setField(term10725, term10725.getClass(), "name", "pZcEKUNIXL");
        setField(term10725, term10725.getClass(), "host", "QbRtvZIDtW");
        setField(term10725, term10725.getClass(), "roomName", "fbsmDvjMqr");
        setField(term10725, term10725.getClass(), "online", term10764);
        setIntField(term10767, term10767.getClass(), "year", 2022);
        setShortField(term10767, term10767.getClass(), "month", (short) 6);
        setShortField(term10767, term10767.getClass(), "day", (short) 20);
        setField(term10766, term10766.getClass(), "date", term10767);
        setByteField(term10771, term10771.getClass(), "hour", (byte) 7);
        setByteField(term10771, term10771.getClass(), "minute", (byte) 57);
        setByteField(term10771, term10771.getClass(), "second", (byte) 37);
        setIntField(term10771, term10771.getClass(), "nano", 90374877);
        setField(term10766, term10766.getClass(), "time", term10771);
        setField(term10725, term10725.getClass(), "createTime", term10766);
        setField(term10725, term10725.getClass(), "link", "tycssGWZvU");
        setField(term10725, term10725.getClass(), "meetingTime", "jcvrILwbgt");
        setField(term10725, term10725.getClass(), "signTime", "AphrAHzPMC");
        setField(term10725, term10725.getClass(), "introduce", "iwismCnYjB");
        setField(term10725, term10725.getClass(), "state", term10824);
        setIntField(term10827, term10827.getClass(), "year", 2023);
        setShortField(term10827, term10827.getClass(), "month", (short) 2);
        setShortField(term10827, term10827.getClass(), "day", (short) 16);
        setField(term10826, term10826.getClass(), "date", term10827);
        setByteField(term10831, term10831.getClass(), "hour", (byte) 3);
        setByteField(term10831, term10831.getClass(), "minute", (byte) 18);
        setByteField(term10831, term10831.getClass(), "second", (byte) 56);
        setIntField(term10831, term10831.getClass(), "nano", 733017887);
        setField(term10826, term10826.getClass(), "time", term10831);
        setField(term10725, term10725.getClass(), "updateTime", term10826);
        setField(term10725, term10725.getClass(), "userNumber", term10836);
        setField(term10725, term10725.getClass(), "signNumber", term10838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GerBZdiruT";
        callMethod(klass, "setLink", argTypes, term10725, args);
    }

};



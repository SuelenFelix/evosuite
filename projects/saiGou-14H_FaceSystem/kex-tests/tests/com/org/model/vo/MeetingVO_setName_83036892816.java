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

public class MeetingVO_setName_83036892816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9722;

    public MeetingVO_setName_83036892816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9723 = new Integer(-1831826725);
        Integer term9761 = new Integer(752152965);
        Integer term9821 = new Integer(-1577069773);
        Integer term9833 = new Integer(-266625190);
        Integer term9835 = new Integer(489201218);
        term9722 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term9763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9828 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9722, term9722.getClass(), "id", term9723);
        setField(term9722, term9722.getClass(), "name", "xwVTgDhNdW");
        setField(term9722, term9722.getClass(), "host", "ruqGjVRVlD");
        setField(term9722, term9722.getClass(), "roomName", "oeoFYkQLVk");
        setField(term9722, term9722.getClass(), "online", term9761);
        setIntField(term9764, term9764.getClass(), "year", 2017);
        setShortField(term9764, term9764.getClass(), "month", (short) 4);
        setShortField(term9764, term9764.getClass(), "day", (short) 3);
        setField(term9763, term9763.getClass(), "date", term9764);
        setByteField(term9768, term9768.getClass(), "hour", (byte) 6);
        setByteField(term9768, term9768.getClass(), "minute", (byte) 51);
        setByteField(term9768, term9768.getClass(), "second", (byte) 10);
        setIntField(term9768, term9768.getClass(), "nano", 316377166);
        setField(term9763, term9763.getClass(), "time", term9768);
        setField(term9722, term9722.getClass(), "createTime", term9763);
        setField(term9722, term9722.getClass(), "link", "fibZqjUmdU");
        setField(term9722, term9722.getClass(), "meetingTime", "DvLIPKnbCV");
        setField(term9722, term9722.getClass(), "signTime", "QwAMZyCIhS");
        setField(term9722, term9722.getClass(), "introduce", "TnLDXZoBoo");
        setField(term9722, term9722.getClass(), "state", term9821);
        setIntField(term9824, term9824.getClass(), "year", 2027);
        setShortField(term9824, term9824.getClass(), "month", (short) 8);
        setShortField(term9824, term9824.getClass(), "day", (short) 23);
        setField(term9823, term9823.getClass(), "date", term9824);
        setByteField(term9828, term9828.getClass(), "hour", (byte) 15);
        setByteField(term9828, term9828.getClass(), "minute", (byte) 12);
        setByteField(term9828, term9828.getClass(), "second", (byte) 6);
        setIntField(term9828, term9828.getClass(), "nano", 541218258);
        setField(term9823, term9823.getClass(), "time", term9828);
        setField(term9722, term9722.getClass(), "updateTime", term9823);
        setField(term9722, term9722.getClass(), "userNumber", term9833);
        setField(term9722, term9722.getClass(), "signNumber", term9835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RQTElJrtwb";
        callMethod(klass, "setName", argTypes, term9722, args);
    }

};



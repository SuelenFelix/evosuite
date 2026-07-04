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

public class MeetingVO_setCreateTime_74129454220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10530;
     Object term10645;

    public MeetingVO_setCreateTime_74129454220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10531 = new Integer(-1867239125);
        Integer term10569 = new Integer(952869601);
        Integer term10629 = new Integer(91958879);
        Integer term10641 = new Integer(-645429025);
        Integer term10643 = new Integer(-688213483);
        term10530 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term10571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10636 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10530, term10530.getClass(), "id", term10531);
        setField(term10530, term10530.getClass(), "name", "enWkULOykY");
        setField(term10530, term10530.getClass(), "host", "BPdcafiAQX");
        setField(term10530, term10530.getClass(), "roomName", "GvmOxwMrOk");
        setField(term10530, term10530.getClass(), "online", term10569);
        setIntField(term10572, term10572.getClass(), "year", 2012);
        setShortField(term10572, term10572.getClass(), "month", (short) 7);
        setShortField(term10572, term10572.getClass(), "day", (short) 21);
        setField(term10571, term10571.getClass(), "date", term10572);
        setByteField(term10576, term10576.getClass(), "hour", (byte) 13);
        setByteField(term10576, term10576.getClass(), "minute", (byte) 41);
        setByteField(term10576, term10576.getClass(), "second", (byte) 44);
        setIntField(term10576, term10576.getClass(), "nano", 394467282);
        setField(term10571, term10571.getClass(), "time", term10576);
        setField(term10530, term10530.getClass(), "createTime", term10571);
        setField(term10530, term10530.getClass(), "link", "WXUKmhwFsK");
        setField(term10530, term10530.getClass(), "meetingTime", "OcfokBTzZZ");
        setField(term10530, term10530.getClass(), "signTime", "zeBhlhyhkL");
        setField(term10530, term10530.getClass(), "introduce", "PxinRhWgwT");
        setField(term10530, term10530.getClass(), "state", term10629);
        setIntField(term10632, term10632.getClass(), "year", 2025);
        setShortField(term10632, term10632.getClass(), "month", (short) 9);
        setShortField(term10632, term10632.getClass(), "day", (short) 25);
        setField(term10631, term10631.getClass(), "date", term10632);
        setByteField(term10636, term10636.getClass(), "hour", (byte) 20);
        setByteField(term10636, term10636.getClass(), "minute", (byte) 0);
        setByteField(term10636, term10636.getClass(), "second", (byte) 25);
        setIntField(term10636, term10636.getClass(), "nano", 65871584);
        setField(term10631, term10631.getClass(), "time", term10636);
        setField(term10530, term10530.getClass(), "updateTime", term10631);
        setField(term10530, term10530.getClass(), "userNumber", term10641);
        setField(term10530, term10530.getClass(), "signNumber", term10643);
        term10645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10650 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term10646, term10646.getClass(), "year", 2011);
        setShortField(term10646, term10646.getClass(), "month", (short) 9);
        setShortField(term10646, term10646.getClass(), "day", (short) 25);
        setField(term10645, term10645.getClass(), "date", term10646);
        setByteField(term10650, term10650.getClass(), "hour", (byte) 16);
        setByteField(term10650, term10650.getClass(), "minute", (byte) 45);
        setByteField(term10650, term10650.getClass(), "second", (byte) 19);
        setIntField(term10650, term10650.getClass(), "nano", 962864785);
        setField(term10645, term10645.getClass(), "time", term10650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term10645;
        callMethod(klass, "setCreateTime", argTypes, term10530, args);
    }

};



package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_getMeetingTime_12812166027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27621;

    public Meeting_getMeetingTime_12812166027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27622 = new Integer(254542714);
        Integer term27704 = new Integer(-51533463);
        Integer term27706 = new Integer(2042811670);
        Integer term27721 = new Integer(-1713263092);
        term27621 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term27624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27675 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27621, term27621.getClass(), "id", term27622);
        setIntField(term27625, term27625.getClass(), "year", 2017);
        setShortField(term27625, term27625.getClass(), "month", (short) 2);
        setShortField(term27625, term27625.getClass(), "day", (short) 24);
        setField(term27624, term27624.getClass(), "date", term27625);
        setByteField(term27629, term27629.getClass(), "hour", (byte) 23);
        setByteField(term27629, term27629.getClass(), "minute", (byte) 46);
        setByteField(term27629, term27629.getClass(), "second", (byte) 43);
        setIntField(term27629, term27629.getClass(), "nano", 626549570);
        setField(term27624, term27624.getClass(), "time", term27629);
        setField(term27621, term27621.getClass(), "createTime", term27624);
        setField(term27621, term27621.getClass(), "name", "PQHyujWLlL");
        setField(term27621, term27621.getClass(), "link", "UEKVADcZqS");
        setField(term27621, term27621.getClass(), "introduce", "qZRVFeFetw");
        setIntField(term27671, term27671.getClass(), "year", 2014);
        setShortField(term27671, term27671.getClass(), "month", (short) 4);
        setShortField(term27671, term27671.getClass(), "day", (short) 20);
        setField(term27670, term27670.getClass(), "date", term27671);
        setByteField(term27675, term27675.getClass(), "hour", (byte) 16);
        setByteField(term27675, term27675.getClass(), "minute", (byte) 19);
        setByteField(term27675, term27675.getClass(), "second", (byte) 50);
        setIntField(term27675, term27675.getClass(), "nano", 397343944);
        setField(term27670, term27670.getClass(), "time", term27675);
        setField(term27621, term27621.getClass(), "updateTime", term27670);
        setField(term27621, term27621.getClass(), "meetingTime", "lyrSJRdQbw");
        setField(term27621, term27621.getClass(), "signTime", "PVBjmhwdMr");
        setField(term27621, term27621.getClass(), "signNumber", term27704);
        setField(term27621, term27621.getClass(), "userNumber", term27706);
        setField(term27621, term27621.getClass(), "fileUrl", "TURoCylnmF");
        setBooleanField(term27621, term27621.getClass(), "online", true);
        setField(term27621, term27621.getClass(), "deleted", term27721);
        setField(term27621, term27621.getClass(), "host", "OqAYoPyLDR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingTime", argTypes, term27621, args);
    }

};



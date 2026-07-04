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

public class UserMeeting_getMeetingId_13724066805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40125;

    public UserMeeting_getMeetingId_13724066805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40126 = new Integer(-1463702476);
        Integer term40128 = new Integer(90151812);
        Integer term40140 = new Integer(-416703693);
        Integer term40142 = new Integer(-1718111500);
        Integer term40164 = new Integer(2134049264);
        Integer term40176 = new Integer(-619693439);
        term40125 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40154 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40155 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40159 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40171 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40125, term40125.getClass(), "id", term40126);
        setField(term40125, term40125.getClass(), "umPower", term40128);
        setIntField(term40131, term40131.getClass(), "year", 2025);
        setShortField(term40131, term40131.getClass(), "month", (short) 10);
        setShortField(term40131, term40131.getClass(), "day", (short) 24);
        setField(term40130, term40130.getClass(), "date", term40131);
        setByteField(term40135, term40135.getClass(), "hour", (byte) 16);
        setByteField(term40135, term40135.getClass(), "minute", (byte) 37);
        setByteField(term40135, term40135.getClass(), "second", (byte) 14);
        setIntField(term40135, term40135.getClass(), "nano", 973421967);
        setField(term40130, term40130.getClass(), "time", term40135);
        setField(term40125, term40125.getClass(), "createTime", term40130);
        setField(term40125, term40125.getClass(), "userId", term40140);
        setField(term40125, term40125.getClass(), "meetingId", term40142);
        setIntField(term40145, term40145.getClass(), "year", 2021);
        setShortField(term40145, term40145.getClass(), "month", (short) 4);
        setShortField(term40145, term40145.getClass(), "day", (short) 25);
        setField(term40144, term40144.getClass(), "date", term40145);
        setByteField(term40149, term40149.getClass(), "hour", (byte) 8);
        setByteField(term40149, term40149.getClass(), "minute", (byte) 14);
        setByteField(term40149, term40149.getClass(), "second", (byte) 18);
        setIntField(term40149, term40149.getClass(), "nano", 906796683);
        setField(term40144, term40144.getClass(), "time", term40149);
        setField(term40125, term40125.getClass(), "updateTime", term40144);
        setIntField(term40155, term40155.getClass(), "year", 2012);
        setShortField(term40155, term40155.getClass(), "month", (short) 7);
        setShortField(term40155, term40155.getClass(), "day", (short) 16);
        setField(term40154, term40154.getClass(), "date", term40155);
        setByteField(term40159, term40159.getClass(), "hour", (byte) 8);
        setByteField(term40159, term40159.getClass(), "minute", (byte) 3);
        setByteField(term40159, term40159.getClass(), "second", (byte) 1);
        setIntField(term40159, term40159.getClass(), "nano", 861288078);
        setField(term40154, term40154.getClass(), "time", term40159);
        setField(term40125, term40125.getClass(), "startTime", term40154);
        setField(term40125, term40125.getClass(), "state", term40164);
        setIntField(term40167, term40167.getClass(), "year", 2028);
        setShortField(term40167, term40167.getClass(), "month", (short) 11);
        setShortField(term40167, term40167.getClass(), "day", (short) 9);
        setField(term40166, term40166.getClass(), "date", term40167);
        setByteField(term40171, term40171.getClass(), "hour", (byte) 7);
        setByteField(term40171, term40171.getClass(), "minute", (byte) 38);
        setByteField(term40171, term40171.getClass(), "second", (byte) 24);
        setIntField(term40171, term40171.getClass(), "nano", 528146857);
        setField(term40166, term40166.getClass(), "time", term40171);
        setField(term40125, term40125.getClass(), "endTime", term40166);
        setField(term40125, term40125.getClass(), "deleted", term40176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingId", argTypes, term40125, args);
    }

};



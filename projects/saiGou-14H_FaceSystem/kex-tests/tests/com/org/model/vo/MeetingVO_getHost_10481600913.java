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

public class MeetingVO_getHost_10481600913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7315;

    public MeetingVO_getHost_10481600913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7316 = new Integer(-942194446);
        Integer term7354 = new Integer(-938508470);
        Integer term7414 = new Integer(1242676024);
        Integer term7426 = new Integer(-1865023308);
        Integer term7428 = new Integer(1698510819);
        term7315 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term7356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7421 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7315, term7315.getClass(), "id", term7316);
        setField(term7315, term7315.getClass(), "name", "PBcepqkBBV");
        setField(term7315, term7315.getClass(), "host", "mukHRKZmND");
        setField(term7315, term7315.getClass(), "roomName", "WVPSokrFPV");
        setField(term7315, term7315.getClass(), "online", term7354);
        setIntField(term7357, term7357.getClass(), "year", 2020);
        setShortField(term7357, term7357.getClass(), "month", (short) 7);
        setShortField(term7357, term7357.getClass(), "day", (short) 24);
        setField(term7356, term7356.getClass(), "date", term7357);
        setByteField(term7361, term7361.getClass(), "hour", (byte) 0);
        setByteField(term7361, term7361.getClass(), "minute", (byte) 59);
        setByteField(term7361, term7361.getClass(), "second", (byte) 56);
        setIntField(term7361, term7361.getClass(), "nano", 320219201);
        setField(term7356, term7356.getClass(), "time", term7361);
        setField(term7315, term7315.getClass(), "createTime", term7356);
        setField(term7315, term7315.getClass(), "link", "jELmrpQCNf");
        setField(term7315, term7315.getClass(), "meetingTime", "NkjAcBXmmT");
        setField(term7315, term7315.getClass(), "signTime", "KgtGJGInhu");
        setField(term7315, term7315.getClass(), "introduce", "mVHDjrsMAV");
        setField(term7315, term7315.getClass(), "state", term7414);
        setIntField(term7417, term7417.getClass(), "year", 2014);
        setShortField(term7417, term7417.getClass(), "month", (short) 7);
        setShortField(term7417, term7417.getClass(), "day", (short) 13);
        setField(term7416, term7416.getClass(), "date", term7417);
        setByteField(term7421, term7421.getClass(), "hour", (byte) 21);
        setByteField(term7421, term7421.getClass(), "minute", (byte) 46);
        setByteField(term7421, term7421.getClass(), "second", (byte) 0);
        setIntField(term7421, term7421.getClass(), "nano", 887884128);
        setField(term7416, term7416.getClass(), "time", term7421);
        setField(term7315, term7315.getClass(), "updateTime", term7416);
        setField(term7315, term7315.getClass(), "userNumber", term7426);
        setField(term7315, term7315.getClass(), "signNumber", term7428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term7315, args);
    }

};



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

public class MeetingVO_getName_8895076402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7130;

    public MeetingVO_getName_8895076402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7131 = new Integer(719656595);
        Integer term7169 = new Integer(-1516995753);
        Integer term7229 = new Integer(-390501023);
        Integer term7241 = new Integer(-1667482829);
        Integer term7243 = new Integer(1116576792);
        term7130 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term7171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7236 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7130, term7130.getClass(), "id", term7131);
        setField(term7130, term7130.getClass(), "name", "qociGUMzem");
        setField(term7130, term7130.getClass(), "host", "HHAfSjIdNi");
        setField(term7130, term7130.getClass(), "roomName", "oTqQEKklHi");
        setField(term7130, term7130.getClass(), "online", term7169);
        setIntField(term7172, term7172.getClass(), "year", 2029);
        setShortField(term7172, term7172.getClass(), "month", (short) 6);
        setShortField(term7172, term7172.getClass(), "day", (short) 23);
        setField(term7171, term7171.getClass(), "date", term7172);
        setByteField(term7176, term7176.getClass(), "hour", (byte) 21);
        setByteField(term7176, term7176.getClass(), "minute", (byte) 55);
        setByteField(term7176, term7176.getClass(), "second", (byte) 27);
        setIntField(term7176, term7176.getClass(), "nano", 66889274);
        setField(term7171, term7171.getClass(), "time", term7176);
        setField(term7130, term7130.getClass(), "createTime", term7171);
        setField(term7130, term7130.getClass(), "link", "riyKkxMvWm");
        setField(term7130, term7130.getClass(), "meetingTime", "WENnGcBSTd");
        setField(term7130, term7130.getClass(), "signTime", "juEYcOCxLW");
        setField(term7130, term7130.getClass(), "introduce", "YsWgGEhEmC");
        setField(term7130, term7130.getClass(), "state", term7229);
        setIntField(term7232, term7232.getClass(), "year", 2017);
        setShortField(term7232, term7232.getClass(), "month", (short) 3);
        setShortField(term7232, term7232.getClass(), "day", (short) 5);
        setField(term7231, term7231.getClass(), "date", term7232);
        setByteField(term7236, term7236.getClass(), "hour", (byte) 20);
        setByteField(term7236, term7236.getClass(), "minute", (byte) 34);
        setByteField(term7236, term7236.getClass(), "second", (byte) 55);
        setIntField(term7236, term7236.getClass(), "nano", 78024496);
        setField(term7231, term7231.getClass(), "time", term7236);
        setField(term7130, term7130.getClass(), "updateTime", term7231);
        setField(term7130, term7130.getClass(), "userNumber", term7241);
        setField(term7130, term7130.getClass(), "signNumber", term7243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term7130, args);
    }

};



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

public class MeetingMessage_getNickname_399858837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703;

    public MeetingMessage_getNickname_399858837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term740 = new Integer(1134449235);
        Integer term742 = new Integer(-883034806);
        term703 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term759 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term703, term703.getClass(), "username", "vrQLuWIDJX");
        setField(term703, term703.getClass(), "nickname", "flxyYxBRtu");
        setField(term703, term703.getClass(), "sex", "OclPbYPkcH");
        setField(term703, term703.getClass(), "umPower", term740);
        setField(term703, term703.getClass(), "state", term742);
        setIntField(term745, term745.getClass(), "year", 2012);
        setShortField(term745, term745.getClass(), "month", (short) 9);
        setShortField(term745, term745.getClass(), "day", (short) 11);
        setField(term744, term744.getClass(), "date", term745);
        setByteField(term749, term749.getClass(), "hour", (byte) 22);
        setByteField(term749, term749.getClass(), "minute", (byte) 10);
        setByteField(term749, term749.getClass(), "second", (byte) 8);
        setIntField(term749, term749.getClass(), "nano", 380008862);
        setField(term744, term744.getClass(), "time", term749);
        setField(term703, term703.getClass(), "startTime", term744);
        setIntField(term755, term755.getClass(), "year", 2021);
        setShortField(term755, term755.getClass(), "month", (short) 9);
        setShortField(term755, term755.getClass(), "day", (short) 7);
        setField(term754, term754.getClass(), "date", term755);
        setByteField(term759, term759.getClass(), "hour", (byte) 5);
        setByteField(term759, term759.getClass(), "minute", (byte) 25);
        setByteField(term759, term759.getClass(), "second", (byte) 7);
        setIntField(term759, term759.getClass(), "nano", 755924076);
        setField(term754, term754.getClass(), "time", term759);
        setField(term703, term703.getClass(), "endTime", term754);
        setField(term703, term703.getClass(), "allTime", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickname", argTypes, term703, args);
    }

};



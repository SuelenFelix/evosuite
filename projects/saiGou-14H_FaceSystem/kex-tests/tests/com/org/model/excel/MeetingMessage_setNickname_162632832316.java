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

public class MeetingMessage_setNickname_162632832316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38080;

    public MeetingMessage_setNickname_162632832316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38117 = new Integer(-411068820);
        Integer term38119 = new Integer(-608484309);
        term38080 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term38121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38126 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38136 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38080, term38080.getClass(), "username", "LVDexpaQJR");
        setField(term38080, term38080.getClass(), "nickname", "vlzfUznWJR");
        setField(term38080, term38080.getClass(), "sex", "FdzDmAbJCC");
        setField(term38080, term38080.getClass(), "umPower", term38117);
        setField(term38080, term38080.getClass(), "state", term38119);
        setIntField(term38122, term38122.getClass(), "year", 2029);
        setShortField(term38122, term38122.getClass(), "month", (short) 7);
        setShortField(term38122, term38122.getClass(), "day", (short) 8);
        setField(term38121, term38121.getClass(), "date", term38122);
        setByteField(term38126, term38126.getClass(), "hour", (byte) 17);
        setByteField(term38126, term38126.getClass(), "minute", (byte) 0);
        setByteField(term38126, term38126.getClass(), "second", (byte) 26);
        setIntField(term38126, term38126.getClass(), "nano", 789866170);
        setField(term38121, term38121.getClass(), "time", term38126);
        setField(term38080, term38080.getClass(), "startTime", term38121);
        setIntField(term38132, term38132.getClass(), "year", 2010);
        setShortField(term38132, term38132.getClass(), "month", (short) 3);
        setShortField(term38132, term38132.getClass(), "day", (short) 28);
        setField(term38131, term38131.getClass(), "date", term38132);
        setByteField(term38136, term38136.getClass(), "hour", (byte) 22);
        setByteField(term38136, term38136.getClass(), "minute", (byte) 36);
        setByteField(term38136, term38136.getClass(), "second", (byte) 47);
        setIntField(term38136, term38136.getClass(), "nano", 84020683);
        setField(term38131, term38131.getClass(), "time", term38136);
        setField(term38080, term38080.getClass(), "endTime", term38131);
        setField(term38080, term38080.getClass(), "allTime", "OSXAuRuAau");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "azsnWqwRkF";
        callMethod(klass, "setNickname", argTypes, term38080, args);
    }

};



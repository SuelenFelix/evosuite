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

public class MeetingMessage_hashCode_96601018526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38829;

    public MeetingMessage_hashCode_96601018526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38829 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        setField(term38829, term38829.getClass(), "username", null);
        setField(term38829, term38829.getClass(), "nickname", null);
        setField(term38829, term38829.getClass(), "sex", null);
        setField(term38829, term38829.getClass(), "umPower", null);
        setField(term38829, term38829.getClass(), "state", null);
        setField(term38829, term38829.getClass(), "startTime", null);
        setField(term38829, term38829.getClass(), "endTime", null);
        setField(term38829, term38829.getClass(), "allTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term38829, args);
    }

};



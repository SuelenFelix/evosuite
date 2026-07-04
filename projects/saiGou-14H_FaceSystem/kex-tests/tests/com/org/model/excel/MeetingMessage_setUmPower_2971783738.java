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

public class MeetingMessage_setUmPower_2971783738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2391;

    public MeetingMessage_setUmPower_2971783738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2391 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        setField(term2391, term2391.getClass(), "username", null);
        setField(term2391, term2391.getClass(), "nickname", null);
        setField(term2391, term2391.getClass(), "sex", null);
        setField(term2391, term2391.getClass(), "umPower", null);
        setField(term2391, term2391.getClass(), "state", null);
        setField(term2391, term2391.getClass(), "startTime", null);
        setField(term2391, term2391.getClass(), "endTime", null);
        setField(term2391, term2391.getClass(), "allTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUmPower", argTypes, term2391, args);
    }

};



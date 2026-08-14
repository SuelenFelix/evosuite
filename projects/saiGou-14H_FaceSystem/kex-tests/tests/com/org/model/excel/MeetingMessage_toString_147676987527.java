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

public class MeetingMessage_toString_147676987527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38830;

    public MeetingMessage_toString_147676987527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38830 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        setField(term38830, term38830.getClass(), "username", null);
        setField(term38830, term38830.getClass(), "nickname", null);
        setField(term38830, term38830.getClass(), "sex", null);
        setField(term38830, term38830.getClass(), "umPower", null);
        setField(term38830, term38830.getClass(), "state", null);
        setField(term38830, term38830.getClass(), "startTime", null);
        setField(term38830, term38830.getClass(), "endTime", null);
        setField(term38830, term38830.getClass(), "allTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term38830, args);
    }

};



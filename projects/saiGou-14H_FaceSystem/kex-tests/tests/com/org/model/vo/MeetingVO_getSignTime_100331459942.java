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

public class MeetingVO_getSignTime_100331459942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53428;

    public MeetingVO_getSignTime_100331459942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53428 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        setField(term53428, term53428.getClass(), "id", null);
        setField(term53428, term53428.getClass(), "name", null);
        setField(term53428, term53428.getClass(), "host", null);
        setField(term53428, term53428.getClass(), "roomName", null);
        setField(term53428, term53428.getClass(), "online", null);
        setField(term53428, term53428.getClass(), "createTime", null);
        setField(term53428, term53428.getClass(), "link", null);
        setField(term53428, term53428.getClass(), "meetingTime", null);
        setField(term53428, term53428.getClass(), "signTime", null);
        setField(term53428, term53428.getClass(), "introduce", null);
        setField(term53428, term53428.getClass(), "state", null);
        setField(term53428, term53428.getClass(), "updateTime", null);
        setField(term53428, term53428.getClass(), "userNumber", null);
        setField(term53428, term53428.getClass(), "signNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSignTime", argTypes, term53428, args);
    }

};



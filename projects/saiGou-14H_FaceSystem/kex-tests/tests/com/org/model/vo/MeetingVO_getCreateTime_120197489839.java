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

public class MeetingVO_getCreateTime_120197489839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13056;

    public MeetingVO_getCreateTime_120197489839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13056 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        setField(term13056, term13056.getClass(), "id", null);
        setField(term13056, term13056.getClass(), "name", null);
        setField(term13056, term13056.getClass(), "host", null);
        setField(term13056, term13056.getClass(), "roomName", null);
        setField(term13056, term13056.getClass(), "online", null);
        setField(term13056, term13056.getClass(), "createTime", null);
        setField(term13056, term13056.getClass(), "link", null);
        setField(term13056, term13056.getClass(), "meetingTime", null);
        setField(term13056, term13056.getClass(), "signTime", null);
        setField(term13056, term13056.getClass(), "introduce", null);
        setField(term13056, term13056.getClass(), "state", null);
        setField(term13056, term13056.getClass(), "updateTime", null);
        setField(term13056, term13056.getClass(), "userNumber", null);
        setField(term13056, term13056.getClass(), "signNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term13056, args);
    }

};



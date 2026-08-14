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

public class MeetingVO_setSignNumber_186041346261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53447;

    public MeetingVO_setSignNumber_186041346261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53447 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        setField(term53447, term53447.getClass(), "id", null);
        setField(term53447, term53447.getClass(), "name", null);
        setField(term53447, term53447.getClass(), "host", null);
        setField(term53447, term53447.getClass(), "roomName", null);
        setField(term53447, term53447.getClass(), "online", null);
        setField(term53447, term53447.getClass(), "createTime", null);
        setField(term53447, term53447.getClass(), "link", null);
        setField(term53447, term53447.getClass(), "meetingTime", null);
        setField(term53447, term53447.getClass(), "signTime", null);
        setField(term53447, term53447.getClass(), "introduce", null);
        setField(term53447, term53447.getClass(), "state", null);
        setField(term53447, term53447.getClass(), "updateTime", null);
        setField(term53447, term53447.getClass(), "userNumber", null);
        setField(term53447, term53447.getClass(), "signNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSignNumber", argTypes, term53447, args);
    }

};



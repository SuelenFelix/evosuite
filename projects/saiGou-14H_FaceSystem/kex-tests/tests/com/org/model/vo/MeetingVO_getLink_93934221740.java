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

public class MeetingVO_getLink_93934221740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53426;

    public MeetingVO_getLink_93934221740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53426 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        setField(term53426, term53426.getClass(), "id", null);
        setField(term53426, term53426.getClass(), "name", null);
        setField(term53426, term53426.getClass(), "host", null);
        setField(term53426, term53426.getClass(), "roomName", null);
        setField(term53426, term53426.getClass(), "online", null);
        setField(term53426, term53426.getClass(), "createTime", null);
        setField(term53426, term53426.getClass(), "link", null);
        setField(term53426, term53426.getClass(), "meetingTime", null);
        setField(term53426, term53426.getClass(), "signTime", null);
        setField(term53426, term53426.getClass(), "introduce", null);
        setField(term53426, term53426.getClass(), "state", null);
        setField(term53426, term53426.getClass(), "updateTime", null);
        setField(term53426, term53426.getClass(), "userNumber", null);
        setField(term53426, term53426.getClass(), "signNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLink", argTypes, term53426, args);
    }

};



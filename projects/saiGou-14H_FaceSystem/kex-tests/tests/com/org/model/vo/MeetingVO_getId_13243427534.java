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

public class MeetingVO_getId_13243427534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53420;

    public MeetingVO_getId_13243427534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53420 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        setField(term53420, term53420.getClass(), "id", null);
        setField(term53420, term53420.getClass(), "name", null);
        setField(term53420, term53420.getClass(), "host", null);
        setField(term53420, term53420.getClass(), "roomName", null);
        setField(term53420, term53420.getClass(), "online", null);
        setField(term53420, term53420.getClass(), "createTime", null);
        setField(term53420, term53420.getClass(), "link", null);
        setField(term53420, term53420.getClass(), "meetingTime", null);
        setField(term53420, term53420.getClass(), "signTime", null);
        setField(term53420, term53420.getClass(), "introduce", null);
        setField(term53420, term53420.getClass(), "state", null);
        setField(term53420, term53420.getClass(), "updateTime", null);
        setField(term53420, term53420.getClass(), "userNumber", null);
        setField(term53420, term53420.getClass(), "signNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term53420, args);
    }

};



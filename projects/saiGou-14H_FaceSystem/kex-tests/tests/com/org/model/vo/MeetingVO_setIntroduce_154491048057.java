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

public class MeetingVO_setIntroduce_154491048057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13074;

    public MeetingVO_setIntroduce_154491048057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13074 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        setField(term13074, term13074.getClass(), "id", null);
        setField(term13074, term13074.getClass(), "name", null);
        setField(term13074, term13074.getClass(), "host", null);
        setField(term13074, term13074.getClass(), "roomName", null);
        setField(term13074, term13074.getClass(), "online", null);
        setField(term13074, term13074.getClass(), "createTime", null);
        setField(term13074, term13074.getClass(), "link", null);
        setField(term13074, term13074.getClass(), "meetingTime", null);
        setField(term13074, term13074.getClass(), "signTime", null);
        setField(term13074, term13074.getClass(), "introduce", null);
        setField(term13074, term13074.getClass(), "state", null);
        setField(term13074, term13074.getClass(), "updateTime", null);
        setField(term13074, term13074.getClass(), "userNumber", null);
        setField(term13074, term13074.getClass(), "signNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIntroduce", argTypes, term13074, args);
    }

};



package com.amazonaws.kda.flink.starterkit;

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
import static com.amazonaws.kda.flink.starterkit.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Event_getSessionid_104110526613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2261;

    public Event_getSessionid_104110526613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2261 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term2261, term2261.getClass(), "attr_1", "sEccwbJKYE");
        setField(term2261, term2261.getClass(), "attr_2", "AWRooQKkdW");
        setField(term2261, term2261.getClass(), "attr_3", "vjxIhXHxGR");
        setField(term2261, term2261.getClass(), "attr_4", "QXzGXbEXMu");
        setField(term2261, term2261.getClass(), "attr_5", "qxSDVejjiY");
        setField(term2261, term2261.getClass(), "attr_6", "xBsXSDjXYK");
        setLongField(term2261, term2261.getClass(), "attr_7", 7009926388951271268L);
        setField(term2261, term2261.getClass(), "attr_8", "sEnIVFtZuQ");
        setField(term2261, term2261.getClass(), "session_id", "ZVecLZMLHF");
        setLongField(term2261, term2261.getClass(), "timestamp", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSession_id", argTypes, term2261, args);
    }

};



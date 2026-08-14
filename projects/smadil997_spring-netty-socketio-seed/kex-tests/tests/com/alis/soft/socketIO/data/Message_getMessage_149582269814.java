package com.alis.soft.socketIO.data;

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
import static com.alis.soft.socketIO.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Message_getMessage_149582269814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public Message_getMessage_149582269814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741 = newInstance(Class.forName("com.alis.soft.socketIO.data.Message"));
        setField(term741, term741.getClass(), "senderName", null);
        setField(term741, term741.getClass(), "targetUserName", null);
        setField(term741, term741.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alis.soft.socketIO.data.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term741, args);
    }

};



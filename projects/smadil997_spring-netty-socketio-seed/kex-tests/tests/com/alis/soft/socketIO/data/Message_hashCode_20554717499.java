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

public class Message_hashCode_20554717499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605;

    public Message_hashCode_20554717499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605 = newInstance(Class.forName("com.alis.soft.socketIO.data.Message"));
        setField(term605, term605.getClass(), "senderName", "OclPbYPkcH");
        setField(term605, term605.getClass(), "targetUserName", "IoAlmYsBwc");
        setField(term605, term605.getClass(), "message", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alis.soft.socketIO.data.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term605, args);
    }

};



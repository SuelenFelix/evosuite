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

public class Message_setMessage_19876635746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;

    public Message_setMessage_19876635746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380 = newInstance(Class.forName("com.alis.soft.socketIO.data.Message"));
        setField(term380, term380.getClass(), "senderName", "tbcdzjIfER");
        setField(term380, term380.getClass(), "targetUserName", "HyxfbSQYBe");
        setField(term380, term380.getClass(), "message", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alis.soft.socketIO.data.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setMessage", argTypes, term380, args);
    }

};



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

public class Message_equals_16067850747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;
     Object term506;

    public Message_equals_16067850747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469 = newInstance(Class.forName("com.alis.soft.socketIO.data.Message"));
        setField(term469, term469.getClass(), "senderName", "RkybSrpybU");
        setField(term469, term469.getClass(), "targetUserName", "xOEqzGAmDU");
        setField(term469, term469.getClass(), "message", "eZFUvlxvGV");
        term506 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alis.soft.socketIO.data.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term506;
        callMethod(klass, "equals", argTypes, term469, args);
    }

};



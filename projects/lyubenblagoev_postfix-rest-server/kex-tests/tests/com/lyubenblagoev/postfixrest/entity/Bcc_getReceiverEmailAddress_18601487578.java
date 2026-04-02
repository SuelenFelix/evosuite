package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Bcc_getReceiverEmailAddress_18601487578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5215;

    public Bcc_getReceiverEmailAddress_18601487578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5215 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc"));
        setField(term5215, term5215.getClass(), "account", null);
        setField(term5215, term5215.getClass(), "receiverEmailAddress", null);
        setField(term5215, term5215.getClass(), "id", null);
        setBooleanField(term5215, term5215.getClass(), "enabled", false);
        setField(term5215, term5215.getClass(), "created", null);
        setField(term5215, term5215.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReceiverEmailAddress", argTypes, term5215, args);
    }

};



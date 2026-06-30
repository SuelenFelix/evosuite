package com.example.demo;

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
import static com.example.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TwilioConfiguration_getAccountSid_9899262828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;

    public TwilioConfiguration_getAccountSid_9899262828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469 = newInstance(Class.forName("com.example.demo.TwilioConfiguration"));
        setField(term469, term469.getClass(), "accountSid", null);
        setField(term469, term469.getClass(), "authToken", null);
        setField(term469, term469.getClass(), "trialNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.TwilioConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountSid", argTypes, term469, args);
    }

};



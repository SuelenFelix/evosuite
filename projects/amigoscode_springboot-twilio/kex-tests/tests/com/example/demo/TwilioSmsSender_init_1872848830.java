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

public class TwilioSmsSender_init_1872848830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;

    public TwilioSmsSender_init_1872848830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475 = newInstance(Class.forName("com.example.demo.TwilioConfiguration"));
        setField(term475, term475.getClass(), "accountSid", "RkybSrpybU");
        setField(term475, term475.getClass(), "authToken", "xOEqzGAmDU");
        setField(term475, term475.getClass(), "trialNumber", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.TwilioSmsSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.demo.TwilioConfiguration");
        Object[] args = new Object[1];
        args[0] = term475;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



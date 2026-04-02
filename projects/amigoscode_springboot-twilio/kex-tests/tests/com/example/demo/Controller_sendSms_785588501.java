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
import java.lang.Object;

public class Controller_sendSms_785588501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;
     Object term932;

    public Controller_sendSms_785588501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term930 = newInstance(Class.forName("com.example.demo.Controller"));
        Object term931 = newInstance(Class.forName("com.example.demo.Service"));
        setField(term931, term931.getClass(), "smsSender", null);
        setField(term930, term930.getClass(), "service", term931);
        term932 = newInstance(Class.forName("com.example.demo.SmsRequest"));
        setField(term932, term932.getClass(), "phoneNumber", "UlajhuVLaP");
        setField(term932, term932.getClass(), "message", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.Controller");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.demo.SmsRequest");
        Object[] args = new Object[1];
        args[0] = term932;
        callMethod(klass, "sendSms", argTypes, term930, args);
    }

};



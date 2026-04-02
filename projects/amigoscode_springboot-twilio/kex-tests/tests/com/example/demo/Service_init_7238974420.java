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

public class Service_init_7238974420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;

    public Service_init_7238974420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("com.example.demo.TwilioSmsSender"));
        Object term748 = newInstance(Class.forName("com.example.demo.TwilioConfiguration"));
        setField(term748, term748.getClass(), "accountSid", "SbAoxhfrkn");
        setField(term748, term748.getClass(), "authToken", "kuTXqwMtDB");
        setField(term748, term748.getClass(), "trialNumber", "Ghbwtircqb");
        setField(term747, term747.getClass(), "twilioConfiguration", term748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.Service");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.demo.TwilioSmsSender");
        Object[] args = new Object[1];
        args[0] = term747;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



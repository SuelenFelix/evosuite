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

public class TwilioSmsSender_sendSms_21216118861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542;
     Object term580;

    public TwilioSmsSender_sendSms_21216118861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542 = newInstance(Class.forName("com.example.demo.TwilioSmsSender"));
        Object term543 = newInstance(Class.forName("com.example.demo.TwilioConfiguration"));
        setField(term543, term543.getClass(), "accountSid", "BYqFIqCKAV");
        setField(term543, term543.getClass(), "authToken", "vrQLuWIDJX");
        setField(term543, term543.getClass(), "trialNumber", "flxyYxBRtu");
        setField(term542, term542.getClass(), "twilioConfiguration", term543);
        term580 = newInstance(Class.forName("com.example.demo.SmsRequest"));
        setField(term580, term580.getClass(), "phoneNumber", "OclPbYPkcH");
        setField(term580, term580.getClass(), "message", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.TwilioSmsSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.demo.SmsRequest");
        Object[] args = new Object[1];
        args[0] = term580;
        callMethod(klass, "sendSms", argTypes, term542, args);
    }

};



package com.pfa.app.config.twilio;

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
import static com.pfa.app.config.twilio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TwilioConfig_getAccountSid_1602604898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;

    public TwilioConfig_getAccountSid_1602604898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469 = newInstance(Class.forName("com.pfa.app.config.twilio.TwilioConfig"));
        setField(term469, term469.getClass(), "accountSid", null);
        setField(term469, term469.getClass(), "authToken", null);
        setField(term469, term469.getClass(), "trialNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.config.twilio.TwilioConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountSid", argTypes, term469, args);
    }

};



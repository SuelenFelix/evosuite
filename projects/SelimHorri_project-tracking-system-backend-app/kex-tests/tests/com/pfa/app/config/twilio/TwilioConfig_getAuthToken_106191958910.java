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

public class TwilioConfig_getAuthToken_106191958910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;

    public TwilioConfig_getAuthToken_106191958910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("com.pfa.app.config.twilio.TwilioConfig"));
        setField(term471, term471.getClass(), "accountSid", null);
        setField(term471, term471.getClass(), "authToken", null);
        setField(term471, term471.getClass(), "trialNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.config.twilio.TwilioConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthToken", argTypes, term471, args);
    }

};



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

public class TwilioConfig_getAccountSid_1602604891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TwilioConfig_getAccountSid_1602604891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.pfa.app.config.twilio.TwilioConfig"));
        setField(term1, term1.getClass(), "accountSid", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "authToken", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "trialNumber", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.config.twilio.TwilioConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountSid", argTypes, term1, args);
    }

};



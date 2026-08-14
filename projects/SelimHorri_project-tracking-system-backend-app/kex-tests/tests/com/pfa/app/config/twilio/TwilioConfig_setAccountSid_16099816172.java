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

public class TwilioConfig_setAccountSid_16099816172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public TwilioConfig_setAccountSid_16099816172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("com.pfa.app.config.twilio.TwilioConfig"));
        setField(term68, term68.getClass(), "accountSid", "xxtlPwDYFs");
        setField(term68, term68.getClass(), "authToken", "jJCZpVmanW");
        setField(term68, term68.getClass(), "trialNumber", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.config.twilio.TwilioConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setAccountSid", argTypes, term68, args);
    }

};



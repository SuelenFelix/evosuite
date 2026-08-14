package com.as12.models;

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
import static com.as12.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mail_setMailFrom_13688651572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public Mail_setMailFrom_13688651572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term176, term176.getClass(), "mailFrom", "MjGYSRKTNF");
        setField(term176, term176.getClass(), "mailTo", "hRNSzYYIrc");
        setField(term176, term176.getClass(), "mailCc", "RMFIsYGgne");
        setField(term176, term176.getClass(), "mailBcc", "NRdvgJlhkX");
        setField(term176, term176.getClass(), "mailSubject", "uuaPigETmJ");
        setField(term176, term176.getClass(), "mailContent", "MxlszYVzRf");
        setField(term176, term176.getClass(), "templateName", "LQFpaHEwXR");
        setField(term176, term176.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "setMailFrom", argTypes, term176, args);
    }

};



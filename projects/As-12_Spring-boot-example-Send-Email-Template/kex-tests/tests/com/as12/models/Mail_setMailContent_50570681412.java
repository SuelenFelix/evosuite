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

public class Mail_setMailContent_50570681412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2036;

    public Mail_setMailContent_50570681412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2036 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term2036, term2036.getClass(), "mailFrom", "jUbSRrkrYZ");
        setField(term2036, term2036.getClass(), "mailTo", "bWWfajKbEX");
        setField(term2036, term2036.getClass(), "mailCc", "cAPeiZHKGJ");
        setField(term2036, term2036.getClass(), "mailBcc", "LvJFtLBaxj");
        setField(term2036, term2036.getClass(), "mailSubject", "PHvxnGHptP");
        setField(term2036, term2036.getClass(), "mailContent", "TimdotUuNC");
        setField(term2036, term2036.getClass(), "templateName", "PkWMRdJcBb");
        setField(term2036, term2036.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jSpAteRute";
        callMethod(klass, "setMailContent", argTypes, term2036, args);
    }

};



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

public class Mail_setMailBcc_5144914458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292;

    public Mail_setMailBcc_5144914458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1292 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term1292, term1292.getClass(), "mailFrom", "UoYtihxVaS");
        setField(term1292, term1292.getClass(), "mailTo", "JDswTTCZHV");
        setField(term1292, term1292.getClass(), "mailCc", "onpbIeEKoi");
        setField(term1292, term1292.getClass(), "mailBcc", "YRHGsAkhxb");
        setField(term1292, term1292.getClass(), "mailSubject", "ffYhPOzlUs");
        setField(term1292, term1292.getClass(), "mailContent", "MLqYREekMl");
        setField(term1292, term1292.getClass(), "templateName", "ytSBIKXogI");
        setField(term1292, term1292.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setMailBcc", argTypes, term1292, args);
    }

};



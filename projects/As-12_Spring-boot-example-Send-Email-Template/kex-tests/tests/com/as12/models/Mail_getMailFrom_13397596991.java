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

public class Mail_getMailFrom_13397596991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Mail_getMailFrom_13397596991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term1, term1.getClass(), "mailFrom", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "mailTo", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "mailCc", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "mailBcc", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "mailSubject", "jJCZpVmanW");
        setField(term1, term1.getClass(), "mailContent", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "templateName", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailFrom", argTypes, term1, args);
    }

};



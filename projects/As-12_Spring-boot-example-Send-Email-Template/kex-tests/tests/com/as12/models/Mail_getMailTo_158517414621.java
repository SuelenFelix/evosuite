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

public class Mail_getMailTo_158517414621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3154;

    public Mail_getMailTo_158517414621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3154 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term3154, term3154.getClass(), "mailFrom", null);
        setField(term3154, term3154.getClass(), "mailTo", null);
        setField(term3154, term3154.getClass(), "mailCc", null);
        setField(term3154, term3154.getClass(), "mailBcc", null);
        setField(term3154, term3154.getClass(), "mailSubject", null);
        setField(term3154, term3154.getClass(), "mailContent", null);
        setField(term3154, term3154.getClass(), "templateName", null);
        setField(term3154, term3154.getClass(), "contentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailTo", argTypes, term3154, args);
    }

};



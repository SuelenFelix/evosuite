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

public class Mail_getContentType_76878212533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3166;

    public Mail_getContentType_76878212533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3166 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term3166, term3166.getClass(), "mailFrom", null);
        setField(term3166, term3166.getClass(), "mailTo", null);
        setField(term3166, term3166.getClass(), "mailCc", null);
        setField(term3166, term3166.getClass(), "mailBcc", null);
        setField(term3166, term3166.getClass(), "mailSubject", null);
        setField(term3166, term3166.getClass(), "mailContent", null);
        setField(term3166, term3166.getClass(), "templateName", null);
        setField(term3166, term3166.getClass(), "contentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term3166, args);
    }

};



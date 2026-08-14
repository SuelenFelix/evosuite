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

public class Mail_getMailContent_60875763011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1861;

    public Mail_getMailContent_60875763011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1861 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term1861, term1861.getClass(), "mailFrom", "MAcUBcBckh");
        setField(term1861, term1861.getClass(), "mailTo", "oVgzLbrsFr");
        setField(term1861, term1861.getClass(), "mailCc", "vQVyKLdtaz");
        setField(term1861, term1861.getClass(), "mailBcc", "OWKQODBLzb");
        setField(term1861, term1861.getClass(), "mailSubject", "wGmYcqUkgE");
        setField(term1861, term1861.getClass(), "mailContent", "idgaQsnJpQ");
        setField(term1861, term1861.getClass(), "templateName", "VgZnGoIFwQ");
        setField(term1861, term1861.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailContent", argTypes, term1861, args);
    }

};



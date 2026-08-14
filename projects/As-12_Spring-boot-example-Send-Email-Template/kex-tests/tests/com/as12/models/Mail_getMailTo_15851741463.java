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

public class Mail_getMailTo_15851741463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public Mail_getMailTo_15851741463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term373, term373.getClass(), "mailFrom", "aJlieCFVtF");
        setField(term373, term373.getClass(), "mailTo", "ZiaGIbnzTs");
        setField(term373, term373.getClass(), "mailCc", "tbcdzjIfER");
        setField(term373, term373.getClass(), "mailBcc", "HyxfbSQYBe");
        setField(term373, term373.getClass(), "mailSubject", "pCTimMblYc");
        setField(term373, term373.getClass(), "mailContent", "hNxWaHcfhY");
        setField(term373, term373.getClass(), "templateName", "RkybSrpybU");
        setField(term373, term373.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailTo", argTypes, term373, args);
    }

};



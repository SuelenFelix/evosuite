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

public class Mail_getContentType_76878212515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2605;

    public Mail_getContentType_76878212515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2605 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term2605, term2605.getClass(), "mailFrom", "qxSDVejjiY");
        setField(term2605, term2605.getClass(), "mailTo", "xBsXSDjXYK");
        setField(term2605, term2605.getClass(), "mailCc", "sEnIVFtZuQ");
        setField(term2605, term2605.getClass(), "mailBcc", "ZVecLZMLHF");
        setField(term2605, term2605.getClass(), "mailSubject", "fztQhjqwdP");
        setField(term2605, term2605.getClass(), "mailContent", "eVpkWxjuki");
        setField(term2605, term2605.getClass(), "templateName", "SJiQaLvSKv");
        setField(term2605, term2605.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term2605, args);
    }

};



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

public class Mail_toString_187785590217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977;

    public Mail_toString_187785590217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2977 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term2977, term2977.getClass(), "mailFrom", "dpNsDgfPso");
        setField(term2977, term2977.getClass(), "mailTo", "hCWPJQKpdc");
        setField(term2977, term2977.getClass(), "mailCc", "WzMEhMXkKx");
        setField(term2977, term2977.getClass(), "mailBcc", "XOiDvlDhdc");
        setField(term2977, term2977.getClass(), "mailSubject", "AdxvLJhNLe");
        setField(term2977, term2977.getClass(), "mailContent", "lHfTrWKMPk");
        setField(term2977, term2977.getClass(), "templateName", "JDaAnsVTGV");
        setField(term2977, term2977.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2977, args);
    }

};



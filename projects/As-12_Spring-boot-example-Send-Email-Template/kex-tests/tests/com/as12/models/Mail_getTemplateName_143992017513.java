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

public class Mail_getTemplateName_143992017513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233;

    public Mail_getTemplateName_143992017513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2233 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term2233, term2233.getClass(), "mailFrom", "swZVeJAxjt");
        setField(term2233, term2233.getClass(), "mailTo", "xOcJIiQQDu");
        setField(term2233, term2233.getClass(), "mailCc", "GVizqqzXpy");
        setField(term2233, term2233.getClass(), "mailBcc", "JqXGgAhZPl");
        setField(term2233, term2233.getClass(), "mailSubject", "jiKYgYHqIS");
        setField(term2233, term2233.getClass(), "mailContent", "DfISiziTgG");
        setField(term2233, term2233.getClass(), "templateName", "XqgfKFvPSD");
        setField(term2233, term2233.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateName", argTypes, term2233, args);
    }

};



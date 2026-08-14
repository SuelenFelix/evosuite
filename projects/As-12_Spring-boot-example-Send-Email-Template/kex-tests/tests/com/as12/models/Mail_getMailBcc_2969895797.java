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

public class Mail_getMailBcc_2969895797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1117;

    public Mail_getMailBcc_2969895797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1117 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term1117, term1117.getClass(), "mailFrom", "GzFkzHGYFt");
        setField(term1117, term1117.getClass(), "mailTo", "tShwQLRGNe");
        setField(term1117, term1117.getClass(), "mailCc", "LvtrsXUliU");
        setField(term1117, term1117.getClass(), "mailBcc", "xLbjWUgOIL");
        setField(term1117, term1117.getClass(), "mailSubject", "jDtqGUpnZN");
        setField(term1117, term1117.getClass(), "mailContent", "nGKItKLYNC");
        setField(term1117, term1117.getClass(), "templateName", "UiUYnPrcCi");
        setField(term1117, term1117.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailBcc", argTypes, term1117, args);
    }

};



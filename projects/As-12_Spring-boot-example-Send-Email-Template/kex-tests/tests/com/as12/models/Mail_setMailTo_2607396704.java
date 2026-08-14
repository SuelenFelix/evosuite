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

public class Mail_setMailTo_2607396704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;

    public Mail_setMailTo_2607396704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term548, term548.getClass(), "mailFrom", "xOEqzGAmDU");
        setField(term548, term548.getClass(), "mailTo", "eZFUvlxvGV");
        setField(term548, term548.getClass(), "mailCc", "BYqFIqCKAV");
        setField(term548, term548.getClass(), "mailBcc", "vrQLuWIDJX");
        setField(term548, term548.getClass(), "mailSubject", "flxyYxBRtu");
        setField(term548, term548.getClass(), "mailContent", "OclPbYPkcH");
        setField(term548, term548.getClass(), "templateName", "IoAlmYsBwc");
        setField(term548, term548.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setMailTo", argTypes, term548, args);
    }

};



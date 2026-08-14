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

public class Mail_getMailCc_15856921255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745;

    public Mail_getMailCc_15856921255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term745, term745.getClass(), "mailFrom", "OWDIEULEFu");
        setField(term745, term745.getClass(), "mailTo", "dWRymuLBtr");
        setField(term745, term745.getClass(), "mailCc", "AijpHYOFuy");
        setField(term745, term745.getClass(), "mailBcc", "SbAoxhfrkn");
        setField(term745, term745.getClass(), "mailSubject", "kuTXqwMtDB");
        setField(term745, term745.getClass(), "mailContent", "Ghbwtircqb");
        setField(term745, term745.getClass(), "templateName", "xrwlQZdwCp");
        setField(term745, term745.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailCc", argTypes, term745, args);
    }

};



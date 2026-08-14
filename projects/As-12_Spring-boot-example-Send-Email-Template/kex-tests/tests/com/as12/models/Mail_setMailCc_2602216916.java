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

public class Mail_setMailCc_2602216916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;

    public Mail_setMailCc_2602216916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term920 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term920, term920.getClass(), "mailFrom", "IDCWpPLRkE");
        setField(term920, term920.getClass(), "mailTo", "nyiiPDVjAc");
        setField(term920, term920.getClass(), "mailCc", "aKnKipADSo");
        setField(term920, term920.getClass(), "mailBcc", "wSQxaModmm");
        setField(term920, term920.getClass(), "mailSubject", "UlajhuVLaP");
        setField(term920, term920.getClass(), "mailContent", "gGSMzuGICf");
        setField(term920, term920.getClass(), "templateName", "hxCBltsObl");
        setField(term920, term920.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setMailCc", argTypes, term920, args);
    }

};



package com.alkemy.ong.application.service.contact;

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
import static com.alkemy.ong.application.service.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateContactUseCaseService_sendContactConfirmationEmail_5663436371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term96;

    public CreateContactUseCaseService_sendContactConfirmationEmail_5663436371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("com.alkemy.ong.application.service.contact.CreateContactUseCaseService"));
        setField(term95, term95.getClass(), "contactRepository", null);
        setField(term95, term95.getClass(), "organizationRepository", null);
        setField(term95, term95.getClass(), "mailSender", null);
        Long term97 = new Long(6375119433582206027L);
        term96 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term96, term96.getClass(), "id", term97);
        setField(term96, term96.getClass(), "name", "jJCZpVmanW");
        setField(term96, term96.getClass(), "phone", "EGtDIRbSSb");
        setField(term96, term96.getClass(), "email", "SzjVpOQTyS");
        setField(term96, term96.getClass(), "message", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.contact.CreateContactUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Contact");
        Object[] args = new Object[1];
        args[0] = term96;
        callMethod(klass, "sendContactConfirmationEmail", argTypes, term95, args);
    }

};



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

public class CreateContactUseCaseService_create_9087587903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public CreateContactUseCaseService_create_9087587903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187 = newInstance(Class.forName("com.alkemy.ong.application.service.contact.CreateContactUseCaseService"));
        setField(term187, term187.getClass(), "contactRepository", null);
        setField(term187, term187.getClass(), "organizationRepository", null);
        setField(term187, term187.getClass(), "mailSender", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.contact.CreateContactUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Contact");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term187, args);
    }

};



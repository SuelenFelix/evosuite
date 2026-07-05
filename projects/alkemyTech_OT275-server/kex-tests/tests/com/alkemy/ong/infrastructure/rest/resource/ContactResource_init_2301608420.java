package com.alkemy.ong.infrastructure.rest.resource;

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
import static com.alkemy.ong.infrastructure.rest.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContactResource_init_2301608420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term26;

    public ContactResource_init_2301608420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.CreateContactMapper"));
        term26 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.ListContactMapper"));
        Object term27 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.GetContactMapper"));
        setField(term26, term26.getClass(), "getContactMapper", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.ContactResource");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.contact.usecase.IListContactUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.contact.usecase.ICreateContactUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.CreateContactMapper");
        argTypes[3] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.ListContactMapper");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term25;
        args[3] = term26;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



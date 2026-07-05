package com.alkemy.ong.infrastructure.rest.request.contact;

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
import static com.alkemy.ong.infrastructure.rest.request.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateContactRequest_getEmail_13592495782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public CreateContactRequest_getEmail_13592495782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.contact.CreateContactRequest"));
        setField(term179, term179.getClass(), "name", "hRNSzYYIrc");
        setField(term179, term179.getClass(), "phone", "RMFIsYGgne");
        setField(term179, term179.getClass(), "email", "NRdvgJlhkX");
        setField(term179, term179.getClass(), "message", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.contact.CreateContactRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term179, args);
    }

};



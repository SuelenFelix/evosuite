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

public class CreateContactUseCaseService_create_9087587900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;

    public CreateContactUseCaseService_create_9087587900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.alkemy.ong.application.service.contact.CreateContactUseCaseService"));
        setField(term3, term3.getClass(), "contactRepository", null);
        setField(term3, term3.getClass(), "organizationRepository", null);
        setField(term3, term3.getClass(), "mailSender", null);
        Long term5 = new Long(2442117782898005296L);
        term4 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term4, term4.getClass(), "id", term5);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "phone", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "email", "MuLcgQHgqz");
        setField(term4, term4.getClass(), "message", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.contact.CreateContactUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Contact");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "create", argTypes, term3, args);
    }

};



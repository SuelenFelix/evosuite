package com.alkemy.ong.infrastructure.rest.mapper.contact;

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
import static com.alkemy.ong.infrastructure.rest.mapper.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateContactMapper_toResponse_7093549272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term92;

    public CreateContactMapper_toResponse_7093549272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.CreateContactMapper"));
        Long term93 = new Long(2442117782898005296L);
        term92 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term92, term92.getClass(), "id", term93);
        setField(term92, term92.getClass(), "name", "jJCZpVmanW");
        setField(term92, term92.getClass(), "phone", "EGtDIRbSSb");
        setField(term92, term92.getClass(), "email", "SzjVpOQTyS");
        setField(term92, term92.getClass(), "message", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.CreateContactMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Contact");
        Object[] args = new Object[1];
        args[0] = term92;
        callMethod(klass, "toResponse", argTypes, term91, args);
    }

};



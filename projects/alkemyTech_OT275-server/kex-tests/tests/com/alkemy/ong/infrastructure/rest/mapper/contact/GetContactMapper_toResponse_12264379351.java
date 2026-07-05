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

public class GetContactMapper_toResponse_12264379351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;
     Object term350;

    public GetContactMapper_toResponse_12264379351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.GetContactMapper"));
        Long term351 = new Long(4872422362414183754L);
        term350 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term350, term350.getClass(), "id", term351);
        setField(term350, term350.getClass(), "name", "IoAlmYsBwc");
        setField(term350, term350.getClass(), "phone", "TEParAifyi");
        setField(term350, term350.getClass(), "email", "OWDIEULEFu");
        setField(term350, term350.getClass(), "message", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.GetContactMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Contact");
        Object[] args = new Object[1];
        args[0] = term350;
        callMethod(klass, "toResponse", argTypes, term349, args);
    }

};



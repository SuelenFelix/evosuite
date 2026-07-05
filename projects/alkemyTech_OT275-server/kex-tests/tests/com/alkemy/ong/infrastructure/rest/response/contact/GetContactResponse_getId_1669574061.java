package com.alkemy.ong.infrastructure.rest.response.contact;

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
import static com.alkemy.ong.infrastructure.rest.response.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GetContactResponse_getId_1669574061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public GetContactResponse_getId_1669574061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term230 = new Long(-8257434502486459194L);
        term229 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term229, term229.getClass(), "id", term230);
        setField(term229, term229.getClass(), "name", "NRdvgJlhkX");
        setField(term229, term229.getClass(), "phone", "uuaPigETmJ");
        setField(term229, term229.getClass(), "email", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term229, args);
    }

};



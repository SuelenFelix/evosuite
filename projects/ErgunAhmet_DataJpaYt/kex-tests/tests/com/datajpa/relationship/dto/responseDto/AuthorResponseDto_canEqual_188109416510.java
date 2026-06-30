package com.datajpa.relationship.dto.responseDto;

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
import static com.datajpa.relationship.dto.responseDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class AuthorResponseDto_canEqual_188109416510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4416;
     Object term4543;

    public AuthorResponseDto_canEqual_188109416510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4417 = new Long(-484994522244390100L);
        ArrayList term4431 = new ArrayList();
        ((ArrayList) term4431).add("OqbwYQfvAe");
        ((ArrayList) term4431).add("tRxZafjqIx");
        ((ArrayList) term4431).add("DhjNLmRMCu");
        ((ArrayList) term4431).add("PgPzMSEjjX");
        ((ArrayList) term4431).add("wzsPSPcRdj");
        ((ArrayList) term4431).add("kGMQdqJYyB");
        ((ArrayList) term4431).add("XJJNClzHRf");
        ((ArrayList) term4431).add("HDaezxQfQR");
        term4416 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term4416, term4416.getClass(), "id", term4417);
        setField(term4416, term4416.getClass(), "name", "sZdUNdggUW");
        setField(term4416, term4416.getClass(), "bookNames", term4431);
        setField(term4416, term4416.getClass(), "zipcodeName", "iikZEapDlu");
        term4543 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4543;
        callMethod(klass, "canEqual", argTypes, term4416, args);
    }

};



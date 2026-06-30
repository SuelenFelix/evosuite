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

public class AuthorResponseDto_getZipcodeName_8087421764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3464;

    public AuthorResponseDto_getZipcodeName_8087421764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3465 = new Long(-4502405999831680926L);
        ArrayList term3479 = new ArrayList();
        ((ArrayList) term3479).add("ZfdXfCCFDf");
        ((ArrayList) term3479).add("MwwjNtdOFT");
        ((ArrayList) term3479).add("VYkqXKVlAJ");
        ((ArrayList) term3479).add("XkIoWJRNwN");
        ((ArrayList) term3479).add("aNWLJdrZMq");
        term3464 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term3464, term3464.getClass(), "id", term3465);
        setField(term3464, term3464.getClass(), "name", "jwsfVjMoJT");
        setField(term3464, term3464.getClass(), "bookNames", term3479);
        setField(term3464, term3464.getClass(), "zipcodeName", "HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZipcodeName", argTypes, term3464, args);
    }

};



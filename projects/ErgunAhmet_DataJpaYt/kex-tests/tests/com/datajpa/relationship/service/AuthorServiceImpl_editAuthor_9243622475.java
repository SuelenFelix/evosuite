package com.datajpa.relationship.service;

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
import static com.datajpa.relationship.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AuthorServiceImpl_editAuthor_9243622475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328;
     Object term330;

    public AuthorServiceImpl_editAuthor_9243622475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328 = new Long(-6292278961887936280L);
        Long term343 = new Long(-6645965768855543712L);
        term330 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.AuthorRequestDto"));
        setField(term330, term330.getClass(), "name", "RMFIsYGgne");
        setField(term330, term330.getClass(), "zipcodeId", term343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.service.AuthorServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.datajpa.relationship.dto.requestDto.AuthorRequestDto");
        Object[] args = new Object[2];
        args[0] = term328;
        args[1] = term330;
        callMethod(klass, "editAuthor", argTypes, null, args);
    }

};



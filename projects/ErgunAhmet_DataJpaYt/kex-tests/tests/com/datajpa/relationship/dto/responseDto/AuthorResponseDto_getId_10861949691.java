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

public class AuthorResponseDto_getId_10861949691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3003;

    public AuthorResponseDto_getId_10861949691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3004 = new Long(2486810210675247493L);
        ArrayList term3018 = new ArrayList();
        ((ArrayList) term3018).add("AKNapTAfmD");
        ((ArrayList) term3018).add("xJgPlLxpgC");
        ((ArrayList) term3018).add("EYtfuJaxiM");
        term3003 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term3003, term3003.getClass(), "id", term3004);
        setField(term3003, term3003.getClass(), "name", "OJJtVNPyKZ");
        setField(term3003, term3003.getClass(), "bookNames", term3018);
        setField(term3003, term3003.getClass(), "zipcodeName", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3003, args);
    }

};



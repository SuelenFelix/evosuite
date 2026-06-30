package com.datajpa.relationship.dto.requestDto;

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
import static com.datajpa.relationship.dto.requestDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class BookRequestDto_getCategoryId_11780594893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881;

    public BookRequestDto_getCategoryId_11780594893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term896 = new Long(2120084523938730454L);
        Long term898 = new Long(6855071767938501807L);
        Long term900 = new Long(-5892135042702373494L);
        ArrayList term894 = new ArrayList();
        ((ArrayList) term894).add(term896);
        ((ArrayList) term894).add(term898);
        ((ArrayList) term894).add(term900);
        Long term904 = new Long(5262507301787091109L);
        term881 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term881, term881.getClass(), "name", "kuTXqwMtDB");
        setField(term881, term881.getClass(), "authorIds", term894);
        setField(term881, term881.getClass(), "categoryId", term904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryId", argTypes, term881, args);
    }

};



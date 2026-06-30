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

public class BookResponseDto_getAuthorNames_112915667716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2993;

    public BookResponseDto_getAuthorNames_112915667716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2993 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2993, term2993.getClass(), "id", null);
        setField(term2993, term2993.getClass(), "name", null);
        setField(term2993, term2993.getClass(), "authorNames", null);
        setField(term2993, term2993.getClass(), "categoryName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthorNames", argTypes, term2993, args);
    }

};



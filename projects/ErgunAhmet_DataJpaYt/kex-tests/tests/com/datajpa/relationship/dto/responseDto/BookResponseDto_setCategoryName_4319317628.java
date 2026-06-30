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

public class BookResponseDto_setCategoryName_4319317628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2140;

    public BookResponseDto_setCategoryName_4319317628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2141 = new Long(-4920224193275732920L);
        ArrayList term2155 = new ArrayList();
        ((ArrayList) term2155).add("jiKYgYHqIS");
        ((ArrayList) term2155).add("DfISiziTgG");
        ((ArrayList) term2155).add("XqgfKFvPSD");
        ((ArrayList) term2155).add("JiVRgTZvKc");
        ((ArrayList) term2155).add("XPKmummaqg");
        ((ArrayList) term2155).add("BKLfkLiZTH");
        ((ArrayList) term2155).add("SPpkrGcPRr");
        ((ArrayList) term2155).add("sEccwbJKYE");
        term2140 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2140, term2140.getClass(), "id", term2141);
        setField(term2140, term2140.getClass(), "name", "JqXGgAhZPl");
        setField(term2140, term2140.getClass(), "authorNames", term2155);
        setField(term2140, term2140.getClass(), "categoryName", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setCategoryName", argTypes, term2140, args);
    }

};



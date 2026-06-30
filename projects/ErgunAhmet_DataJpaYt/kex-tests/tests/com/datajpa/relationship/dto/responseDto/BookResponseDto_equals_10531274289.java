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

public class BookResponseDto_equals_10531274289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;
     Object term2492;

    public BookResponseDto_equals_10531274289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2390 = new Long(8428634514691209827L);
        ArrayList term2404 = new ArrayList();
        ((ArrayList) term2404).add("qxSDVejjiY");
        ((ArrayList) term2404).add("xBsXSDjXYK");
        ((ArrayList) term2404).add("sEnIVFtZuQ");
        ((ArrayList) term2404).add("ZVecLZMLHF");
        ((ArrayList) term2404).add("fztQhjqwdP");
        ((ArrayList) term2404).add("eVpkWxjuki");
        term2389 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2389, term2389.getClass(), "id", term2390);
        setField(term2389, term2389.getClass(), "name", "QXzGXbEXMu");
        setField(term2389, term2389.getClass(), "authorNames", term2404);
        setField(term2389, term2389.getClass(), "categoryName", "SJiQaLvSKv");
        term2492 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2492;
        callMethod(klass, "equals", argTypes, term2389, args);
    }

};



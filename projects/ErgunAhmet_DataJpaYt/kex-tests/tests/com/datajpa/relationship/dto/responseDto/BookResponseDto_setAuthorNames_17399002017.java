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
import java.util.LinkedList;

public class BookResponseDto_setAuthorNames_17399002017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2064;
     Object term2107;

    public BookResponseDto_setAuthorNames_17399002017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2065 = new Long(-6573104506744284592L);
        ArrayList term2079 = new ArrayList();
        ((ArrayList) term2079).add("xOcJIiQQDu");
        term2064 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2064, term2064.getClass(), "id", term2065);
        setField(term2064, term2064.getClass(), "name", "swZVeJAxjt");
        setField(term2064, term2064.getClass(), "authorNames", term2079);
        setField(term2064, term2064.getClass(), "categoryName", "GVizqqzXpy");
        term2107 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2107;
        callMethod(klass, "setAuthorNames", argTypes, term2064, args);
    }

};



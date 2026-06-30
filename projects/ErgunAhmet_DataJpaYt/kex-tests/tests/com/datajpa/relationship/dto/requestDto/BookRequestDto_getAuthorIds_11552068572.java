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

public class BookRequestDto_getAuthorIds_11552068572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;

    public BookRequestDto_getAuthorIds_11552068572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term859 = new Long(2486810210675247493L);
        Long term861 = new Long(7009926388951271268L);
        Long term863 = new Long(-7672528020740371001L);
        Long term865 = new Long(-4502405999831680926L);
        ArrayList term857 = new ArrayList();
        ((ArrayList) term857).add(term859);
        ((ArrayList) term857).add(term861);
        ((ArrayList) term857).add(term863);
        ((ArrayList) term857).add(term865);
        Long term869 = new Long(1967728129628047933L);
        term844 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term844, term844.getClass(), "name", "SbAoxhfrkn");
        setField(term844, term844.getClass(), "authorIds", term857);
        setField(term844, term844.getClass(), "categoryId", term869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthorIds", argTypes, term844, args);
    }

};



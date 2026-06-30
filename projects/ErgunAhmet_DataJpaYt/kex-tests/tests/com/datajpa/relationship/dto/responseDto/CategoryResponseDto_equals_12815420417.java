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

public class CategoryResponseDto_equals_12815420417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term789;

    public CategoryResponseDto_equals_12815420417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term771 = new Long(6811161968424632369L);
        ArrayList term785 = new ArrayList();
        term770 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto"));
        setField(term770, term770.getClass(), "id", term771);
        setField(term770, term770.getClass(), "name", "Ghbwtircqb");
        setField(term770, term770.getClass(), "bookNames", term785);
        term789 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term789;
        callMethod(klass, "equals", argTypes, term770, args);
    }

};



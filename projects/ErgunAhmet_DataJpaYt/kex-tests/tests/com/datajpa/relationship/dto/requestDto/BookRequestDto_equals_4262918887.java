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

public class BookRequestDto_equals_4262918887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082;
     Object term1101;

    public BookRequestDto_equals_4262918887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1095 = new ArrayList();
        Long term1099 = new Long(5953383087795962419L);
        term1082 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term1082, term1082.getClass(), "name", "aKnKipADSo");
        setField(term1082, term1082.getClass(), "authorIds", term1095);
        setField(term1082, term1082.getClass(), "categoryId", term1099);
        term1101 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1101;
        callMethod(klass, "equals", argTypes, term1082, args);
    }

};



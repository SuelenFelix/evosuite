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

public class BookResponseDto_canEqual_185729005710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;
     Object term2628;

    public BookResponseDto_canEqual_185729005710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2574 = new Long(-2585684163342970173L);
        ArrayList term2588 = new ArrayList();
        ((ArrayList) term2588).add("RYdKCNNMBR");
        ((ArrayList) term2588).add("yGtHPyvYiQ");
        term2573 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2573, term2573.getClass(), "id", term2574);
        setField(term2573, term2573.getClass(), "name", "OEXDRUKcFl");
        setField(term2573, term2573.getClass(), "authorNames", term2588);
        setField(term2573, term2573.getClass(), "categoryName", "MvRIxilFMJ");
        term2628 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2628;
        callMethod(klass, "canEqual", argTypes, term2573, args);
    }

};



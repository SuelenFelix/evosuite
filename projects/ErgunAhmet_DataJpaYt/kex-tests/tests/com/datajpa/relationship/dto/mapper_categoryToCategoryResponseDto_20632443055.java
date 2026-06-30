package com.datajpa.relationship.dto;

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
import static com.datajpa.relationship.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class mapper_categoryToCategoryResponseDto_20632443055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5700;

    public mapper_categoryToCategoryResponseDto_20632443055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5701 = new Long(6005241913654469005L);
        ArrayList term5715 = new ArrayList();
        term5700 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term5700, term5700.getClass(), "id", term5701);
        setField(term5700, term5700.getClass(), "name", "ypEdrstygY");
        setField(term5700, term5700.getClass(), "books", term5715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Category");
        Object[] args = new Object[1];
        args[0] = term5700;
        callMethod(klass, "categoryToCategoryResponseDto", argTypes, null, args);
    }

};



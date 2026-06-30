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
import java.lang.Object;
import java.util.ArrayList;

public class mapper_authorToAuthorResponseDto_6096166693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5581;

    public mapper_authorToAuthorResponseDto_6096166693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5582 = new Long(-7291743527973326814L);
        Long term5597 = new Long(-5963439350418910964L);
        Long term5612 = new Long(9013624480170062917L);
        ArrayList term5626 = new ArrayList();
        term5581 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term5596 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term5611 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term5581, term5581.getClass(), "id", term5582);
        setField(term5581, term5581.getClass(), "name", "CKWpJaaaxX");
        setField(term5596, term5596.getClass(), "id", term5597);
        setField(term5596, term5596.getClass(), "name", "UBRmXJmfrt");
        setField(term5611, term5611.getClass(), "id", term5612);
        setField(term5611, term5611.getClass(), "name", "WZzvmIHhzZ");
        setField(term5596, term5596.getClass(), "city", term5611);
        setField(term5581, term5581.getClass(), "zipcode", term5596);
        setField(term5581, term5581.getClass(), "books", term5626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Author");
        Object[] args = new Object[1];
        args[0] = term5581;
        callMethod(klass, "authorToAuthorResponseDto", argTypes, null, args);
    }

};



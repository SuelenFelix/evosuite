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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class mapper_authorsToAuthorResponseDtos_20717015124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5660;

    public mapper_authorsToAuthorResponseDtos_20717015124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5664 = new Long(7862575738391801707L);
        Long term5679 = new Long(50358265865610362L);
        Long term5683 = new Long(5510783420697225605L);
        ArrayList term5685 = new ArrayList();
        Object term5663 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term5678 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term5682 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term5663, term5663.getClass(), "id", term5664);
        setField(term5663, term5663.getClass(), "name", "doQLHkjpNm");
        setField(term5678, term5678.getClass(), "id", term5679);
        setField(term5678, term5678.getClass(), "name", "");
        setField(term5682, term5682.getClass(), "id", term5683);
        setField(term5682, term5682.getClass(), "name", null);
        setField(term5678, term5678.getClass(), "city", term5682);
        setField(term5663, term5663.getClass(), "zipcode", term5678);
        setField(term5663, term5663.getClass(), "books", term5685);
        term5660 = new LinkedList();
        ((LinkedList) term5660).add(term5663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5660;
        callMethod(klass, "authorsToAuthorResponseDtos", argTypes, null, args);
    }

};



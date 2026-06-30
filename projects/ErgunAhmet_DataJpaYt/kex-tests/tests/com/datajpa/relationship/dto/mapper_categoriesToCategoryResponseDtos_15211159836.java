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

public class mapper_categoriesToCategoryResponseDtos_15211159836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5729;

    public mapper_categoriesToCategoryResponseDtos_15211159836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5733 = new Long(-1983291584002806658L);
        ArrayList term5747 = new ArrayList();
        Object term5732 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term5732, term5732.getClass(), "id", term5733);
        setField(term5732, term5732.getClass(), "name", "sNQFlATEeQ");
        setField(term5732, term5732.getClass(), "books", term5747);
        term5729 = new LinkedList();
        ((LinkedList) term5729).add(term5732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5729;
        callMethod(klass, "categoriesToCategoryResponseDtos", argTypes, null, args);
    }

};



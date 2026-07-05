package com.alkemy.ong.infrastructure.rest.mapper.category;

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
import static com.alkemy.ong.infrastructure.rest.mapper.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class GetCategoryMapper_toResponse_19443197292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;
     Object term353;

    public GetCategoryMapper_toResponse_19443197292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        Long term357 = new Long(-8400487765614892086L);
        Object term356 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term356, term356.getClass(), "id", term357);
        setField(term356, term356.getClass(), "name", "aJlieCFVtF");
        setField(term356, term356.getClass(), "description", "ZiaGIbnzTs");
        setField(term356, term356.getClass(), "imageUrl", "tbcdzjIfER");
        Long term397 = new Long(5270370404989704783L);
        Object term396 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term396, term396.getClass(), "id", term397);
        setField(term396, term396.getClass(), "name", "");
        setField(term396, term396.getClass(), "description", "");
        setField(term396, term396.getClass(), "imageUrl", "");
        Long term404 = new Long(7411271909051562686L);
        Object term403 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term403, term403.getClass(), "id", term404);
        setField(term403, term403.getClass(), "name", null);
        setField(term403, term403.getClass(), "description", null);
        setField(term403, term403.getClass(), "imageUrl", null);
        term353 = new LinkedList();
        ((LinkedList) term353).add(term356);
        ((LinkedList) term353).add(term396);
        ((LinkedList) term353).add(term403);
        ((LinkedList) term353).add((Object)null);
        ((LinkedList) term353).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term353;
        callMethod(klass, "toResponse", argTypes, term352, args);
    }

};



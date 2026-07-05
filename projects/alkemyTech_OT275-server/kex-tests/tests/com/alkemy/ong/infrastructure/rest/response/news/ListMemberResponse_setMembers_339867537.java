package com.alkemy.ong.infrastructure.rest.response.news;

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
import static com.alkemy.ong.infrastructure.rest.response.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ListMemberResponse_setMembers_339867537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2201;

    public ListMemberResponse_setMembers_339867537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2201 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListMemberResponse"));
        setField(term2201, term2201.getClass(), "members", null);
        setIntField(term2201, term2201.getClass(), "page", 0);
        setIntField(term2201, term2201.getClass(), "size", 0);
        setIntField(term2201, term2201.getClass(), "totalPages", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMembers", argTypes, term2201, args);
    }

};



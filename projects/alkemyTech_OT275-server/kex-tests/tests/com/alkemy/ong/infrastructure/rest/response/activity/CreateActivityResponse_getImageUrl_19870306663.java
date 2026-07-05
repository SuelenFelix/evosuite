package com.alkemy.ong.infrastructure.rest.response.activity;

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
import static com.alkemy.ong.infrastructure.rest.response.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateActivityResponse_getImageUrl_19870306663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term836;

    public CreateActivityResponse_getImageUrl_19870306663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term837 = new Long(-4325723315152823407L);
        term836 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.CreateActivityResponse"));
        setField(term836, term836.getClass(), "id", term837);
        setField(term836, term836.getClass(), "name", "xrwlQZdwCp");
        setField(term836, term836.getClass(), "content", "IDCWpPLRkE");
        setField(term836, term836.getClass(), "imageUrl", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.CreateActivityResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term836, args);
    }

};



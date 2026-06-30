package com.alkemy.ong.infrastructure.rest.response.category;

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
import static com.alkemy.ong.infrastructure.rest.response.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateCategoryResponse_setDescription_16302712586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037;

    public CreateCategoryResponse_setDescription_16302712586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2038 = new Long(-2068172595987555756L);
        term2037 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse"));
        setField(term2037, term2037.getClass(), "id", term2038);
        setField(term2037, term2037.getClass(), "name", "hCWPJQKpdc");
        setField(term2037, term2037.getClass(), "description", "WzMEhMXkKx");
        setField(term2037, term2037.getClass(), "image", "XOiDvlDhdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "setDescription", argTypes, term2037, args);
    }

};



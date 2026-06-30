package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Zipcode_hashCode_5368593639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2022;

    public Zipcode_hashCode_5368593639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2023 = new Long(1672578078364590450L);
        Long term2038 = new Long(4949335493504695457L);
        term2022 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term2037 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term2022, term2022.getClass(), "id", term2023);
        setField(term2022, term2022.getClass(), "name", "sEccwbJKYE");
        setField(term2037, term2037.getClass(), "id", term2038);
        setField(term2037, term2037.getClass(), "name", "AWRooQKkdW");
        setField(term2022, term2022.getClass(), "city", term2037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2022, args);
    }

};



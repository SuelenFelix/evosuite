package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_getEmail_8734435314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20181;

    public User_getEmail_8734435314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20182 = new Long(4369503082568083627L);
        Long term20245 = new Long(-1148001666040486410L);
        term20181 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term20244 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term20181, term20181.getClass(), "id", term20182);
        setField(term20181, term20181.getClass(), "firstName", "PhtNZAacut");
        setField(term20181, term20181.getClass(), "lastName", "xbPAqsSBBS");
        setField(term20181, term20181.getClass(), "email", "ivxMfASKCB");
        setField(term20181, term20181.getClass(), "password", "JbksMMXXzT");
        setField(term20181, term20181.getClass(), "imageUrl", "WHpoLWpffz");
        setField(term20244, term20244.getClass(), "id", term20245);
        setField(term20244, term20244.getClass(), "name", "axiXBkomuw");
        setField(term20244, term20244.getClass(), "description", "nhByIXwUpO");
        setField(term20181, term20181.getClass(), "role", term20244);
        setField(term20181, term20181.getClass(), "token", "vVySvQZVok");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term20181, args);
    }

};



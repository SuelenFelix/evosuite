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

public class User_getLastName_13392234603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19999;

    public User_getLastName_13392234603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20000 = new Long(873013799050926004L);
        Long term20063 = new Long(132446939133186077L);
        term19999 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term20062 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term19999, term19999.getClass(), "id", term20000);
        setField(term19999, term19999.getClass(), "firstName", "OBbbsrFNxC");
        setField(term19999, term19999.getClass(), "lastName", "mvdZyohjrq");
        setField(term19999, term19999.getClass(), "email", "hXsByefZqZ");
        setField(term19999, term19999.getClass(), "password", "PfWKdFFgbz");
        setField(term19999, term19999.getClass(), "imageUrl", "rgmFLfFmTW");
        setField(term20062, term20062.getClass(), "id", term20063);
        setField(term20062, term20062.getClass(), "name", "GHvFvelXFv");
        setField(term20062, term20062.getClass(), "description", "MIDoqNmCoh");
        setField(term19999, term19999.getClass(), "role", term20062);
        setField(term19999, term19999.getClass(), "token", "yrOIMfdQSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term19999, args);
    }

};



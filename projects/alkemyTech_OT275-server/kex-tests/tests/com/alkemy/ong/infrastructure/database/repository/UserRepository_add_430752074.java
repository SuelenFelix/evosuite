package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserRepository_add_430752074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1410;

    public UserRepository_add_430752074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1411 = new Long(-1468719814009985452L);
        Long term1474 = new Long(-7738503207562305297L);
        term1410 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1473 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term1410, term1410.getClass(), "id", term1411);
        setField(term1410, term1410.getClass(), "firstName", "igCAtimmYB");
        setField(term1410, term1410.getClass(), "lastName", "DyiXbeYIaN");
        setField(term1410, term1410.getClass(), "email", "VGizxZnyHX");
        setField(term1410, term1410.getClass(), "password", "kVEZMHmRtR");
        setField(term1410, term1410.getClass(), "imageUrl", "ekxGuOYIwi");
        setField(term1473, term1473.getClass(), "id", term1474);
        setField(term1473, term1473.getClass(), "name", "RbVQXSpxXy");
        setField(term1473, term1473.getClass(), "description", "YpJbIgJWWv");
        setField(term1410, term1410.getClass(), "role", term1473);
        setField(term1410, term1410.getClass(), "token", "JppkknKVOw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.UserRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term1410;
        callMethod(klass, "add", argTypes, null, args);
    }

};



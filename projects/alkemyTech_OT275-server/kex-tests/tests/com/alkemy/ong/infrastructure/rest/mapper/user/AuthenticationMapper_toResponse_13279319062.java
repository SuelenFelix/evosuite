package com.alkemy.ong.infrastructure.rest.mapper.user;

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
import static com.alkemy.ong.infrastructure.rest.mapper.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AuthenticationMapper_toResponse_13279319062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751;
     Object term752;

    public AuthenticationMapper_toResponse_13279319062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.AuthenticationMapper"));
        Long term753 = new Long(-5476826692763582090L);
        Long term816 = new Long(-872011222785455006L);
        term752 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term815 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term752, term752.getClass(), "id", term753);
        setField(term752, term752.getClass(), "firstName", "hoicvmsovO");
        setField(term752, term752.getClass(), "lastName", "eqJfYWRaEL");
        setField(term752, term752.getClass(), "email", "fhkbdRViHi");
        setField(term752, term752.getClass(), "password", "uWHnvSvaPl");
        setField(term752, term752.getClass(), "imageUrl", "kBdSllIBVz");
        setField(term815, term815.getClass(), "id", term816);
        setField(term815, term815.getClass(), "name", "TJmVBGfTML");
        setField(term815, term815.getClass(), "description", "tPlsykYBqO");
        setField(term752, term752.getClass(), "role", term815);
        setField(term752, term752.getClass(), "token", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.AuthenticationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term752;
        callMethod(klass, "toResponse", argTypes, term751, args);
    }

};



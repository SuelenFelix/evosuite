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

public class GetUserDetailsMapper_toResponse_3263813461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;
     Object term249;

    public GetUserDetailsMapper_toResponse_3263813461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserDetailsMapper"));
        Long term250 = new Long(-2813493605142626659L);
        Long term313 = new Long(-8885298608300233488L);
        term249 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term312 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term249, term249.getClass(), "id", term250);
        setField(term249, term249.getClass(), "firstName", "wSQxaModmm");
        setField(term249, term249.getClass(), "lastName", "UlajhuVLaP");
        setField(term249, term249.getClass(), "email", "gGSMzuGICf");
        setField(term249, term249.getClass(), "password", "hxCBltsObl");
        setField(term249, term249.getClass(), "imageUrl", "BndsHwAFMv");
        setField(term312, term312.getClass(), "id", term313);
        setField(term312, term312.getClass(), "name", "GzFkzHGYFt");
        setField(term312, term312.getClass(), "description", "tShwQLRGNe");
        setField(term249, term249.getClass(), "role", term312);
        setField(term249, term249.getClass(), "token", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserDetailsMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term249;
        callMethod(klass, "toResponse", argTypes, term248, args);
    }

};



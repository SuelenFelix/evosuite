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

public class GetUserMapper_toResponse_16476654421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936;
     Object term937;

    public GetUserMapper_toResponse_16476654421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term936 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserMapper"));
        Long term938 = new Long(-316468845751588286L);
        Long term1001 = new Long(5127676408959197577L);
        term937 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1000 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term937, term937.getClass(), "id", term938);
        setField(term937, term937.getClass(), "firstName", "whBvTVIIlC");
        setField(term937, term937.getClass(), "lastName", "IgRJUzaCwW");
        setField(term937, term937.getClass(), "email", "JUmudUmaaV");
        setField(term937, term937.getClass(), "password", "KoyGrUJeJW");
        setField(term937, term937.getClass(), "imageUrl", "HqBOwkVqjD");
        setField(term1000, term1000.getClass(), "id", term1001);
        setField(term1000, term1000.getClass(), "name", "MAcUBcBckh");
        setField(term1000, term1000.getClass(), "description", "oVgzLbrsFr");
        setField(term937, term937.getClass(), "role", term1000);
        setField(term937, term937.getClass(), "token", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term937;
        callMethod(klass, "toResponse", argTypes, term936, args);
    }

};



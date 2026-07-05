package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UpdateUserResponse_getLastName_19319930147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4089;

    public UpdateUserResponse_getLastName_19319930147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4090 = new Long(8428634514691209827L);
        term4089 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse"));
        setField(term4089, term4089.getClass(), "id", term4090);
        setField(term4089, term4089.getClass(), "firstName", "VGizxZnyHX");
        setField(term4089, term4089.getClass(), "lastName", "kVEZMHmRtR");
        setField(term4089, term4089.getClass(), "imageUrl", "ekxGuOYIwi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term4089, args);
    }

};



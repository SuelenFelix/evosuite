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

public class User_getToken_13674731288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20909;

    public User_getToken_13674731288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20910 = new Long(6313343355456678206L);
        Long term20973 = new Long(-8901826621860118061L);
        term20909 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term20972 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term20909, term20909.getClass(), "id", term20910);
        setField(term20909, term20909.getClass(), "firstName", "VDnsNuhEvG");
        setField(term20909, term20909.getClass(), "lastName", "DMrfMwXyYT");
        setField(term20909, term20909.getClass(), "email", "GAzZvzjuXP");
        setField(term20909, term20909.getClass(), "password", "WoFrMqAUlT");
        setField(term20909, term20909.getClass(), "imageUrl", "RtHOddPkOW");
        setField(term20972, term20972.getClass(), "id", term20973);
        setField(term20972, term20972.getClass(), "name", "LAaHVAeRPU");
        setField(term20972, term20972.getClass(), "description", "BLPwYfxwnm");
        setField(term20909, term20909.getClass(), "role", term20972);
        setField(term20909, term20909.getClass(), "token", "zItHVuBBzy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term20909, args);
    }

};



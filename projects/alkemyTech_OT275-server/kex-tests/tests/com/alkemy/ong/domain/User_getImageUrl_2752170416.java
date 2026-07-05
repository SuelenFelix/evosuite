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

public class User_getImageUrl_2752170416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20545;

    public User_getImageUrl_2752170416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20546 = new Long(-8735757853649335051L);
        Long term20609 = new Long(7016651719770171901L);
        term20545 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term20608 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term20545, term20545.getClass(), "id", term20546);
        setField(term20545, term20545.getClass(), "firstName", "WVQqsFGJMw");
        setField(term20545, term20545.getClass(), "lastName", "TIPSlmidwP");
        setField(term20545, term20545.getClass(), "email", "SRYeqWJJkR");
        setField(term20545, term20545.getClass(), "password", "vUVScKcyFY");
        setField(term20545, term20545.getClass(), "imageUrl", "DCSMbuGiaM");
        setField(term20608, term20608.getClass(), "id", term20609);
        setField(term20608, term20608.getClass(), "name", "wtOVzMPrFU");
        setField(term20608, term20608.getClass(), "description", "CBnamgJrJS");
        setField(term20545, term20545.getClass(), "role", term20608);
        setField(term20545, term20545.getClass(), "token", "uJhRRqAnDP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term20545, args);
    }

};



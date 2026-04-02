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

public class User_getRole_6832602667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20727;

    public User_getRole_6832602667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20728 = new Long(7777131569376571611L);
        Long term20791 = new Long(-2792969772767139843L);
        term20727 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term20790 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term20727, term20727.getClass(), "id", term20728);
        setField(term20727, term20727.getClass(), "firstName", "hJCqADrhuV");
        setField(term20727, term20727.getClass(), "lastName", "RyPUBlRpNZ");
        setField(term20727, term20727.getClass(), "email", "ardfVpCueq");
        setField(term20727, term20727.getClass(), "password", "wEYAmGJIEF");
        setField(term20727, term20727.getClass(), "imageUrl", "iXEhfXJomO");
        setField(term20790, term20790.getClass(), "id", term20791);
        setField(term20790, term20790.getClass(), "name", "KEoUMzNdMA");
        setField(term20790, term20790.getClass(), "description", "SOsGYAgpgW");
        setField(term20727, term20727.getClass(), "role", term20790);
        setField(term20727, term20727.getClass(), "token", "ZBafuLDRDM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term20727, args);
    }

};



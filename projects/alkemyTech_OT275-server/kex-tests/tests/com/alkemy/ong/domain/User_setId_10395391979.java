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

public class User_setId_10395391979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21091;
     Object term21193;

    public User_setId_10395391979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21092 = new Long(2947576061864407618L);
        Long term21155 = new Long(7265006047025305787L);
        term21091 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term21154 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term21091, term21091.getClass(), "id", term21092);
        setField(term21091, term21091.getClass(), "firstName", "pQcdIREjlp");
        setField(term21091, term21091.getClass(), "lastName", "WjUrdNMIOj");
        setField(term21091, term21091.getClass(), "email", "aQUpwHjYvS");
        setField(term21091, term21091.getClass(), "password", "lvcTLkVhAN");
        setField(term21091, term21091.getClass(), "imageUrl", "BJJuVqxXjT");
        setField(term21154, term21154.getClass(), "id", term21155);
        setField(term21154, term21154.getClass(), "name", "IvxbsFCczM");
        setField(term21154, term21154.getClass(), "description", "GkAaLUoaoL");
        setField(term21091, term21091.getClass(), "role", term21154);
        setField(term21091, term21091.getClass(), "token", "VSmPzUiFzd");
        term21193 = new Long(-3323049156110984575L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term21193;
        callMethod(klass, "setId", argTypes, term21091, args);
    }

};



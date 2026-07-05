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

public class User_setImageUrl_186155948114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22091;

    public User_setImageUrl_186155948114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22092 = new Long(-5597498165246748176L);
        Long term22155 = new Long(6174523862926526279L);
        term22091 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term22154 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term22091, term22091.getClass(), "id", term22092);
        setField(term22091, term22091.getClass(), "firstName", "BixZhUjVme");
        setField(term22091, term22091.getClass(), "lastName", "BmnUezUoWz");
        setField(term22091, term22091.getClass(), "email", "QqeCgeRpIS");
        setField(term22091, term22091.getClass(), "password", "xVwossmLda");
        setField(term22091, term22091.getClass(), "imageUrl", "EvSQeALexj");
        setField(term22154, term22154.getClass(), "id", term22155);
        setField(term22154, term22154.getClass(), "name", "VuprBjhWdI");
        setField(term22154, term22154.getClass(), "description", "CFGOXMbAUn");
        setField(term22091, term22091.getClass(), "role", term22154);
        setField(term22091, term22091.getClass(), "token", "OxlZVhvedR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eoDtSQyUsr";
        callMethod(klass, "setImageUrl", argTypes, term22091, args);
    }

};



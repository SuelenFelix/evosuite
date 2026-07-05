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

public class User_setRole_91776754815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22295;
     Object term22397;

    public User_setRole_91776754815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22296 = new Long(4977537501907213732L);
        Long term22359 = new Long(-2341942457089205755L);
        term22295 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term22358 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term22295, term22295.getClass(), "id", term22296);
        setField(term22295, term22295.getClass(), "firstName", "RMTgBohsAX");
        setField(term22295, term22295.getClass(), "lastName", "kdYeXJnJGG");
        setField(term22295, term22295.getClass(), "email", "XEdoshuvxD");
        setField(term22295, term22295.getClass(), "password", "ljtopXMcRl");
        setField(term22295, term22295.getClass(), "imageUrl", "HHtcAGkfuz");
        setField(term22358, term22358.getClass(), "id", term22359);
        setField(term22358, term22358.getClass(), "name", "QZCuYHcIBC");
        setField(term22358, term22358.getClass(), "description", "hpvoFaAyIu");
        setField(term22295, term22295.getClass(), "role", term22358);
        setField(term22295, term22295.getClass(), "token", "dyqukIBJxC");
        Long term22398 = new Long(-7503147844796296300L);
        term22397 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term22397, term22397.getClass(), "id", term22398);
        setField(term22397, term22397.getClass(), "name", "MVMiGQdgnX");
        setField(term22397, term22397.getClass(), "description", "cQnJIENJHe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Role");
        Object[] args = new Object[1];
        args[0] = term22397;
        callMethod(klass, "setRole", argTypes, term22295, args);
    }

};



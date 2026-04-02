package com.syqu.shop.domain;

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
import static com.syqu.shop.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setBalance_85453259249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7857;

    public User_setBalance_85453259249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7857 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        setLongField(term7857, term7857.getClass(), "id", 0L);
        setField(term7857, term7857.getClass(), "username", null);
        setField(term7857, term7857.getClass(), "email", null);
        setField(term7857, term7857.getClass(), "password", null);
        setField(term7857, term7857.getClass(), "passwordConfirm", null);
        setField(term7857, term7857.getClass(), "firstName", null);
        setField(term7857, term7857.getClass(), "lastName", null);
        setIntField(term7857, term7857.getClass(), "age", 0);
        setField(term7857, term7857.getClass(), "city", null);
        setField(term7857, term7857.getClass(), "gender", null);
        setField(term7857, term7857.getClass(), "balance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBalance", argTypes, term7857, args);
    }

};



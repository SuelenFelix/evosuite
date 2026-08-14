package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_setConfirmPassword_1411249911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4440;

    public User_setConfirmPassword_1411249911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4440 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term4539 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4540 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4542 = (int[]) newIntArray(5);
        setLongField(term4440, term4440.getClass(), "id", 41775768178052008L);
        setField(term4440, term4440.getClass(), "username", "nhoHrZfnIN");
        setField(term4440, term4440.getClass(), "email", "ZkMALXpEAZ");
        setField(term4440, term4440.getClass(), "password", "tXfQjSqDzN");
        setField(term4440, term4440.getClass(), "confirmPassword", "BjugTaMcxJ");
        setField(term4440, term4440.getClass(), "firstName", "vGiuZVPJNH");
        setField(term4440, term4440.getClass(), "lastName", "tlzpzIjMib");
        setIntField(term4440, term4440.getClass(), "age", 1725571209);
        setField(term4440, term4440.getClass(), "city", "AZdLeSugwv");
        setField(term4440, term4440.getClass(), "gender", "RMsXuyzKJV");
        setIntField(term4540, term4540.getClass(), "signum", 1);
        setIntElement(term4542, 0, -2002033409);
        setIntElement(term4542, 1, -1386179650);
        setIntElement(term4542, 2, -1729534613);
        setIntElement(term4542, 3, 1100074383);
        setIntElement(term4542, 4, -1610460545);
        setField(term4540, term4540.getClass(), "mag", term4542);
        setIntField(term4540, term4540.getClass(), "bitCountPlusOne", 0);
        setIntField(term4540, term4540.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4540, term4540.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4540, term4540.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4539, term4539.getClass(), "intVal", term4540);
        setIntField(term4539, term4539.getClass(), "scale", 49);
        setIntField(term4539, term4539.getClass(), "precision", 0);
        setField(term4539, term4539.getClass(), "stringCache", null);
        setLongField(term4539, term4539.getClass(), "intCompact", -9223372036854775808L);
        setField(term4440, term4440.getClass(), "balance", term4539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FwPbDZcHmB";
        callMethod(klass, "setConfirmPassword", argTypes, term4440, args);
    }

};



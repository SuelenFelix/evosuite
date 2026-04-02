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
import java.lang.Object;

public class User_setEmail_82394516214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4989;

    public User_setEmail_82394516214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4989 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term5088 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5089 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5091 = (int[]) newIntArray(6);
        setLongField(term4989, term4989.getClass(), "id", 414749984815662075L);
        setField(term4989, term4989.getClass(), "username", "HDaezxQfQR");
        setField(term4989, term4989.getClass(), "email", "iikZEapDlu");
        setField(term4989, term4989.getClass(), "password", "nhoHrZfnIN");
        setField(term4989, term4989.getClass(), "passwordConfirm", "ZkMALXpEAZ");
        setField(term4989, term4989.getClass(), "firstName", "tXfQjSqDzN");
        setField(term4989, term4989.getClass(), "lastName", "BjugTaMcxJ");
        setIntField(term4989, term4989.getClass(), "age", -883034806);
        setField(term4989, term4989.getClass(), "city", "vGiuZVPJNH");
        setField(term4989, term4989.getClass(), "gender", "tlzpzIjMib");
        setIntField(term5089, term5089.getClass(), "signum", 1);
        setIntElement(term5091, 0, 66623);
        setIntElement(term5091, 1, -721879507);
        setIntElement(term5091, 2, 685392094);
        setIntElement(term5091, 3, -309014712);
        setIntElement(term5091, 4, -2143218141);
        setIntElement(term5091, 5, -724344211);
        setField(term5089, term5089.getClass(), "mag", term5091);
        setIntField(term5089, term5089.getClass(), "bitCountPlusOne", 0);
        setIntField(term5089, term5089.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5089, term5089.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5089, term5089.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5088, term5088.getClass(), "intVal", term5089);
        setIntField(term5088, term5088.getClass(), "scale", 53);
        setIntField(term5088, term5088.getClass(), "precision", 0);
        setField(term5088, term5088.getClass(), "stringCache", null);
        setLongField(term5088, term5088.getClass(), "intCompact", -9223372036854775808L);
        setField(term4989, term4989.getClass(), "balance", term5088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AZdLeSugwv";
        callMethod(klass, "setEmail", argTypes, term4989, args);
    }

};



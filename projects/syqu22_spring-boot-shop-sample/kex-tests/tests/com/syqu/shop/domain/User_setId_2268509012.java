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
import java.lang.Long;

public class User_setId_2268509012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4561;
     Object term4677;

    public User_setId_2268509012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4561 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term4660 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4661 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4663 = (int[]) newIntArray(6);
        setLongField(term4561, term4561.getClass(), "id", -1610676979013636850L);
        setField(term4561, term4561.getClass(), "username", "kVEZMHmRtR");
        setField(term4561, term4561.getClass(), "email", "ekxGuOYIwi");
        setField(term4561, term4561.getClass(), "password", "RbVQXSpxXy");
        setField(term4561, term4561.getClass(), "passwordConfirm", "YpJbIgJWWv");
        setField(term4561, term4561.getClass(), "firstName", "JppkknKVOw");
        setField(term4561, term4561.getClass(), "lastName", "iljANwuEjk");
        setIntField(term4561, term4561.getClass(), "age", -522618178);
        setField(term4561, term4561.getClass(), "city", "kNqaJKIATy");
        setField(term4561, term4561.getClass(), "gender", "vKQukfbJUd");
        setIntField(term4661, term4661.getClass(), "signum", 1);
        setIntElement(term4663, 0, 19519);
        setIntElement(term4663, 1, -1182278371);
        setIntElement(term4663, 2, -1767261549);
        setIntElement(term4663, 3, 1466667712);
        setIntElement(term4663, 4, 124168962);
        setIntElement(term4663, 5, -1752295351);
        setField(term4661, term4661.getClass(), "mag", term4663);
        setIntField(term4661, term4661.getClass(), "bitCountPlusOne", 0);
        setIntField(term4661, term4661.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4661, term4661.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4661, term4661.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4660, term4660.getClass(), "intVal", term4661);
        setIntField(term4660, term4660.getClass(), "scale", 53);
        setIntField(term4660, term4660.getClass(), "precision", 0);
        setField(term4660, term4660.getClass(), "stringCache", null);
        setLongField(term4660, term4660.getClass(), "intCompact", -9223372036854775808L);
        setField(term4561, term4561.getClass(), "balance", term4660);
        term4677 = new Long(2062173786000223358L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4677;
        callMethod(klass, "setId", argTypes, term4561, args);
    }

};



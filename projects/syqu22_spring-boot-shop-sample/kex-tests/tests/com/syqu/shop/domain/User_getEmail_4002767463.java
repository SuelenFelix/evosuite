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

public class User_getEmail_4002767463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2743;

    public User_getEmail_4002767463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2743 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term2842 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2843 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2845 = (int[]) newIntArray(6);
        setLongField(term2743, term2743.getClass(), "id", -2644215923136513282L);
        setField(term2743, term2743.getClass(), "username", "eVpkWxjuki");
        setField(term2743, term2743.getClass(), "email", "SJiQaLvSKv");
        setField(term2743, term2743.getClass(), "password", "OEXDRUKcFl");
        setField(term2743, term2743.getClass(), "passwordConfirm", "RYdKCNNMBR");
        setField(term2743, term2743.getClass(), "firstName", "yGtHPyvYiQ");
        setField(term2743, term2743.getClass(), "lastName", "MvRIxilFMJ");
        setIntField(term2743, term2743.getClass(), "age", 1484323161);
        setField(term2743, term2743.getClass(), "city", "iNwOJRBEjp");
        setField(term2743, term2743.getClass(), "gender", "XylxrMBraH");
        setIntField(term2843, term2843.getClass(), "signum", 1);
        setIntElement(term2845, 0, 5222);
        setIntElement(term2845, 1, -454284340);
        setIntElement(term2845, 2, -1412298361);
        setIntElement(term2845, 3, -225970664);
        setIntElement(term2845, 4, -1354448185);
        setIntElement(term2845, 5, -1168679607);
        setField(term2843, term2843.getClass(), "mag", term2845);
        setIntField(term2843, term2843.getClass(), "bitCountPlusOne", 0);
        setIntField(term2843, term2843.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2843, term2843.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2843, term2843.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2842, term2842.getClass(), "intVal", term2843);
        setIntField(term2842, term2842.getClass(), "scale", 52);
        setIntField(term2842, term2842.getClass(), "precision", 0);
        setField(term2842, term2842.getClass(), "stringCache", null);
        setLongField(term2842, term2842.getClass(), "intCompact", -9223372036854775808L);
        setField(term2743, term2743.getClass(), "balance", term2842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term2743, args);
    }

};



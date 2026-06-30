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

public class User_getUsername_20444226922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2541;

    public User_getUsername_20444226922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2541 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term2640 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2641 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2643 = (int[]) newIntArray(6);
        setLongField(term2541, term2541.getClass(), "id", -2850532706972744550L);
        setField(term2541, term2541.getClass(), "username", "AWRooQKkdW");
        setField(term2541, term2541.getClass(), "email", "vjxIhXHxGR");
        setField(term2541, term2541.getClass(), "password", "QXzGXbEXMu");
        setField(term2541, term2541.getClass(), "passwordConfirm", "qxSDVejjiY");
        setField(term2541, term2541.getClass(), "firstName", "xBsXSDjXYK");
        setField(term2541, term2541.getClass(), "lastName", "sEnIVFtZuQ");
        setIntField(term2541, term2541.getClass(), "age", 1162663216);
        setField(term2541, term2541.getClass(), "city", "ZVecLZMLHF");
        setField(term2541, term2541.getClass(), "gender", "fztQhjqwdP");
        setIntField(term2641, term2641.getClass(), "signum", 1);
        setIntElement(term2643, 0, 29895);
        setIntElement(term2643, 1, 1752172477);
        setIntElement(term2643, 2, 1964732279);
        setIntElement(term2643, 3, 382594040);
        setIntElement(term2643, 4, 1485746598);
        setIntElement(term2643, 5, -1795307845);
        setField(term2641, term2641.getClass(), "mag", term2643);
        setIntField(term2641, term2641.getClass(), "bitCountPlusOne", 0);
        setIntField(term2641, term2641.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2641, term2641.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2641, term2641.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2640, term2640.getClass(), "intVal", term2641);
        setIntField(term2640, term2640.getClass(), "scale", 53);
        setIntField(term2640, term2640.getClass(), "precision", 0);
        setField(term2640, term2640.getClass(), "stringCache", null);
        setLongField(term2640, term2640.getClass(), "intCompact", -9223372036854775808L);
        setField(term2541, term2541.getClass(), "balance", term2640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term2541, args);
    }

};



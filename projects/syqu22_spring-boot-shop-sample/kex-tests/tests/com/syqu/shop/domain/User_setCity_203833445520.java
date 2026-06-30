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

public class User_setCity_203833445520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6307;

    public User_setCity_203833445520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6307 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term6406 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6407 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6409 = (int[]) newIntArray(6);
        setLongField(term6307, term6307.getClass(), "id", 41775768178052008L);
        setField(term6307, term6307.getClass(), "username", "CKWpJaaaxX");
        setField(term6307, term6307.getClass(), "email", "UBRmXJmfrt");
        setField(term6307, term6307.getClass(), "password", "WZzvmIHhzZ");
        setField(term6307, term6307.getClass(), "passwordConfirm", "doQLHkjpNm");
        setField(term6307, term6307.getClass(), "firstName", "lCyLIcSuom");
        setField(term6307, term6307.getClass(), "lastName", "CGOpQSZZwI");
        setIntField(term6307, term6307.getClass(), "age", -655067527);
        setField(term6307, term6307.getClass(), "city", "ypEdrstygY");
        setField(term6307, term6307.getClass(), "gender", "sNQFlATEeQ");
        setIntField(term6407, term6407.getClass(), "signum", 1);
        setIntElement(term6409, 0, 15498);
        setIntElement(term6409, 1, -1390712929);
        setIntElement(term6409, 2, 1617799219);
        setIntElement(term6409, 3, -903553597);
        setIntElement(term6409, 4, -1997977581);
        setIntElement(term6409, 5, -2052139129);
        setField(term6407, term6407.getClass(), "mag", term6409);
        setIntField(term6407, term6407.getClass(), "bitCountPlusOne", 0);
        setIntField(term6407, term6407.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6407, term6407.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6407, term6407.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6406, term6406.getClass(), "intVal", term6407);
        setIntField(term6406, term6406.getClass(), "scale", 53);
        setIntField(term6406, term6406.getClass(), "precision", 0);
        setField(term6406, term6406.getClass(), "stringCache", null);
        setLongField(term6406, term6406.getClass(), "intCompact", -9223372036854775808L);
        setField(term6307, term6307.getClass(), "balance", term6406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZKMLioamsY";
        callMethod(klass, "setCity", argTypes, term6307, args);
    }

};



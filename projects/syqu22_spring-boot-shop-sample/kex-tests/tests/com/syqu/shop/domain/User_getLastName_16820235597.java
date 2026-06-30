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

public class User_getLastName_16820235597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3551;

    public User_getLastName_16820235597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3551 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term3650 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3651 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3653 = (int[]) newIntArray(6);
        setLongField(term3551, term3551.getClass(), "id", -3838084482494604218L);
        setField(term3551, term3551.getClass(), "username", "mvrkADEgpp");
        setField(term3551, term3551.getClass(), "email", "pXOkjyeIRb");
        setField(term3551, term3551.getClass(), "password", "GgZWSjxjyE");
        setField(term3551, term3551.getClass(), "passwordConfirm", "EeBVbzjcCI");
        setField(term3551, term3551.getClass(), "firstName", "UfQtPRyWRC");
        setField(term3551, term3551.getClass(), "lastName", "FPvxVzzSvD");
        setIntField(term3551, term3551.getClass(), "age", -1955890973);
        setField(term3551, term3551.getClass(), "city", "WHcwFgsGFC");
        setField(term3551, term3551.getClass(), "gender", "HzqpegHiRq");
        setIntField(term3651, term3651.getClass(), "signum", 1);
        setIntElement(term3653, 0, 51722);
        setIntElement(term3653, 1, 1822015379);
        setIntElement(term3653, 2, 1030733959);
        setIntElement(term3653, 3, 1299891196);
        setIntElement(term3653, 4, 1679751767);
        setIntElement(term3653, 5, -572989409);
        setField(term3651, term3651.getClass(), "mag", term3653);
        setIntField(term3651, term3651.getClass(), "bitCountPlusOne", 0);
        setIntField(term3651, term3651.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3651, term3651.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3651, term3651.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3650, term3650.getClass(), "intVal", term3651);
        setIntField(term3650, term3650.getClass(), "scale", 53);
        setIntField(term3650, term3650.getClass(), "precision", 0);
        setField(term3650, term3650.getClass(), "stringCache", null);
        setLongField(term3650, term3650.getClass(), "intCompact", -9223372036854775808L);
        setField(term3551, term3551.getClass(), "balance", term3650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term3551, args);
    }

};



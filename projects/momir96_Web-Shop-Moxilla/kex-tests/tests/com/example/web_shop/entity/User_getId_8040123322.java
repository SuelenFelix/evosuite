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

public class User_getId_8040123322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2556;

    public User_getId_8040123322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2556 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term2655 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2656 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2658 = (int[]) newIntArray(6);
        setLongField(term2556, term2556.getClass(), "id", 2443640364875054177L);
        setField(term2556, term2556.getClass(), "username", "JDaAnsVTGV");
        setField(term2556, term2556.getClass(), "email", "mLUZFTfjle");
        setField(term2556, term2556.getClass(), "password", "xIeFjkHkOe");
        setField(term2556, term2556.getClass(), "confirmPassword", "SdCKLMIYnX");
        setField(term2556, term2556.getClass(), "firstName", "OJJtVNPyKZ");
        setField(term2556, term2556.getClass(), "lastName", "AKNapTAfmD");
        setIntField(term2556, term2556.getClass(), "age", 1162663216);
        setField(term2556, term2556.getClass(), "city", "xJgPlLxpgC");
        setField(term2556, term2556.getClass(), "gender", "EYtfuJaxiM");
        setIntField(term2656, term2656.getClass(), "signum", 1);
        setIntElement(term2658, 0, 7298);
        setIntElement(term2658, 1, -1245459431);
        setIntElement(term2658, 2, 154872706);
        setIntElement(term2658, 3, -869635639);
        setIntElement(term2658, 4, 1023248111);
        setIntElement(term2658, 5, 1345698053);
        setField(term2656, term2656.getClass(), "mag", term2658);
        setIntField(term2656, term2656.getClass(), "bitCountPlusOne", 0);
        setIntField(term2656, term2656.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2656, term2656.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2656, term2656.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2655, term2655.getClass(), "intVal", term2656);
        setIntField(term2655, term2655.getClass(), "scale", 53);
        setIntField(term2655, term2655.getClass(), "precision", 0);
        setField(term2655, term2655.getClass(), "stringCache", null);
        setLongField(term2655, term2655.getClass(), "intCompact", -9223372036854775808L);
        setField(term2556, term2556.getClass(), "balance", term2655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2556, args);
    }

};



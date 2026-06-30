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

public class User_hashCode_180838885825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7386;

    public User_hashCode_180838885825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7386 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term7485 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7486 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7488 = (int[]) newIntArray(6);
        setLongField(term7386, term7386.getClass(), "id", 9013624480170062917L);
        setField(term7386, term7386.getClass(), "username", "DIbeDHICho");
        setField(term7386, term7386.getClass(), "email", "dJGPlmSRnz");
        setField(term7386, term7386.getClass(), "password", "DPskuFUobI");
        setField(term7386, term7386.getClass(), "passwordConfirm", "wBGfLpNNiZ");
        setField(term7386, term7386.getClass(), "firstName", "yUGCjlqgJE");
        setField(term7386, term7386.getClass(), "lastName", "PXdVZyoJyC");
        setIntField(term7386, term7386.getClass(), "age", 1135664017);
        setField(term7386, term7386.getClass(), "city", "vLerpqavFM");
        setField(term7386, term7386.getClass(), "gender", "qnvxzwuGKX");
        setIntField(term7486, term7486.getClass(), "signum", 1);
        setIntElement(term7488, 0, 603);
        setIntElement(term7488, 1, -1260367601);
        setIntElement(term7488, 2, 1144972827);
        setIntElement(term7488, 3, -88001541);
        setIntElement(term7488, 4, 347574334);
        setIntElement(term7488, 5, 1686084361);
        setField(term7486, term7486.getClass(), "mag", term7488);
        setIntField(term7486, term7486.getClass(), "bitCountPlusOne", 0);
        setIntField(term7486, term7486.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7486, term7486.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7486, term7486.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7485, term7485.getClass(), "intVal", term7486);
        setIntField(term7485, term7485.getClass(), "scale", 51);
        setIntField(term7485, term7485.getClass(), "precision", 0);
        setField(term7485, term7485.getClass(), "stringCache", null);
        setLongField(term7485, term7485.getClass(), "intCompact", -9223372036854775808L);
        setField(term7386, term7386.getClass(), "balance", term7485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7386, args);
    }

};



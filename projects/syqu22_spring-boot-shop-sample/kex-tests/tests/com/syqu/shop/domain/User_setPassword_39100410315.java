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

public class User_setPassword_39100410315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5213;

    public User_setPassword_39100410315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5213 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term5312 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5313 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5315 = (int[]) newIntArray(5);
        setLongField(term5213, term5213.getClass(), "id", 463622836963501975L);
        setField(term5213, term5213.getClass(), "username", "RMsXuyzKJV");
        setField(term5213, term5213.getClass(), "email", "FwPbDZcHmB");
        setField(term5213, term5213.getClass(), "password", "hOncybyCAH");
        setField(term5213, term5213.getClass(), "passwordConfirm", "QduALnDSVo");
        setField(term5213, term5213.getClass(), "firstName", "izPpKDErnQ");
        setField(term5213, term5213.getClass(), "lastName", "NnpwZBUTvx");
        setIntField(term5213, term5213.getClass(), "age", 1585847225);
        setField(term5213, term5213.getClass(), "city", "tlQSNgTkQX");
        setField(term5213, term5213.getClass(), "gender", "PCipZnmBOF");
        setIntField(term5313, term5313.getClass(), "signum", 1);
        setIntElement(term5315, 0, 1965699107);
        setIntElement(term5315, 1, 276112590);
        setIntElement(term5315, 2, 1355446503);
        setIntElement(term5315, 3, 1278820088);
        setIntElement(term5315, 4, -472848849);
        setField(term5313, term5313.getClass(), "mag", term5315);
        setIntField(term5313, term5313.getClass(), "bitCountPlusOne", 0);
        setIntField(term5313, term5313.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5313, term5313.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5313, term5313.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5312, term5312.getClass(), "intVal", term5313);
        setIntField(term5312, term5312.getClass(), "scale", 49);
        setIntField(term5312, term5312.getClass(), "precision", 0);
        setField(term5312, term5312.getClass(), "stringCache", null);
        setLongField(term5312, term5312.getClass(), "intCompact", -9223372036854775808L);
        setField(term5213, term5213.getClass(), "balance", term5312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zcorEihhLK";
        callMethod(klass, "setPassword", argTypes, term5213, args);
    }

};



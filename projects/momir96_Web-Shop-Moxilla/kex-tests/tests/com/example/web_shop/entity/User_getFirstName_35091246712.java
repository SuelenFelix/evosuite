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

public class User_getFirstName_35091246712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4662;

    public User_getFirstName_35091246712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4662 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term4761 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4762 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4764 = (int[]) newIntArray(5);
        setLongField(term4662, term4662.getClass(), "id", 6682528376118987775L);
        setField(term4662, term4662.getClass(), "username", "hOncybyCAH");
        setField(term4662, term4662.getClass(), "email", "QduALnDSVo");
        setField(term4662, term4662.getClass(), "password", "izPpKDErnQ");
        setField(term4662, term4662.getClass(), "confirmPassword", "NnpwZBUTvx");
        setField(term4662, term4662.getClass(), "firstName", "tlQSNgTkQX");
        setField(term4662, term4662.getClass(), "lastName", "PCipZnmBOF");
        setIntField(term4662, term4662.getClass(), "age", -522618178);
        setField(term4662, term4662.getClass(), "city", "zcorEihhLK");
        setField(term4662, term4662.getClass(), "gender", "GrqozDKFOk");
        setIntField(term4762, term4762.getClass(), "signum", 1);
        setIntElement(term4764, 0, 1551440818);
        setIntElement(term4764, 1, 344453067);
        setIntElement(term4764, 2, 133967669);
        setIntElement(term4764, 3, 381677751);
        setIntElement(term4764, 4, -305602591);
        setField(term4762, term4762.getClass(), "mag", term4764);
        setIntField(term4762, term4762.getClass(), "bitCountPlusOne", 0);
        setIntField(term4762, term4762.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4762, term4762.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4762, term4762.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4761, term4761.getClass(), "intVal", term4762);
        setIntField(term4761, term4761.getClass(), "scale", 48);
        setIntField(term4761, term4761.getClass(), "precision", 0);
        setField(term4761, term4761.getClass(), "stringCache", null);
        setLongField(term4761, term4761.getClass(), "intCompact", -9223372036854775808L);
        setField(term4662, term4662.getClass(), "balance", term4761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term4662, args);
    }

};



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

public class User_toString_197581874826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7588;

    public User_toString_197581874826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7588 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term7687 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7688 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7690 = (int[]) newIntArray(6);
        setLongField(term7588, term7588.getClass(), "id", 7862575738391801707L);
        setField(term7588, term7588.getClass(), "username", "EdPAvpluZg");
        setField(term7588, term7588.getClass(), "email", "DzHVBMqWtE");
        setField(term7588, term7588.getClass(), "password", "THZSpzBRYP");
        setField(term7588, term7588.getClass(), "passwordConfirm", "ZfBIVGBQOE");
        setField(term7588, term7588.getClass(), "firstName", "QSrDQfEsTR");
        setField(term7588, term7588.getClass(), "lastName", "PsqusYmejD");
        setIntField(term7588, term7588.getClass(), "age", 590364439);
        setField(term7588, term7588.getClass(), "city", "NTWMiBEaDF");
        setField(term7588, term7588.getClass(), "gender", "SPBstwKFVr");
        setIntField(term7688, term7688.getClass(), "signum", 1);
        setIntElement(term7690, 0, 1500);
        setIntElement(term7690, 1, 583251543);
        setIntElement(term7690, 2, 1353928515);
        setIntElement(term7690, 3, -1884531673);
        setIntElement(term7690, 4, 1102760999);
        setIntElement(term7690, 5, 468388505);
        setField(term7688, term7688.getClass(), "mag", term7690);
        setIntField(term7688, term7688.getClass(), "bitCountPlusOne", 0);
        setIntField(term7688, term7688.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7688, term7688.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7688, term7688.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7687, term7687.getClass(), "intVal", term7688);
        setIntField(term7687, term7687.getClass(), "scale", 52);
        setIntField(term7687, term7687.getClass(), "precision", 0);
        setField(term7687, term7687.getClass(), "stringCache", null);
        setLongField(term7687, term7687.getClass(), "intCompact", -9223372036854775808L);
        setField(term7588, term7588.getClass(), "balance", term7687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7588, args);
    }

};



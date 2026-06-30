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

public class User_setLastName_9568111918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5881;

    public User_setLastName_9568111918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5881 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term5980 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5981 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5983 = (int[]) newIntArray(5);
        setLongField(term5881, term5881.getClass(), "id", -5248475803419977214L);
        setField(term5881, term5881.getClass(), "username", "XfRABIFVEp");
        setField(term5881, term5881.getClass(), "email", "MHGKyEnwKc");
        setField(term5881, term5881.getClass(), "password", "ShIELyuULw");
        setField(term5881, term5881.getClass(), "passwordConfirm", "IpQuOGMgmj");
        setField(term5881, term5881.getClass(), "firstName", "pJbnHTYrxn");
        setField(term5881, term5881.getClass(), "lastName", "iIRsCSYqXH");
        setIntField(term5881, term5881.getClass(), "age", -1456670397);
        setField(term5881, term5881.getClass(), "city", "nghfqDXyCG");
        setField(term5881, term5881.getClass(), "gender", "WBAOTqErtm");
        setIntField(term5981, term5981.getClass(), "signum", 1);
        setIntElement(term5983, 0, 1551440818);
        setIntElement(term5983, 1, 344453067);
        setIntElement(term5983, 2, 133967669);
        setIntElement(term5983, 3, 381677751);
        setIntElement(term5983, 4, -305602591);
        setField(term5981, term5981.getClass(), "mag", term5983);
        setIntField(term5981, term5981.getClass(), "bitCountPlusOne", 0);
        setIntField(term5981, term5981.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5981, term5981.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5981, term5981.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5980, term5980.getClass(), "intVal", term5981);
        setIntField(term5980, term5980.getClass(), "scale", 48);
        setIntField(term5980, term5980.getClass(), "precision", 0);
        setField(term5980, term5980.getClass(), "stringCache", null);
        setLongField(term5980, term5980.getClass(), "intCompact", -9223372036854775808L);
        setField(term5881, term5881.getClass(), "balance", term5980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqtVXXZMqK";
        callMethod(klass, "setLastName", argTypes, term5881, args);
    }

};



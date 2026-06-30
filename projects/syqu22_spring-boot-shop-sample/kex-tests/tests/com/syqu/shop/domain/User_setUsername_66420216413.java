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

public class User_setUsername_66420216413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4765;

    public User_setUsername_66420216413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4765 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term4864 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4865 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4867 = (int[]) newIntArray(6);
        setLongField(term4765, term4765.getClass(), "id", -8658027316505137504L);
        setField(term4765, term4765.getClass(), "username", "lFRJFUMVbx");
        setField(term4765, term4765.getClass(), "email", "sZdUNdggUW");
        setField(term4765, term4765.getClass(), "password", "OqbwYQfvAe");
        setField(term4765, term4765.getClass(), "passwordConfirm", "tRxZafjqIx");
        setField(term4765, term4765.getClass(), "firstName", "DhjNLmRMCu");
        setField(term4765, term4765.getClass(), "lastName", "PgPzMSEjjX");
        setIntField(term4765, term4765.getClass(), "age", 1134449235);
        setField(term4765, term4765.getClass(), "city", "wzsPSPcRdj");
        setField(term4765, term4765.getClass(), "gender", "kGMQdqJYyB");
        setIntField(term4865, term4865.getClass(), "signum", 1);
        setIntElement(term4867, 0, 43112);
        setIntElement(term4867, 1, 702459169);
        setIntElement(term4867, 2, 1058217529);
        setIntElement(term4867, 3, -393994438);
        setIntElement(term4867, 4, 1792052543);
        setIntElement(term4867, 5, 196757249);
        setField(term4865, term4865.getClass(), "mag", term4867);
        setIntField(term4865, term4865.getClass(), "bitCountPlusOne", 0);
        setIntField(term4865, term4865.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4865, term4865.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4865, term4865.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4864, term4864.getClass(), "intVal", term4865);
        setIntField(term4864, term4864.getClass(), "scale", 53);
        setIntField(term4864, term4864.getClass(), "precision", 0);
        setField(term4864, term4864.getClass(), "stringCache", null);
        setLongField(term4864, term4864.getClass(), "intCompact", -9223372036854775808L);
        setField(term4765, term4765.getClass(), "balance", term4864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XJJNClzHRf";
        callMethod(klass, "setUsername", argTypes, term4765, args);
    }

};



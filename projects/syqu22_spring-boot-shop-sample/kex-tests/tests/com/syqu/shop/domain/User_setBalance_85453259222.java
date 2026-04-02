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

public class User_setBalance_85453259222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6755;
     Object term6871;

    public User_setBalance_85453259222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6755 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term6854 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6855 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6857 = (int[]) newIntArray(6);
        setLongField(term6755, term6755.getClass(), "id", 682356318767179819L);
        setField(term6755, term6755.getClass(), "username", "SPtPatHeOm");
        setField(term6755, term6755.getClass(), "email", "ywmcuThdfL");
        setField(term6755, term6755.getClass(), "password", "GBOEuByOfr");
        setField(term6755, term6755.getClass(), "passwordConfirm", "NHbOFFjyVK");
        setField(term6755, term6755.getClass(), "firstName", "zaloBqlrSo");
        setField(term6755, term6755.getClass(), "lastName", "vvoLrMGCoN");
        setIntField(term6755, term6755.getClass(), "age", -2068769794);
        setField(term6755, term6755.getClass(), "city", "pXdglvyrQe");
        setField(term6755, term6755.getClass(), "gender", "OcfNzHYdki");
        setIntField(term6855, term6855.getClass(), "signum", 1);
        setIntElement(term6857, 0, 45083);
        setIntElement(term6857, 1, 1788905768);
        setIntElement(term6857, 2, 372010598);
        setIntElement(term6857, 3, 225971366);
        setIntElement(term6857, 4, -1505336223);
        setIntElement(term6857, 5, 707279667);
        setField(term6855, term6855.getClass(), "mag", term6857);
        setIntField(term6855, term6855.getClass(), "bitCountPlusOne", 0);
        setIntField(term6855, term6855.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6855, term6855.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6855, term6855.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6854, term6854.getClass(), "intVal", term6855);
        setIntField(term6854, term6854.getClass(), "scale", 53);
        setIntField(term6854, term6854.getClass(), "precision", 0);
        setField(term6854, term6854.getClass(), "stringCache", null);
        setLongField(term6854, term6854.getClass(), "intCompact", -9223372036854775808L);
        setField(term6755, term6755.getClass(), "balance", term6854);
        term6871 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6872 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6874 = (int[]) newIntArray(6);
        setIntField(term6872, term6872.getClass(), "signum", 1);
        setIntElement(term6874, 0, 43771);
        setIntElement(term6874, 1, -2064049935);
        setIntElement(term6874, 2, 2069770836);
        setIntElement(term6874, 3, 478634100);
        setIntElement(term6874, 4, -643849105);
        setIntElement(term6874, 5, -507036065);
        setField(term6872, term6872.getClass(), "mag", term6874);
        setIntField(term6872, term6872.getClass(), "bitCountPlusOne", 0);
        setIntField(term6872, term6872.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6872, term6872.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6872, term6872.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6871, term6871.getClass(), "intVal", term6872);
        setIntField(term6871, term6871.getClass(), "scale", 53);
        setIntField(term6871, term6871.getClass(), "precision", 0);
        setField(term6871, term6871.getClass(), "stringCache", null);
        setLongField(term6871, term6871.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term6871;
        callMethod(klass, "setBalance", argTypes, term6755, args);
    }

};



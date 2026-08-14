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

public class User_setGender_137375549721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6546;

    public User_setGender_137375549721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6546 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term6645 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6646 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6648 = (int[]) newIntArray(6);
        setLongField(term6546, term6546.getClass(), "id", -1983291584002806658L);
        setField(term6546, term6546.getClass(), "username", "tsTGdgQYUL");
        setField(term6546, term6546.getClass(), "email", "TtGbVmKcnX");
        setField(term6546, term6546.getClass(), "password", "GJVkUrCVdD");
        setField(term6546, term6546.getClass(), "confirmPassword", "zNdorvdUgu");
        setField(term6546, term6546.getClass(), "firstName", "oPxuZbkYio");
        setField(term6546, term6546.getClass(), "lastName", "vKitydDVnM");
        setIntField(term6546, term6546.getClass(), "age", -6029667);
        setField(term6546, term6546.getClass(), "city", "urCiQnUFBM");
        setField(term6546, term6546.getClass(), "gender", "EKjQdtKxAM");
        setIntField(term6646, term6646.getClass(), "signum", 1);
        setIntElement(term6648, 0, 1500);
        setIntElement(term6648, 1, 583251543);
        setIntElement(term6648, 2, 1353928515);
        setIntElement(term6648, 3, -1884531673);
        setIntElement(term6648, 4, 1102760999);
        setIntElement(term6648, 5, 468388505);
        setField(term6646, term6646.getClass(), "mag", term6648);
        setIntField(term6646, term6646.getClass(), "bitCountPlusOne", 0);
        setIntField(term6646, term6646.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6646, term6646.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6646, term6646.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6645, term6645.getClass(), "intVal", term6646);
        setIntField(term6645, term6645.getClass(), "scale", 52);
        setIntField(term6645, term6645.getClass(), "precision", 0);
        setField(term6645, term6645.getClass(), "stringCache", null);
        setLongField(term6645, term6645.getClass(), "intCompact", -9223372036854775808L);
        setField(term6546, term6546.getClass(), "balance", term6645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TXZAIPQJHt";
        callMethod(klass, "setGender", argTypes, term6546, args);
    }

};



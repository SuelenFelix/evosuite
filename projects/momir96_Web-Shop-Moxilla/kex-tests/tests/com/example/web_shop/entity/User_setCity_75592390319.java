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

public class User_setCity_75592390319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6120;

    public User_setCity_75592390319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6120 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term6219 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6220 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6222 = (int[]) newIntArray(6);
        setLongField(term6120, term6120.getClass(), "id", 5510783420697225605L);
        setField(term6120, term6120.getClass(), "username", "BwtdjiefJn");
        setField(term6120, term6120.getClass(), "email", "jDmhBrIoDa");
        setField(term6120, term6120.getClass(), "password", "SPtPatHeOm");
        setField(term6120, term6120.getClass(), "confirmPassword", "ywmcuThdfL");
        setField(term6120, term6120.getClass(), "firstName", "GBOEuByOfr");
        setField(term6120, term6120.getClass(), "lastName", "NHbOFFjyVK");
        setIntField(term6120, term6120.getClass(), "age", 1048535127);
        setField(term6120, term6120.getClass(), "city", "zaloBqlrSo");
        setField(term6120, term6120.getClass(), "gender", "vvoLrMGCoN");
        setIntField(term6220, term6220.getClass(), "signum", 1);
        setIntElement(term6222, 0, 401);
        setIntElement(term6222, 1, -590196483);
        setIntElement(term6222, 2, 2126931709);
        setIntElement(term6222, 3, 1543000854);
        setIntElement(term6222, 4, 1590753847);
        setIntElement(term6222, 5, 1431251521);
        setField(term6220, term6220.getClass(), "mag", term6222);
        setIntField(term6220, term6220.getClass(), "bitCountPlusOne", 0);
        setIntField(term6220, term6220.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6220, term6220.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6220, term6220.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6219, term6219.getClass(), "intVal", term6220);
        setIntField(term6219, term6219.getClass(), "scale", 51);
        setIntField(term6219, term6219.getClass(), "precision", 0);
        setField(term6219, term6219.getClass(), "stringCache", null);
        setLongField(term6219, term6219.getClass(), "intCompact", -9223372036854775808L);
        setField(term6120, term6120.getClass(), "balance", term6219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXdglvyrQe";
        callMethod(klass, "setCity", argTypes, term6120, args);
    }

};



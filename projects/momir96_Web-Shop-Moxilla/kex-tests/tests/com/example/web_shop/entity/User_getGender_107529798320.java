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

public class User_getGender_107529798320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6344;

    public User_getGender_107529798320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6344 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term6443 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6444 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6446 = (int[]) newIntArray(6);
        setLongField(term6344, term6344.getClass(), "id", 6005241913654469005L);
        setField(term6344, term6344.getClass(), "username", "OcfNzHYdki");
        setField(term6344, term6344.getClass(), "email", "uPuCVuZYOI");
        setField(term6344, term6344.getClass(), "password", "TweMFhxNdj");
        setField(term6344, term6344.getClass(), "confirmPassword", "NBrvVzvQHe");
        setField(term6344, term6344.getClass(), "firstName", "FjOiNAfBOc");
        setField(term6344, term6344.getClass(), "lastName", "iCCsaLHohG");
        setIntField(term6344, term6344.getClass(), "age", -655067527);
        setField(term6344, term6344.getClass(), "city", "NJhGgctbdj");
        setField(term6344, term6344.getClass(), "gender", "MYWYUeLGOp");
        setIntField(term6444, term6444.getClass(), "signum", 1);
        setIntElement(term6446, 0, 603);
        setIntElement(term6446, 1, -1260367601);
        setIntElement(term6446, 2, 1144972827);
        setIntElement(term6446, 3, -88001541);
        setIntElement(term6446, 4, 347574334);
        setIntElement(term6446, 5, 1686084361);
        setField(term6444, term6444.getClass(), "mag", term6446);
        setIntField(term6444, term6444.getClass(), "bitCountPlusOne", 0);
        setIntField(term6444, term6444.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6444, term6444.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6444, term6444.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6443, term6443.getClass(), "intVal", term6444);
        setIntField(term6443, term6443.getClass(), "scale", 51);
        setIntField(term6443, term6443.getClass(), "precision", 0);
        setField(term6443, term6443.getClass(), "stringCache", null);
        setLongField(term6443, term6443.getClass(), "intCompact", -9223372036854775808L);
        setField(term6344, term6344.getClass(), "balance", term6443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term6344, args);
    }

};



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

public class User_getAge_122001802816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5512;

    public User_getAge_122001802816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5512 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term5611 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5612 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5614 = (int[]) newIntArray(6);
        setLongField(term5512, term5512.getClass(), "id", 9013624480170062917L);
        setField(term5512, term5512.getClass(), "username", "rYbtIDVdnd");
        setField(term5512, term5512.getClass(), "email", "UKAReurpHG");
        setField(term5512, term5512.getClass(), "password", "WVRMUmrljA");
        setField(term5512, term5512.getClass(), "confirmPassword", "NTlKJDDWlk");
        setField(term5512, term5512.getClass(), "firstName", "vOuMEpOQAg");
        setField(term5512, term5512.getClass(), "lastName", "SIODFGaQhr");
        setIntField(term5512, term5512.getClass(), "age", 597278769);
        setField(term5512, term5512.getClass(), "city", "qYzsiuXOgS");
        setField(term5512, term5512.getClass(), "gender", "bxrCBbrrct");
        setIntField(term5612, term5612.getClass(), "signum", 1);
        setIntElement(term5614, 0, 45083);
        setIntElement(term5614, 1, 1788905768);
        setIntElement(term5614, 2, 372010598);
        setIntElement(term5614, 3, 225971366);
        setIntElement(term5614, 4, -1505336223);
        setIntElement(term5614, 5, 707279667);
        setField(term5612, term5612.getClass(), "mag", term5614);
        setIntField(term5612, term5612.getClass(), "bitCountPlusOne", 0);
        setIntField(term5612, term5612.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5612, term5612.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5612, term5612.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5611, term5611.getClass(), "intVal", term5612);
        setIntField(term5611, term5611.getClass(), "scale", 53);
        setIntField(term5611, term5611.getClass(), "precision", 0);
        setField(term5611, term5611.getClass(), "stringCache", null);
        setLongField(term5611, term5611.getClass(), "intCompact", -9223372036854775808L);
        setField(term5512, term5512.getClass(), "balance", term5611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term5512, args);
    }

};



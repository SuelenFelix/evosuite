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

public class User_getPassword_18172184078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3814;

    public User_getPassword_18172184078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3814 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term3913 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3914 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3916 = (int[]) newIntArray(6);
        setLongField(term3814, term3814.getClass(), "id", -8654565919063661957L);
        setField(term3814, term3814.getClass(), "username", "lihXWlGDxk");
        setField(term3814, term3814.getClass(), "email", "JmcmxoGhIK");
        setField(term3814, term3814.getClass(), "password", "jXzmYyrnnT");
        setField(term3814, term3814.getClass(), "confirmPassword", "igCAtimmYB");
        setField(term3814, term3814.getClass(), "firstName", "DyiXbeYIaN");
        setField(term3814, term3814.getClass(), "lastName", "VGizxZnyHX");
        setIntField(term3814, term3814.getClass(), "age", -2038273078);
        setField(term3814, term3814.getClass(), "city", "kVEZMHmRtR");
        setField(term3814, term3814.getClass(), "gender", "ekxGuOYIwi");
        setIntField(term3914, term3914.getClass(), "signum", 1);
        setIntElement(term3916, 0, 66623);
        setIntElement(term3916, 1, -721879507);
        setIntElement(term3916, 2, 685392094);
        setIntElement(term3916, 3, -309014712);
        setIntElement(term3916, 4, -2143218141);
        setIntElement(term3916, 5, -724344211);
        setField(term3914, term3914.getClass(), "mag", term3916);
        setIntField(term3914, term3914.getClass(), "bitCountPlusOne", 0);
        setIntField(term3914, term3914.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3914, term3914.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3914, term3914.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3913, term3913.getClass(), "intVal", term3914);
        setIntField(term3913, term3913.getClass(), "scale", 53);
        setIntField(term3913, term3913.getClass(), "precision", 0);
        setField(term3913, term3913.getClass(), "stringCache", null);
        setLongField(term3913, term3913.getClass(), "intCompact", -9223372036854775808L);
        setField(term3814, term3814.getClass(), "balance", term3913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3814, args);
    }

};



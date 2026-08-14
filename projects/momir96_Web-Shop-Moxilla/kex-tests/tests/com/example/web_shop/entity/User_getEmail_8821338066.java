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

public class User_getEmail_8821338066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;

    public User_getEmail_8821338066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3388 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term3487 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3488 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3490 = (int[]) newIntArray(6);
        setLongField(term3388, term3388.getClass(), "id", 463622836963501975L);
        setField(term3388, term3388.getClass(), "username", "hMmaoREuCK");
        setField(term3388, term3388.getClass(), "email", "VeDtgDzGAN");
        setField(term3388, term3388.getClass(), "password", "aWYOWZFyaX");
        setField(term3388, term3388.getClass(), "confirmPassword", "BRIVNtfUWU");
        setField(term3388, term3388.getClass(), "firstName", "DbiCVtPPCT");
        setField(term3388, term3388.getClass(), "lastName", "WzFopsaDuG");
        setIntField(term3388, term3388.getClass(), "age", -616727354);
        setField(term3388, term3388.getClass(), "city", "PapWxkhEWe");
        setField(term3388, term3388.getClass(), "gender", "smnHEqRFRx");
        setIntField(term3488, term3488.getClass(), "signum", 1);
        setIntElement(term3490, 0, 19519);
        setIntElement(term3490, 1, -1182278371);
        setIntElement(term3490, 2, -1767261549);
        setIntElement(term3490, 3, 1466667712);
        setIntElement(term3490, 4, 124168962);
        setIntElement(term3490, 5, -1752295351);
        setField(term3488, term3488.getClass(), "mag", term3490);
        setIntField(term3488, term3488.getClass(), "bitCountPlusOne", 0);
        setIntField(term3488, term3488.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3488, term3488.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3488, term3488.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3487, term3487.getClass(), "intVal", term3488);
        setIntField(term3487, term3487.getClass(), "scale", 53);
        setIntField(term3487, term3487.getClass(), "precision", 0);
        setField(term3487, term3487.getClass(), "stringCache", null);
        setLongField(term3487, term3487.getClass(), "intCompact", -9223372036854775808L);
        setField(term3388, term3388.getClass(), "balance", term3487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3388, args);
    }

};



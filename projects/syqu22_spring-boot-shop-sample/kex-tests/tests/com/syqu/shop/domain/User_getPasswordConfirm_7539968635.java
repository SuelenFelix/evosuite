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

public class User_getPasswordConfirm_7539968635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3147;

    public User_getPasswordConfirm_7539968635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3147 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term3246 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3247 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3249 = (int[]) newIntArray(6);
        setLongField(term3147, term3147.getClass(), "id", -7738503207562305297L);
        setField(term3147, term3147.getClass(), "username", "JDaAnsVTGV");
        setField(term3147, term3147.getClass(), "email", "mLUZFTfjle");
        setField(term3147, term3147.getClass(), "password", "xIeFjkHkOe");
        setField(term3147, term3147.getClass(), "passwordConfirm", "SdCKLMIYnX");
        setField(term3147, term3147.getClass(), "firstName", "OJJtVNPyKZ");
        setField(term3147, term3147.getClass(), "lastName", "AKNapTAfmD");
        setIntField(term3147, term3147.getClass(), "age", -1922583790);
        setField(term3147, term3147.getClass(), "city", "xJgPlLxpgC");
        setField(term3147, term3147.getClass(), "gender", "EYtfuJaxiM");
        setIntField(term3247, term3247.getClass(), "signum", 1);
        setIntElement(term3249, 0, 26001);
        setIntElement(term3249, 1, 1123266030);
        setIntElement(term3249, 2, 1277036849);
        setIntElement(term3249, 3, 2128028609);
        setIntElement(term3249, 4, -171954480);
        setIntElement(term3249, 5, -1359520521);
        setField(term3247, term3247.getClass(), "mag", term3249);
        setIntField(term3247, term3247.getClass(), "bitCountPlusOne", 0);
        setIntField(term3247, term3247.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3247, term3247.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3247, term3247.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3246, term3246.getClass(), "intVal", term3247);
        setIntField(term3246, term3246.getClass(), "scale", 53);
        setIntField(term3246, term3246.getClass(), "precision", 0);
        setField(term3246, term3246.getClass(), "stringCache", null);
        setLongField(term3246, term3246.getClass(), "intCompact", -9223372036854775808L);
        setField(term3147, term3147.getClass(), "balance", term3246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordConfirm", argTypes, term3147, args);
    }

};



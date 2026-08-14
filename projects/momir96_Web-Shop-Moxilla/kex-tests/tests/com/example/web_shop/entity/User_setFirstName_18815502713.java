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

public class User_setFirstName_18815502713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4862;

    public User_setFirstName_18815502713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4862 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term4961 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4962 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4964 = (int[]) newIntArray(6);
        setLongField(term4862, term4862.getClass(), "id", 682356318767179819L);
        setField(term4862, term4862.getClass(), "username", "CFyoseFGLF");
        setField(term4862, term4862.getClass(), "email", "SFqCrhEWLm");
        setField(term4862, term4862.getClass(), "password", "GZdcJyZntS");
        setField(term4862, term4862.getClass(), "confirmPassword", "OIHoJeysUi");
        setField(term4862, term4862.getClass(), "firstName", "WXMWFDGcLB");
        setField(term4862, term4862.getClass(), "lastName", "wKWbJssZuG");
        setIntField(term4862, term4862.getClass(), "age", 1134449235);
        setField(term4862, term4862.getClass(), "city", "NzBMMhkhpT");
        setField(term4862, term4862.getClass(), "gender", "qCpEbQDHdF");
        setIntField(term4962, term4962.getClass(), "signum", 1);
        setIntElement(term4964, 0, 21910);
        setIntElement(term4964, 1, 1232338756);
        setIntElement(term4964, 2, -1082493650);
        setIntElement(term4964, 3, 2096909910);
        setIntElement(term4964, 4, -386707863);
        setIntElement(term4964, 5, -1583619851);
        setField(term4962, term4962.getClass(), "mag", term4964);
        setIntField(term4962, term4962.getClass(), "bitCountPlusOne", 0);
        setIntField(term4962, term4962.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4962, term4962.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4962, term4962.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4961, term4961.getClass(), "intVal", term4962);
        setIntField(term4961, term4961.getClass(), "scale", 53);
        setIntField(term4961, term4961.getClass(), "precision", 0);
        setField(term4961, term4961.getClass(), "stringCache", null);
        setLongField(term4961, term4961.getClass(), "intCompact", -9223372036854775808L);
        setField(term4862, term4862.getClass(), "balance", term4961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AHbZyFOmlo";
        callMethod(klass, "setFirstName", argTypes, term4862, args);
    }

};



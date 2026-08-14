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

public class User_setEmail_4584653907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3590;

    public User_setEmail_4584653907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3590 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term3689 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3690 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3692 = (int[]) newIntArray(6);
        setLongField(term3590, term3590.getClass(), "id", 305759998609888272L);
        setField(term3590, term3590.getClass(), "username", "XYtryyobou");
        setField(term3590, term3590.getClass(), "email", "OYbzXylRWW");
        setField(term3590, term3590.getClass(), "password", "DSNsTGYXDF");
        setField(term3590, term3590.getClass(), "confirmPassword", "sQvGcVjdEx");
        setField(term3590, term3590.getClass(), "firstName", "rLHAoqXgPh");
        setField(term3590, term3590.getClass(), "lastName", "zUlRdimJtU");
        setIntField(term3590, term3590.getClass(), "age", -1955890973);
        setField(term3590, term3590.getClass(), "city", "vwbEQQNQrx");
        setField(term3590, term3590.getClass(), "gender", "xtftXXMbem");
        setIntField(term3690, term3690.getClass(), "signum", 1);
        setIntElement(term3692, 0, 43112);
        setIntElement(term3692, 1, 702459169);
        setIntElement(term3692, 2, 1058217529);
        setIntElement(term3692, 3, -393994438);
        setIntElement(term3692, 4, 1792052543);
        setIntElement(term3692, 5, 196757249);
        setField(term3690, term3690.getClass(), "mag", term3692);
        setIntField(term3690, term3690.getClass(), "bitCountPlusOne", 0);
        setIntField(term3690, term3690.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3690, term3690.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3690, term3690.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3689, term3689.getClass(), "intVal", term3690);
        setIntField(term3689, term3689.getClass(), "scale", 53);
        setIntField(term3689, term3689.getClass(), "precision", 0);
        setField(term3689, term3689.getClass(), "stringCache", null);
        setLongField(term3689, term3689.getClass(), "intCompact", -9223372036854775808L);
        setField(term3590, term3590.getClass(), "balance", term3689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cudZvLMQon";
        callMethod(klass, "setEmail", argTypes, term3590, args);
    }

};



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

public class User_setBalance_213694314423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6972;
     Object term7088;

    public User_setBalance_213694314423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6972 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term7071 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7072 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7074 = (int[]) newIntArray(6);
        setLongField(term6972, term6972.getClass(), "id", -8652538484981166496L);
        setField(term6972, term6972.getClass(), "username", "EdPAvpluZg");
        setField(term6972, term6972.getClass(), "email", "DzHVBMqWtE");
        setField(term6972, term6972.getClass(), "password", "THZSpzBRYP");
        setField(term6972, term6972.getClass(), "confirmPassword", "ZfBIVGBQOE");
        setField(term6972, term6972.getClass(), "firstName", "QSrDQfEsTR");
        setField(term6972, term6972.getClass(), "lastName", "PsqusYmejD");
        setIntField(term6972, term6972.getClass(), "age", -117576464);
        setField(term6972, term6972.getClass(), "city", "NTWMiBEaDF");
        setField(term6972, term6972.getClass(), "gender", "SPBstwKFVr");
        setIntField(term7072, term7072.getClass(), "signum", 1);
        setIntElement(term7074, 0, 54169);
        setIntElement(term7074, 1, -119706842);
        setIntElement(term7074, 2, 282847504);
        setIntElement(term7074, 3, 2006296120);
        setIntElement(term7074, 4, 1230329280);
        setIntElement(term7074, 5, -824672783);
        setField(term7072, term7072.getClass(), "mag", term7074);
        setIntField(term7072, term7072.getClass(), "bitCountPlusOne", 0);
        setIntField(term7072, term7072.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7072, term7072.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7072, term7072.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7071, term7071.getClass(), "intVal", term7072);
        setIntField(term7071, term7071.getClass(), "scale", 53);
        setIntField(term7071, term7071.getClass(), "precision", 0);
        setField(term7071, term7071.getClass(), "stringCache", null);
        setLongField(term7071, term7071.getClass(), "intCompact", -9223372036854775808L);
        setField(term6972, term6972.getClass(), "balance", term7071);
        term7088 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7089 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7091 = (int[]) newIntArray(6);
        setIntField(term7089, term7089.getClass(), "signum", 1);
        setIntElement(term7091, 0, 46953);
        setIntElement(term7091, 1, 959700722);
        setIntElement(term7091, 2, -735566206);
        setIntElement(term7091, 3, 1326839338);
        setIntElement(term7091, 4, -1874212242);
        setIntElement(term7091, 5, -146800463);
        setField(term7089, term7089.getClass(), "mag", term7091);
        setIntField(term7089, term7089.getClass(), "bitCountPlusOne", 0);
        setIntField(term7089, term7089.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7089, term7089.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7089, term7089.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7088, term7088.getClass(), "intVal", term7089);
        setIntField(term7088, term7088.getClass(), "scale", 53);
        setIntField(term7088, term7088.getClass(), "precision", 0);
        setField(term7088, term7088.getClass(), "stringCache", null);
        setLongField(term7088, term7088.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term7088;
        callMethod(klass, "setBalance", argTypes, term6972, args);
    }

};



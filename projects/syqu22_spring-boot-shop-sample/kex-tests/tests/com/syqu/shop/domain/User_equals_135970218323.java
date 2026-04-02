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

public class User_equals_135970218323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6980;
     Object term7096;

    public User_equals_135970218323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6980 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term7079 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7080 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7082 = (int[]) newIntArray(6);
        setLongField(term6980, term6980.getClass(), "id", -7291743527973326814L);
        setField(term6980, term6980.getClass(), "username", "uPuCVuZYOI");
        setField(term6980, term6980.getClass(), "email", "TweMFhxNdj");
        setField(term6980, term6980.getClass(), "password", "NBrvVzvQHe");
        setField(term6980, term6980.getClass(), "passwordConfirm", "FjOiNAfBOc");
        setField(term6980, term6980.getClass(), "firstName", "iCCsaLHohG");
        setField(term6980, term6980.getClass(), "lastName", "NJhGgctbdj");
        setIntField(term6980, term6980.getClass(), "age", -117576464);
        setField(term6980, term6980.getClass(), "city", "MYWYUeLGOp");
        setField(term6980, term6980.getClass(), "gender", "tsTGdgQYUL");
        setIntField(term7080, term7080.getClass(), "signum", 1);
        setIntElement(term7082, 0, 17747);
        setIntElement(term7082, 1, 222971343);
        setIntElement(term7082, 2, 1645407127);
        setIntElement(term7082, 3, 211829796);
        setIntElement(term7082, 4, 1665135280);
        setIntElement(term7082, 5, -264762539);
        setField(term7080, term7080.getClass(), "mag", term7082);
        setIntField(term7080, term7080.getClass(), "bitCountPlusOne", 0);
        setIntField(term7080, term7080.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7080, term7080.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7080, term7080.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7079, term7079.getClass(), "intVal", term7080);
        setIntField(term7079, term7079.getClass(), "scale", 53);
        setIntField(term7079, term7079.getClass(), "precision", 0);
        setField(term7079, term7079.getClass(), "stringCache", null);
        setLongField(term7079, term7079.getClass(), "intCompact", -9223372036854775808L);
        setField(term6980, term6980.getClass(), "balance", term7079);
        term7096 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7096;
        callMethod(klass, "equals", argTypes, term6980, args);
    }

};



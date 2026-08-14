package com.delgado.bruno.boilerplates.camel.models;

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
import static com.delgado.bruno.boilerplates.camel.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class SampleEvent_setPrice_16518906706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term297;

    public SampleEvent_setPrice_16518906706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term278 = new Integer(-1955890973);
        term265 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent"));
        Object term280 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term281 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term283 = (int[]) newIntArray(6);
        setField(term265, term265.getClass(), "name", "SzjVpOQTyS");
        setField(term265, term265.getClass(), "quantity", term278);
        setIntField(term281, term281.getClass(), "signum", 1);
        setIntElement(term283, 0, 27489);
        setIntElement(term283, 1, -274433180);
        setIntElement(term283, 2, 698548608);
        setIntElement(term283, 3, -1143703655);
        setIntElement(term283, 4, 1619765041);
        setIntElement(term283, 5, -418227111);
        setField(term281, term281.getClass(), "mag", term283);
        setIntField(term281, term281.getClass(), "bitCountPlusOne", 0);
        setIntField(term281, term281.getClass(), "bitLengthPlusOne", 0);
        setIntField(term281, term281.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term281, term281.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term280, term280.getClass(), "intVal", term281);
        setIntField(term280, term280.getClass(), "scale", 53);
        setIntField(term280, term280.getClass(), "precision", 0);
        setField(term280, term280.getClass(), "stringCache", null);
        setLongField(term280, term280.getClass(), "intCompact", -9223372036854775808L);
        setField(term265, term265.getClass(), "price", term280);
        term297 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term298 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term300 = (int[]) newIntArray(6);
        setIntField(term298, term298.getClass(), "signum", 1);
        setIntElement(term300, 0, 1807);
        setIntElement(term300, 1, 1210968587);
        setIntElement(term300, 2, -857410878);
        setIntElement(term300, 3, 520383771);
        setIntElement(term300, 4, 2106706510);
        setIntElement(term300, 5, 1731185477);
        setField(term298, term298.getClass(), "mag", term300);
        setIntField(term298, term298.getClass(), "bitCountPlusOne", 0);
        setIntField(term298, term298.getClass(), "bitLengthPlusOne", 0);
        setIntField(term298, term298.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term298, term298.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term297, term297.getClass(), "intVal", term298);
        setIntField(term297, term297.getClass(), "scale", 52);
        setIntField(term297, term297.getClass(), "precision", 0);
        setField(term297, term297.getClass(), "stringCache", null);
        setLongField(term297, term297.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.models.SampleEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term297;
        callMethod(klass, "setPrice", argTypes, term265, args);
    }

};



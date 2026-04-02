package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class FseAccount_FseAccountBuilder_blackholed_9318034105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78206;
     Object term78259;

    public FseAccount_FseAccountBuilder_blackholed_9318034105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78238 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78238, term78238.getClass(), "classicAddress", "");
        setField(term78238, term78238.getClass(), "currency", "");
        setField(term78238, term78238.getClass(), "balance", "");
        setField(term78238, term78238.getClass(), "limit", "");
        ArrayList term78236 = new ArrayList();
        ((ArrayList) term78236).add(term78238);
        Boolean term78257 = new Boolean(true);
        term78206 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term78219 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term78220 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term78222 = (int[]) newIntArray(6);
        setField(term78206, term78206.getClass(), "classicAddress", "IKfozyyKEj");
        setIntField(term78220, term78220.getClass(), "signum", 1);
        setIntElement(term78222, 0, 27489);
        setIntElement(term78222, 1, -274433180);
        setIntElement(term78222, 2, 698548608);
        setIntElement(term78222, 3, -1143703655);
        setIntElement(term78222, 4, 1619765041);
        setIntElement(term78222, 5, -418227111);
        setField(term78220, term78220.getClass(), "mag", term78222);
        setIntField(term78220, term78220.getClass(), "bitCountPlusOne", 0);
        setIntField(term78220, term78220.getClass(), "bitLengthPlusOne", 0);
        setIntField(term78220, term78220.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term78220, term78220.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term78219, term78219.getClass(), "intVal", term78220);
        setIntField(term78219, term78219.getClass(), "scale", 53);
        setIntField(term78219, term78219.getClass(), "precision", 0);
        setField(term78219, term78219.getClass(), "stringCache", null);
        setLongField(term78219, term78219.getClass(), "intCompact", -9223372036854775808L);
        setField(term78206, term78206.getClass(), "xrpBalance", term78219);
        setField(term78206, term78206.getClass(), "trustLines", term78236);
        setField(term78206, term78206.getClass(), "activationAddress", "MxrhCLTMTH");
        setField(term78206, term78206.getClass(), "blackholed", term78257);
        term78259 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term78259;
        callMethod(klass, "blackholed", argTypes, term78206, args);
    }

};



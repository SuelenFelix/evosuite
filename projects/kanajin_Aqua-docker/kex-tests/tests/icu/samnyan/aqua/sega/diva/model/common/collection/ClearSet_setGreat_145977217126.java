package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ClearSet_setGreat_145977217126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501458;
     Object term1501463;

    public ClearSet_setGreat_145977217126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501458 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term1501458, term1501458.getClass(), "clear", 0);
        setIntField(term1501458, term1501458.getClass(), "great", 0);
        setIntField(term1501458, term1501458.getClass(), "excellent", 0);
        setIntField(term1501458, term1501458.getClass(), "perfect", 0);
        term1501463 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1501463;
        callMethod(klass, "setGreat", argTypes, term1501458, args);
    }

};



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

public class ClearSet_getGreat_8947626355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501346;

    public ClearSet_getGreat_8947626355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501346 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term1501346, term1501346.getClass(), "clear", -416502685);
        setIntField(term1501346, term1501346.getClass(), "great", -1756280016);
        setIntField(term1501346, term1501346.getClass(), "excellent", 2137056412);
        setIntField(term1501346, term1501346.getClass(), "perfect", -685642034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGreat", argTypes, term1501346, args);
    }

};



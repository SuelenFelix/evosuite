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
import java.lang.Object;

public class ClearTally_getHard_18367044903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18054;

    public ClearTally_getHard_18367044903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18054 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18055 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18060 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18065 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18070 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18075 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18055, term18055.getClass(), "clear", 0);
        setIntField(term18055, term18055.getClass(), "great", 0);
        setIntField(term18055, term18055.getClass(), "excellent", 0);
        setIntField(term18055, term18055.getClass(), "perfect", 0);
        setField(term18054, term18054.getClass(), "easy", term18055);
        setIntField(term18060, term18060.getClass(), "clear", 0);
        setIntField(term18060, term18060.getClass(), "great", 0);
        setIntField(term18060, term18060.getClass(), "excellent", 0);
        setIntField(term18060, term18060.getClass(), "perfect", 0);
        setField(term18054, term18054.getClass(), "normal", term18060);
        setIntField(term18065, term18065.getClass(), "clear", 0);
        setIntField(term18065, term18065.getClass(), "great", 0);
        setIntField(term18065, term18065.getClass(), "excellent", 0);
        setIntField(term18065, term18065.getClass(), "perfect", 0);
        setField(term18054, term18054.getClass(), "hard", term18065);
        setIntField(term18070, term18070.getClass(), "clear", 0);
        setIntField(term18070, term18070.getClass(), "great", 0);
        setIntField(term18070, term18070.getClass(), "excellent", 0);
        setIntField(term18070, term18070.getClass(), "perfect", 0);
        setField(term18054, term18054.getClass(), "extreme", term18070);
        setIntField(term18075, term18075.getClass(), "clear", 0);
        setIntField(term18075, term18075.getClass(), "great", 0);
        setIntField(term18075, term18075.getClass(), "excellent", 0);
        setIntField(term18075, term18075.getClass(), "perfect", 0);
        setField(term18054, term18054.getClass(), "extraExtreme", term18075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHard", argTypes, term18054, args);
    }

};



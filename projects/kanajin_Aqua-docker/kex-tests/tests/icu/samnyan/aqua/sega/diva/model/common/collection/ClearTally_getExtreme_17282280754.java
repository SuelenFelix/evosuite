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

public class ClearTally_getExtreme_17282280754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18080;

    public ClearTally_getExtreme_17282280754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18080 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18081 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18086 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18091 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18096 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18101 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18081, term18081.getClass(), "clear", 0);
        setIntField(term18081, term18081.getClass(), "great", 0);
        setIntField(term18081, term18081.getClass(), "excellent", 0);
        setIntField(term18081, term18081.getClass(), "perfect", 0);
        setField(term18080, term18080.getClass(), "easy", term18081);
        setIntField(term18086, term18086.getClass(), "clear", 0);
        setIntField(term18086, term18086.getClass(), "great", 0);
        setIntField(term18086, term18086.getClass(), "excellent", 0);
        setIntField(term18086, term18086.getClass(), "perfect", 0);
        setField(term18080, term18080.getClass(), "normal", term18086);
        setIntField(term18091, term18091.getClass(), "clear", 0);
        setIntField(term18091, term18091.getClass(), "great", 0);
        setIntField(term18091, term18091.getClass(), "excellent", 0);
        setIntField(term18091, term18091.getClass(), "perfect", 0);
        setField(term18080, term18080.getClass(), "hard", term18091);
        setIntField(term18096, term18096.getClass(), "clear", 0);
        setIntField(term18096, term18096.getClass(), "great", 0);
        setIntField(term18096, term18096.getClass(), "excellent", 0);
        setIntField(term18096, term18096.getClass(), "perfect", 0);
        setField(term18080, term18080.getClass(), "extreme", term18096);
        setIntField(term18101, term18101.getClass(), "clear", 0);
        setIntField(term18101, term18101.getClass(), "great", 0);
        setIntField(term18101, term18101.getClass(), "excellent", 0);
        setIntField(term18101, term18101.getClass(), "perfect", 0);
        setField(term18080, term18080.getClass(), "extraExtreme", term18101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtreme", argTypes, term18080, args);
    }

};



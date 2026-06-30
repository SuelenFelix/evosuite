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

public class ClearTally_getEasy_19225419711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18002;

    public ClearTally_getEasy_19225419711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18002 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18003 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18008 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18013 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18018 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18023 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18003, term18003.getClass(), "clear", 0);
        setIntField(term18003, term18003.getClass(), "great", 0);
        setIntField(term18003, term18003.getClass(), "excellent", 0);
        setIntField(term18003, term18003.getClass(), "perfect", 0);
        setField(term18002, term18002.getClass(), "easy", term18003);
        setIntField(term18008, term18008.getClass(), "clear", 0);
        setIntField(term18008, term18008.getClass(), "great", 0);
        setIntField(term18008, term18008.getClass(), "excellent", 0);
        setIntField(term18008, term18008.getClass(), "perfect", 0);
        setField(term18002, term18002.getClass(), "normal", term18008);
        setIntField(term18013, term18013.getClass(), "clear", 0);
        setIntField(term18013, term18013.getClass(), "great", 0);
        setIntField(term18013, term18013.getClass(), "excellent", 0);
        setIntField(term18013, term18013.getClass(), "perfect", 0);
        setField(term18002, term18002.getClass(), "hard", term18013);
        setIntField(term18018, term18018.getClass(), "clear", 0);
        setIntField(term18018, term18018.getClass(), "great", 0);
        setIntField(term18018, term18018.getClass(), "excellent", 0);
        setIntField(term18018, term18018.getClass(), "perfect", 0);
        setField(term18002, term18002.getClass(), "extreme", term18018);
        setIntField(term18023, term18023.getClass(), "clear", 0);
        setIntField(term18023, term18023.getClass(), "great", 0);
        setIntField(term18023, term18023.getClass(), "excellent", 0);
        setIntField(term18023, term18023.getClass(), "perfect", 0);
        setField(term18002, term18002.getClass(), "extraExtreme", term18023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEasy", argTypes, term18002, args);
    }

};



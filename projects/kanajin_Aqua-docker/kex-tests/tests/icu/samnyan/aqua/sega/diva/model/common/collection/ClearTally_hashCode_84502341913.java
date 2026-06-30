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

public class ClearTally_hashCode_84502341913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18341;

    public ClearTally_hashCode_84502341913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18341 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18342 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18347 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18352 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18357 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18362 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18342, term18342.getClass(), "clear", 0);
        setIntField(term18342, term18342.getClass(), "great", 0);
        setIntField(term18342, term18342.getClass(), "excellent", 0);
        setIntField(term18342, term18342.getClass(), "perfect", 0);
        setField(term18341, term18341.getClass(), "easy", term18342);
        setIntField(term18347, term18347.getClass(), "clear", 0);
        setIntField(term18347, term18347.getClass(), "great", 0);
        setIntField(term18347, term18347.getClass(), "excellent", 0);
        setIntField(term18347, term18347.getClass(), "perfect", 0);
        setField(term18341, term18341.getClass(), "normal", term18347);
        setIntField(term18352, term18352.getClass(), "clear", 0);
        setIntField(term18352, term18352.getClass(), "great", 0);
        setIntField(term18352, term18352.getClass(), "excellent", 0);
        setIntField(term18352, term18352.getClass(), "perfect", 0);
        setField(term18341, term18341.getClass(), "hard", term18352);
        setIntField(term18357, term18357.getClass(), "clear", 0);
        setIntField(term18357, term18357.getClass(), "great", 0);
        setIntField(term18357, term18357.getClass(), "excellent", 0);
        setIntField(term18357, term18357.getClass(), "perfect", 0);
        setField(term18341, term18341.getClass(), "extreme", term18357);
        setIntField(term18362, term18362.getClass(), "clear", 0);
        setIntField(term18362, term18362.getClass(), "great", 0);
        setIntField(term18362, term18362.getClass(), "excellent", 0);
        setIntField(term18362, term18362.getClass(), "perfect", 0);
        setField(term18341, term18341.getClass(), "extraExtreme", term18362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term18341, args);
    }

};



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

public class ClearTally_toString_135578310914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18367;

    public ClearTally_toString_135578310914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18367 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18368 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18373 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18378 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18383 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18388 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18368, term18368.getClass(), "clear", 0);
        setIntField(term18368, term18368.getClass(), "great", 0);
        setIntField(term18368, term18368.getClass(), "excellent", 0);
        setIntField(term18368, term18368.getClass(), "perfect", 0);
        setField(term18367, term18367.getClass(), "easy", term18368);
        setIntField(term18373, term18373.getClass(), "clear", 0);
        setIntField(term18373, term18373.getClass(), "great", 0);
        setIntField(term18373, term18373.getClass(), "excellent", 0);
        setIntField(term18373, term18373.getClass(), "perfect", 0);
        setField(term18367, term18367.getClass(), "normal", term18373);
        setIntField(term18378, term18378.getClass(), "clear", 0);
        setIntField(term18378, term18378.getClass(), "great", 0);
        setIntField(term18378, term18378.getClass(), "excellent", 0);
        setIntField(term18378, term18378.getClass(), "perfect", 0);
        setField(term18367, term18367.getClass(), "hard", term18378);
        setIntField(term18383, term18383.getClass(), "clear", 0);
        setIntField(term18383, term18383.getClass(), "great", 0);
        setIntField(term18383, term18383.getClass(), "excellent", 0);
        setIntField(term18383, term18383.getClass(), "perfect", 0);
        setField(term18367, term18367.getClass(), "extreme", term18383);
        setIntField(term18388, term18388.getClass(), "clear", 0);
        setIntField(term18388, term18388.getClass(), "great", 0);
        setIntField(term18388, term18388.getClass(), "excellent", 0);
        setIntField(term18388, term18388.getClass(), "perfect", 0);
        setField(term18367, term18367.getClass(), "extraExtreme", term18388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18367, args);
    }

};



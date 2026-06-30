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

public class ClearTally_toInternal_17621537670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17976;

    public ClearTally_toInternal_17621537670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17976 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term17977 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term17982 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term17987 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term17992 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term17997 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term17977, term17977.getClass(), "clear", 0);
        setIntField(term17977, term17977.getClass(), "great", 0);
        setIntField(term17977, term17977.getClass(), "excellent", 0);
        setIntField(term17977, term17977.getClass(), "perfect", 0);
        setField(term17976, term17976.getClass(), "easy", term17977);
        setIntField(term17982, term17982.getClass(), "clear", 0);
        setIntField(term17982, term17982.getClass(), "great", 0);
        setIntField(term17982, term17982.getClass(), "excellent", 0);
        setIntField(term17982, term17982.getClass(), "perfect", 0);
        setField(term17976, term17976.getClass(), "normal", term17982);
        setIntField(term17987, term17987.getClass(), "clear", 0);
        setIntField(term17987, term17987.getClass(), "great", 0);
        setIntField(term17987, term17987.getClass(), "excellent", 0);
        setIntField(term17987, term17987.getClass(), "perfect", 0);
        setField(term17976, term17976.getClass(), "hard", term17987);
        setIntField(term17992, term17992.getClass(), "clear", 0);
        setIntField(term17992, term17992.getClass(), "great", 0);
        setIntField(term17992, term17992.getClass(), "excellent", 0);
        setIntField(term17992, term17992.getClass(), "perfect", 0);
        setField(term17976, term17976.getClass(), "extreme", term17992);
        setIntField(term17997, term17997.getClass(), "clear", 0);
        setIntField(term17997, term17997.getClass(), "great", 0);
        setIntField(term17997, term17997.getClass(), "excellent", 0);
        setIntField(term17997, term17997.getClass(), "perfect", 0);
        setField(term17976, term17976.getClass(), "extraExtreme", term17997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInternal", argTypes, term17976, args);
    }

};



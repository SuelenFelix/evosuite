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

public class ClearTally_getExtraExtreme_2970840075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18106;

    public ClearTally_getExtraExtreme_2970840075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18106 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18107 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18112 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18117 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18122 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18127 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18107, term18107.getClass(), "clear", 0);
        setIntField(term18107, term18107.getClass(), "great", 0);
        setIntField(term18107, term18107.getClass(), "excellent", 0);
        setIntField(term18107, term18107.getClass(), "perfect", 0);
        setField(term18106, term18106.getClass(), "easy", term18107);
        setIntField(term18112, term18112.getClass(), "clear", 0);
        setIntField(term18112, term18112.getClass(), "great", 0);
        setIntField(term18112, term18112.getClass(), "excellent", 0);
        setIntField(term18112, term18112.getClass(), "perfect", 0);
        setField(term18106, term18106.getClass(), "normal", term18112);
        setIntField(term18117, term18117.getClass(), "clear", 0);
        setIntField(term18117, term18117.getClass(), "great", 0);
        setIntField(term18117, term18117.getClass(), "excellent", 0);
        setIntField(term18117, term18117.getClass(), "perfect", 0);
        setField(term18106, term18106.getClass(), "hard", term18117);
        setIntField(term18122, term18122.getClass(), "clear", 0);
        setIntField(term18122, term18122.getClass(), "great", 0);
        setIntField(term18122, term18122.getClass(), "excellent", 0);
        setIntField(term18122, term18122.getClass(), "perfect", 0);
        setField(term18106, term18106.getClass(), "extreme", term18122);
        setIntField(term18127, term18127.getClass(), "clear", 0);
        setIntField(term18127, term18127.getClass(), "great", 0);
        setIntField(term18127, term18127.getClass(), "excellent", 0);
        setIntField(term18127, term18127.getClass(), "perfect", 0);
        setField(term18106, term18106.getClass(), "extraExtreme", term18127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraExtreme", argTypes, term18106, args);
    }

};



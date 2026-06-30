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

public class ClearTally_setExtraExtreme_19551915510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18256;
     Object term18282;

    public ClearTally_setExtraExtreme_19551915510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18256 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18257 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18262 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18267 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18272 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18257, term18257.getClass(), "clear", 0);
        setIntField(term18257, term18257.getClass(), "great", 0);
        setIntField(term18257, term18257.getClass(), "excellent", 0);
        setIntField(term18257, term18257.getClass(), "perfect", 0);
        setField(term18256, term18256.getClass(), "easy", term18257);
        setIntField(term18262, term18262.getClass(), "clear", 0);
        setIntField(term18262, term18262.getClass(), "great", 0);
        setIntField(term18262, term18262.getClass(), "excellent", 0);
        setIntField(term18262, term18262.getClass(), "perfect", 0);
        setField(term18256, term18256.getClass(), "normal", term18262);
        setIntField(term18267, term18267.getClass(), "clear", 0);
        setIntField(term18267, term18267.getClass(), "great", 0);
        setIntField(term18267, term18267.getClass(), "excellent", 0);
        setIntField(term18267, term18267.getClass(), "perfect", 0);
        setField(term18256, term18256.getClass(), "hard", term18267);
        setIntField(term18272, term18272.getClass(), "clear", 0);
        setIntField(term18272, term18272.getClass(), "great", 0);
        setIntField(term18272, term18272.getClass(), "excellent", 0);
        setIntField(term18272, term18272.getClass(), "perfect", 0);
        setField(term18256, term18256.getClass(), "extreme", term18272);
        setIntField(term18277, term18277.getClass(), "clear", 0);
        setIntField(term18277, term18277.getClass(), "great", 0);
        setIntField(term18277, term18277.getClass(), "excellent", 0);
        setIntField(term18277, term18277.getClass(), "perfect", 0);
        setField(term18256, term18256.getClass(), "extraExtreme", term18277);
        term18282 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18282, term18282.getClass(), "clear", -1685132342);
        setIntField(term18282, term18282.getClass(), "great", -1456670397);
        setIntField(term18282, term18282.getClass(), "excellent", 1622346318);
        setIntField(term18282, term18282.getClass(), "perfect", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Object[] args = new Object[1];
        args[0] = term18282;
        callMethod(klass, "setExtraExtreme", argTypes, term18256, args);
    }

};



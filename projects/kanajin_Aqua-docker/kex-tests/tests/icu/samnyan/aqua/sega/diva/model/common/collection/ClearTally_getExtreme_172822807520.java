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

public class ClearTally_getExtreme_172822807520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18397;

    public ClearTally_getExtreme_172822807520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18397 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        setField(term18397, term18397.getClass(), "easy", null);
        setField(term18397, term18397.getClass(), "normal", null);
        setField(term18397, term18397.getClass(), "hard", null);
        setField(term18397, term18397.getClass(), "extreme", null);
        setField(term18397, term18397.getClass(), "extraExtreme", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtreme", argTypes, term18397, args);
    }

};



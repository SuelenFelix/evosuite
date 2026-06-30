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

public class PsRankingCollection_getSecond_90494690313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2019451;

    public PsRankingCollection_getSecond_90494690313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2019451 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.PsRankingCollection"));
        setField(term2019451, term2019451.getClass(), "first", null);
        setField(term2019451, term2019451.getClass(), "second", null);
        setField(term2019451, term2019451.getClass(), "third", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.PsRankingCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecond", argTypes, term2019451, args);
    }

};



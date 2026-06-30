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

public class ClearTally_setExtreme_1791586259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18225;
     Object term18251;

    public ClearTally_setExtreme_1791586259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18225 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18226 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18231 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18236 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18241 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18246 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18226, term18226.getClass(), "clear", 0);
        setIntField(term18226, term18226.getClass(), "great", 0);
        setIntField(term18226, term18226.getClass(), "excellent", 0);
        setIntField(term18226, term18226.getClass(), "perfect", 0);
        setField(term18225, term18225.getClass(), "easy", term18226);
        setIntField(term18231, term18231.getClass(), "clear", 0);
        setIntField(term18231, term18231.getClass(), "great", 0);
        setIntField(term18231, term18231.getClass(), "excellent", 0);
        setIntField(term18231, term18231.getClass(), "perfect", 0);
        setField(term18225, term18225.getClass(), "normal", term18231);
        setIntField(term18236, term18236.getClass(), "clear", 0);
        setIntField(term18236, term18236.getClass(), "great", 0);
        setIntField(term18236, term18236.getClass(), "excellent", 0);
        setIntField(term18236, term18236.getClass(), "perfect", 0);
        setField(term18225, term18225.getClass(), "hard", term18236);
        setIntField(term18241, term18241.getClass(), "clear", 0);
        setIntField(term18241, term18241.getClass(), "great", 0);
        setIntField(term18241, term18241.getClass(), "excellent", 0);
        setIntField(term18241, term18241.getClass(), "perfect", 0);
        setField(term18225, term18225.getClass(), "extreme", term18241);
        setIntField(term18246, term18246.getClass(), "clear", 0);
        setIntField(term18246, term18246.getClass(), "great", 0);
        setIntField(term18246, term18246.getClass(), "excellent", 0);
        setIntField(term18246, term18246.getClass(), "perfect", 0);
        setField(term18225, term18225.getClass(), "extraExtreme", term18246);
        term18251 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18251, term18251.getClass(), "clear", 1134449235);
        setIntField(term18251, term18251.getClass(), "great", -883034806);
        setIntField(term18251, term18251.getClass(), "excellent", 1585847225);
        setIntField(term18251, term18251.getClass(), "perfect", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Object[] args = new Object[1];
        args[0] = term18251;
        callMethod(klass, "setExtreme", argTypes, term18225, args);
    }

};



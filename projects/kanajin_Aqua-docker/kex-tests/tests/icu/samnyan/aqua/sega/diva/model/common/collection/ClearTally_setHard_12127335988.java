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

public class ClearTally_setHard_12127335988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18194;
     Object term18220;

    public ClearTally_setHard_12127335988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18194 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18195 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18200 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18205 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18210 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18215 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18195, term18195.getClass(), "clear", 0);
        setIntField(term18195, term18195.getClass(), "great", 0);
        setIntField(term18195, term18195.getClass(), "excellent", 0);
        setIntField(term18195, term18195.getClass(), "perfect", 0);
        setField(term18194, term18194.getClass(), "easy", term18195);
        setIntField(term18200, term18200.getClass(), "clear", 0);
        setIntField(term18200, term18200.getClass(), "great", 0);
        setIntField(term18200, term18200.getClass(), "excellent", 0);
        setIntField(term18200, term18200.getClass(), "perfect", 0);
        setField(term18194, term18194.getClass(), "normal", term18200);
        setIntField(term18205, term18205.getClass(), "clear", 0);
        setIntField(term18205, term18205.getClass(), "great", 0);
        setIntField(term18205, term18205.getClass(), "excellent", 0);
        setIntField(term18205, term18205.getClass(), "perfect", 0);
        setField(term18194, term18194.getClass(), "hard", term18205);
        setIntField(term18210, term18210.getClass(), "clear", 0);
        setIntField(term18210, term18210.getClass(), "great", 0);
        setIntField(term18210, term18210.getClass(), "excellent", 0);
        setIntField(term18210, term18210.getClass(), "perfect", 0);
        setField(term18194, term18194.getClass(), "extreme", term18210);
        setIntField(term18215, term18215.getClass(), "clear", 0);
        setIntField(term18215, term18215.getClass(), "great", 0);
        setIntField(term18215, term18215.getClass(), "excellent", 0);
        setIntField(term18215, term18215.getClass(), "perfect", 0);
        setField(term18194, term18194.getClass(), "extraExtreme", term18215);
        term18220 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18220, term18220.getClass(), "clear", 1227103734);
        setIntField(term18220, term18220.getClass(), "great", -1339778481);
        setIntField(term18220, term18220.getClass(), "excellent", 1725571209);
        setIntField(term18220, term18220.getClass(), "perfect", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Object[] args = new Object[1];
        args[0] = term18220;
        callMethod(klass, "setHard", argTypes, term18194, args);
    }

};



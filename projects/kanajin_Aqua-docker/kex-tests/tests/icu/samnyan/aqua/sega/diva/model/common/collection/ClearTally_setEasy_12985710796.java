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

public class ClearTally_setEasy_12985710796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18132;
     Object term18158;

    public ClearTally_setEasy_12985710796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18132 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18133 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18138 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18143 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18148 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18153 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18133, term18133.getClass(), "clear", 0);
        setIntField(term18133, term18133.getClass(), "great", 0);
        setIntField(term18133, term18133.getClass(), "excellent", 0);
        setIntField(term18133, term18133.getClass(), "perfect", 0);
        setField(term18132, term18132.getClass(), "easy", term18133);
        setIntField(term18138, term18138.getClass(), "clear", 0);
        setIntField(term18138, term18138.getClass(), "great", 0);
        setIntField(term18138, term18138.getClass(), "excellent", 0);
        setIntField(term18138, term18138.getClass(), "perfect", 0);
        setField(term18132, term18132.getClass(), "normal", term18138);
        setIntField(term18143, term18143.getClass(), "clear", 0);
        setIntField(term18143, term18143.getClass(), "great", 0);
        setIntField(term18143, term18143.getClass(), "excellent", 0);
        setIntField(term18143, term18143.getClass(), "perfect", 0);
        setField(term18132, term18132.getClass(), "hard", term18143);
        setIntField(term18148, term18148.getClass(), "clear", 0);
        setIntField(term18148, term18148.getClass(), "great", 0);
        setIntField(term18148, term18148.getClass(), "excellent", 0);
        setIntField(term18148, term18148.getClass(), "perfect", 0);
        setField(term18132, term18132.getClass(), "extreme", term18148);
        setIntField(term18153, term18153.getClass(), "clear", 0);
        setIntField(term18153, term18153.getClass(), "great", 0);
        setIntField(term18153, term18153.getClass(), "excellent", 0);
        setIntField(term18153, term18153.getClass(), "perfect", 0);
        setField(term18132, term18132.getClass(), "extraExtreme", term18153);
        term18158 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18158, term18158.getClass(), "clear", 568599855);
        setIntField(term18158, term18158.getClass(), "great", 1162663216);
        setIntField(term18158, term18158.getClass(), "excellent", 1484323161);
        setIntField(term18158, term18158.getClass(), "perfect", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Object[] args = new Object[1];
        args[0] = term18158;
        callMethod(klass, "setEasy", argTypes, term18132, args);
    }

};



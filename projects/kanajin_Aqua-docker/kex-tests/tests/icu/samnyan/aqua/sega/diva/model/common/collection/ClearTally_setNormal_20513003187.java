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

public class ClearTally_setNormal_20513003187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18163;
     Object term18189;

    public ClearTally_setNormal_20513003187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18163 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18164 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18169 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18174 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18179 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18184 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18164, term18164.getClass(), "clear", 0);
        setIntField(term18164, term18164.getClass(), "great", 0);
        setIntField(term18164, term18164.getClass(), "excellent", 0);
        setIntField(term18164, term18164.getClass(), "perfect", 0);
        setField(term18163, term18163.getClass(), "easy", term18164);
        setIntField(term18169, term18169.getClass(), "clear", 0);
        setIntField(term18169, term18169.getClass(), "great", 0);
        setIntField(term18169, term18169.getClass(), "excellent", 0);
        setIntField(term18169, term18169.getClass(), "perfect", 0);
        setField(term18163, term18163.getClass(), "normal", term18169);
        setIntField(term18174, term18174.getClass(), "clear", 0);
        setIntField(term18174, term18174.getClass(), "great", 0);
        setIntField(term18174, term18174.getClass(), "excellent", 0);
        setIntField(term18174, term18174.getClass(), "perfect", 0);
        setField(term18163, term18163.getClass(), "hard", term18174);
        setIntField(term18179, term18179.getClass(), "clear", 0);
        setIntField(term18179, term18179.getClass(), "great", 0);
        setIntField(term18179, term18179.getClass(), "excellent", 0);
        setIntField(term18179, term18179.getClass(), "perfect", 0);
        setField(term18163, term18163.getClass(), "extreme", term18179);
        setIntField(term18184, term18184.getClass(), "clear", 0);
        setIntField(term18184, term18184.getClass(), "great", 0);
        setIntField(term18184, term18184.getClass(), "excellent", 0);
        setIntField(term18184, term18184.getClass(), "perfect", 0);
        setField(term18163, term18163.getClass(), "extraExtreme", term18184);
        term18189 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18189, term18189.getClass(), "clear", -1922583790);
        setIntField(term18189, term18189.getClass(), "great", -616727354);
        setIntField(term18189, term18189.getClass(), "excellent", -1955890973);
        setIntField(term18189, term18189.getClass(), "perfect", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Object[] args = new Object[1];
        args[0] = term18189;
        callMethod(klass, "setNormal", argTypes, term18163, args);
    }

};



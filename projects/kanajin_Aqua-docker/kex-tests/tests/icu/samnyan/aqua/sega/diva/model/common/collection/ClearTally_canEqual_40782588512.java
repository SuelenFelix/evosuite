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

public class ClearTally_canEqual_40782588512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18314;
     Object term18340;

    public ClearTally_canEqual_40782588512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18314 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18315 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18320 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18325 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18330 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18335 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18315, term18315.getClass(), "clear", 0);
        setIntField(term18315, term18315.getClass(), "great", 0);
        setIntField(term18315, term18315.getClass(), "excellent", 0);
        setIntField(term18315, term18315.getClass(), "perfect", 0);
        setField(term18314, term18314.getClass(), "easy", term18315);
        setIntField(term18320, term18320.getClass(), "clear", 0);
        setIntField(term18320, term18320.getClass(), "great", 0);
        setIntField(term18320, term18320.getClass(), "excellent", 0);
        setIntField(term18320, term18320.getClass(), "perfect", 0);
        setField(term18314, term18314.getClass(), "normal", term18320);
        setIntField(term18325, term18325.getClass(), "clear", 0);
        setIntField(term18325, term18325.getClass(), "great", 0);
        setIntField(term18325, term18325.getClass(), "excellent", 0);
        setIntField(term18325, term18325.getClass(), "perfect", 0);
        setField(term18314, term18314.getClass(), "hard", term18325);
        setIntField(term18330, term18330.getClass(), "clear", 0);
        setIntField(term18330, term18330.getClass(), "great", 0);
        setIntField(term18330, term18330.getClass(), "excellent", 0);
        setIntField(term18330, term18330.getClass(), "perfect", 0);
        setField(term18314, term18314.getClass(), "extreme", term18330);
        setIntField(term18335, term18335.getClass(), "clear", 0);
        setIntField(term18335, term18335.getClass(), "great", 0);
        setIntField(term18335, term18335.getClass(), "excellent", 0);
        setIntField(term18335, term18335.getClass(), "perfect", 0);
        setField(term18314, term18314.getClass(), "extraExtreme", term18335);
        term18340 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18340;
        callMethod(klass, "canEqual", argTypes, term18314, args);
    }

};



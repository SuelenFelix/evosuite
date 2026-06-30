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

public class ClearTally_getNormal_13012921782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18028;

    public ClearTally_getNormal_13012921782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18028 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18029 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18034 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18039 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18044 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18049 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18029, term18029.getClass(), "clear", 0);
        setIntField(term18029, term18029.getClass(), "great", 0);
        setIntField(term18029, term18029.getClass(), "excellent", 0);
        setIntField(term18029, term18029.getClass(), "perfect", 0);
        setField(term18028, term18028.getClass(), "easy", term18029);
        setIntField(term18034, term18034.getClass(), "clear", 0);
        setIntField(term18034, term18034.getClass(), "great", 0);
        setIntField(term18034, term18034.getClass(), "excellent", 0);
        setIntField(term18034, term18034.getClass(), "perfect", 0);
        setField(term18028, term18028.getClass(), "normal", term18034);
        setIntField(term18039, term18039.getClass(), "clear", 0);
        setIntField(term18039, term18039.getClass(), "great", 0);
        setIntField(term18039, term18039.getClass(), "excellent", 0);
        setIntField(term18039, term18039.getClass(), "perfect", 0);
        setField(term18028, term18028.getClass(), "hard", term18039);
        setIntField(term18044, term18044.getClass(), "clear", 0);
        setIntField(term18044, term18044.getClass(), "great", 0);
        setIntField(term18044, term18044.getClass(), "excellent", 0);
        setIntField(term18044, term18044.getClass(), "perfect", 0);
        setField(term18028, term18028.getClass(), "extreme", term18044);
        setIntField(term18049, term18049.getClass(), "clear", 0);
        setIntField(term18049, term18049.getClass(), "great", 0);
        setIntField(term18049, term18049.getClass(), "excellent", 0);
        setIntField(term18049, term18049.getClass(), "perfect", 0);
        setField(term18028, term18028.getClass(), "extraExtreme", term18049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormal", argTypes, term18028, args);
    }

};



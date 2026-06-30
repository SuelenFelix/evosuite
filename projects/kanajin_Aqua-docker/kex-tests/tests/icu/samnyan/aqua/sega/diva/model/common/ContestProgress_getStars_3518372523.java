package icu.samnyan.aqua.sega.diva.model.common;

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
import static icu.samnyan.aqua.sega.diva.model.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContestProgress_getStars_3518372523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3058;

    public ContestProgress_getStars_3518372523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3058 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress"));
        setIntField(term3058, term3058.getClass(), "pvId", 1962444399);
        setIntField(term3058, term3058.getClass(), "hardness", 767834723);
        setIntField(term3058, term3058.getClass(), "edition", -602026508);
        setIntField(term3058, term3058.getClass(), "stars", -157887805);
        setIntField(term3058, term3058.getClass(), "scores", 1876565163);
        setIntField(term3058, term3058.getClass(), "version", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStars", argTypes, term3058, args);
    }

};



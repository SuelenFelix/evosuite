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

public class LevelInfo_hashCode_112918806116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1807;

    public LevelInfo_hashCode_112918806116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1807 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.LevelInfo"));
        setIntField(term1807, term1807.getClass(), "levelNumber", 0);
        setIntField(term1807, term1807.getClass(), "levelExp", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.LevelInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1807, args);
    }

};



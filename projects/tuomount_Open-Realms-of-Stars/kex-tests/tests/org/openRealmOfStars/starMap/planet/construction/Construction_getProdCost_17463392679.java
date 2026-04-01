package org.openRealmOfStars.starMap.planet.construction;

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
import static org.openRealmOfStars.starMap.planet.construction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Construction_getProdCost_17463392679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740;

    public Construction_getProdCost_17463392679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        setField(term740, term740.getClass(), "name", "AijpHYOFuy");
        setField(term740, term740.getClass(), "iconId", "SbAoxhfrkn");
        setField(term740, term740.getClass(), "description", "kuTXqwMtDB");
        setIntField(term740, term740.getClass(), "prodCost", 1622346318);
        setIntField(term740, term740.getClass(), "metalCost", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProdCost", argTypes, term740, args);
    }

};



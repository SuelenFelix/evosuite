package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlanetaryStatus_getReseBonus_170315185111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7810;

    public PlanetaryStatus_getReseBonus_170315185111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7810 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term7847 = (Object[]) newArray("java.lang.String", 4);
        setField(term7810, term7810.getClass(), "statusId", "NnpwZBUTvx");
        setField(term7810, term7810.getClass(), "name", "tlQSNgTkQX");
        setField(term7810, term7810.getClass(), "description", "PCipZnmBOF");
        setElement(term7847, 0, "zcorEihhLK");
        setElement(term7847, 1, "GrqozDKFOk");
        setElement(term7847, 2, "CFyoseFGLF");
        setElement(term7847, 3, "SFqCrhEWLm");
        setField(term7810, term7810.getClass(), "conflictingIds", term7847);
        setIntField(term7810, term7810.getClass(), "foodBonus", 1384592638);
        setIntField(term7810, term7810.getClass(), "happinessBonus", -1002370457);
        setIntField(term7810, term7810.getClass(), "mineBonus", -2014576105);
        setIntField(term7810, term7810.getClass(), "prodBonus", 1296895584);
        setIntField(term7810, term7810.getClass(), "credBonus", 628918458);
        setIntField(term7810, term7810.getClass(), "reseBonus", -1274456137);
        setBooleanField(term7810, term7810.getClass(), "hidden", true);
        setField(term7810, term7810.getClass(), "discoveryText", "GZdcJyZntS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReseBonus", argTypes, term7810, args);
    }

};



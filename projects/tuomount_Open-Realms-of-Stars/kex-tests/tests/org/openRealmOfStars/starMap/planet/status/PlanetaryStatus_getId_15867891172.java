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

public class PlanetaryStatus_getId_15867891172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6145;

    public PlanetaryStatus_getId_15867891172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6145 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term6182 = (Object[]) newArray("java.lang.String", 6);
        setField(term6145, term6145.getClass(), "statusId", "yVMkkQhvmN");
        setField(term6145, term6145.getClass(), "name", "mvrkADEgpp");
        setField(term6145, term6145.getClass(), "description", "pXOkjyeIRb");
        setElement(term6182, 0, "GgZWSjxjyE");
        setElement(term6182, 1, "EeBVbzjcCI");
        setElement(term6182, 2, "UfQtPRyWRC");
        setElement(term6182, 3, "FPvxVzzSvD");
        setElement(term6182, 4, "WHcwFgsGFC");
        setElement(term6182, 5, "HzqpegHiRq");
        setField(term6145, term6145.getClass(), "conflictingIds", term6182);
        setIntField(term6145, term6145.getClass(), "foodBonus", -1801760683);
        setIntField(term6145, term6145.getClass(), "happinessBonus", 1141317871);
        setIntField(term6145, term6145.getClass(), "mineBonus", 890669485);
        setIntField(term6145, term6145.getClass(), "prodBonus", 691577392);
        setIntField(term6145, term6145.getClass(), "credBonus", -893623680);
        setIntField(term6145, term6145.getClass(), "reseBonus", -1963434938);
        setBooleanField(term6145, term6145.getClass(), "hidden", false);
        setField(term6145, term6145.getClass(), "discoveryText", "jwsfVjMoJT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6145, args);
    }

};



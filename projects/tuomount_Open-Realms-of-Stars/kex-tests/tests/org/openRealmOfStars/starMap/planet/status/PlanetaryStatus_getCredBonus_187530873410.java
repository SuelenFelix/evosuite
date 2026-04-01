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

public class PlanetaryStatus_getCredBonus_187530873410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7515;

    public PlanetaryStatus_getCredBonus_187530873410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7515 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term7552 = (Object[]) newArray("java.lang.String", 9);
        setField(term7515, term7515.getClass(), "statusId", "iikZEapDlu");
        setField(term7515, term7515.getClass(), "name", "nhoHrZfnIN");
        setField(term7515, term7515.getClass(), "description", "ZkMALXpEAZ");
        setElement(term7552, 0, "tXfQjSqDzN");
        setElement(term7552, 1, "BjugTaMcxJ");
        setElement(term7552, 2, "vGiuZVPJNH");
        setElement(term7552, 3, "tlzpzIjMib");
        setElement(term7552, 4, "AZdLeSugwv");
        setElement(term7552, 5, "RMsXuyzKJV");
        setElement(term7552, 6, "FwPbDZcHmB");
        setElement(term7552, 7, "hOncybyCAH");
        setElement(term7552, 8, "QduALnDSVo");
        setField(term7515, term7515.getClass(), "conflictingIds", term7552);
        setIntField(term7515, term7515.getClass(), "foodBonus", 1283079251);
        setIntField(term7515, term7515.getClass(), "happinessBonus", -523949691);
        setIntField(term7515, term7515.getClass(), "mineBonus", 1398204340);
        setIntField(term7515, term7515.getClass(), "prodBonus", 229204365);
        setIntField(term7515, term7515.getClass(), "credBonus", -461771056);
        setIntField(term7515, term7515.getClass(), "reseBonus", -243422082);
        setBooleanField(term7515, term7515.getClass(), "hidden", false);
        setField(term7515, term7515.getClass(), "discoveryText", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCredBonus", argTypes, term7515, args);
    }

};



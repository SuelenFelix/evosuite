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

public class PlanetaryStatus_getProdBonus_3605480719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7418;

    public PlanetaryStatus_getProdBonus_3605480719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7418 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term7455 = (Object[]) newArray("java.lang.String", 0);
        setField(term7418, term7418.getClass(), "statusId", "wzsPSPcRdj");
        setField(term7418, term7418.getClass(), "name", "kGMQdqJYyB");
        setField(term7418, term7418.getClass(), "description", "XJJNClzHRf");
        setField(term7418, term7418.getClass(), "conflictingIds", term7455);
        setIntField(term7418, term7418.getClass(), "foodBonus", 2098647989);
        setIntField(term7418, term7418.getClass(), "happinessBonus", 1598895173);
        setIntField(term7418, term7418.getClass(), "mineBonus", 1830648570);
        setIntField(term7418, term7418.getClass(), "prodBonus", -227365013);
        setIntField(term7418, term7418.getClass(), "credBonus", 11724947);
        setIntField(term7418, term7418.getClass(), "reseBonus", 1953277050);
        setBooleanField(term7418, term7418.getClass(), "hidden", false);
        setField(term7418, term7418.getClass(), "discoveryText", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProdBonus", argTypes, term7418, args);
    }

};



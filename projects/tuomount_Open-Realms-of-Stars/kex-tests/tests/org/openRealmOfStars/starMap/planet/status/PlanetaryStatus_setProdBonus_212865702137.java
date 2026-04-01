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
import java.lang.Integer;

public class PlanetaryStatus_setProdBonus_212865702137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10439;
     Object term10447;

    public PlanetaryStatus_setProdBonus_212865702137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10439 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10439, term10439.getClass(), "statusId", null);
        setField(term10439, term10439.getClass(), "name", null);
        setField(term10439, term10439.getClass(), "description", null);
        setField(term10439, term10439.getClass(), "conflictingIds", null);
        setIntField(term10439, term10439.getClass(), "foodBonus", 0);
        setIntField(term10439, term10439.getClass(), "happinessBonus", 0);
        setIntField(term10439, term10439.getClass(), "mineBonus", 0);
        setIntField(term10439, term10439.getClass(), "prodBonus", 0);
        setIntField(term10439, term10439.getClass(), "credBonus", 0);
        setIntField(term10439, term10439.getClass(), "reseBonus", 0);
        setBooleanField(term10439, term10439.getClass(), "hidden", false);
        setField(term10439, term10439.getClass(), "discoveryText", null);
        term10447 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10447;
        callMethod(klass, "setProdBonus", argTypes, term10439, args);
    }

};



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

public class PlanetaryStatus_getConflictingIds_9259470375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6722;

    public PlanetaryStatus_getConflictingIds_9259470375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6722 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term6759 = (Object[]) newArray("java.lang.String", 3);
        setField(term6722, term6722.getClass(), "statusId", "smnHEqRFRx");
        setField(term6722, term6722.getClass(), "name", "XYtryyobou");
        setField(term6722, term6722.getClass(), "description", "OYbzXylRWW");
        setElement(term6759, 0, "DSNsTGYXDF");
        setElement(term6759, 1, "sQvGcVjdEx");
        setElement(term6759, 2, "rLHAoqXgPh");
        setField(term6722, term6722.getClass(), "conflictingIds", term6759);
        setIntField(term6722, term6722.getClass(), "foodBonus", -2015854073);
        setIntField(term6722, term6722.getClass(), "happinessBonus", 538259104);
        setIntField(term6722, term6722.getClass(), "mineBonus", 96566506);
        setIntField(term6722, term6722.getClass(), "prodBonus", -343325701);
        setIntField(term6722, term6722.getClass(), "credBonus", 107945604);
        setIntField(term6722, term6722.getClass(), "reseBonus", -1963464809);
        setBooleanField(term6722, term6722.getClass(), "hidden", true);
        setField(term6722, term6722.getClass(), "discoveryText", "zUlRdimJtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConflictingIds", argTypes, term6722, args);
    }

};



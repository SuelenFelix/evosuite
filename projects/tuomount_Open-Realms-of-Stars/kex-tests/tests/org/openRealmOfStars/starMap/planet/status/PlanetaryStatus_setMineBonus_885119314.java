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
import java.lang.Integer;

public class PlanetaryStatus_setMineBonus_885119314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8501;
     Object term8582;

    public PlanetaryStatus_setMineBonus_885119314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8501 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term8538 = (Object[]) newArray("java.lang.String", 2);
        setField(term8501, term8501.getClass(), "statusId", "PqtVXXZMqK");
        setField(term8501, term8501.getClass(), "name", "rYbtIDVdnd");
        setField(term8501, term8501.getClass(), "description", "UKAReurpHG");
        setElement(term8538, 0, "WVRMUmrljA");
        setElement(term8538, 1, "NTlKJDDWlk");
        setField(term8501, term8501.getClass(), "conflictingIds", term8538);
        setIntField(term8501, term8501.getClass(), "foodBonus", -1970452551);
        setIntField(term8501, term8501.getClass(), "happinessBonus", -1896376975);
        setIntField(term8501, term8501.getClass(), "mineBonus", 729658803);
        setIntField(term8501, term8501.getClass(), "prodBonus", 114754804);
        setIntField(term8501, term8501.getClass(), "credBonus", 1687361082);
        setIntField(term8501, term8501.getClass(), "reseBonus", 584893196);
        setBooleanField(term8501, term8501.getClass(), "hidden", true);
        setField(term8501, term8501.getClass(), "discoveryText", "vOuMEpOQAg");
        term8582 = new Integer(497269071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8582;
        callMethod(klass, "setMineBonus", argTypes, term8501, args);
    }

};



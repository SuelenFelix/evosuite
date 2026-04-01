package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Planet_getTotalProduction_170551097337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177542;
     Object term177556;

    public Planet_getTotalProduction_170551097337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177542 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term177542, term177542.getClass(), "name", null);
        setIntField(term177542, term177542.getClass(), "orderNumber", 0);
        setField(term177542, term177542.getClass(), "radiationType", null);
        setField(term177542, term177542.getClass(), "gravityType", null);
        setField(term177542, term177542.getClass(), "temperatureType", null);
        setField(term177542, term177542.getClass(), "waterLevel", null);
        setBooleanField(term177542, term177542.getClass(), "gasGiant", false);
        setField(term177542, term177542.getClass(), "coordinate", null);
        setField(term177542, term177542.getClass(), "planetType", null);
        setIntField(term177542, term177542.getClass(), "groundSize", 0);
        setIntField(term177542, term177542.getClass(), "amountMetalInGround", 0);
        setIntField(term177542, term177542.getClass(), "metal", 0);
        setIntField(term177542, term177542.getClass(), "prodResource", 0);
        setIntField(term177542, term177542.getClass(), "extraFood", 0);
        setIntField(term177542, term177542.getClass(), "culture", 0);
        setIntField(term177542, term177542.getClass(), "planetOwner", 0);
        setField(term177542, term177542.getClass(), "planetOwnerInfo", null);
        setField(term177542, term177542.getClass(), "homeWorldId", null);
        setIntField(term177542, term177542.getClass(), "startRealmIndex", 0);
        setIntField(term177542, term177542.getClass(), "tax", 0);
        setField(term177542, term177542.getClass(), "statuses", null);
        setField(term177542, term177542.getClass(), "timedStatuses", null);
        setField(term177542, term177542.getClass(), "event", null);
        setBooleanField(term177542, term177542.getClass(), "eventFound", false);
        setField(term177542, term177542.getClass(), "happinessEffect", null);
        setField(term177542, term177542.getClass(), "happinessExplanation", null);
        setField(term177542, term177542.getClass(), "farmProdExplain", null);
        setField(term177542, term177542.getClass(), "metaProdExplain", null);
        setField(term177542, term177542.getClass(), "prodProdExplain", null);
        setField(term177542, term177542.getClass(), "reseProdExplain", null);
        setField(term177542, term177542.getClass(), "cultProdExplain", null);
        setField(term177542, term177542.getClass(), "credProdExplain", null);
        setField(term177542, term177542.getClass(), "governor", null);
        setIntField(term177542, term177542.getClass(), "governorGuide", 0);
        setField(term177542, term177542.getClass(), "orbital", null);
        setField(term177542, term177542.getClass(), "workers", null);
        setField(term177542, term177542.getClass(), "buildings", null);
        setField(term177542, term177542.getClass(), "underConstruction", null);
        term177556 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177556;
        callMethod(klass, "getTotalProduction", argTypes, term177542, args);
    }

};



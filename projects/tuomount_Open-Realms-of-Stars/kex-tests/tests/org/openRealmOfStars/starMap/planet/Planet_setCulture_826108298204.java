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

public class Planet_setCulture_826108298204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875216;
     Object term875230;

    public Planet_setCulture_826108298204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term875216 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term875216, term875216.getClass(), "name", null);
        setIntField(term875216, term875216.getClass(), "orderNumber", 0);
        setField(term875216, term875216.getClass(), "radiationType", null);
        setField(term875216, term875216.getClass(), "gravityType", null);
        setField(term875216, term875216.getClass(), "temperatureType", null);
        setField(term875216, term875216.getClass(), "waterLevel", null);
        setBooleanField(term875216, term875216.getClass(), "gasGiant", false);
        setField(term875216, term875216.getClass(), "coordinate", null);
        setField(term875216, term875216.getClass(), "planetType", null);
        setIntField(term875216, term875216.getClass(), "groundSize", 0);
        setIntField(term875216, term875216.getClass(), "amountMetalInGround", 0);
        setIntField(term875216, term875216.getClass(), "metal", 0);
        setIntField(term875216, term875216.getClass(), "prodResource", 0);
        setIntField(term875216, term875216.getClass(), "extraFood", 0);
        setIntField(term875216, term875216.getClass(), "culture", 0);
        setIntField(term875216, term875216.getClass(), "planetOwner", 0);
        setField(term875216, term875216.getClass(), "planetOwnerInfo", null);
        setField(term875216, term875216.getClass(), "homeWorldId", null);
        setIntField(term875216, term875216.getClass(), "startRealmIndex", 0);
        setIntField(term875216, term875216.getClass(), "tax", 0);
        setField(term875216, term875216.getClass(), "statuses", null);
        setField(term875216, term875216.getClass(), "timedStatuses", null);
        setField(term875216, term875216.getClass(), "event", null);
        setBooleanField(term875216, term875216.getClass(), "eventFound", false);
        setField(term875216, term875216.getClass(), "happinessEffect", null);
        setField(term875216, term875216.getClass(), "happinessExplanation", null);
        setField(term875216, term875216.getClass(), "farmProdExplain", null);
        setField(term875216, term875216.getClass(), "metaProdExplain", null);
        setField(term875216, term875216.getClass(), "prodProdExplain", null);
        setField(term875216, term875216.getClass(), "reseProdExplain", null);
        setField(term875216, term875216.getClass(), "cultProdExplain", null);
        setField(term875216, term875216.getClass(), "credProdExplain", null);
        setField(term875216, term875216.getClass(), "governor", null);
        setIntField(term875216, term875216.getClass(), "governorGuide", 0);
        setField(term875216, term875216.getClass(), "orbital", null);
        setField(term875216, term875216.getClass(), "workers", null);
        setField(term875216, term875216.getClass(), "buildings", null);
        setField(term875216, term875216.getClass(), "underConstruction", null);
        term875230 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term875230;
        callMethod(klass, "setCulture", argTypes, term875216, args);
    }

};



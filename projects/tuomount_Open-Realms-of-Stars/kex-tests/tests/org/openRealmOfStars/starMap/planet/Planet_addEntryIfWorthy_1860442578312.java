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

public class Planet_addEntryIfWorthy_1860442578312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325814;
     Object term1325828;

    public Planet_addEntryIfWorthy_1860442578312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325814 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325814, term1325814.getClass(), "name", null);
        setIntField(term1325814, term1325814.getClass(), "orderNumber", 0);
        setField(term1325814, term1325814.getClass(), "radiationType", null);
        setField(term1325814, term1325814.getClass(), "gravityType", null);
        setField(term1325814, term1325814.getClass(), "temperatureType", null);
        setField(term1325814, term1325814.getClass(), "waterLevel", null);
        setBooleanField(term1325814, term1325814.getClass(), "gasGiant", false);
        setField(term1325814, term1325814.getClass(), "coordinate", null);
        setField(term1325814, term1325814.getClass(), "planetType", null);
        setIntField(term1325814, term1325814.getClass(), "groundSize", 0);
        setIntField(term1325814, term1325814.getClass(), "amountMetalInGround", 0);
        setIntField(term1325814, term1325814.getClass(), "metal", 0);
        setIntField(term1325814, term1325814.getClass(), "prodResource", 0);
        setIntField(term1325814, term1325814.getClass(), "extraFood", 0);
        setIntField(term1325814, term1325814.getClass(), "culture", 0);
        setIntField(term1325814, term1325814.getClass(), "planetOwner", 0);
        setField(term1325814, term1325814.getClass(), "planetOwnerInfo", null);
        setField(term1325814, term1325814.getClass(), "homeWorldId", null);
        setIntField(term1325814, term1325814.getClass(), "startRealmIndex", 0);
        setIntField(term1325814, term1325814.getClass(), "tax", 0);
        setField(term1325814, term1325814.getClass(), "statuses", null);
        setField(term1325814, term1325814.getClass(), "timedStatuses", null);
        setField(term1325814, term1325814.getClass(), "event", null);
        setBooleanField(term1325814, term1325814.getClass(), "eventFound", false);
        setField(term1325814, term1325814.getClass(), "happinessEffect", null);
        setField(term1325814, term1325814.getClass(), "happinessExplanation", null);
        setField(term1325814, term1325814.getClass(), "farmProdExplain", null);
        setField(term1325814, term1325814.getClass(), "metaProdExplain", null);
        setField(term1325814, term1325814.getClass(), "prodProdExplain", null);
        setField(term1325814, term1325814.getClass(), "reseProdExplain", null);
        setField(term1325814, term1325814.getClass(), "cultProdExplain", null);
        setField(term1325814, term1325814.getClass(), "credProdExplain", null);
        setField(term1325814, term1325814.getClass(), "governor", null);
        setIntField(term1325814, term1325814.getClass(), "governorGuide", 0);
        setField(term1325814, term1325814.getClass(), "orbital", null);
        setField(term1325814, term1325814.getClass(), "workers", null);
        setField(term1325814, term1325814.getClass(), "buildings", null);
        setField(term1325814, term1325814.getClass(), "underConstruction", null);
        term1325828 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1325828;
        callMethod(klass, "addEntryIfWorthy", argTypes, term1325814, args);
    }

};



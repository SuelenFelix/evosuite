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

public class Planet_addEntryIfWorthy_1860442578313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373075;
     Object term3373089;

    public Planet_addEntryIfWorthy_1860442578313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373075 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373075, term3373075.getClass(), "name", null);
        setIntField(term3373075, term3373075.getClass(), "orderNumber", 0);
        setField(term3373075, term3373075.getClass(), "radiationType", null);
        setField(term3373075, term3373075.getClass(), "gravityType", null);
        setField(term3373075, term3373075.getClass(), "temperatureType", null);
        setField(term3373075, term3373075.getClass(), "waterLevel", null);
        setBooleanField(term3373075, term3373075.getClass(), "gasGiant", false);
        setField(term3373075, term3373075.getClass(), "coordinate", null);
        setField(term3373075, term3373075.getClass(), "planetType", null);
        setIntField(term3373075, term3373075.getClass(), "groundSize", 0);
        setIntField(term3373075, term3373075.getClass(), "amountMetalInGround", 0);
        setIntField(term3373075, term3373075.getClass(), "metal", 0);
        setIntField(term3373075, term3373075.getClass(), "prodResource", 0);
        setIntField(term3373075, term3373075.getClass(), "extraFood", 0);
        setIntField(term3373075, term3373075.getClass(), "culture", 0);
        setIntField(term3373075, term3373075.getClass(), "planetOwner", 0);
        setField(term3373075, term3373075.getClass(), "planetOwnerInfo", null);
        setField(term3373075, term3373075.getClass(), "homeWorldId", null);
        setIntField(term3373075, term3373075.getClass(), "startRealmIndex", 0);
        setIntField(term3373075, term3373075.getClass(), "tax", 0);
        setField(term3373075, term3373075.getClass(), "statuses", null);
        setField(term3373075, term3373075.getClass(), "timedStatuses", null);
        setField(term3373075, term3373075.getClass(), "event", null);
        setBooleanField(term3373075, term3373075.getClass(), "eventFound", false);
        setField(term3373075, term3373075.getClass(), "happinessEffect", null);
        setField(term3373075, term3373075.getClass(), "happinessExplanation", null);
        setField(term3373075, term3373075.getClass(), "farmProdExplain", null);
        setField(term3373075, term3373075.getClass(), "metaProdExplain", null);
        setField(term3373075, term3373075.getClass(), "prodProdExplain", null);
        setField(term3373075, term3373075.getClass(), "reseProdExplain", null);
        setField(term3373075, term3373075.getClass(), "cultProdExplain", null);
        setField(term3373075, term3373075.getClass(), "credProdExplain", null);
        setField(term3373075, term3373075.getClass(), "governor", null);
        setIntField(term3373075, term3373075.getClass(), "governorGuide", 0);
        setField(term3373075, term3373075.getClass(), "orbital", null);
        setField(term3373075, term3373075.getClass(), "workers", null);
        setField(term3373075, term3373075.getClass(), "buildings", null);
        setField(term3373075, term3373075.getClass(), "underConstruction", null);
        term3373089 = new Integer(0);
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
        args[2] = term3373089;
        callMethod(klass, "addEntryIfWorthy", argTypes, term3373075, args);
    }

};



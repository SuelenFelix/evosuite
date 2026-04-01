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
import java.lang.Boolean;

public class Planet_updateOneTurn_488354820318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373147;
     Object term3373161;

    public Planet_updateOneTurn_488354820318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373147 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373147, term3373147.getClass(), "name", null);
        setIntField(term3373147, term3373147.getClass(), "orderNumber", 0);
        setField(term3373147, term3373147.getClass(), "radiationType", null);
        setField(term3373147, term3373147.getClass(), "gravityType", null);
        setField(term3373147, term3373147.getClass(), "temperatureType", null);
        setField(term3373147, term3373147.getClass(), "waterLevel", null);
        setBooleanField(term3373147, term3373147.getClass(), "gasGiant", false);
        setField(term3373147, term3373147.getClass(), "coordinate", null);
        setField(term3373147, term3373147.getClass(), "planetType", null);
        setIntField(term3373147, term3373147.getClass(), "groundSize", 0);
        setIntField(term3373147, term3373147.getClass(), "amountMetalInGround", 0);
        setIntField(term3373147, term3373147.getClass(), "metal", 0);
        setIntField(term3373147, term3373147.getClass(), "prodResource", 0);
        setIntField(term3373147, term3373147.getClass(), "extraFood", 0);
        setIntField(term3373147, term3373147.getClass(), "culture", 0);
        setIntField(term3373147, term3373147.getClass(), "planetOwner", 0);
        setField(term3373147, term3373147.getClass(), "planetOwnerInfo", null);
        setField(term3373147, term3373147.getClass(), "homeWorldId", null);
        setIntField(term3373147, term3373147.getClass(), "startRealmIndex", 0);
        setIntField(term3373147, term3373147.getClass(), "tax", 0);
        setField(term3373147, term3373147.getClass(), "statuses", null);
        setField(term3373147, term3373147.getClass(), "timedStatuses", null);
        setField(term3373147, term3373147.getClass(), "event", null);
        setBooleanField(term3373147, term3373147.getClass(), "eventFound", false);
        setField(term3373147, term3373147.getClass(), "happinessEffect", null);
        setField(term3373147, term3373147.getClass(), "happinessExplanation", null);
        setField(term3373147, term3373147.getClass(), "farmProdExplain", null);
        setField(term3373147, term3373147.getClass(), "metaProdExplain", null);
        setField(term3373147, term3373147.getClass(), "prodProdExplain", null);
        setField(term3373147, term3373147.getClass(), "reseProdExplain", null);
        setField(term3373147, term3373147.getClass(), "cultProdExplain", null);
        setField(term3373147, term3373147.getClass(), "credProdExplain", null);
        setField(term3373147, term3373147.getClass(), "governor", null);
        setIntField(term3373147, term3373147.getClass(), "governorGuide", 0);
        setField(term3373147, term3373147.getClass(), "orbital", null);
        setField(term3373147, term3373147.getClass(), "workers", null);
        setField(term3373147, term3373147.getClass(), "buildings", null);
        setField(term3373147, term3373147.getClass(), "underConstruction", null);
        term3373161 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[2];
        args[0] = term3373161;
        args[1] = null;
        callMethod(klass, "updateOneTurn", argTypes, term3373147, args);
    }

};



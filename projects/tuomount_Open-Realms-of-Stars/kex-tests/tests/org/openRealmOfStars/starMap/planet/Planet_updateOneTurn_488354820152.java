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

public class Planet_updateOneTurn_488354820152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640490;
     Object term640504;

    public Planet_updateOneTurn_488354820152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640490 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term640490, term640490.getClass(), "name", null);
        setIntField(term640490, term640490.getClass(), "orderNumber", 0);
        setField(term640490, term640490.getClass(), "radiationType", null);
        setField(term640490, term640490.getClass(), "gravityType", null);
        setField(term640490, term640490.getClass(), "temperatureType", null);
        setField(term640490, term640490.getClass(), "waterLevel", null);
        setBooleanField(term640490, term640490.getClass(), "gasGiant", false);
        setField(term640490, term640490.getClass(), "coordinate", null);
        setField(term640490, term640490.getClass(), "planetType", null);
        setIntField(term640490, term640490.getClass(), "groundSize", 0);
        setIntField(term640490, term640490.getClass(), "amountMetalInGround", 0);
        setIntField(term640490, term640490.getClass(), "metal", 0);
        setIntField(term640490, term640490.getClass(), "prodResource", 0);
        setIntField(term640490, term640490.getClass(), "extraFood", 0);
        setIntField(term640490, term640490.getClass(), "culture", 0);
        setIntField(term640490, term640490.getClass(), "planetOwner", 0);
        setField(term640490, term640490.getClass(), "planetOwnerInfo", null);
        setField(term640490, term640490.getClass(), "homeWorldId", null);
        setIntField(term640490, term640490.getClass(), "startRealmIndex", 0);
        setIntField(term640490, term640490.getClass(), "tax", 0);
        setField(term640490, term640490.getClass(), "statuses", null);
        setField(term640490, term640490.getClass(), "timedStatuses", null);
        setField(term640490, term640490.getClass(), "event", null);
        setBooleanField(term640490, term640490.getClass(), "eventFound", false);
        setField(term640490, term640490.getClass(), "happinessEffect", null);
        setField(term640490, term640490.getClass(), "happinessExplanation", null);
        setField(term640490, term640490.getClass(), "farmProdExplain", null);
        setField(term640490, term640490.getClass(), "metaProdExplain", null);
        setField(term640490, term640490.getClass(), "prodProdExplain", null);
        setField(term640490, term640490.getClass(), "reseProdExplain", null);
        setField(term640490, term640490.getClass(), "cultProdExplain", null);
        setField(term640490, term640490.getClass(), "credProdExplain", null);
        setField(term640490, term640490.getClass(), "governor", null);
        setIntField(term640490, term640490.getClass(), "governorGuide", 0);
        setField(term640490, term640490.getClass(), "orbital", null);
        setField(term640490, term640490.getClass(), "workers", null);
        setField(term640490, term640490.getClass(), "buildings", null);
        setField(term640490, term640490.getClass(), "underConstruction", null);
        term640504 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[2];
        args[0] = term640504;
        args[1] = null;
        callMethod(klass, "updateOneTurn", argTypes, term640490, args);
    }

};



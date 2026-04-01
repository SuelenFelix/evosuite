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

public class Planet_nukem_1754253535323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373219;
     Object term3373233;

    public Planet_nukem_1754253535323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373219 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373219, term3373219.getClass(), "name", null);
        setIntField(term3373219, term3373219.getClass(), "orderNumber", 0);
        setField(term3373219, term3373219.getClass(), "radiationType", null);
        setField(term3373219, term3373219.getClass(), "gravityType", null);
        setField(term3373219, term3373219.getClass(), "temperatureType", null);
        setField(term3373219, term3373219.getClass(), "waterLevel", null);
        setBooleanField(term3373219, term3373219.getClass(), "gasGiant", false);
        setField(term3373219, term3373219.getClass(), "coordinate", null);
        setField(term3373219, term3373219.getClass(), "planetType", null);
        setIntField(term3373219, term3373219.getClass(), "groundSize", 0);
        setIntField(term3373219, term3373219.getClass(), "amountMetalInGround", 0);
        setIntField(term3373219, term3373219.getClass(), "metal", 0);
        setIntField(term3373219, term3373219.getClass(), "prodResource", 0);
        setIntField(term3373219, term3373219.getClass(), "extraFood", 0);
        setIntField(term3373219, term3373219.getClass(), "culture", 0);
        setIntField(term3373219, term3373219.getClass(), "planetOwner", 0);
        setField(term3373219, term3373219.getClass(), "planetOwnerInfo", null);
        setField(term3373219, term3373219.getClass(), "homeWorldId", null);
        setIntField(term3373219, term3373219.getClass(), "startRealmIndex", 0);
        setIntField(term3373219, term3373219.getClass(), "tax", 0);
        setField(term3373219, term3373219.getClass(), "statuses", null);
        setField(term3373219, term3373219.getClass(), "timedStatuses", null);
        setField(term3373219, term3373219.getClass(), "event", null);
        setBooleanField(term3373219, term3373219.getClass(), "eventFound", false);
        setField(term3373219, term3373219.getClass(), "happinessEffect", null);
        setField(term3373219, term3373219.getClass(), "happinessExplanation", null);
        setField(term3373219, term3373219.getClass(), "farmProdExplain", null);
        setField(term3373219, term3373219.getClass(), "metaProdExplain", null);
        setField(term3373219, term3373219.getClass(), "prodProdExplain", null);
        setField(term3373219, term3373219.getClass(), "reseProdExplain", null);
        setField(term3373219, term3373219.getClass(), "cultProdExplain", null);
        setField(term3373219, term3373219.getClass(), "credProdExplain", null);
        setField(term3373219, term3373219.getClass(), "governor", null);
        setIntField(term3373219, term3373219.getClass(), "governorGuide", 0);
        setField(term3373219, term3373219.getClass(), "orbital", null);
        setField(term3373219, term3373219.getClass(), "workers", null);
        setField(term3373219, term3373219.getClass(), "buildings", null);
        setField(term3373219, term3373219.getClass(), "underConstruction", null);
        term3373233 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[3] = Class.forName("org.openRealmOfStars.starMap.planet.PlanetNuked");
        Object[] args = new Object[4];
        args[0] = term3373233;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "nukem", argTypes, term3373219, args);
    }

};



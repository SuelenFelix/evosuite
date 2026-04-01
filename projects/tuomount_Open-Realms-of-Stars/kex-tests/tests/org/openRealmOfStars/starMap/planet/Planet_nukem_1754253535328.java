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

public class Planet_nukem_1754253535328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1326044;
     Object term1326058;

    public Planet_nukem_1754253535328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1326044 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1326044, term1326044.getClass(), "name", null);
        setIntField(term1326044, term1326044.getClass(), "orderNumber", 0);
        setField(term1326044, term1326044.getClass(), "radiationType", null);
        setField(term1326044, term1326044.getClass(), "gravityType", null);
        setField(term1326044, term1326044.getClass(), "temperatureType", null);
        setField(term1326044, term1326044.getClass(), "waterLevel", null);
        setBooleanField(term1326044, term1326044.getClass(), "gasGiant", false);
        setField(term1326044, term1326044.getClass(), "coordinate", null);
        setField(term1326044, term1326044.getClass(), "planetType", null);
        setIntField(term1326044, term1326044.getClass(), "groundSize", 0);
        setIntField(term1326044, term1326044.getClass(), "amountMetalInGround", 0);
        setIntField(term1326044, term1326044.getClass(), "metal", 0);
        setIntField(term1326044, term1326044.getClass(), "prodResource", 0);
        setIntField(term1326044, term1326044.getClass(), "extraFood", 0);
        setIntField(term1326044, term1326044.getClass(), "culture", 0);
        setIntField(term1326044, term1326044.getClass(), "planetOwner", 0);
        setField(term1326044, term1326044.getClass(), "planetOwnerInfo", null);
        setField(term1326044, term1326044.getClass(), "homeWorldId", null);
        setIntField(term1326044, term1326044.getClass(), "startRealmIndex", 0);
        setIntField(term1326044, term1326044.getClass(), "tax", 0);
        setField(term1326044, term1326044.getClass(), "statuses", null);
        setField(term1326044, term1326044.getClass(), "timedStatuses", null);
        setField(term1326044, term1326044.getClass(), "event", null);
        setBooleanField(term1326044, term1326044.getClass(), "eventFound", false);
        setField(term1326044, term1326044.getClass(), "happinessEffect", null);
        setField(term1326044, term1326044.getClass(), "happinessExplanation", null);
        setField(term1326044, term1326044.getClass(), "farmProdExplain", null);
        setField(term1326044, term1326044.getClass(), "metaProdExplain", null);
        setField(term1326044, term1326044.getClass(), "prodProdExplain", null);
        setField(term1326044, term1326044.getClass(), "reseProdExplain", null);
        setField(term1326044, term1326044.getClass(), "cultProdExplain", null);
        setField(term1326044, term1326044.getClass(), "credProdExplain", null);
        setField(term1326044, term1326044.getClass(), "governor", null);
        setIntField(term1326044, term1326044.getClass(), "governorGuide", 0);
        setField(term1326044, term1326044.getClass(), "orbital", null);
        setField(term1326044, term1326044.getClass(), "workers", null);
        setField(term1326044, term1326044.getClass(), "buildings", null);
        setField(term1326044, term1326044.getClass(), "underConstruction", null);
        term1326058 = new Integer(0);
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
        args[0] = term1326058;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "nukem", argTypes, term1326044, args);
    }

};



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

public class Planet_setRadiationLevel_188511520463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272256;

    public Planet_setRadiationLevel_188511520463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272256 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term272256, term272256.getClass(), "name", null);
        setIntField(term272256, term272256.getClass(), "orderNumber", 0);
        setField(term272256, term272256.getClass(), "radiationType", null);
        setField(term272256, term272256.getClass(), "gravityType", null);
        setField(term272256, term272256.getClass(), "temperatureType", null);
        setField(term272256, term272256.getClass(), "waterLevel", null);
        setBooleanField(term272256, term272256.getClass(), "gasGiant", false);
        setField(term272256, term272256.getClass(), "coordinate", null);
        setField(term272256, term272256.getClass(), "planetType", null);
        setIntField(term272256, term272256.getClass(), "groundSize", 0);
        setIntField(term272256, term272256.getClass(), "amountMetalInGround", 0);
        setIntField(term272256, term272256.getClass(), "metal", 0);
        setIntField(term272256, term272256.getClass(), "prodResource", 0);
        setIntField(term272256, term272256.getClass(), "extraFood", 0);
        setIntField(term272256, term272256.getClass(), "culture", 0);
        setIntField(term272256, term272256.getClass(), "planetOwner", 0);
        setField(term272256, term272256.getClass(), "planetOwnerInfo", null);
        setField(term272256, term272256.getClass(), "homeWorldId", null);
        setIntField(term272256, term272256.getClass(), "startRealmIndex", 0);
        setIntField(term272256, term272256.getClass(), "tax", 0);
        setField(term272256, term272256.getClass(), "statuses", null);
        setField(term272256, term272256.getClass(), "timedStatuses", null);
        setField(term272256, term272256.getClass(), "event", null);
        setBooleanField(term272256, term272256.getClass(), "eventFound", false);
        setField(term272256, term272256.getClass(), "happinessEffect", null);
        setField(term272256, term272256.getClass(), "happinessExplanation", null);
        setField(term272256, term272256.getClass(), "farmProdExplain", null);
        setField(term272256, term272256.getClass(), "metaProdExplain", null);
        setField(term272256, term272256.getClass(), "prodProdExplain", null);
        setField(term272256, term272256.getClass(), "reseProdExplain", null);
        setField(term272256, term272256.getClass(), "cultProdExplain", null);
        setField(term272256, term272256.getClass(), "credProdExplain", null);
        setField(term272256, term272256.getClass(), "governor", null);
        setIntField(term272256, term272256.getClass(), "governorGuide", 0);
        setField(term272256, term272256.getClass(), "orbital", null);
        setField(term272256, term272256.getClass(), "workers", null);
        setField(term272256, term272256.getClass(), "buildings", null);
        setField(term272256, term272256.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.RadiationType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRadiationLevel", argTypes, term272256, args);
    }

};



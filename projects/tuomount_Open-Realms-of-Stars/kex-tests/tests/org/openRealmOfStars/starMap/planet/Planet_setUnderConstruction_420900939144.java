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

public class Planet_setUnderConstruction_420900939144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2615492;

    public Planet_setUnderConstruction_420900939144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2615492 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2615492, term2615492.getClass(), "name", null);
        setIntField(term2615492, term2615492.getClass(), "orderNumber", 0);
        setField(term2615492, term2615492.getClass(), "radiationType", null);
        setField(term2615492, term2615492.getClass(), "gravityType", null);
        setField(term2615492, term2615492.getClass(), "temperatureType", null);
        setField(term2615492, term2615492.getClass(), "waterLevel", null);
        setBooleanField(term2615492, term2615492.getClass(), "gasGiant", false);
        setField(term2615492, term2615492.getClass(), "coordinate", null);
        setField(term2615492, term2615492.getClass(), "planetType", null);
        setIntField(term2615492, term2615492.getClass(), "groundSize", 0);
        setIntField(term2615492, term2615492.getClass(), "amountMetalInGround", 0);
        setIntField(term2615492, term2615492.getClass(), "metal", 0);
        setIntField(term2615492, term2615492.getClass(), "prodResource", 0);
        setIntField(term2615492, term2615492.getClass(), "extraFood", 0);
        setIntField(term2615492, term2615492.getClass(), "culture", 0);
        setIntField(term2615492, term2615492.getClass(), "planetOwner", 0);
        setField(term2615492, term2615492.getClass(), "planetOwnerInfo", null);
        setField(term2615492, term2615492.getClass(), "homeWorldId", null);
        setIntField(term2615492, term2615492.getClass(), "startRealmIndex", 0);
        setIntField(term2615492, term2615492.getClass(), "tax", 0);
        setField(term2615492, term2615492.getClass(), "statuses", null);
        setField(term2615492, term2615492.getClass(), "timedStatuses", null);
        setField(term2615492, term2615492.getClass(), "event", null);
        setBooleanField(term2615492, term2615492.getClass(), "eventFound", false);
        setField(term2615492, term2615492.getClass(), "happinessEffect", null);
        setField(term2615492, term2615492.getClass(), "happinessExplanation", null);
        setField(term2615492, term2615492.getClass(), "farmProdExplain", null);
        setField(term2615492, term2615492.getClass(), "metaProdExplain", null);
        setField(term2615492, term2615492.getClass(), "prodProdExplain", null);
        setField(term2615492, term2615492.getClass(), "reseProdExplain", null);
        setField(term2615492, term2615492.getClass(), "cultProdExplain", null);
        setField(term2615492, term2615492.getClass(), "credProdExplain", null);
        setField(term2615492, term2615492.getClass(), "governor", null);
        setIntField(term2615492, term2615492.getClass(), "governorGuide", 0);
        setField(term2615492, term2615492.getClass(), "orbital", null);
        setField(term2615492, term2615492.getClass(), "workers", null);
        setField(term2615492, term2615492.getClass(), "buildings", null);
        setField(term2615492, term2615492.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUnderConstruction", argTypes, term2615492, args);
    }

};



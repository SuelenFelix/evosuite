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

public class Planet_fightAgainstAttacker_65156756030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149368;
     Object term149382;

    public Planet_fightAgainstAttacker_65156756030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149368 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term149368, term149368.getClass(), "name", null);
        setIntField(term149368, term149368.getClass(), "orderNumber", 0);
        setField(term149368, term149368.getClass(), "radiationType", null);
        setField(term149368, term149368.getClass(), "gravityType", null);
        setField(term149368, term149368.getClass(), "temperatureType", null);
        setField(term149368, term149368.getClass(), "waterLevel", null);
        setBooleanField(term149368, term149368.getClass(), "gasGiant", false);
        setField(term149368, term149368.getClass(), "coordinate", null);
        setField(term149368, term149368.getClass(), "planetType", null);
        setIntField(term149368, term149368.getClass(), "groundSize", 0);
        setIntField(term149368, term149368.getClass(), "amountMetalInGround", 0);
        setIntField(term149368, term149368.getClass(), "metal", 0);
        setIntField(term149368, term149368.getClass(), "prodResource", 0);
        setIntField(term149368, term149368.getClass(), "extraFood", 0);
        setIntField(term149368, term149368.getClass(), "culture", 0);
        setIntField(term149368, term149368.getClass(), "planetOwner", 0);
        setField(term149368, term149368.getClass(), "planetOwnerInfo", null);
        setField(term149368, term149368.getClass(), "homeWorldId", null);
        setIntField(term149368, term149368.getClass(), "startRealmIndex", 0);
        setIntField(term149368, term149368.getClass(), "tax", 0);
        setField(term149368, term149368.getClass(), "statuses", null);
        setField(term149368, term149368.getClass(), "timedStatuses", null);
        setField(term149368, term149368.getClass(), "event", null);
        setBooleanField(term149368, term149368.getClass(), "eventFound", false);
        setField(term149368, term149368.getClass(), "happinessEffect", null);
        setField(term149368, term149368.getClass(), "happinessExplanation", null);
        setField(term149368, term149368.getClass(), "farmProdExplain", null);
        setField(term149368, term149368.getClass(), "metaProdExplain", null);
        setField(term149368, term149368.getClass(), "prodProdExplain", null);
        setField(term149368, term149368.getClass(), "reseProdExplain", null);
        setField(term149368, term149368.getClass(), "cultProdExplain", null);
        setField(term149368, term149368.getClass(), "credProdExplain", null);
        setField(term149368, term149368.getClass(), "governor", null);
        setIntField(term149368, term149368.getClass(), "governorGuide", 0);
        setField(term149368, term149368.getClass(), "orbital", null);
        setField(term149368, term149368.getClass(), "workers", null);
        setField(term149368, term149368.getClass(), "buildings", null);
        setField(term149368, term149368.getClass(), "underConstruction", null);
        term149382 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[2];
        args[0] = term149382;
        args[1] = null;
        callMethod(klass, "fightAgainstAttacker", argTypes, term149368, args);
    }

};



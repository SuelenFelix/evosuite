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

public class Planet_fightAgainstAttacker_44399310328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141655;
     Object term141669;

    public Planet_fightAgainstAttacker_44399310328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141655 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term141655, term141655.getClass(), "name", null);
        setIntField(term141655, term141655.getClass(), "orderNumber", 0);
        setField(term141655, term141655.getClass(), "radiationType", null);
        setField(term141655, term141655.getClass(), "gravityType", null);
        setField(term141655, term141655.getClass(), "temperatureType", null);
        setField(term141655, term141655.getClass(), "waterLevel", null);
        setBooleanField(term141655, term141655.getClass(), "gasGiant", false);
        setField(term141655, term141655.getClass(), "coordinate", null);
        setField(term141655, term141655.getClass(), "planetType", null);
        setIntField(term141655, term141655.getClass(), "groundSize", 0);
        setIntField(term141655, term141655.getClass(), "amountMetalInGround", 0);
        setIntField(term141655, term141655.getClass(), "metal", 0);
        setIntField(term141655, term141655.getClass(), "prodResource", 0);
        setIntField(term141655, term141655.getClass(), "extraFood", 0);
        setIntField(term141655, term141655.getClass(), "culture", 0);
        setIntField(term141655, term141655.getClass(), "planetOwner", 0);
        setField(term141655, term141655.getClass(), "planetOwnerInfo", null);
        setField(term141655, term141655.getClass(), "homeWorldId", null);
        setIntField(term141655, term141655.getClass(), "startRealmIndex", 0);
        setIntField(term141655, term141655.getClass(), "tax", 0);
        setField(term141655, term141655.getClass(), "statuses", null);
        setField(term141655, term141655.getClass(), "timedStatuses", null);
        setField(term141655, term141655.getClass(), "event", null);
        setBooleanField(term141655, term141655.getClass(), "eventFound", false);
        setField(term141655, term141655.getClass(), "happinessEffect", null);
        setField(term141655, term141655.getClass(), "happinessExplanation", null);
        setField(term141655, term141655.getClass(), "farmProdExplain", null);
        setField(term141655, term141655.getClass(), "metaProdExplain", null);
        setField(term141655, term141655.getClass(), "prodProdExplain", null);
        setField(term141655, term141655.getClass(), "reseProdExplain", null);
        setField(term141655, term141655.getClass(), "cultProdExplain", null);
        setField(term141655, term141655.getClass(), "credProdExplain", null);
        setField(term141655, term141655.getClass(), "governor", null);
        setIntField(term141655, term141655.getClass(), "governorGuide", 0);
        setField(term141655, term141655.getClass(), "orbital", null);
        setField(term141655, term141655.getClass(), "workers", null);
        setField(term141655, term141655.getClass(), "buildings", null);
        setField(term141655, term141655.getClass(), "underConstruction", null);
        term141669 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term141669;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "fightAgainstAttacker", argTypes, term141655, args);
    }

};



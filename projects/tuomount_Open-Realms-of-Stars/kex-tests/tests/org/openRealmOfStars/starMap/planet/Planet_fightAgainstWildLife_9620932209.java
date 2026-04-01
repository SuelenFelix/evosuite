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

public class Planet_fightAgainstWildLife_9620932209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2094077;

    public Planet_fightAgainstWildLife_9620932209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2094077 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2094077, term2094077.getClass(), "name", null);
        setIntField(term2094077, term2094077.getClass(), "orderNumber", 0);
        setField(term2094077, term2094077.getClass(), "radiationType", null);
        setField(term2094077, term2094077.getClass(), "gravityType", null);
        setField(term2094077, term2094077.getClass(), "temperatureType", null);
        setField(term2094077, term2094077.getClass(), "waterLevel", null);
        setBooleanField(term2094077, term2094077.getClass(), "gasGiant", false);
        setField(term2094077, term2094077.getClass(), "coordinate", null);
        setField(term2094077, term2094077.getClass(), "planetType", null);
        setIntField(term2094077, term2094077.getClass(), "groundSize", 0);
        setIntField(term2094077, term2094077.getClass(), "amountMetalInGround", 0);
        setIntField(term2094077, term2094077.getClass(), "metal", 0);
        setIntField(term2094077, term2094077.getClass(), "prodResource", 0);
        setIntField(term2094077, term2094077.getClass(), "extraFood", 0);
        setIntField(term2094077, term2094077.getClass(), "culture", 0);
        setIntField(term2094077, term2094077.getClass(), "planetOwner", 0);
        setField(term2094077, term2094077.getClass(), "planetOwnerInfo", null);
        setField(term2094077, term2094077.getClass(), "homeWorldId", null);
        setIntField(term2094077, term2094077.getClass(), "startRealmIndex", 0);
        setIntField(term2094077, term2094077.getClass(), "tax", 0);
        setField(term2094077, term2094077.getClass(), "statuses", null);
        setField(term2094077, term2094077.getClass(), "timedStatuses", null);
        setField(term2094077, term2094077.getClass(), "event", null);
        setBooleanField(term2094077, term2094077.getClass(), "eventFound", false);
        setField(term2094077, term2094077.getClass(), "happinessEffect", null);
        setField(term2094077, term2094077.getClass(), "happinessExplanation", null);
        setField(term2094077, term2094077.getClass(), "farmProdExplain", null);
        setField(term2094077, term2094077.getClass(), "metaProdExplain", null);
        setField(term2094077, term2094077.getClass(), "prodProdExplain", null);
        setField(term2094077, term2094077.getClass(), "reseProdExplain", null);
        setField(term2094077, term2094077.getClass(), "cultProdExplain", null);
        setField(term2094077, term2094077.getClass(), "credProdExplain", null);
        setField(term2094077, term2094077.getClass(), "governor", null);
        setIntField(term2094077, term2094077.getClass(), "governorGuide", 0);
        setField(term2094077, term2094077.getClass(), "orbital", null);
        setField(term2094077, term2094077.getClass(), "workers", null);
        setField(term2094077, term2094077.getClass(), "buildings", null);
        setField(term2094077, term2094077.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "fightAgainstWildLife", argTypes, term2094077, args);
    }

};



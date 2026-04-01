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

public class Planet_fightAgainstWildLife_962093220308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325756;

    public Planet_fightAgainstWildLife_962093220308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325756 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325756, term1325756.getClass(), "name", null);
        setIntField(term1325756, term1325756.getClass(), "orderNumber", 0);
        setField(term1325756, term1325756.getClass(), "radiationType", null);
        setField(term1325756, term1325756.getClass(), "gravityType", null);
        setField(term1325756, term1325756.getClass(), "temperatureType", null);
        setField(term1325756, term1325756.getClass(), "waterLevel", null);
        setBooleanField(term1325756, term1325756.getClass(), "gasGiant", false);
        setField(term1325756, term1325756.getClass(), "coordinate", null);
        setField(term1325756, term1325756.getClass(), "planetType", null);
        setIntField(term1325756, term1325756.getClass(), "groundSize", 0);
        setIntField(term1325756, term1325756.getClass(), "amountMetalInGround", 0);
        setIntField(term1325756, term1325756.getClass(), "metal", 0);
        setIntField(term1325756, term1325756.getClass(), "prodResource", 0);
        setIntField(term1325756, term1325756.getClass(), "extraFood", 0);
        setIntField(term1325756, term1325756.getClass(), "culture", 0);
        setIntField(term1325756, term1325756.getClass(), "planetOwner", 0);
        setField(term1325756, term1325756.getClass(), "planetOwnerInfo", null);
        setField(term1325756, term1325756.getClass(), "homeWorldId", null);
        setIntField(term1325756, term1325756.getClass(), "startRealmIndex", 0);
        setIntField(term1325756, term1325756.getClass(), "tax", 0);
        setField(term1325756, term1325756.getClass(), "statuses", null);
        setField(term1325756, term1325756.getClass(), "timedStatuses", null);
        setField(term1325756, term1325756.getClass(), "event", null);
        setBooleanField(term1325756, term1325756.getClass(), "eventFound", false);
        setField(term1325756, term1325756.getClass(), "happinessEffect", null);
        setField(term1325756, term1325756.getClass(), "happinessExplanation", null);
        setField(term1325756, term1325756.getClass(), "farmProdExplain", null);
        setField(term1325756, term1325756.getClass(), "metaProdExplain", null);
        setField(term1325756, term1325756.getClass(), "prodProdExplain", null);
        setField(term1325756, term1325756.getClass(), "reseProdExplain", null);
        setField(term1325756, term1325756.getClass(), "cultProdExplain", null);
        setField(term1325756, term1325756.getClass(), "credProdExplain", null);
        setField(term1325756, term1325756.getClass(), "governor", null);
        setIntField(term1325756, term1325756.getClass(), "governorGuide", 0);
        setField(term1325756, term1325756.getClass(), "orbital", null);
        setField(term1325756, term1325756.getClass(), "workers", null);
        setField(term1325756, term1325756.getClass(), "buildings", null);
        setField(term1325756, term1325756.getClass(), "underConstruction", null);
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
        callMethod(klass, "fightAgainstWildLife", argTypes, term1325756, args);
    }

};



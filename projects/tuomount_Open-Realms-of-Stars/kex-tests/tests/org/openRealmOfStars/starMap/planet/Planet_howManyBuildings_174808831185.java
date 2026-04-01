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

public class Planet_howManyBuildings_174808831185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782278;

    public Planet_howManyBuildings_174808831185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782278 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term782278, term782278.getClass(), "name", null);
        setIntField(term782278, term782278.getClass(), "orderNumber", 0);
        setField(term782278, term782278.getClass(), "radiationType", null);
        setField(term782278, term782278.getClass(), "gravityType", null);
        setField(term782278, term782278.getClass(), "temperatureType", null);
        setField(term782278, term782278.getClass(), "waterLevel", null);
        setBooleanField(term782278, term782278.getClass(), "gasGiant", false);
        setField(term782278, term782278.getClass(), "coordinate", null);
        setField(term782278, term782278.getClass(), "planetType", null);
        setIntField(term782278, term782278.getClass(), "groundSize", 0);
        setIntField(term782278, term782278.getClass(), "amountMetalInGround", 0);
        setIntField(term782278, term782278.getClass(), "metal", 0);
        setIntField(term782278, term782278.getClass(), "prodResource", 0);
        setIntField(term782278, term782278.getClass(), "extraFood", 0);
        setIntField(term782278, term782278.getClass(), "culture", 0);
        setIntField(term782278, term782278.getClass(), "planetOwner", 0);
        setField(term782278, term782278.getClass(), "planetOwnerInfo", null);
        setField(term782278, term782278.getClass(), "homeWorldId", null);
        setIntField(term782278, term782278.getClass(), "startRealmIndex", 0);
        setIntField(term782278, term782278.getClass(), "tax", 0);
        setField(term782278, term782278.getClass(), "statuses", null);
        setField(term782278, term782278.getClass(), "timedStatuses", null);
        setField(term782278, term782278.getClass(), "event", null);
        setBooleanField(term782278, term782278.getClass(), "eventFound", false);
        setField(term782278, term782278.getClass(), "happinessEffect", null);
        setField(term782278, term782278.getClass(), "happinessExplanation", null);
        setField(term782278, term782278.getClass(), "farmProdExplain", null);
        setField(term782278, term782278.getClass(), "metaProdExplain", null);
        setField(term782278, term782278.getClass(), "prodProdExplain", null);
        setField(term782278, term782278.getClass(), "reseProdExplain", null);
        setField(term782278, term782278.getClass(), "cultProdExplain", null);
        setField(term782278, term782278.getClass(), "credProdExplain", null);
        setField(term782278, term782278.getClass(), "governor", null);
        setIntField(term782278, term782278.getClass(), "governorGuide", 0);
        setField(term782278, term782278.getClass(), "orbital", null);
        setField(term782278, term782278.getClass(), "workers", null);
        setField(term782278, term782278.getClass(), "buildings", null);
        setField(term782278, term782278.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "howManyBuildings", argTypes, term782278, args);
    }

};



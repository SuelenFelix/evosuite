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

public class Planet_setGovernorGuide_86118994335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373391;
     Object term3373405;

    public Planet_setGovernorGuide_86118994335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373391 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373391, term3373391.getClass(), "name", null);
        setIntField(term3373391, term3373391.getClass(), "orderNumber", 0);
        setField(term3373391, term3373391.getClass(), "radiationType", null);
        setField(term3373391, term3373391.getClass(), "gravityType", null);
        setField(term3373391, term3373391.getClass(), "temperatureType", null);
        setField(term3373391, term3373391.getClass(), "waterLevel", null);
        setBooleanField(term3373391, term3373391.getClass(), "gasGiant", false);
        setField(term3373391, term3373391.getClass(), "coordinate", null);
        setField(term3373391, term3373391.getClass(), "planetType", null);
        setIntField(term3373391, term3373391.getClass(), "groundSize", 0);
        setIntField(term3373391, term3373391.getClass(), "amountMetalInGround", 0);
        setIntField(term3373391, term3373391.getClass(), "metal", 0);
        setIntField(term3373391, term3373391.getClass(), "prodResource", 0);
        setIntField(term3373391, term3373391.getClass(), "extraFood", 0);
        setIntField(term3373391, term3373391.getClass(), "culture", 0);
        setIntField(term3373391, term3373391.getClass(), "planetOwner", 0);
        setField(term3373391, term3373391.getClass(), "planetOwnerInfo", null);
        setField(term3373391, term3373391.getClass(), "homeWorldId", null);
        setIntField(term3373391, term3373391.getClass(), "startRealmIndex", 0);
        setIntField(term3373391, term3373391.getClass(), "tax", 0);
        setField(term3373391, term3373391.getClass(), "statuses", null);
        setField(term3373391, term3373391.getClass(), "timedStatuses", null);
        setField(term3373391, term3373391.getClass(), "event", null);
        setBooleanField(term3373391, term3373391.getClass(), "eventFound", false);
        setField(term3373391, term3373391.getClass(), "happinessEffect", null);
        setField(term3373391, term3373391.getClass(), "happinessExplanation", null);
        setField(term3373391, term3373391.getClass(), "farmProdExplain", null);
        setField(term3373391, term3373391.getClass(), "metaProdExplain", null);
        setField(term3373391, term3373391.getClass(), "prodProdExplain", null);
        setField(term3373391, term3373391.getClass(), "reseProdExplain", null);
        setField(term3373391, term3373391.getClass(), "cultProdExplain", null);
        setField(term3373391, term3373391.getClass(), "credProdExplain", null);
        setField(term3373391, term3373391.getClass(), "governor", null);
        setIntField(term3373391, term3373391.getClass(), "governorGuide", 0);
        setField(term3373391, term3373391.getClass(), "orbital", null);
        setField(term3373391, term3373391.getClass(), "workers", null);
        setField(term3373391, term3373391.getClass(), "buildings", null);
        setField(term3373391, term3373391.getClass(), "underConstruction", null);
        term3373405 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3373405;
        callMethod(klass, "setGovernorGuide", argTypes, term3373391, args);
    }

};



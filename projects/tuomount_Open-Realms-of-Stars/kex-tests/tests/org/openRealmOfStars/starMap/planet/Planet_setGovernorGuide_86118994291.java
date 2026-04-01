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

public class Planet_setGovernorGuide_86118994291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1241520;
     Object term1241534;

    public Planet_setGovernorGuide_86118994291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1241520 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1241520, term1241520.getClass(), "name", null);
        setIntField(term1241520, term1241520.getClass(), "orderNumber", 0);
        setField(term1241520, term1241520.getClass(), "radiationType", null);
        setField(term1241520, term1241520.getClass(), "gravityType", null);
        setField(term1241520, term1241520.getClass(), "temperatureType", null);
        setField(term1241520, term1241520.getClass(), "waterLevel", null);
        setBooleanField(term1241520, term1241520.getClass(), "gasGiant", false);
        setField(term1241520, term1241520.getClass(), "coordinate", null);
        setField(term1241520, term1241520.getClass(), "planetType", null);
        setIntField(term1241520, term1241520.getClass(), "groundSize", 0);
        setIntField(term1241520, term1241520.getClass(), "amountMetalInGround", 0);
        setIntField(term1241520, term1241520.getClass(), "metal", 0);
        setIntField(term1241520, term1241520.getClass(), "prodResource", 0);
        setIntField(term1241520, term1241520.getClass(), "extraFood", 0);
        setIntField(term1241520, term1241520.getClass(), "culture", 0);
        setIntField(term1241520, term1241520.getClass(), "planetOwner", 0);
        setField(term1241520, term1241520.getClass(), "planetOwnerInfo", null);
        setField(term1241520, term1241520.getClass(), "homeWorldId", null);
        setIntField(term1241520, term1241520.getClass(), "startRealmIndex", 0);
        setIntField(term1241520, term1241520.getClass(), "tax", 0);
        setField(term1241520, term1241520.getClass(), "statuses", null);
        setField(term1241520, term1241520.getClass(), "timedStatuses", null);
        setField(term1241520, term1241520.getClass(), "event", null);
        setBooleanField(term1241520, term1241520.getClass(), "eventFound", false);
        setField(term1241520, term1241520.getClass(), "happinessEffect", null);
        setField(term1241520, term1241520.getClass(), "happinessExplanation", null);
        setField(term1241520, term1241520.getClass(), "farmProdExplain", null);
        setField(term1241520, term1241520.getClass(), "metaProdExplain", null);
        setField(term1241520, term1241520.getClass(), "prodProdExplain", null);
        setField(term1241520, term1241520.getClass(), "reseProdExplain", null);
        setField(term1241520, term1241520.getClass(), "cultProdExplain", null);
        setField(term1241520, term1241520.getClass(), "credProdExplain", null);
        setField(term1241520, term1241520.getClass(), "governor", null);
        setIntField(term1241520, term1241520.getClass(), "governorGuide", 0);
        setField(term1241520, term1241520.getClass(), "orbital", null);
        setField(term1241520, term1241520.getClass(), "workers", null);
        setField(term1241520, term1241520.getClass(), "buildings", null);
        setField(term1241520, term1241520.getClass(), "underConstruction", null);
        term1241534 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1241534;
        callMethod(klass, "setGovernorGuide", argTypes, term1241520, args);
    }

};



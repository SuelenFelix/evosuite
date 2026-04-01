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

public class Planet_getPlanetType_382078669221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938485;

    public Planet_getPlanetType_382078669221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938485 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term938485, term938485.getClass(), "name", null);
        setIntField(term938485, term938485.getClass(), "orderNumber", 0);
        setField(term938485, term938485.getClass(), "radiationType", null);
        setField(term938485, term938485.getClass(), "gravityType", null);
        setField(term938485, term938485.getClass(), "temperatureType", null);
        setField(term938485, term938485.getClass(), "waterLevel", null);
        setBooleanField(term938485, term938485.getClass(), "gasGiant", false);
        setField(term938485, term938485.getClass(), "coordinate", null);
        setField(term938485, term938485.getClass(), "planetType", null);
        setIntField(term938485, term938485.getClass(), "groundSize", 0);
        setIntField(term938485, term938485.getClass(), "amountMetalInGround", 0);
        setIntField(term938485, term938485.getClass(), "metal", 0);
        setIntField(term938485, term938485.getClass(), "prodResource", 0);
        setIntField(term938485, term938485.getClass(), "extraFood", 0);
        setIntField(term938485, term938485.getClass(), "culture", 0);
        setIntField(term938485, term938485.getClass(), "planetOwner", 0);
        setField(term938485, term938485.getClass(), "planetOwnerInfo", null);
        setField(term938485, term938485.getClass(), "homeWorldId", null);
        setIntField(term938485, term938485.getClass(), "startRealmIndex", 0);
        setIntField(term938485, term938485.getClass(), "tax", 0);
        setField(term938485, term938485.getClass(), "statuses", null);
        setField(term938485, term938485.getClass(), "timedStatuses", null);
        setField(term938485, term938485.getClass(), "event", null);
        setBooleanField(term938485, term938485.getClass(), "eventFound", false);
        setField(term938485, term938485.getClass(), "happinessEffect", null);
        setField(term938485, term938485.getClass(), "happinessExplanation", null);
        setField(term938485, term938485.getClass(), "farmProdExplain", null);
        setField(term938485, term938485.getClass(), "metaProdExplain", null);
        setField(term938485, term938485.getClass(), "prodProdExplain", null);
        setField(term938485, term938485.getClass(), "reseProdExplain", null);
        setField(term938485, term938485.getClass(), "cultProdExplain", null);
        setField(term938485, term938485.getClass(), "credProdExplain", null);
        setField(term938485, term938485.getClass(), "governor", null);
        setIntField(term938485, term938485.getClass(), "governorGuide", 0);
        setField(term938485, term938485.getClass(), "orbital", null);
        setField(term938485, term938485.getClass(), "workers", null);
        setField(term938485, term938485.getClass(), "buildings", null);
        setField(term938485, term938485.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetType", argTypes, term938485, args);
    }

};



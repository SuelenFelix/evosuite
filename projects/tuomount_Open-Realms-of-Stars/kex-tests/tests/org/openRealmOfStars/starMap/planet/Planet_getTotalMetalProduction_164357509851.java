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

public class Planet_getTotalMetalProduction_164357509851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230394;

    public Planet_getTotalMetalProduction_164357509851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230394 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term230394, term230394.getClass(), "name", null);
        setIntField(term230394, term230394.getClass(), "orderNumber", 0);
        setField(term230394, term230394.getClass(), "radiationType", null);
        setField(term230394, term230394.getClass(), "gravityType", null);
        setField(term230394, term230394.getClass(), "temperatureType", null);
        setField(term230394, term230394.getClass(), "waterLevel", null);
        setBooleanField(term230394, term230394.getClass(), "gasGiant", false);
        setField(term230394, term230394.getClass(), "coordinate", null);
        setField(term230394, term230394.getClass(), "planetType", null);
        setIntField(term230394, term230394.getClass(), "groundSize", 0);
        setIntField(term230394, term230394.getClass(), "amountMetalInGround", 0);
        setIntField(term230394, term230394.getClass(), "metal", 0);
        setIntField(term230394, term230394.getClass(), "prodResource", 0);
        setIntField(term230394, term230394.getClass(), "extraFood", 0);
        setIntField(term230394, term230394.getClass(), "culture", 0);
        setIntField(term230394, term230394.getClass(), "planetOwner", 0);
        setField(term230394, term230394.getClass(), "planetOwnerInfo", null);
        setField(term230394, term230394.getClass(), "homeWorldId", null);
        setIntField(term230394, term230394.getClass(), "startRealmIndex", 0);
        setIntField(term230394, term230394.getClass(), "tax", 0);
        setField(term230394, term230394.getClass(), "statuses", null);
        setField(term230394, term230394.getClass(), "timedStatuses", null);
        setField(term230394, term230394.getClass(), "event", null);
        setBooleanField(term230394, term230394.getClass(), "eventFound", false);
        setField(term230394, term230394.getClass(), "happinessEffect", null);
        setField(term230394, term230394.getClass(), "happinessExplanation", null);
        setField(term230394, term230394.getClass(), "farmProdExplain", null);
        setField(term230394, term230394.getClass(), "metaProdExplain", null);
        setField(term230394, term230394.getClass(), "prodProdExplain", null);
        setField(term230394, term230394.getClass(), "reseProdExplain", null);
        setField(term230394, term230394.getClass(), "cultProdExplain", null);
        setField(term230394, term230394.getClass(), "credProdExplain", null);
        setField(term230394, term230394.getClass(), "governor", null);
        setIntField(term230394, term230394.getClass(), "governorGuide", 0);
        setField(term230394, term230394.getClass(), "orbital", null);
        setField(term230394, term230394.getClass(), "workers", null);
        setField(term230394, term230394.getClass(), "buildings", null);
        setField(term230394, term230394.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMetalProduction", argTypes, term230394, args);
    }

};



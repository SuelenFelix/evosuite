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

public class Planet_getCulture_1916239116187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789581;

    public Planet_getCulture_1916239116187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789581 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term789581, term789581.getClass(), "name", null);
        setIntField(term789581, term789581.getClass(), "orderNumber", 0);
        setField(term789581, term789581.getClass(), "radiationType", null);
        setField(term789581, term789581.getClass(), "gravityType", null);
        setField(term789581, term789581.getClass(), "temperatureType", null);
        setField(term789581, term789581.getClass(), "waterLevel", null);
        setBooleanField(term789581, term789581.getClass(), "gasGiant", false);
        setField(term789581, term789581.getClass(), "coordinate", null);
        setField(term789581, term789581.getClass(), "planetType", null);
        setIntField(term789581, term789581.getClass(), "groundSize", 0);
        setIntField(term789581, term789581.getClass(), "amountMetalInGround", 0);
        setIntField(term789581, term789581.getClass(), "metal", 0);
        setIntField(term789581, term789581.getClass(), "prodResource", 0);
        setIntField(term789581, term789581.getClass(), "extraFood", 0);
        setIntField(term789581, term789581.getClass(), "culture", 0);
        setIntField(term789581, term789581.getClass(), "planetOwner", 0);
        setField(term789581, term789581.getClass(), "planetOwnerInfo", null);
        setField(term789581, term789581.getClass(), "homeWorldId", null);
        setIntField(term789581, term789581.getClass(), "startRealmIndex", 0);
        setIntField(term789581, term789581.getClass(), "tax", 0);
        setField(term789581, term789581.getClass(), "statuses", null);
        setField(term789581, term789581.getClass(), "timedStatuses", null);
        setField(term789581, term789581.getClass(), "event", null);
        setBooleanField(term789581, term789581.getClass(), "eventFound", false);
        setField(term789581, term789581.getClass(), "happinessEffect", null);
        setField(term789581, term789581.getClass(), "happinessExplanation", null);
        setField(term789581, term789581.getClass(), "farmProdExplain", null);
        setField(term789581, term789581.getClass(), "metaProdExplain", null);
        setField(term789581, term789581.getClass(), "prodProdExplain", null);
        setField(term789581, term789581.getClass(), "reseProdExplain", null);
        setField(term789581, term789581.getClass(), "cultProdExplain", null);
        setField(term789581, term789581.getClass(), "credProdExplain", null);
        setField(term789581, term789581.getClass(), "governor", null);
        setIntField(term789581, term789581.getClass(), "governorGuide", 0);
        setField(term789581, term789581.getClass(), "orbital", null);
        setField(term789581, term789581.getClass(), "workers", null);
        setField(term789581, term789581.getClass(), "buildings", null);
        setField(term789581, term789581.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCulture", argTypes, term789581, args);
    }

};



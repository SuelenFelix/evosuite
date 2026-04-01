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

public class Planet_broadcaster_1271766818185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2791139;

    public Planet_broadcaster_1271766818185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2791139 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2791139, term2791139.getClass(), "name", null);
        setIntField(term2791139, term2791139.getClass(), "orderNumber", 0);
        setField(term2791139, term2791139.getClass(), "radiationType", null);
        setField(term2791139, term2791139.getClass(), "gravityType", null);
        setField(term2791139, term2791139.getClass(), "temperatureType", null);
        setField(term2791139, term2791139.getClass(), "waterLevel", null);
        setBooleanField(term2791139, term2791139.getClass(), "gasGiant", false);
        setField(term2791139, term2791139.getClass(), "coordinate", null);
        setField(term2791139, term2791139.getClass(), "planetType", null);
        setIntField(term2791139, term2791139.getClass(), "groundSize", 0);
        setIntField(term2791139, term2791139.getClass(), "amountMetalInGround", 0);
        setIntField(term2791139, term2791139.getClass(), "metal", 0);
        setIntField(term2791139, term2791139.getClass(), "prodResource", 0);
        setIntField(term2791139, term2791139.getClass(), "extraFood", 0);
        setIntField(term2791139, term2791139.getClass(), "culture", 0);
        setIntField(term2791139, term2791139.getClass(), "planetOwner", 0);
        setField(term2791139, term2791139.getClass(), "planetOwnerInfo", null);
        setField(term2791139, term2791139.getClass(), "homeWorldId", null);
        setIntField(term2791139, term2791139.getClass(), "startRealmIndex", 0);
        setIntField(term2791139, term2791139.getClass(), "tax", 0);
        setField(term2791139, term2791139.getClass(), "statuses", null);
        setField(term2791139, term2791139.getClass(), "timedStatuses", null);
        setField(term2791139, term2791139.getClass(), "event", null);
        setBooleanField(term2791139, term2791139.getClass(), "eventFound", false);
        setField(term2791139, term2791139.getClass(), "happinessEffect", null);
        setField(term2791139, term2791139.getClass(), "happinessExplanation", null);
        setField(term2791139, term2791139.getClass(), "farmProdExplain", null);
        setField(term2791139, term2791139.getClass(), "metaProdExplain", null);
        setField(term2791139, term2791139.getClass(), "prodProdExplain", null);
        setField(term2791139, term2791139.getClass(), "reseProdExplain", null);
        setField(term2791139, term2791139.getClass(), "cultProdExplain", null);
        setField(term2791139, term2791139.getClass(), "credProdExplain", null);
        setField(term2791139, term2791139.getClass(), "governor", null);
        setIntField(term2791139, term2791139.getClass(), "governorGuide", 0);
        setField(term2791139, term2791139.getClass(), "orbital", null);
        setField(term2791139, term2791139.getClass(), "workers", null);
        setField(term2791139, term2791139.getClass(), "buildings", null);
        setField(term2791139, term2791139.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "broadcaster", argTypes, term2791139, args);
    }

};



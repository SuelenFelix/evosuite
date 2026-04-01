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

public class Planet_isEventActivated_861785771330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373319;

    public Planet_isEventActivated_861785771330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373319 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373319, term3373319.getClass(), "name", null);
        setIntField(term3373319, term3373319.getClass(), "orderNumber", 0);
        setField(term3373319, term3373319.getClass(), "radiationType", null);
        setField(term3373319, term3373319.getClass(), "gravityType", null);
        setField(term3373319, term3373319.getClass(), "temperatureType", null);
        setField(term3373319, term3373319.getClass(), "waterLevel", null);
        setBooleanField(term3373319, term3373319.getClass(), "gasGiant", false);
        setField(term3373319, term3373319.getClass(), "coordinate", null);
        setField(term3373319, term3373319.getClass(), "planetType", null);
        setIntField(term3373319, term3373319.getClass(), "groundSize", 0);
        setIntField(term3373319, term3373319.getClass(), "amountMetalInGround", 0);
        setIntField(term3373319, term3373319.getClass(), "metal", 0);
        setIntField(term3373319, term3373319.getClass(), "prodResource", 0);
        setIntField(term3373319, term3373319.getClass(), "extraFood", 0);
        setIntField(term3373319, term3373319.getClass(), "culture", 0);
        setIntField(term3373319, term3373319.getClass(), "planetOwner", 0);
        setField(term3373319, term3373319.getClass(), "planetOwnerInfo", null);
        setField(term3373319, term3373319.getClass(), "homeWorldId", null);
        setIntField(term3373319, term3373319.getClass(), "startRealmIndex", 0);
        setIntField(term3373319, term3373319.getClass(), "tax", 0);
        setField(term3373319, term3373319.getClass(), "statuses", null);
        setField(term3373319, term3373319.getClass(), "timedStatuses", null);
        setField(term3373319, term3373319.getClass(), "event", null);
        setBooleanField(term3373319, term3373319.getClass(), "eventFound", false);
        setField(term3373319, term3373319.getClass(), "happinessEffect", null);
        setField(term3373319, term3373319.getClass(), "happinessExplanation", null);
        setField(term3373319, term3373319.getClass(), "farmProdExplain", null);
        setField(term3373319, term3373319.getClass(), "metaProdExplain", null);
        setField(term3373319, term3373319.getClass(), "prodProdExplain", null);
        setField(term3373319, term3373319.getClass(), "reseProdExplain", null);
        setField(term3373319, term3373319.getClass(), "cultProdExplain", null);
        setField(term3373319, term3373319.getClass(), "credProdExplain", null);
        setField(term3373319, term3373319.getClass(), "governor", null);
        setIntField(term3373319, term3373319.getClass(), "governorGuide", 0);
        setField(term3373319, term3373319.getClass(), "orbital", null);
        setField(term3373319, term3373319.getClass(), "workers", null);
        setField(term3373319, term3373319.getClass(), "buildings", null);
        setField(term3373319, term3373319.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEventActivated", argTypes, term3373319, args);
    }

};



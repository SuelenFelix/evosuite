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

public class Planet_getCulture_1916239116322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373205;

    public Planet_getCulture_1916239116322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373205 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373205, term3373205.getClass(), "name", null);
        setIntField(term3373205, term3373205.getClass(), "orderNumber", 0);
        setField(term3373205, term3373205.getClass(), "radiationType", null);
        setField(term3373205, term3373205.getClass(), "gravityType", null);
        setField(term3373205, term3373205.getClass(), "temperatureType", null);
        setField(term3373205, term3373205.getClass(), "waterLevel", null);
        setBooleanField(term3373205, term3373205.getClass(), "gasGiant", false);
        setField(term3373205, term3373205.getClass(), "coordinate", null);
        setField(term3373205, term3373205.getClass(), "planetType", null);
        setIntField(term3373205, term3373205.getClass(), "groundSize", 0);
        setIntField(term3373205, term3373205.getClass(), "amountMetalInGround", 0);
        setIntField(term3373205, term3373205.getClass(), "metal", 0);
        setIntField(term3373205, term3373205.getClass(), "prodResource", 0);
        setIntField(term3373205, term3373205.getClass(), "extraFood", 0);
        setIntField(term3373205, term3373205.getClass(), "culture", 0);
        setIntField(term3373205, term3373205.getClass(), "planetOwner", 0);
        setField(term3373205, term3373205.getClass(), "planetOwnerInfo", null);
        setField(term3373205, term3373205.getClass(), "homeWorldId", null);
        setIntField(term3373205, term3373205.getClass(), "startRealmIndex", 0);
        setIntField(term3373205, term3373205.getClass(), "tax", 0);
        setField(term3373205, term3373205.getClass(), "statuses", null);
        setField(term3373205, term3373205.getClass(), "timedStatuses", null);
        setField(term3373205, term3373205.getClass(), "event", null);
        setBooleanField(term3373205, term3373205.getClass(), "eventFound", false);
        setField(term3373205, term3373205.getClass(), "happinessEffect", null);
        setField(term3373205, term3373205.getClass(), "happinessExplanation", null);
        setField(term3373205, term3373205.getClass(), "farmProdExplain", null);
        setField(term3373205, term3373205.getClass(), "metaProdExplain", null);
        setField(term3373205, term3373205.getClass(), "prodProdExplain", null);
        setField(term3373205, term3373205.getClass(), "reseProdExplain", null);
        setField(term3373205, term3373205.getClass(), "cultProdExplain", null);
        setField(term3373205, term3373205.getClass(), "credProdExplain", null);
        setField(term3373205, term3373205.getClass(), "governor", null);
        setIntField(term3373205, term3373205.getClass(), "governorGuide", 0);
        setField(term3373205, term3373205.getClass(), "orbital", null);
        setField(term3373205, term3373205.getClass(), "workers", null);
        setField(term3373205, term3373205.getClass(), "buildings", null);
        setField(term3373205, term3373205.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCulture", argTypes, term3373205, args);
    }

};



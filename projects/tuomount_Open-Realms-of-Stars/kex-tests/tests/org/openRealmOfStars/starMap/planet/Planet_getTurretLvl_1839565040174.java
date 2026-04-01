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

public class Planet_getTurretLvl_1839565040174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732830;

    public Planet_getTurretLvl_1839565040174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732830 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term732830, term732830.getClass(), "name", null);
        setIntField(term732830, term732830.getClass(), "orderNumber", 0);
        setField(term732830, term732830.getClass(), "radiationType", null);
        setField(term732830, term732830.getClass(), "gravityType", null);
        setField(term732830, term732830.getClass(), "temperatureType", null);
        setField(term732830, term732830.getClass(), "waterLevel", null);
        setBooleanField(term732830, term732830.getClass(), "gasGiant", false);
        setField(term732830, term732830.getClass(), "coordinate", null);
        setField(term732830, term732830.getClass(), "planetType", null);
        setIntField(term732830, term732830.getClass(), "groundSize", 0);
        setIntField(term732830, term732830.getClass(), "amountMetalInGround", 0);
        setIntField(term732830, term732830.getClass(), "metal", 0);
        setIntField(term732830, term732830.getClass(), "prodResource", 0);
        setIntField(term732830, term732830.getClass(), "extraFood", 0);
        setIntField(term732830, term732830.getClass(), "culture", 0);
        setIntField(term732830, term732830.getClass(), "planetOwner", 0);
        setField(term732830, term732830.getClass(), "planetOwnerInfo", null);
        setField(term732830, term732830.getClass(), "homeWorldId", null);
        setIntField(term732830, term732830.getClass(), "startRealmIndex", 0);
        setIntField(term732830, term732830.getClass(), "tax", 0);
        setField(term732830, term732830.getClass(), "statuses", null);
        setField(term732830, term732830.getClass(), "timedStatuses", null);
        setField(term732830, term732830.getClass(), "event", null);
        setBooleanField(term732830, term732830.getClass(), "eventFound", false);
        setField(term732830, term732830.getClass(), "happinessEffect", null);
        setField(term732830, term732830.getClass(), "happinessExplanation", null);
        setField(term732830, term732830.getClass(), "farmProdExplain", null);
        setField(term732830, term732830.getClass(), "metaProdExplain", null);
        setField(term732830, term732830.getClass(), "prodProdExplain", null);
        setField(term732830, term732830.getClass(), "reseProdExplain", null);
        setField(term732830, term732830.getClass(), "cultProdExplain", null);
        setField(term732830, term732830.getClass(), "credProdExplain", null);
        setField(term732830, term732830.getClass(), "governor", null);
        setIntField(term732830, term732830.getClass(), "governorGuide", 0);
        setField(term732830, term732830.getClass(), "orbital", null);
        setField(term732830, term732830.getClass(), "workers", null);
        setField(term732830, term732830.getClass(), "buildings", null);
        setField(term732830, term732830.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurretLvl", argTypes, term732830, args);
    }

};



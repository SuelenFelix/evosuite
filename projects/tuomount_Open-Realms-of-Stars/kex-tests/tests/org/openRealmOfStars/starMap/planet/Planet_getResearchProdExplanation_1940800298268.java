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

public class Planet_getResearchProdExplanation_1940800298268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1132661;

    public Planet_getResearchProdExplanation_1940800298268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1132661 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1132661, term1132661.getClass(), "name", null);
        setIntField(term1132661, term1132661.getClass(), "orderNumber", 0);
        setField(term1132661, term1132661.getClass(), "radiationType", null);
        setField(term1132661, term1132661.getClass(), "gravityType", null);
        setField(term1132661, term1132661.getClass(), "temperatureType", null);
        setField(term1132661, term1132661.getClass(), "waterLevel", null);
        setBooleanField(term1132661, term1132661.getClass(), "gasGiant", false);
        setField(term1132661, term1132661.getClass(), "coordinate", null);
        setField(term1132661, term1132661.getClass(), "planetType", null);
        setIntField(term1132661, term1132661.getClass(), "groundSize", 0);
        setIntField(term1132661, term1132661.getClass(), "amountMetalInGround", 0);
        setIntField(term1132661, term1132661.getClass(), "metal", 0);
        setIntField(term1132661, term1132661.getClass(), "prodResource", 0);
        setIntField(term1132661, term1132661.getClass(), "extraFood", 0);
        setIntField(term1132661, term1132661.getClass(), "culture", 0);
        setIntField(term1132661, term1132661.getClass(), "planetOwner", 0);
        setField(term1132661, term1132661.getClass(), "planetOwnerInfo", null);
        setField(term1132661, term1132661.getClass(), "homeWorldId", null);
        setIntField(term1132661, term1132661.getClass(), "startRealmIndex", 0);
        setIntField(term1132661, term1132661.getClass(), "tax", 0);
        setField(term1132661, term1132661.getClass(), "statuses", null);
        setField(term1132661, term1132661.getClass(), "timedStatuses", null);
        setField(term1132661, term1132661.getClass(), "event", null);
        setBooleanField(term1132661, term1132661.getClass(), "eventFound", false);
        setField(term1132661, term1132661.getClass(), "happinessEffect", null);
        setField(term1132661, term1132661.getClass(), "happinessExplanation", null);
        setField(term1132661, term1132661.getClass(), "farmProdExplain", null);
        setField(term1132661, term1132661.getClass(), "metaProdExplain", null);
        setField(term1132661, term1132661.getClass(), "prodProdExplain", null);
        setField(term1132661, term1132661.getClass(), "reseProdExplain", null);
        setField(term1132661, term1132661.getClass(), "cultProdExplain", null);
        setField(term1132661, term1132661.getClass(), "credProdExplain", null);
        setField(term1132661, term1132661.getClass(), "governor", null);
        setIntField(term1132661, term1132661.getClass(), "governorGuide", 0);
        setField(term1132661, term1132661.getClass(), "orbital", null);
        setField(term1132661, term1132661.getClass(), "workers", null);
        setField(term1132661, term1132661.getClass(), "buildings", null);
        setField(term1132661, term1132661.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearchProdExplanation", argTypes, term1132661, args);
    }

};



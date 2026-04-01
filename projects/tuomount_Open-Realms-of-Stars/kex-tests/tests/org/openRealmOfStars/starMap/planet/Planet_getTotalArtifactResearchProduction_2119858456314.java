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

public class Planet_getTotalArtifactResearchProduction_2119858456314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373091;

    public Planet_getTotalArtifactResearchProduction_2119858456314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373091 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373091, term3373091.getClass(), "name", null);
        setIntField(term3373091, term3373091.getClass(), "orderNumber", 0);
        setField(term3373091, term3373091.getClass(), "radiationType", null);
        setField(term3373091, term3373091.getClass(), "gravityType", null);
        setField(term3373091, term3373091.getClass(), "temperatureType", null);
        setField(term3373091, term3373091.getClass(), "waterLevel", null);
        setBooleanField(term3373091, term3373091.getClass(), "gasGiant", false);
        setField(term3373091, term3373091.getClass(), "coordinate", null);
        setField(term3373091, term3373091.getClass(), "planetType", null);
        setIntField(term3373091, term3373091.getClass(), "groundSize", 0);
        setIntField(term3373091, term3373091.getClass(), "amountMetalInGround", 0);
        setIntField(term3373091, term3373091.getClass(), "metal", 0);
        setIntField(term3373091, term3373091.getClass(), "prodResource", 0);
        setIntField(term3373091, term3373091.getClass(), "extraFood", 0);
        setIntField(term3373091, term3373091.getClass(), "culture", 0);
        setIntField(term3373091, term3373091.getClass(), "planetOwner", 0);
        setField(term3373091, term3373091.getClass(), "planetOwnerInfo", null);
        setField(term3373091, term3373091.getClass(), "homeWorldId", null);
        setIntField(term3373091, term3373091.getClass(), "startRealmIndex", 0);
        setIntField(term3373091, term3373091.getClass(), "tax", 0);
        setField(term3373091, term3373091.getClass(), "statuses", null);
        setField(term3373091, term3373091.getClass(), "timedStatuses", null);
        setField(term3373091, term3373091.getClass(), "event", null);
        setBooleanField(term3373091, term3373091.getClass(), "eventFound", false);
        setField(term3373091, term3373091.getClass(), "happinessEffect", null);
        setField(term3373091, term3373091.getClass(), "happinessExplanation", null);
        setField(term3373091, term3373091.getClass(), "farmProdExplain", null);
        setField(term3373091, term3373091.getClass(), "metaProdExplain", null);
        setField(term3373091, term3373091.getClass(), "prodProdExplain", null);
        setField(term3373091, term3373091.getClass(), "reseProdExplain", null);
        setField(term3373091, term3373091.getClass(), "cultProdExplain", null);
        setField(term3373091, term3373091.getClass(), "credProdExplain", null);
        setField(term3373091, term3373091.getClass(), "governor", null);
        setIntField(term3373091, term3373091.getClass(), "governorGuide", 0);
        setField(term3373091, term3373091.getClass(), "orbital", null);
        setField(term3373091, term3373091.getClass(), "workers", null);
        setField(term3373091, term3373091.getClass(), "buildings", null);
        setField(term3373091, term3373091.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalArtifactResearchProduction", argTypes, term3373091, args);
    }

};



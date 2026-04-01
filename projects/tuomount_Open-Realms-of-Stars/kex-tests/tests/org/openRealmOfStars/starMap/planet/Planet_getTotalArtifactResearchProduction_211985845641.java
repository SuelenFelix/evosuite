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

public class Planet_getTotalArtifactResearchProduction_211985845641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192389;

    public Planet_getTotalArtifactResearchProduction_211985845641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192389 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term192389, term192389.getClass(), "name", null);
        setIntField(term192389, term192389.getClass(), "orderNumber", 0);
        setField(term192389, term192389.getClass(), "radiationType", null);
        setField(term192389, term192389.getClass(), "gravityType", null);
        setField(term192389, term192389.getClass(), "temperatureType", null);
        setField(term192389, term192389.getClass(), "waterLevel", null);
        setBooleanField(term192389, term192389.getClass(), "gasGiant", false);
        setField(term192389, term192389.getClass(), "coordinate", null);
        setField(term192389, term192389.getClass(), "planetType", null);
        setIntField(term192389, term192389.getClass(), "groundSize", 0);
        setIntField(term192389, term192389.getClass(), "amountMetalInGround", 0);
        setIntField(term192389, term192389.getClass(), "metal", 0);
        setIntField(term192389, term192389.getClass(), "prodResource", 0);
        setIntField(term192389, term192389.getClass(), "extraFood", 0);
        setIntField(term192389, term192389.getClass(), "culture", 0);
        setIntField(term192389, term192389.getClass(), "planetOwner", 0);
        setField(term192389, term192389.getClass(), "planetOwnerInfo", null);
        setField(term192389, term192389.getClass(), "homeWorldId", null);
        setIntField(term192389, term192389.getClass(), "startRealmIndex", 0);
        setIntField(term192389, term192389.getClass(), "tax", 0);
        setField(term192389, term192389.getClass(), "statuses", null);
        setField(term192389, term192389.getClass(), "timedStatuses", null);
        setField(term192389, term192389.getClass(), "event", null);
        setBooleanField(term192389, term192389.getClass(), "eventFound", false);
        setField(term192389, term192389.getClass(), "happinessEffect", null);
        setField(term192389, term192389.getClass(), "happinessExplanation", null);
        setField(term192389, term192389.getClass(), "farmProdExplain", null);
        setField(term192389, term192389.getClass(), "metaProdExplain", null);
        setField(term192389, term192389.getClass(), "prodProdExplain", null);
        setField(term192389, term192389.getClass(), "reseProdExplain", null);
        setField(term192389, term192389.getClass(), "cultProdExplain", null);
        setField(term192389, term192389.getClass(), "credProdExplain", null);
        setField(term192389, term192389.getClass(), "governor", null);
        setIntField(term192389, term192389.getClass(), "governorGuide", 0);
        setField(term192389, term192389.getClass(), "orbital", null);
        setField(term192389, term192389.getClass(), "workers", null);
        setField(term192389, term192389.getClass(), "buildings", null);
        setField(term192389, term192389.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalArtifactResearchProduction", argTypes, term192389, args);
    }

};



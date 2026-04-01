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

public class Planet_getWaterLevel_127179063876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322137;

    public Planet_getWaterLevel_127179063876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322137 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term322137, term322137.getClass(), "name", null);
        setIntField(term322137, term322137.getClass(), "orderNumber", 0);
        setField(term322137, term322137.getClass(), "radiationType", null);
        setField(term322137, term322137.getClass(), "gravityType", null);
        setField(term322137, term322137.getClass(), "temperatureType", null);
        setField(term322137, term322137.getClass(), "waterLevel", null);
        setBooleanField(term322137, term322137.getClass(), "gasGiant", false);
        setField(term322137, term322137.getClass(), "coordinate", null);
        setField(term322137, term322137.getClass(), "planetType", null);
        setIntField(term322137, term322137.getClass(), "groundSize", 0);
        setIntField(term322137, term322137.getClass(), "amountMetalInGround", 0);
        setIntField(term322137, term322137.getClass(), "metal", 0);
        setIntField(term322137, term322137.getClass(), "prodResource", 0);
        setIntField(term322137, term322137.getClass(), "extraFood", 0);
        setIntField(term322137, term322137.getClass(), "culture", 0);
        setIntField(term322137, term322137.getClass(), "planetOwner", 0);
        setField(term322137, term322137.getClass(), "planetOwnerInfo", null);
        setField(term322137, term322137.getClass(), "homeWorldId", null);
        setIntField(term322137, term322137.getClass(), "startRealmIndex", 0);
        setIntField(term322137, term322137.getClass(), "tax", 0);
        setField(term322137, term322137.getClass(), "statuses", null);
        setField(term322137, term322137.getClass(), "timedStatuses", null);
        setField(term322137, term322137.getClass(), "event", null);
        setBooleanField(term322137, term322137.getClass(), "eventFound", false);
        setField(term322137, term322137.getClass(), "happinessEffect", null);
        setField(term322137, term322137.getClass(), "happinessExplanation", null);
        setField(term322137, term322137.getClass(), "farmProdExplain", null);
        setField(term322137, term322137.getClass(), "metaProdExplain", null);
        setField(term322137, term322137.getClass(), "prodProdExplain", null);
        setField(term322137, term322137.getClass(), "reseProdExplain", null);
        setField(term322137, term322137.getClass(), "cultProdExplain", null);
        setField(term322137, term322137.getClass(), "credProdExplain", null);
        setField(term322137, term322137.getClass(), "governor", null);
        setIntField(term322137, term322137.getClass(), "governorGuide", 0);
        setField(term322137, term322137.getClass(), "orbital", null);
        setField(term322137, term322137.getClass(), "workers", null);
        setField(term322137, term322137.getClass(), "buildings", null);
        setField(term322137, term322137.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaterLevel", argTypes, term322137, args);
    }

};



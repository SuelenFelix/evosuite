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

public class Planet_setTemperatureType_37478656870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300035;

    public Planet_setTemperatureType_37478656870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300035 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term300035, term300035.getClass(), "name", null);
        setIntField(term300035, term300035.getClass(), "orderNumber", 0);
        setField(term300035, term300035.getClass(), "radiationType", null);
        setField(term300035, term300035.getClass(), "gravityType", null);
        setField(term300035, term300035.getClass(), "temperatureType", null);
        setField(term300035, term300035.getClass(), "waterLevel", null);
        setBooleanField(term300035, term300035.getClass(), "gasGiant", false);
        setField(term300035, term300035.getClass(), "coordinate", null);
        setField(term300035, term300035.getClass(), "planetType", null);
        setIntField(term300035, term300035.getClass(), "groundSize", 0);
        setIntField(term300035, term300035.getClass(), "amountMetalInGround", 0);
        setIntField(term300035, term300035.getClass(), "metal", 0);
        setIntField(term300035, term300035.getClass(), "prodResource", 0);
        setIntField(term300035, term300035.getClass(), "extraFood", 0);
        setIntField(term300035, term300035.getClass(), "culture", 0);
        setIntField(term300035, term300035.getClass(), "planetOwner", 0);
        setField(term300035, term300035.getClass(), "planetOwnerInfo", null);
        setField(term300035, term300035.getClass(), "homeWorldId", null);
        setIntField(term300035, term300035.getClass(), "startRealmIndex", 0);
        setIntField(term300035, term300035.getClass(), "tax", 0);
        setField(term300035, term300035.getClass(), "statuses", null);
        setField(term300035, term300035.getClass(), "timedStatuses", null);
        setField(term300035, term300035.getClass(), "event", null);
        setBooleanField(term300035, term300035.getClass(), "eventFound", false);
        setField(term300035, term300035.getClass(), "happinessEffect", null);
        setField(term300035, term300035.getClass(), "happinessExplanation", null);
        setField(term300035, term300035.getClass(), "farmProdExplain", null);
        setField(term300035, term300035.getClass(), "metaProdExplain", null);
        setField(term300035, term300035.getClass(), "prodProdExplain", null);
        setField(term300035, term300035.getClass(), "reseProdExplain", null);
        setField(term300035, term300035.getClass(), "cultProdExplain", null);
        setField(term300035, term300035.getClass(), "credProdExplain", null);
        setField(term300035, term300035.getClass(), "governor", null);
        setIntField(term300035, term300035.getClass(), "governorGuide", 0);
        setField(term300035, term300035.getClass(), "orbital", null);
        setField(term300035, term300035.getClass(), "workers", null);
        setField(term300035, term300035.getClass(), "buildings", null);
        setField(term300035, term300035.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTemperatureType", argTypes, term300035, args);
    }

};



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
import java.lang.Integer;

public class Planet_setExtraFood_806559190225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2967515;
     Object term2967529;

    public Planet_setExtraFood_806559190225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2967515 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2967515, term2967515.getClass(), "name", null);
        setIntField(term2967515, term2967515.getClass(), "orderNumber", 0);
        setField(term2967515, term2967515.getClass(), "radiationType", null);
        setField(term2967515, term2967515.getClass(), "gravityType", null);
        setField(term2967515, term2967515.getClass(), "temperatureType", null);
        setField(term2967515, term2967515.getClass(), "waterLevel", null);
        setBooleanField(term2967515, term2967515.getClass(), "gasGiant", false);
        setField(term2967515, term2967515.getClass(), "coordinate", null);
        setField(term2967515, term2967515.getClass(), "planetType", null);
        setIntField(term2967515, term2967515.getClass(), "groundSize", 0);
        setIntField(term2967515, term2967515.getClass(), "amountMetalInGround", 0);
        setIntField(term2967515, term2967515.getClass(), "metal", 0);
        setIntField(term2967515, term2967515.getClass(), "prodResource", 0);
        setIntField(term2967515, term2967515.getClass(), "extraFood", 0);
        setIntField(term2967515, term2967515.getClass(), "culture", 0);
        setIntField(term2967515, term2967515.getClass(), "planetOwner", 0);
        setField(term2967515, term2967515.getClass(), "planetOwnerInfo", null);
        setField(term2967515, term2967515.getClass(), "homeWorldId", null);
        setIntField(term2967515, term2967515.getClass(), "startRealmIndex", 0);
        setIntField(term2967515, term2967515.getClass(), "tax", 0);
        setField(term2967515, term2967515.getClass(), "statuses", null);
        setField(term2967515, term2967515.getClass(), "timedStatuses", null);
        setField(term2967515, term2967515.getClass(), "event", null);
        setBooleanField(term2967515, term2967515.getClass(), "eventFound", false);
        setField(term2967515, term2967515.getClass(), "happinessEffect", null);
        setField(term2967515, term2967515.getClass(), "happinessExplanation", null);
        setField(term2967515, term2967515.getClass(), "farmProdExplain", null);
        setField(term2967515, term2967515.getClass(), "metaProdExplain", null);
        setField(term2967515, term2967515.getClass(), "prodProdExplain", null);
        setField(term2967515, term2967515.getClass(), "reseProdExplain", null);
        setField(term2967515, term2967515.getClass(), "cultProdExplain", null);
        setField(term2967515, term2967515.getClass(), "credProdExplain", null);
        setField(term2967515, term2967515.getClass(), "governor", null);
        setIntField(term2967515, term2967515.getClass(), "governorGuide", 0);
        setField(term2967515, term2967515.getClass(), "orbital", null);
        setField(term2967515, term2967515.getClass(), "workers", null);
        setField(term2967515, term2967515.getClass(), "buildings", null);
        setField(term2967515, term2967515.getClass(), "underConstruction", null);
        term2967529 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2967529;
        callMethod(klass, "setExtraFood", argTypes, term2967515, args);
    }

};



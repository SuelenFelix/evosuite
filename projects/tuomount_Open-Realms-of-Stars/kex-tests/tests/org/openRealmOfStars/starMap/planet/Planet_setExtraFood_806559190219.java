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

public class Planet_setExtraFood_806559190219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931953;
     Object term931967;

    public Planet_setExtraFood_806559190219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931953 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term931953, term931953.getClass(), "name", null);
        setIntField(term931953, term931953.getClass(), "orderNumber", 0);
        setField(term931953, term931953.getClass(), "radiationType", null);
        setField(term931953, term931953.getClass(), "gravityType", null);
        setField(term931953, term931953.getClass(), "temperatureType", null);
        setField(term931953, term931953.getClass(), "waterLevel", null);
        setBooleanField(term931953, term931953.getClass(), "gasGiant", false);
        setField(term931953, term931953.getClass(), "coordinate", null);
        setField(term931953, term931953.getClass(), "planetType", null);
        setIntField(term931953, term931953.getClass(), "groundSize", 0);
        setIntField(term931953, term931953.getClass(), "amountMetalInGround", 0);
        setIntField(term931953, term931953.getClass(), "metal", 0);
        setIntField(term931953, term931953.getClass(), "prodResource", 0);
        setIntField(term931953, term931953.getClass(), "extraFood", 0);
        setIntField(term931953, term931953.getClass(), "culture", 0);
        setIntField(term931953, term931953.getClass(), "planetOwner", 0);
        setField(term931953, term931953.getClass(), "planetOwnerInfo", null);
        setField(term931953, term931953.getClass(), "homeWorldId", null);
        setIntField(term931953, term931953.getClass(), "startRealmIndex", 0);
        setIntField(term931953, term931953.getClass(), "tax", 0);
        setField(term931953, term931953.getClass(), "statuses", null);
        setField(term931953, term931953.getClass(), "timedStatuses", null);
        setField(term931953, term931953.getClass(), "event", null);
        setBooleanField(term931953, term931953.getClass(), "eventFound", false);
        setField(term931953, term931953.getClass(), "happinessEffect", null);
        setField(term931953, term931953.getClass(), "happinessExplanation", null);
        setField(term931953, term931953.getClass(), "farmProdExplain", null);
        setField(term931953, term931953.getClass(), "metaProdExplain", null);
        setField(term931953, term931953.getClass(), "prodProdExplain", null);
        setField(term931953, term931953.getClass(), "reseProdExplain", null);
        setField(term931953, term931953.getClass(), "cultProdExplain", null);
        setField(term931953, term931953.getClass(), "credProdExplain", null);
        setField(term931953, term931953.getClass(), "governor", null);
        setIntField(term931953, term931953.getClass(), "governorGuide", 0);
        setField(term931953, term931953.getClass(), "orbital", null);
        setField(term931953, term931953.getClass(), "workers", null);
        setField(term931953, term931953.getClass(), "buildings", null);
        setField(term931953, term931953.getClass(), "underConstruction", null);
        term931967 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term931967;
        callMethod(klass, "setExtraFood", argTypes, term931953, args);
    }

};



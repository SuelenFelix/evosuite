package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpaceRace_getWarFatigueResistance_29018703581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350614;

    public SpaceRace_getWarFatigueResistance_29018703581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350614 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350614, term350614.getClass(), "id", null);
        setField(term350614, term350614.getClass(), "name", null);
        setField(term350614, term350614.getClass(), "nameSingle", null);
        setField(term350614, term350614.getClass(), "attitude", null);
        setField(term350614, term350614.getClass(), "imagePath", null);
        setField(term350614, term350614.getClass(), "bridgeId", null);
        setField(term350614, term350614.getClass(), "spaceShipId", null);
        setField(term350614, term350614.getClass(), "socialSystem", null);
        setField(term350614, term350614.getClass(), "genderList", null);
        setField(term350614, term350614.getClass(), "speechSetId", null);
        setField(term350614, term350614.getClass(), "bridgeEffect", null);
        setField(term350614, term350614.getClass(), "diplomacyMusic", null);
        setField(term350614, term350614.getClass(), "traits", null);
        setField(term350614, term350614.getClass(), "leaderNameGenerator", null);
        setField(term350614, term350614.getClass(), "description", null);
        setField(term350614, term350614.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarFatigueResistance", argTypes, term350614, args);
    }

};



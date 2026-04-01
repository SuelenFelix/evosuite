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

public class SpaceRace_getFoodSpeed_195486260478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350611;

    public SpaceRace_getFoodSpeed_195486260478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350611 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350611, term350611.getClass(), "id", null);
        setField(term350611, term350611.getClass(), "name", null);
        setField(term350611, term350611.getClass(), "nameSingle", null);
        setField(term350611, term350611.getClass(), "attitude", null);
        setField(term350611, term350611.getClass(), "imagePath", null);
        setField(term350611, term350611.getClass(), "bridgeId", null);
        setField(term350611, term350611.getClass(), "spaceShipId", null);
        setField(term350611, term350611.getClass(), "socialSystem", null);
        setField(term350611, term350611.getClass(), "genderList", null);
        setField(term350611, term350611.getClass(), "speechSetId", null);
        setField(term350611, term350611.getClass(), "bridgeEffect", null);
        setField(term350611, term350611.getClass(), "diplomacyMusic", null);
        setField(term350611, term350611.getClass(), "traits", null);
        setField(term350611, term350611.getClass(), "leaderNameGenerator", null);
        setField(term350611, term350611.getClass(), "description", null);
        setField(term350611, term350611.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.GravityType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFoodSpeed", argTypes, term350611, args);
    }

};



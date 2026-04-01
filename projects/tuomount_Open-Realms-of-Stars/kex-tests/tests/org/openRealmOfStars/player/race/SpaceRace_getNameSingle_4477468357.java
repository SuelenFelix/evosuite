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

public class SpaceRace_getNameSingle_4477468357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350590;

    public SpaceRace_getNameSingle_4477468357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350590 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350590, term350590.getClass(), "id", null);
        setField(term350590, term350590.getClass(), "name", null);
        setField(term350590, term350590.getClass(), "nameSingle", null);
        setField(term350590, term350590.getClass(), "attitude", null);
        setField(term350590, term350590.getClass(), "imagePath", null);
        setField(term350590, term350590.getClass(), "bridgeId", null);
        setField(term350590, term350590.getClass(), "spaceShipId", null);
        setField(term350590, term350590.getClass(), "socialSystem", null);
        setField(term350590, term350590.getClass(), "genderList", null);
        setField(term350590, term350590.getClass(), "speechSetId", null);
        setField(term350590, term350590.getClass(), "bridgeEffect", null);
        setField(term350590, term350590.getClass(), "diplomacyMusic", null);
        setField(term350590, term350590.getClass(), "traits", null);
        setField(term350590, term350590.getClass(), "leaderNameGenerator", null);
        setField(term350590, term350590.getClass(), "description", null);
        setField(term350590, term350590.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameSingle", argTypes, term350590, args);
    }

};



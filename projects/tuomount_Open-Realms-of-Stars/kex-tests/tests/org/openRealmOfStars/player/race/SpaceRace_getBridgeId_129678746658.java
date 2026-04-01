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

public class SpaceRace_getBridgeId_129678746658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350591;

    public SpaceRace_getBridgeId_129678746658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350591 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350591, term350591.getClass(), "id", null);
        setField(term350591, term350591.getClass(), "name", null);
        setField(term350591, term350591.getClass(), "nameSingle", null);
        setField(term350591, term350591.getClass(), "attitude", null);
        setField(term350591, term350591.getClass(), "imagePath", null);
        setField(term350591, term350591.getClass(), "bridgeId", null);
        setField(term350591, term350591.getClass(), "spaceShipId", null);
        setField(term350591, term350591.getClass(), "socialSystem", null);
        setField(term350591, term350591.getClass(), "genderList", null);
        setField(term350591, term350591.getClass(), "speechSetId", null);
        setField(term350591, term350591.getClass(), "bridgeEffect", null);
        setField(term350591, term350591.getClass(), "diplomacyMusic", null);
        setField(term350591, term350591.getClass(), "traits", null);
        setField(term350591, term350591.getClass(), "leaderNameGenerator", null);
        setField(term350591, term350591.getClass(), "description", null);
        setField(term350591, term350591.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBridgeId", argTypes, term350591, args);
    }

};



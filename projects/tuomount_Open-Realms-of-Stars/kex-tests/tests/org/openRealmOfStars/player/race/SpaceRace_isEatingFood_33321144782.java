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

public class SpaceRace_isEatingFood_33321144782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350615;

    public SpaceRace_isEatingFood_33321144782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350615 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350615, term350615.getClass(), "id", null);
        setField(term350615, term350615.getClass(), "name", null);
        setField(term350615, term350615.getClass(), "nameSingle", null);
        setField(term350615, term350615.getClass(), "attitude", null);
        setField(term350615, term350615.getClass(), "imagePath", null);
        setField(term350615, term350615.getClass(), "bridgeId", null);
        setField(term350615, term350615.getClass(), "spaceShipId", null);
        setField(term350615, term350615.getClass(), "socialSystem", null);
        setField(term350615, term350615.getClass(), "genderList", null);
        setField(term350615, term350615.getClass(), "speechSetId", null);
        setField(term350615, term350615.getClass(), "bridgeEffect", null);
        setField(term350615, term350615.getClass(), "diplomacyMusic", null);
        setField(term350615, term350615.getClass(), "traits", null);
        setField(term350615, term350615.getClass(), "leaderNameGenerator", null);
        setField(term350615, term350615.getClass(), "description", null);
        setField(term350615, term350615.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEatingFood", argTypes, term350615, args);
    }

};



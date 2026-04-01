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
import java.lang.Boolean;

public class SpaceRace_getFullDescription_136425489998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350631;
     Object term350632;
     Object term350634;

    public SpaceRace_getFullDescription_136425489998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350631 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350631, term350631.getClass(), "id", null);
        setField(term350631, term350631.getClass(), "name", null);
        setField(term350631, term350631.getClass(), "nameSingle", null);
        setField(term350631, term350631.getClass(), "attitude", null);
        setField(term350631, term350631.getClass(), "imagePath", null);
        setField(term350631, term350631.getClass(), "bridgeId", null);
        setField(term350631, term350631.getClass(), "spaceShipId", null);
        setField(term350631, term350631.getClass(), "socialSystem", null);
        setField(term350631, term350631.getClass(), "genderList", null);
        setField(term350631, term350631.getClass(), "speechSetId", null);
        setField(term350631, term350631.getClass(), "bridgeEffect", null);
        setField(term350631, term350631.getClass(), "diplomacyMusic", null);
        setField(term350631, term350631.getClass(), "traits", null);
        setField(term350631, term350631.getClass(), "leaderNameGenerator", null);
        setField(term350631, term350631.getClass(), "description", null);
        setField(term350631, term350631.getClass(), "spaceRaceType", null);
        term350632 = new Boolean(false);
        term350634 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term350632;
        args[1] = term350634;
        callMethod(klass, "getFullDescription", argTypes, term350631, args);
    }

};



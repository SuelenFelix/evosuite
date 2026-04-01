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

public class SpaceRace_addGender_45177439193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350626;

    public SpaceRace_addGender_45177439193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350626 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350626, term350626.getClass(), "id", null);
        setField(term350626, term350626.getClass(), "name", null);
        setField(term350626, term350626.getClass(), "nameSingle", null);
        setField(term350626, term350626.getClass(), "attitude", null);
        setField(term350626, term350626.getClass(), "imagePath", null);
        setField(term350626, term350626.getClass(), "bridgeId", null);
        setField(term350626, term350626.getClass(), "spaceShipId", null);
        setField(term350626, term350626.getClass(), "socialSystem", null);
        setField(term350626, term350626.getClass(), "genderList", null);
        setField(term350626, term350626.getClass(), "speechSetId", null);
        setField(term350626, term350626.getClass(), "bridgeEffect", null);
        setField(term350626, term350626.getClass(), "diplomacyMusic", null);
        setField(term350626, term350626.getClass(), "traits", null);
        setField(term350626, term350626.getClass(), "leaderNameGenerator", null);
        setField(term350626, term350626.getClass(), "description", null);
        setField(term350626, term350626.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Gender");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addGender", argTypes, term350626, args);
    }

};



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

public class SpaceRace_getNameGeneratorType_624013230103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350640;

    public SpaceRace_getNameGeneratorType_624013230103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350640 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350640, term350640.getClass(), "id", null);
        setField(term350640, term350640.getClass(), "name", null);
        setField(term350640, term350640.getClass(), "nameSingle", null);
        setField(term350640, term350640.getClass(), "attitude", null);
        setField(term350640, term350640.getClass(), "imagePath", null);
        setField(term350640, term350640.getClass(), "bridgeId", null);
        setField(term350640, term350640.getClass(), "spaceShipId", null);
        setField(term350640, term350640.getClass(), "socialSystem", null);
        setField(term350640, term350640.getClass(), "genderList", null);
        setField(term350640, term350640.getClass(), "speechSetId", null);
        setField(term350640, term350640.getClass(), "bridgeEffect", null);
        setField(term350640, term350640.getClass(), "diplomacyMusic", null);
        setField(term350640, term350640.getClass(), "traits", null);
        setField(term350640, term350640.getClass(), "leaderNameGenerator", null);
        setField(term350640, term350640.getClass(), "description", null);
        setField(term350640, term350640.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameGeneratorType", argTypes, term350640, args);
    }

};



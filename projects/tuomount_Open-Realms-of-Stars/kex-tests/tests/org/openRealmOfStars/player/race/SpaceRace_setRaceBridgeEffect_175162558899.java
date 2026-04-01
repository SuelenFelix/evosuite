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

public class SpaceRace_setRaceBridgeEffect_175162558899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350636;

    public SpaceRace_setRaceBridgeEffect_175162558899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350636 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        setField(term350636, term350636.getClass(), "id", null);
        setField(term350636, term350636.getClass(), "name", null);
        setField(term350636, term350636.getClass(), "nameSingle", null);
        setField(term350636, term350636.getClass(), "attitude", null);
        setField(term350636, term350636.getClass(), "imagePath", null);
        setField(term350636, term350636.getClass(), "bridgeId", null);
        setField(term350636, term350636.getClass(), "spaceShipId", null);
        setField(term350636, term350636.getClass(), "socialSystem", null);
        setField(term350636, term350636.getClass(), "genderList", null);
        setField(term350636, term350636.getClass(), "speechSetId", null);
        setField(term350636, term350636.getClass(), "bridgeEffect", null);
        setField(term350636, term350636.getClass(), "diplomacyMusic", null);
        setField(term350636, term350636.getClass(), "traits", null);
        setField(term350636, term350636.getClass(), "leaderNameGenerator", null);
        setField(term350636, term350636.getClass(), "description", null);
        setField(term350636, term350636.getClass(), "spaceRaceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ambient.BridgeCommandType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRaceBridgeEffect", argTypes, term350636, args);
    }

};


